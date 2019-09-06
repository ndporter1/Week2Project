package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import shapes.Rectangle;

public class TestRectangle {
	
	@Test
	public void testArea() {
		Rectangle c = new Rectangle(10,10);
		assertEquals(c.getArea(), 100, 0.01);
	}
	
	@Test
	public void testArea2() {
		Rectangle c = new Rectangle(0, 0);
		assertEquals(c.getArea(), 0, 0.01);
	}
	
	
	
	@Test
	public void testPerim() {
		Rectangle c = new Rectangle(10,10);
		assertEquals(c.getPerimiter(), 40 , 0.01);
	}
	
	@Test
	public void testPerim2() {
		Rectangle c = new Rectangle(0,0);
		assertEquals(c.getPerimiter(), 0, 0.01);
	}
	
}
