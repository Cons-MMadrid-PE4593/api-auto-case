package com.santander.connector.config.common;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ComponentScan("com.santander.ademma.common")
@Getter
@Setter
public class CommonConfig {

}
