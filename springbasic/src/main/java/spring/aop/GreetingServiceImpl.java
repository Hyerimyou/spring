package spring.aop;

public class GreetingServiceImpl implements GreetingService {

	private String greeting;
		
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void sayHello(String name) {
		System.out.println("sayHello : "+ greeting +" : "+name);

	}

	@Override
	public void sayGoodbye(String name)throws Exception {//오버라이딩이라 슈퍼클래스랑 똑같이 매치되어야함
		System.out.println("sayGoodbye : "+ greeting +" : "+name);
		throw new Exception("강제 예외 발생");
	}
}
