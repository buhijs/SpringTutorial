package Pack;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Service.ShapeService;


public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeservice=ctx.getBean("shapeService", ShapeService.class);
		shapeservice.getCircle().setName("bla bla bla");
		System.out.println(shapeservice.getCircle().getName());
	}

}
