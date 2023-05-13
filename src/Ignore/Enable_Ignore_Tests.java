package Ignore;

import org.testng.annotations.Test;

public class Enable_Ignore_Tests {
	
	@Test(enabled=true)
	public void test1() {
		System.out.println("test1");
		
	}
	@Test(enabled=false)
	public void test2() {
		System.out.println("test2");
	}

}
