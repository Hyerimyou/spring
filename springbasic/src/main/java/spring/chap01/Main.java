package spring.chap01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext beanFactory //applicationContext.xml에서 읽은 bean태그를 객체로생성 후 초기화
		= new GenericXmlApplicationContext("applicationContext.xml");
		WriteArticleService articleService 
		= (WriteArticleService) beanFactory.getBean("writeArticleService");//컨테이너에 생성된 객체에 접근가능하게해줌 getbean
		articleService.write(new Article());
	}

}
