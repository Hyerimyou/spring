package spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class PerformanceAspect {

	@Pointcut("execution(public * sayHello(String))")
	private void pointcut() {
		
	}
	@Around("pointcut()")
	public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable {//첫번째자리 proceedingjoinpoint
		Signature s = joinPoint.getSignature();//메서드정보
		String methodName = s.getName();//메서드 이름
		long startTime = System.nanoTime();
		System.out.println("[Log]METHOD Before : " + methodName + " time check start");
		Object obj = null;
		try {
			obj = joinPoint.proceed();// 핵심로직 메서드            실행 후 끝나면 돌아옴
		} catch (Exception e) {
			System.out.println("[Log]METHOD error : " + methodName);
		}
		long endTime = System.nanoTime();
		System.out.println("[Log]METHOD After : " + methodName + " time check end");
		System.out.println("[Log] " + methodName + " Processing time is " + (endTime - startTime) + "ns");
		return obj;
	}
}

/* 메서드 호출 전*
[Log]METHOD Before : sayHello time check start
sayHello : 안녕 : 갱
[Log]METHOD After : sayHello time check end
[Log] sayHello Processing time is 258900ns
** 메서드 호출 후**
** 메서드 호출 전**
[Log]METHOD Before : sayGoodbye time check start
sayGoodbye : 안녕 : 바이
[Log]METHOD error : sayGoodbye
[Log]METHOD After : sayGoodbye time check end
[Log] sayGoodbye Processing time is 252700ns
** 메서드 호출 후*/
//before around먼저 수행후 around의 전처리를 수행한다(메서드호출전-> logmethod->joint.proceed()가서(핵심로직가는메서드)-> sayhello
//핵심로직 실행후 다시 호출했던 지점으로 돌아와서 around후처리 실행 그다음 after-returning
//다음부분도 비슷한데 이제 바이라는메소드에서 에러출력이있으므로 around후처리에서 에러도 수행해준다
