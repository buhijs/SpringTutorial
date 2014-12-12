package Pack;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle  {

	private Point pointA;
	private Point pointB;
	private Point pointC;


	

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
	
	public void cleanup(){
		System.out.println("Triangle cleaned up");
	}





}
