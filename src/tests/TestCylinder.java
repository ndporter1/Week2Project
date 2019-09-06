package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import shapes.Cylinder;

public class TestCylinder {
	
	@Test
	public void testVolume() {
		Cylinder c = new Cylinder(10,10);
		assertEquals(c.getVolume(), 3141.59, 0.01);
	}
	
	@Test
	public void testVolume2() {
		Cylinder c = new Cylinder(0,0);
		assertEquals(c.getVolume(), 0, 0.01);
	}
	
	@Test
	public void testVolume3() {
		Cylinder c = new Cylinder(10,0);
		assertEquals(c.getVolume(), 0, 0.01);
	}
	
	
	
	@Test
	public void testSA() {
		Cylinder c = new Cylinder(10,10);
		assertEquals(c.getSA(), 1256.64 , 0.01);
	}
	
	@Test
	public void testSA2() {
		Cylinder c = new Cylinder(0,0);
		assertEquals(c.getSA(), 0, 0.01);
	}
	
}
