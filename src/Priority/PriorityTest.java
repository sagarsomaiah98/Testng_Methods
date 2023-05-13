package Priority;
import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority=-3)
	public void method() {
		System.out.println("method 1");
	}
	
	@Test(priority=1)
	public void Amethod() {
		System.out.println("method A");
	}
	@Test(priority=-4)
	public void Cmethod() {
		System.out.println("method C");
	}

}
