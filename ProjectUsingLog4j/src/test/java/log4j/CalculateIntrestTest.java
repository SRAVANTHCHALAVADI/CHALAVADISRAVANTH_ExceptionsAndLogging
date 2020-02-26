package log4j;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateIntrestTest {

	@Test
	public void testSimple_Interest() {
		CalculateIntrest simpleIntrest =new CalculateIntrest();
		assertEquals(10500.00,simpleIntrest.Simple_Interest(10000.00, 1,5.00),0);

	}

	@Test
	public void testCompound_Interest() {
		CalculateIntrest compoundIntrest =new CalculateIntrest();
		assertEquals(10778.50,compoundIntrest.Compound_Interest(10000.00,1,12,7.5),2);
		}

}
