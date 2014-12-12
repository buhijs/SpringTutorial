package Service;

import aspect.LoggingAspect;
import Service.model.Circle;

public class ShapeServiceProxy extends ShapeService {
	public Circle getCircle(){
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}
}
