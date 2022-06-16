package com.santander.connector.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter.XFrameOptionsMode;

@Configuration
//@EnableWebSecurity
//@Order(com.santander.serenity.devstack.util.Constants.DEVSTACK_SECURITY_ORDER - 2)
public class ServiceConfigurerAdapterConfig extends WebSecurityConfigurerAdapter {
	
//    @Override
//    public void configure(WebSecurity web) {
////        web.ignoring().
////			//uncomment next line to ignore JWT validation
////        	//antMatchers(Constants.REQUEST_MAPPING_PATH+"/**").
////	        antMatchers("/actuator/**").
////	        antMatchers("/**/*swagger*/**");
//    }
 
//    /**
//     * No security for actuator and swagger endpoints
//     *
//     * @param http HttpSecurity
//     * @throws Exception if an error occurs
//     */
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//    	
////    	antMatcher("/actuator/**").
////    	http.antMatcher("/").authorizeRequests().anyRequest().permitAll();
//    	http.headers().addHeaderWriter(new XFrameOptionsHeaderWriter(XFrameOptionsMode.SAMEORIGIN)).
//    	and().authorizeRequests().antMatchers("/gqs/**").permitAll();
////		.addHeaderWriter(headerWriter)(new XFrameOptionsHeaderWriter(XFrameOptionsMode.SAMEORIGIN));
////    	http.
////    	authorizeRequests().antMatchers("/", "/**/*swagger*/**").permitAll().anyRequest().hasRole("usertest");
////        http.
////			//uncomment next line to ignore JWT validation
////        	//antMatcher(Constants.REQUEST_MAPPING_PATH+"/**").
////        	antMatcher("/actuator/**").headers().frameOptions().sameOrigin().httpStrictTransportSecurity().disable().and().
////            authorizeRequests().anyRequest().permitAll();
//    }
	
	protected void configure(HttpSecurity http) throws Exception {


		http.antMatcher("/").authorizeRequests().anyRequest().permitAll();
		http.headers().addHeaderWriter(new XFrameOptionsHeaderWriter(XFrameOptionsMode.SAMEORIGIN));

	}
    

}
