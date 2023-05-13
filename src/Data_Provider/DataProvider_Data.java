package Data_Provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Data {
	
	@DataProvider(name="TestData")
	public Object[][] data() {
		
		return new Object[][] {{"U1","P1"},
			                   {"U2","P2"},
			                   {"U3","P3"} 
		                         };
		
		
	}

	
	@Test(dataProvider="TestData")
	public void data(String data1,String data2) throws InterruptedException {
		
		System.out.println(data1+" | "+data2);

	}
	
}
