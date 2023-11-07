package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext container = new GenericXmlApplicationContext("aopTest.xml");
		//aopTest.xml읽어서 빈 초기화
		GreetingService greeting = container.getBean("greeting", GreetingService.class);
		greeting.sayHello("갱");
		try {
			greeting.sayGoodbye("바이");
		} catch (Exception e) {
			e.printStackTrace();//java.lang.Exception: 강제 예외 발생
		}
		
		/* 메서드 호출 전**
		sayHello : 안녕 : 갱
		** 메서드 호출 후**
		여기서 aspect하나끝나고(advise가 더이상없음)
		
		프록시가 중간에서 계속가로채는거임
		
		다시 새로시작(메서드호출)
		** 메서드 호출 전**
		sayGoodbye : 안녕 : 바이
		** 메서드 호출 후*
		*** 예외 발생 : 강제 예외 발생**/
		//java.lang.Exception: 강제 예외 발생
 
		//public 메소드가 실행되기전마다 beforelogging의 호출전이 실행되는모습 ** 메서드 호출 전*
		//public 메소드가 끝날때마다 afterlogging이 실행되는모습 ** 메서드 호출 후**
		//예외발생하면서 after-throwing에 저장되어있는 throwingLogging
		
	}

}
