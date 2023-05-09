package UnitTesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UnitTestingEx {
	@Before
	public void beforeAll() {
		System.out.println("Connect to the database");
	}
	@Before
	public void beforeEach() {
		System.out.println("Load the schema");
	}
	@After
	public void afterAll() {
		System.out.println("Disconnect to the database");
	}
	@After
	public void afterEach() {
		System.out.println("Drop the schema");
	}
	@Test
	public void testone() {
		System.out.println("Test One");
	}
	@Test
	public void testTwo() {
		System.out.println("Test Two");
	}

}
