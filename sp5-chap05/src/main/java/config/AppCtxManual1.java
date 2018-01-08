package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.MemberDao;
import spring.MemberRegisterService;

@Configuration
public class AppCtxManual1 {
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	public MemberRegisterService memberRegisterService() {
		return new MemberRegisterService();
	}
}
