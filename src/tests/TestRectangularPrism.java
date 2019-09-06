package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import shapes.RectangularPrism;

public class TestRectangularPrism {
	
	@Test
	public void testVolume() {
		RectangularPrism c = new RectangularPrism(10,10,10);
		assertEquals(c.getVolume(), 1000 , 0.01);
	}
	
	@Test
	public void testVolume2() {
		RectangularPrism c = new RectangularPrism(0,0,0);
		assertEquals(c.getVolume(), 0, 0.01);
	}
	
	@Test
	public void testVolume3() {
		RectangularPrism c = new RectangularPrism(0,0,10);
		assertEquals(c.getVolume(), 0, 0.01);
	}
	
	
	
	@Test
	public void testSA() {
		RectangularPrism c = new RectangularPrism(10,10,10);
		assertEquals(c.getSA(), 600 , 0.01);
	}
	
	@Test
	public void testSA2() {
		RectangularPrism c = new RectangularPrism(0,0,0);
		assertEquals(c.getSA(), 0, 0.01);
	}
	
}
