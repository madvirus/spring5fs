package sp5.sp5chapcboot.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("spring")
public class CommonExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	public String handleRuntimeException() {
		return "error/commonException";
	}
}
