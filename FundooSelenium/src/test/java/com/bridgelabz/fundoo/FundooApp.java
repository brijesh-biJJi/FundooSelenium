package com.bridgelabz.fundoo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FundooApp 
{
	private WebDriver driver;
	
	@BeforeTest
	public void beforeTest() 
	{
		 //Download the WebDriver Excutable
		  WebDriverManager.chromedriver().setup();
		  
		  //Create a instance of your WebDriver
		  driver=new ChromeDriver();
	}
	
	@Test
	public void testTitle() {
	  
	  //Get the http://localhost:4200/login
	  driver.get("http://localhost:4200/login");
	  
	  //Get the Tittle
	  System.out.println("Title "+driver.getTitle());
	  
	  String actualTitle="FundooFrontEnd";
	  String expectedTitle=driver.getTitle();
	  
	  //check the output
	  assertEquals(actualTitle, expectedTitle);
	}
  
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
