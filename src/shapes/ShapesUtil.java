/**
 * The purpose of this program is to allow the user 
 * to calculate the properties (area, volume, etc.)
 * of some shapes and 3d objects.
 * 
 * @author Nicholas Porter
 */

package shapes;
import javax.swing.JOptionPane;
import java.text.*;

public class ShapesUtil {

	public static void main(String[] args) {
		
		boolean keepGoing = true;
		int shapeKey; //user inputs a number to determine which shape they want
		
		do {
	    //prompt user to enter a shape key or exit
		shapeKey = Integer.parseInt(JOptionPane.showInputDialog("Which shape are you interested in?"
									+ "\n1) Circle\n2) Rectangle\n3) Cylinder\n4) Rectangular Prism\n5) EXIT"));
		
		//based on the shape key, the user can enter shape dimensions
		//and view the resulting properties of that shape
		switch (shapeKey) { 
        case 1: 
        	Circle c = circleInput();
        	System.out.println("A circle of radius " + c.getRadius() + " has an area of " + formatNumber(c.getArea()) + 
        			           " and a circumference of " + formatNumber(c.getCircumference()) + ".\n");
            break; 
        case 2: 
            Rectangle r = rectangleInput();
            System.out.println("A " + r.getLength() + " by " + r.getWidth() + " rectangle has an area of " + 
                               formatNumber(r.getArea()) + " and a perimiter of " + formatNumber(r.getPerimiter()) + ".\n");
            break; 
        case 3: 
            Cylinder cy = cylinderInput();
            System.out.println("A cylinder of height " + cy.getHeight() + " and radius " + cy.getRadius() + 
            		           " has a volume of " + formatNumber(cy.getVolume()) + " and a surface area of " + 
            		           formatNumber(cy.getSA()) + ".\n");
            break; 
        case 4: 
            RectangularPrism rp = rectPrismInput();
            System.out.println("A " + rp.getLength() + " x " + rp.getWidth() + " x " + rp.getHeight() + 
            		           " rectangular prism has a volume of " + formatNumber(rp.getVolume()) + 
            		           " and a surface area of " + formatNumber(rp.getSA()) + ".\n");
            break; 
            
        case 5:
        	System.out.println("Goodbye!");
        	keepGoing = false;
        	break;
        default: 
            System.out.println("Invalid number"); 
            break; 
        } 
		}while(keepGoing);
	}
	
	
	/*
	Helper methods for creating objects from input
	In retrospect I could have made the no-arg shape 
	constructors create objects from input by default 
	*/
	public static Circle circleInput() {
		double radius;
		radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the circle"));
		Circle c = new Circle(radius);
		return c;
	}
	
	public static Rectangle rectangleInput() {
		double length;
		double width;
		length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the rectangle"));
		width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the rectangle"));
		Rectangle c = new Rectangle(length, width);
		return c;
	}
	
	public static Cylinder cylinderInput() {
		double radius;
		double height;
		radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the cylinder"));
		height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the cylinder"));
		Cylinder c = new Cylinder(radius, height);
		return c;
	}
	
	public static RectangularPrism rectPrismInput() {
		double length;
		double width;
		double height;
		length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the rectangular prism"));
		width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of the rectangular prism"));
		height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the rectangular prism"));
		RectangularPrism c = new RectangularPrism(length, width, height);
		return c;
	}
	
	
	//Helper method to format number to a two-decimal-place string
	public static String formatNumber(double number) {
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(number);
	}
	

}