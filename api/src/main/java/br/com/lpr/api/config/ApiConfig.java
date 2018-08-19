package br.com.lpr.api.config;

import br.com.lpr.core.config.CoreConfig;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(ignoreResourceNotFound = false, value = "classpath:api-application.properties")
@Import({CoreConfig.class})
@ComponentScan(basePackages = {"br.com.lpr.core"})
public class ApiConfig {
}
