package com.bridgelabz.bookstore;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class AbstractChromeWebDriverTest {

	protected WebDriver driver;
	protected ExtentHtmlReporter htmlReport;
	protected ExtentReports extentReport;
	protected ExtentTest extentTest;

	public AbstractChromeWebDriverTest() {
		super();
	}

	@BeforeTest
	public void beforeTest() {
////		String url="D:\\FundooSelenium\\FundooSelenium\\test-output\\myReport.html";
		htmlReport=new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/myReport.html");
		htmlReport.config().setDocumentTitle("Automation Report");//Title of the Report
		htmlReport.config().setReportName("Functional Report");//Name of the Report
		htmlReport.config().setTheme(Theme.DARK);
		
		extentReport=new ExtentReports();
		extentReport.attachReporter(htmlReport);
		
		//Set System Info
		extentReport.setSystemInfo("Hostname", "LocalHost");
		extentReport.setSystemInfo("OS", "Windows10");
		extentReport.setSystemInfo("Browser", "Chrome");
		
		
		
		
		
		 //Download the WebDriver Executable
//		  WebDriverManager.chromedriver().setup();
//		  
//		  //Create a instance of your WebDriver
//		  driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\setup\\chromedriver.exe");
		driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterTest
	public void afterTest() {
		extentReport.flush();
		  driver.quit();
	  }
	
	@AfterMethod
	public void testResult(ITestResult result) throws IOException
	{
		if(result.getStatus() == ITestResult.FAILURE) {
			extentTest.log(Status.FAIL,"Test Case Failed Is" + result.getName()); //To Add Name in Extent Report
			extentTest.log(Status.FAIL, "Test Case Failed Is" + result.getThrowable());//To Add Error/Exception in Extent Report
			
			String screenPath=screenCapture(result.getName());
			extentTest.addScreenCaptureFromPath(screenPath);
		}
		else if (result.getStatus() == ITestResult.SUCCESS) 
		{
			extentTest.log(Status.PASS,"Test Case Passed Is " + result.getName());
			String screenPath=screenCapture(result.getName());
			extentTest.addScreenCaptureFromPath(screenPath);
		}
	}
	
	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	static int i=1;
	public String screenCapture(String methName)  {
		String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scrFile=ts.getScreenshotAs(OutputType.FILE);
		
		//"D:\\FundooSelenium\\FundooSelenium\\screenshots\\"+methName+ i++ + dateName +".png";
		
		String dest=System.getProperty("user.dir")+ "/screenshots/" +methName+ i++ + dateName +".png";
		
		File finalDestName=new File(dest);
		 
		try 
		{
			FileUtils.copyFile(scrFile, finalDestName);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		 
//		Reporter.log("<br><img src='"+finalDestName+"' height='250' width='500' /></br>");
		return dest;
	}

}
