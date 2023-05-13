package Data_Provider;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
WebDriver driver;
	
	@DataProvider(name="TestData")
	public Object[][] data() {
		
		return new Object[][] {{"john123","john","winchester","john12@gmail.com","johnxxx"},
			                   {"kevin32","kevin","vasin","kevin32@gmail.com","kevin**"},
			                   {"sam987","sam","wayne","sam765@gmail.com","sam000"} 
		                         };
		
		
	}
	
	
	@Test(dataProvider="TestData")
	public void register(String uname,String fname,String lname,String email,String pwd) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "S:\\JARS\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(lname);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
	
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}
