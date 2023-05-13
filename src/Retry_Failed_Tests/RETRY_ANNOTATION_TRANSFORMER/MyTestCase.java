package Retry_Failed_Tests.RETRY_ANNOTATION_TRANSFORMER;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MyTestCase {
	@Test()
	public void test1() {

		assertEquals(true, false);
}
	
	@Test()
	public void test2() {
		assertEquals(true, true);

}
	@Test()
	public void test3() {
		assertEquals(true, false);

}
	@Test()
	public void test4() {
		assertEquals(true, false);

}


}
