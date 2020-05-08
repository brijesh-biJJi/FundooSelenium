package com.bridgelabz.fundoo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class AbstractChromeWebDriverTest {

	protected WebDriver driver;

	public AbstractChromeWebDriverTest() {
		super();
	}

	@BeforeTest
	public void beforeTest() {
		 //Download the WebDriver Executable
		  WebDriverManager.chromedriver().setup();
		  
		  //Create a instance of your WebDriver
		  driver=new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		  driver.quit();
	  }
	
	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	static int i=1;
	public void screenCapture(String methName)  {
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File screenName=new File("D:\\FundooSelenium\\FundooSelenium\\screenshots\\"+methName+ i++ +".png");
		 try {
			FileUtils.copyFile(scrFile, screenName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		 Reporter.log("<br><img src='"+screenName+"' height='250' width='500' /></br>");
	}

}
