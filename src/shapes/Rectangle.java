/**
 * Represents a basic rectangle
 * 
 * @author Nicholas Porter
 */

package shapes;

public class Rectangle {
	
	protected double length;
	protected double width;
	
	//Create a rectangle with a default length and width
	public Rectangle() {
		length = 10.0;
		width = 10.0;
	}
	
	//Create a rectangle with the given length and width
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	//Return the length of the rectangle
	public double getLength() {
		return length;
	}
	
	//Return the width of the rectangle
	public double getWidth() {
		return width;
	}
	
	//Return the area of the rectangle
	public double getArea() {
		return length * width;
	}
	
	//Return the perimiter of the rectangle
	public double getPerimiter() {
		return (2 * length) + (2 * width);
	}
	
}
