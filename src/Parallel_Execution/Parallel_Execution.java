package Parallel_Execution;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Execution {
	
	@Test
	public void test1() throws InterruptedException {
		System.out.println("first method "+Thread.currentThread().getId());
		WebDriver	driver = new ChromeDriver(); 
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.opencart.com/index.php?route=account/register");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void test2() throws InterruptedException {
		System.out.println("second method  "+Thread.currentThread().getId());
		WebDriver	driver = new ChromeDriver(); 
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/");
		driver.close();
	}
	@Test
	public void test3() throws InterruptedException {
		System.out.println("third method  "+Thread.currentThread().getId());
		WebDriver	driver = new ChromeDriver(); 
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		driver.close();
	}

}
