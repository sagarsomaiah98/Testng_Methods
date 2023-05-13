package Listeners;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListTest {
	
	@Test
	public void test1() {
		assertEquals(true, true);
		
	}
	@Test
	public void test2() {
		assertEquals(true, false);
		
		
	}
	@Test
	public void test() {
		//System.out.println("Test Skipped");
		throw new SkipException("Skipping this exception");
			
	}

}
