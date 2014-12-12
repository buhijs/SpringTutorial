package Pack;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle1 implements ApplicationContextAware, BeanNameAware {

	private List<Point> points;
	private ApplicationContext context= null;

	
	
	public List<Point> getPoints() {
		return points;
	}




	public void setPoints(List<Point> points) {
		this.points = points;
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
	
	public void draw()
	{
		System.out.println(points);
	}
	
	


}
