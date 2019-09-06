/**
 * Represents a rectangular prism
 * 
 * @author Nicholas Porter
 */

package shapes;

public class RectangularPrism extends Rectangle{
	
	private double height;
	
	//Creates a rectangular prism with default dimensions
	public RectangularPrism() {
		super();
		height = 10.0;
	}
	
	//Creates a rectangular prism with the given dimensions
	public RectangularPrism(double length, double width, double height) {
		super(length, width);
		this.height = height;
	}
	
	//Returns the height of the rectangular prism
	public double getHeight() {
		return height;
	}
	
	//Returns the surface area of the rectangle
	public double getSA() {
		return 2 * (width * length + height * length + height * width);
	}
	
	//Returns the volume of the rectangle
	public double getVolume() {
		return length * width * height;
	}
}
