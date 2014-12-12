package Pack;

public class Point {
private int x;
private int y;

public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}

public String toString()
{
	return "x = " + getX() +", y = "+getY();
}

public void draw()
{
	System.out.println("Point was created");
}

public void cleanup()
{
	System.out.println("Point was cleaned up");
}

}
