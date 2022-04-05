package com.santander.connector.config.httpclient;

import java.util.concurrent.TimeUnit;

import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * Apache HttpClient configuration.
 * 
 *
 */
@Configuration
@ConfigurationProperties("connector.httpclient")
@EnableScheduling
@Getter
@Setter
@Slf4j
public class ApacheHttpClientConfig {

	// Connection pool
	private int maxRouteConnections;
	private int maxTotalConnections;
	private int maxLocalhostConnections;

	// Keep alive
	private int defaultKeepAliveTime;

	// Timeouts
	private int connectionTimeout; // the time for waiting until a connection is established
	private int requestTimeout; // the time for waiting for a connection from connection pool
	private int socketTimeout; // the time for waiting for data

	// Idle connection monitor
	private int idleConnectionWaitTime;

	/**
	 * Connection pool configuration.
	 * 
	 * @return PoolingHttpClientConnectionManager
	 */
	@Bean
	@Qualifier("poolingConnectionManager")
	public PoolingHttpClientConnectionManager poolingConnectionManager() {
		PoolingHttpClientConnectionManager poolingConnectionManager = new PoolingHttpClientConnectionManager();

		// set total amount of connections across all HTTP routes
//		poolingConnectionManager.setMaxTotal(maxTotalConnections);
		poolingConnectionManager.setMaxTotal(200);

		// set maximum amount of connections for each http route in pool
//		poolingConnectionManager.setDefaultMaxPerRoute(maxRouteConnections);
		poolingConnectionManager.setDefaultMaxPerRoute(200);
		
		// increase the amounts of connections if host is localhost
		HttpHost localhost = new HttpHost("http://localhost", 8090);
		poolingConnectionManager.setMaxPerRoute(new HttpRoute(localhost), maxLocalhostConnections);

		return poolingConnectionManager;
	}

	/**
	 * Connection keep alive configuration.
	 * 
	 * @return ConnectionKeepAliveStrategy
	 */
	@Bean
	@Qualifier("connectionKeepAliveStrategy")
	public ConnectionKeepAliveStrategy connectionKeepAliveStrategy() {
		return (httpResponse, httpContext) -> {
			HeaderIterator headerIterator = httpResponse.headerIterator(HTTP.CONN_KEEP_ALIVE);
			HeaderElementIterator elementIterator = new BasicHeaderElementIterator(headerIterator);

			while (elementIterator.hasNext()) {
				HeaderElement element = elementIterator.nextElement();
				String param = element.getName();
				String value = element.getValue();
				if (value != null && param.equalsIgnoreCase("timeout")) {
					return Long.parseLong(value) * 1000; // convert to ms
				}
			}

			return defaultKeepAliveTime;
		};
	}

	/**
	 * Monitor which closes expired connections.
	 * 
	 * @param pool pool manager
	 * @return Runnable
	 */
	@Bean
	@Qualifier("idleConnectionMonitor")
	public Runnable idleConnectionMonitor(@Autowired @Qualifier("poolingConnectionManager") PoolingHttpClientConnectionManager pool) {
		return new Runnable() {
			@Override
			@Scheduled(fixedDelay = 300000)
			public void run() {
				// only if connection pool is initialised
				if (pool != null) {
					pool.closeExpiredConnections();
					pool.closeIdleConnections(idleConnectionWaitTime, TimeUnit.MILLISECONDS);

//					log.debug("Idle connection monitor: Closing expired and idle connections");
				}
			}
		};
	}

	/**
	 * Task to execute monitor
	 * 
	 * @return TaskScheduler
	 */
	@Bean
	@Qualifier("taskScheduler")
	public TaskScheduler taskScheduler() {
		ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
		scheduler.setThreadNamePrefix("idleMonitor");
		scheduler.setPoolSize(5);
		return scheduler;
	}

	/**
	 * Creates a instance of HttpClient
	 * 
	 * @return CloseableHttpClient
	 */
	@Bean
	@Qualifier("httpClient")
	public CloseableHttpClient httpClient() {
		RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(connectionTimeout)
				.setConnectionRequestTimeout(requestTimeout).setSocketTimeout(socketTimeout).build();

		return HttpClients.custom().setDefaultRequestConfig(requestConfig)
				.setConnectionManager(poolingConnectionManager()).setKeepAliveStrategy(connectionKeepAliveStrategy())
				.build();
	}

}
