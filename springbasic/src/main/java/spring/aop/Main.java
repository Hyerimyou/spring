package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext container = new GenericXmlApplicationContext("aopTest.xml");
		//aopTest.xml읽어서 빈 초기화
		GreetingService greeting = container.getBean("greeting", GreetingService.class);
		greeting.sayHello("갱");
		greeting.sayGoodbye("바이");
		
		/* 메서드 호출 전**
		sayHello : 안녕 : 갱
		** 메서드 호출 후**
		** 메서드 호출 전**
		sayGoodbye : 안녕 : 바이
		** 메서드 호출 후**/
 
		//public 메소드가 실행되기전마다 beforelogging의 호출전이 실행되는모습 ** 메서드 호출 전*
		//public 메소드가 끝날때마다 afterlogging이 실행되는모습 ** 메서드 호출 후**
		
	}

}
