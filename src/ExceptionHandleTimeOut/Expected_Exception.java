package ExceptionHandleTimeOut;

import org.testng.annotations.Test;

public class Expected_Exception {
	
@Test(expectedExceptions=NumberFormatException.class)
	public void test() {
	String input="100A";
	Integer.parseInt(input);
		
	}

}
