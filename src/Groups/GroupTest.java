package Groups;
import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(groups={"Smoke"})
	public void test1() {
		System.out.println("calling test 1");
}
	
	@Test(groups={"Smoke","Sanity"})
	public void test2() {
		System.out.println("calling test 2");
}
	
	@Test(groups={"Regression"})
	public void test3() {
		System.out.println("calling test 3");
}
	
	@Test(groups={"Sanity","Regression"})
	public void test4() {
		System.out.println("calling test 4");
}
	
	@Test(groups={"Windows.Regression"})
	public void test5() {
		System.out.println("calling test 5");
}
}