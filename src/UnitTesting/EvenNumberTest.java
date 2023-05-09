package UnitTesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EvenNumberTest {

	@Before
	public void setUp() throws Exception
	{
		System.out.println("before");
	}
	@Test
	public void checkEven()
	{
		assertEquals(false, EvenNumber.evenNumber(13));
	}
	
	@After
	public void tearDown() throws Exception
	{
		System.out.println("after");
	}

}
