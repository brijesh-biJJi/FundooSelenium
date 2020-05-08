package com.bridgelabz.fundoo;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FundooApp extends AbstractChromeWebDriverTest
{
	
	@Test
	public void testTitle() throws IOException {
	  
	  //Get the http://localhost:4200/login
	  driver.get("http://localhost:4200/login");
	 
	  //Get the Tittle
	  System.out.println("Title "+driver.getTitle());//FundooFrontEnd
	  
	  String actualTitle="FundooFrontEnd";
	  String expectedTitle=driver.getTitle();
	  
	  //check the output
	  assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void testSearchBar() throws IOException {
		driver.get("http://localhost:4200/dashboard");
		

		
		screenCapture(new Exception() 
		        .getStackTrace()[0] 
		                .getMethodName());
		
		sleep(2);
		WebElement searchBarElement = driver.findElement(By.cssSelector("body > app-root > app-dashboard > div > div.toolbar > mat-toolbar > div.search > mat-card > div.searchboxinput > input"));
		searchBarElement.sendKeys("First");
		screenCapture(new Exception() 
		        .getStackTrace()[0] 
		                .getMethodName());
		sleep(2);
		
		WebElement noteTitleElement = driver.findElement(By.cssSelector("#matdiv > div.matTitle > mat-card-title"));
		System.out.println("Note Title : "+noteTitleElement.getText());//Note Title : First Note
		
		String actualNoteTitle="First Note";
		String expectedNoteTitle=noteTitleElement.getText();
		
		assertEquals(actualNoteTitle, expectedNoteTitle);
	}
 

}
