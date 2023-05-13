package DependsOnMethods;
import org.testng.annotations.Test;

public class DependsOnMethodsTest {
	
	@Test
	public void method() {
		
	//	int a =10/0;
		int b=10/1;
		
	}
	
	@Test(dependsOnMethods="method")
	public void method1() {
		
		System.out.println("executing the depends on method");
	}

}
