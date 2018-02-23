package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import form.FormController;

@Configuration
public class ControllerConfig {

	@Bean
	public FormController loginController() {
		return new FormController();
	}
}
