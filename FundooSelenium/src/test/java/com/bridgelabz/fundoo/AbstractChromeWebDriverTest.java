package com.bridgelabz.fundoo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

}
