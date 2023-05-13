package Parameters;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest {
	
	public static WebDriver driver;
	
	@Test
	@Parameters({"browser","url","uname","pwd"})
	public void logintest(String browser, String url, String uname, String pwd) {
		
		System.out.println(browser);
		System.out.println(url);
		System.out.println(uname);
		System.out.println(pwd);
		
		
		
		/*
		 * if(browser.equals("chrome")) { System.setProperty("webdriver.chrome.driver",
		 * "S:\\JARS\\chromedriver.exe"); driver = new ChromeDriver(); } else
		 * if(browser.equals("firefox")) { System.setProperty("webdriver.gecko.driver",
		 * "S:\\JARS\\geckodriver.exe"); driver = new FirefoxDriver(); }
		 * driver.manage().window().maximize(); driver.get(url);
		 * driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		 * driver.findElement(By.xpath("//input[@id='login-button']")).click();
		 * 
		 * driver.quit();
		 */
		 
		
		
	}

}
