package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import shapes.Circle;

public class TestCircle {
	
	@Test
	public void testArea() {
		Circle c = new Circle(5.0);
		assertEquals(c.getArea(), 78.54, 0.01);
	}
	
	@Test
	public void testArea2() {
		Circle c = new Circle(1);
		assertEquals(c.getArea(), 3.14, 0.01);
	}
	
	@Test
	public void testArea3() {
		Circle c = new Circle(0);
		assertEquals(c.getArea(), 0, 0.01);
	}
	
	@Test
	public void testCircum() {
		Circle c = new Circle(1);
		assertEquals(c.getCircumference(), 6.28 , 0.01);
	}
	
	@Test
	public void testCircum2() {
		Circle c = new Circle(5);
		assertEquals(c.getCircumference(), 31.42, 0.01);
	}
	
	@Test
	public void testCircum3() {
		Circle c = new Circle(0);
		assertEquals(c.getCircumference(), 0, 0.01);
	}
	
}
