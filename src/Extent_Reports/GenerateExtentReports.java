package Extent_Reports;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GenerateExtentReports {
	
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void startReport(){
	extent= new ExtentReports(System.getProperty("user.dir")+"/test-output/Myreport.html",true);
	extent.addSystemInfo("Host Name","LocalHost");
	extent.addSystemInfo("Environment","QA");
	extent.addSystemInfo("User Name","Som");
	extent.loadConfig(new File("S:\\WORKSPACE\\Testng_Methods\\spark-config.xml"));
	}
	
	@Test
	public void demoPass() {
		test=extent.startTest("demoPass");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS,"Assert Pass as condition is true");
	}
	
	@Test
	public void demoFail() {
		test=extent.startTest("demoFail");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL,"Assert Fail as condition is False");
	}
	
	@AfterMethod
	public void getResult(ITestResult result){
	if(result.getStatus()==ITestResult.FAILURE)
	{
	test.log(LogStatus.FAIL,result.getThrowable());
	}
	extent.endTest(test);
	}
	
	@AfterTest
	public void endReport() {
		extent.flush();
	}
	
	}

