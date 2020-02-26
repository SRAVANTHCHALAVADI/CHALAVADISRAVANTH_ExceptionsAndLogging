package log4j;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratecostTest {

	@Test
	public void testCost() {
		Generatecost testObject= new Generatecost();
		assertEquals(3600.00,testObject.Cost("standard", 3),0);
	}
	@Test
	public void testCost1() {
		Generatecost testObject= new Generatecost();
		assertEquals(1500.00,testObject.Cost("Abovestandard", 1),0);
	}
	@Test
	public void testCost2() {
		Generatecost testObject= new Generatecost();
		assertEquals(3600.00,testObject.Cost("Highstandard", 2),0);
	}
	@Test
	public void testCost3() {
		Generatecost testObject= new Generatecost();
		assertEquals(10000.00,testObject.Cost("HighstandardFullautomatic", 4),0);
	}

}
