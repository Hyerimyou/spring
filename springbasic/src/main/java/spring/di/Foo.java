package spring.di;

public class Foo {
	Bar bar;
	Baz baz;
	
	int i;
	String str;
	
//	public Foo(String s1, String s2) {
//		System.out.println("String, String 생성자 실행");
//	}
	
	public Foo(int s1, String s2) {
		System.out.println("int, String 생성자 실행");
	}
	
	
	public Foo(Bar bar, Baz baz) {//Foo에 다른객체를 주입할수있도록 생성자를 만든다
		this.bar = bar;
		this.baz = baz;
	}
	
	public Foo(Bar bar, Baz baz, int i, String str) {
		this.bar = bar;
		this.baz = baz;
		this.i = i;
		this.str = str;
	}

	public void doFoo() {
		System.out.println("doFoo메서드 실행");
		bar.doBar();//bar타입변수가있으니까 호출가능
	}
	
}
