package spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component//component annotation을 쓰면 bean을 따로 등록하지않아도 쓸수있다
//@Component 어노테이션은 기본적으로 타입기반의 자동주입 어노테이션이다. 
@Aspect
public class LogAspect {
	
	//pointcut
	@Pointcut("execution(public * *(..))")//표현식지정
	private void pointcut() {
		
	}
	@Before("pointcut()")//pointcut이 호출되면 그전에 before부터호출됨
	public void beforeLogging() {
		System.out.println("** 메서드 호출 전**");
	}
	@AfterReturning(pointcut="pointcut()", returning= "returnValue")
	public void afterLogging(Object returnValue) {
		System.out.println("** 메서드 호출 후**");
	}
	@AfterThrowing(pointcut="pointcut()", throwing="ex")
	public void throwingLogging(Exception ex) {
		System.out.println("** 예외 발생 : " + ex.getMessage() + "**");
	}
	@After("pointcut()")
	public void alwaysLogging() {
		System.out.println("** 항상 실행 **");
	}
}
