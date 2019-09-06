/**
 * Represents a circle
 * 
 * @author Nicholas Porter
 */

package shapes;

public class Circle {
	
	protected double radius;
	
	//Creates a circle with a default radius of 10
	public Circle() {
		radius = 10.0;
	}
	
	//Creates a circle with the given radius
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//Returns the circle's radius
	public double getRadius() {
		return radius;
	}
	
	//Returns the circle's area
	public double getArea() {
		return Math.PI * Math.pow(radius,2);
	}
	
	//Returns the circle's circumference
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	
}
