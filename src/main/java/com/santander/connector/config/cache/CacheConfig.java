package  com.santander.connector.config.cache;

import java.lang.reflect.Method;
import java.time.Duration;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.benmanes.caffeine.cache.Caffeine;

import com.santander.ademma.common.utils.CommonConstants;
import com.santander.ademma.common.utils.cache.CacheUtils;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableCaching
@ConfigurationProperties("connector.service.cache")
@Getter
@Setter
@Slf4j
public class CacheConfig {

	private long expire;

	@Bean
	@Qualifier("keyGenerator")
	public KeyGenerator keyGenerator() {
		return (Object target, Method method, Object... params) -> {
			String key = CacheUtils.keyGenerator(target, method, params);
//			log.debug("Key value: {}", key);
			return key;
		};
	}

	@Bean
	@Qualifier("KeyGeneratorHashMap")
	public KeyGenerator internalKeyGenerator() {
		return (Object target, Method method, Object... params) -> {
			String key = CacheUtils.keyGeneratorHashMap(target, method, params);
//			log.debug("Key value hash map: {}", key);
			return key;
		};
	}
	
	@Bean
	public CacheManager cacheManager() {
		CaffeineCacheManager cacheManager = new CaffeineCacheManager("service",CommonConstants.MICROSERVICE_INTERNAL_CALLER_CACHE_NAME);
		cacheManager.setCaffeine(caffeineCacheBuilder());
//		log.info("Caches created: {}", cacheManager.getCacheNames());
		return cacheManager;
	}

	@NonNull
	Caffeine<Object, Object> caffeineCacheBuilder() {
		return Caffeine.newBuilder().expireAfterAccess(Duration.ofSeconds(expire))
				.expireAfterWrite(Duration.ofSeconds(expire)).recordStats();
	}

}