package UnitTesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MultipleThreeTest {

	@Before
	public void setUp() 
	{
		System.out.println("Before");
	}
	@Test
	public void checkMultiple()
	{
		assertEquals(false,MultipleThree.Multiple(13));
	}
	
	@After
	public void tearDown()
	{
		System.out.println("After");
	}
}
