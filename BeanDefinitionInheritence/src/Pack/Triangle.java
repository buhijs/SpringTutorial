package Pack;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context= null;


	

	public Triangle(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}




	public Point getPointA() {
		return pointA;
	}




	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}




	public Point getPointB() {
		return pointB;
	}




	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}




	public Point getPointC() {
		return pointC;
	}




	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}




	public void draw(){
		System.out.println(pointA);
		System.out.println(pointB);
		System.out.println(pointC);
	}




	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		
	}




	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("Bean name is: " + beanName);
		
	}
	
	


}
