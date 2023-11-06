package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new GenericXmlApplicationContext("diTest.xml");//diTest.xml을 읽어와 컨테이너 객체생성 bar,baz,foo등의 bean들
		Foo f = context.getBean("foo1", Foo.class);//getBean은 object타입으로 받아오기떄문에 원하는 클래스타입혹은 캐스팅을 해줘야됨
		f.doFoo();
		
		Foo f2 = context.getBean("foo2", Foo.class);
		System.out.println(f2.i);
		System.out.println(f2.str);
		
		System.out.println("===========================");
		Fooo f3 = context.getBean("fooo4", Fooo.class);
		f3.doFooo();
		System.out.println(f3.i+" : "+ f3.str);
		
		System.out.println("===========================");
		FooLookUp f4 = context.getBean("fooLookUp", FooLookUp.class);
		f4.doFooLookUp();
		
		context.registerShutdownHook();
		
	}

}
