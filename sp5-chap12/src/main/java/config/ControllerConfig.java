package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.RegisterController;
import controller.RegisterControllerWithGlobalValidator;
import controller.RegisterControllerWithLocalValidator;
import spring.MemberRegisterService;
import survey.SurveyController;

@Configuration
public class ControllerConfig {

	@Autowired
	private MemberRegisterService memberRegSvc;

	@Bean
	public RegisterController registerController() {
		RegisterController controller = new RegisterController();
		controller.setMemberRegisterService(memberRegSvc);
		return controller;
	}

	@Bean
	public SurveyController surveyController() {
		return new SurveyController();
	}

	@Bean
	public RegisterControllerWithLocalValidator registerControllerLocalValidator() {
		RegisterControllerWithLocalValidator controller = new RegisterControllerWithLocalValidator();
		controller.setMemberRegisterService(memberRegSvc);
		return controller;
	}

	@Bean
	public RegisterControllerWithGlobalValidator registerControllerGlobalValidator() {
		RegisterControllerWithGlobalValidator controller = new RegisterControllerWithGlobalValidator();
		controller.setMemberRegisterService(memberRegSvc);
		return controller;
	}
}
