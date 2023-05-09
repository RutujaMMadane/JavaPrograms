package UnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class maxTest {

	@Test
	public void findmax() {
		assertEquals(4,Calculation.maxNum(new int[] {4,3,4,2}));
		assertEquals(-1,Calculation.maxNum(new int[] {-1,-12,-3,-4,-2}));
	
	}
	
    
}
