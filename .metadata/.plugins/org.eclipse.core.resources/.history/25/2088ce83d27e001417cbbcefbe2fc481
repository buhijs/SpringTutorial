package Pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Example {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle1 = (Triangle) context.getBean("triangle");
		Triangle triangle2 = (Triangle) context.getBean("triangle");
		System.out.println(triangle1==triangle2);
	}
}
