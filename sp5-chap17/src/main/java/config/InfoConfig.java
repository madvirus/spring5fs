package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.Info;

@Configuration
public class InfoConfig {

	@Bean
	public Info info() {
		return new Info();
	}

}
