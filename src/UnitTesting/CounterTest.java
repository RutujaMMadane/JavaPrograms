package UnitTesting;
import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;

public class CounterTest extends TestCase {
	
	public CounterTest()
	{
		
	}
	protected void setUp() { // creates a (simple) test fixture
		 
		 }
		 protected void tearDown() 
		 { 
			 
		 } // no resources to release
		 public void testIncrement() 
		 {
		    assertTrue(Counter.increment() == 1);
		    assertTrue(Counter.increment() == 1);
		 }
		 public void testDecrement() {
			 			 
		     assertTrue(Counter.decrement() == -1);
		     assertTrue(Counter.decrement() == -1);
		 }
    	
}
	
	

 