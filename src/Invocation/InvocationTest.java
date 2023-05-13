package Invocation;
import org.testng.annotations.Test;

public class InvocationTest {
	
	@Test(invocationCount=5)
	public void test( ) {
		
		System.out.println("calling test");
	}

}
