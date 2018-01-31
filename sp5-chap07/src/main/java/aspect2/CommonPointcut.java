package aspect2;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcut {

	@Pointcut("execution(public * chap07..*(..))")
	public void commonTarget() {
	}

}
