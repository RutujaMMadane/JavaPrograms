package UnitTesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MultipleTest {
	
	@Before
	public void setUp() throws Exception
	{
		System.out.println("Before");
	}

	@Test
	public void checkEven() {
		assertEquals(true, MultipleThree.Multiple(9));
		assertFalse(MultipleThree.Multiple(10));
		assertTrue(MultipleThree.Multiple(9));
		assertSame(true, MultipleThree.Multiple(9));
		assertNotSame(true, MultipleThree.Multiple(10));
		assertNull(null);
		assertNotNull(10);
	}
	@After
	public void tewstDown() throws Exception
	{
		System.out.println("After");
	}

}
