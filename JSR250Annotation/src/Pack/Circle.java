package Pack;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class Circle implements Shape{

	private Point center;
	
	public Point getCenter() {
		return center;
	}
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("The center is" + center);
	}
	
	@PostConstruct
	public void initialize(){
		System.out.println("Point was Created");
	}
	@PreDestroy
	public void destroyCircle(){
		System.out.println("Point was destroyed");
	}

}
