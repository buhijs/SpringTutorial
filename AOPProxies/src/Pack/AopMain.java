package Pack;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Service.FactoryService;
import Service.ShapeService;


public class AopMain {

	public static void main(String[] args) {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		//ShapeService shapeservice=ctx.getBean("shapeService", ShapeService.class);
		FactoryService factoryService= new FactoryService();
		ShapeService shapeService = (ShapeService) factoryService.getBean("shapeService");
		System.out.println(shapeService.getCircle());
	}

}
