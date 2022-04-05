package com.santander.connector.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.santander.connector.utils.Constants;

@Configuration
//@Order(com.santander.serenity.devstack.util.Constants.DEVSTACK_SECURITY_ORDER - 2)
public class ServiceConfigurerAdapterConfig extends WebSecurityConfigurerAdapter {


    /**
     * Ignore security for actuator and swagger endpoints
     *
     * @param web WebSecurity
     */
    @Override
    public void configure(WebSecurity web) {
        web.ignoring().
			//uncomment next line to ignore JWT validation
        	//antMatchers(Constants.REQUEST_MAPPING_PATH+"/**").
	        antMatchers("/actuator/**").
	        antMatchers("/**/*swagger*/**").
	        antMatchers("/**/*api-docs*/**").
	        antMatchers("/**/*springfox*/**");
    }
 
    /**
     * No security for actuator and swagger endpoints
     *
     * @param http HttpSecurity
     * @throws Exception if an error occurs
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
			//uncomment next line to ignore JWT validation
        	//antMatcher(Constants.REQUEST_MAPPING_PATH+"/**").
        	antMatcher("/actuator/**").
	        antMatcher("/**/*swagger*/**").
	        antMatcher("/**/*api-docs*/**"). 
	        antMatcher("/**/*springfox*/**").
            authorizeRequests().anyRequest().permitAll();
    }
}
