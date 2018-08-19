package br.com.lpr.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"br.com.lpr.core"})
@PropertySource(ignoreResourceNotFound = false, value = "classpath:core-application.properties")
public class CoreConfig {
}
