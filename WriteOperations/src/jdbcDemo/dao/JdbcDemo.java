package jdbcDemo.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl dao=ctx.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		dao.insertCircle(new Circle(5,"circle5"));

	}

}
