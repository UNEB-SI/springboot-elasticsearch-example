package br.com.lpr.api;

import br.com.lpr.api.config.ApiConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ApiConfig.class})
public class WebStarter {

	public static void main(String[] args) {
		SpringApplication.run(WebStarter.class, args);
	}
}
