package jdbcDemo.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

public class JdbcDemo {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		SimpleJdbcDaoImpl dao = ctx.getBean("simpleJdbcImpl",SimpleJdbcDaoImpl.class);
		System.out.println(dao.getCircleCount());

	}

}
