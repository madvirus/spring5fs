package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring2.MemberRegisterService;

@Configuration
public class AppCtxManual2 {

	@Bean
	public MemberRegisterService memberRegisterService() {
		return new MemberRegisterService();
	}
}
