package springday001.copy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springday001.property.Person;
import springday001.property.book;

public class TestIOC {
	
	@Test
	public void testUser(){
		//1加载spring配置文件，根据创建对象 
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		//2得到配置创建的对象
//		book b1 = (book) context.getBean("book1");
//		
//		System.out.println(b1);
//		b1.demobook();
////		
//		UserService Us = (UserService) context.getBean("service");
//		Us.add();	
		Person Ps = (Person) context.getBean("person");
		Ps.test1();
	}
}
