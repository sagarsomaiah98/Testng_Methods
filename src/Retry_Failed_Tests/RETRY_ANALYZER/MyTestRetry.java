package Retry_Failed_Tests.RETRY_ANALYZER;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;



public class MyTestRetry {
	
	@Test(retryAnalyzer = Retry_Failed_Tests.RETRY_ANALYZER.RetryAnayzer.class)
	public void method1() {

		assertEquals(true, false);
}
	
	@Test
	public void method2() {
		assertEquals(true, true);

}
	@Test(retryAnalyzer = Retry_Failed_Tests.RETRY_ANALYZER.RetryAnayzer.class)
	public void method3() {
		assertEquals(true, false);

}
	
	
	
}