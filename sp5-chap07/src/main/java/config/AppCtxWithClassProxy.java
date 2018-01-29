package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspect.ExeTimeAspect;
import chap07.RecCalculator;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppCtxWithClassProxy {
	@Bean
	public ExeTimeAspect exeTimeAspect() {
		return new ExeTimeAspect();
	}

	@Bean
	public RecCalculator calculator() {
		return new RecCalculator();
	}

}
