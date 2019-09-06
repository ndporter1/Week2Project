/**
 * Represents a cylinder
 * 
 * @author Nicholas Porter
 */

package shapes;

public class Cylinder extends Circle {

	private double height;
	
	//Creates a cylinder with a default radius and height
	public Cylinder() {
		super();
		height = 10.0;
	}
	
	//Creates a cylinder with a given radius and height
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	//Returns the height of the cylinder
	public double getHeight() {
		return height;
	}
	
	//Returns the surface area of the cylinder
	public double getSA() {
		return 2 * ((Math.PI * radius * height) + (Math.PI * Math.pow(radius, 2)));
	}
	
	//Returns the volume of the cylinder
	public double getVolume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}
}
