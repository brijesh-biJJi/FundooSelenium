package com.bridgelabz.fundoo.UserService;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.fundoo.AbstractChromeWebDriverTest;

public class UserServiceTest extends AbstractChromeWebDriverTest{
  
	@Test
	  public void testUserRegistration() throws IOException {
		  driver.get("http://localhost:4200/register");
		  
		  	
			
		  	WebElement nameElement = driver.findElement(By.id("mat-input-0"));
			nameElement.sendKeys("brijesh");
			sleep(2);
			
			WebElement emailElement = driver.findElement(By.id("mat-input-1"));
			emailElement.sendKeys("brijeshkanchan7@gmail.com");
			
			sleep(2);
			
			WebElement passwordElement = driver.findElement(By.id("mat-input-2"));
			passwordElement.sendKeys("abcd");
			
			sleep(2);
			
			WebElement confirmPasswordElement = driver.findElement(By.id("mat-input-3"));
			confirmPasswordElement.sendKeys("abcd");
			
			sleep(2);
			WebElement phoneElement = driver.findElement(By.id("mat-input-4"));
			phoneElement.sendKeys("9874563217");
			
			screenCapture(new Exception().getStackTrace()[0].getMethodName());
			WebElement submitElement = driver.findElement(By.cssSelector("body > app-root > app-registration > div > mat-card > div > form > mat-card-content > mat-card-actions > button > span"));
			submitElement.click();
			
			sleep(10);
			System.out.println(driver.getCurrentUrl());
			screenCapture(new Exception().getStackTrace()[0].getMethodName());
			//Check URL
			assertEquals("http://localhost:4200/login", driver.getCurrentUrl());
	  }
	
	
	  @Test
	  public void testUserLogin() {
		  driver.get("http://localhost:4200/login");
			
			WebElement emailElement = driver.findElement(By.id("mat-input-0"));
			emailElement.sendKeys("brijeshkanchan7@gmail.com");
			
			sleep(2);
			
			WebElement passwordElement = driver.findElement(By.id("mat-input-1"));
			passwordElement.sendKeys("abcd");
			
			sleep(2);
			
			WebElement submitElement = driver.findElement(By.cssSelector("body > app-root > app-login > div > mat-card > div > mat-card-content > mat-card-actions > button > span"));
			submitElement.click();
			
			sleep(2);
			
			WebElement brandNameElement = driver.findElement(By.cssSelector("body > app-root > app-dashboard > div > div.toolbar > mat-toolbar > span > h1"));
			System.out.println("Brand Name : "+brandNameElement.getText());
			
			assertEquals("Fundoo", brandNameElement.getText());
	  }
	  
	  @Test
	  public void testUserForgotPassword() {
		  driver.get("http://localhost:4200/login");
			
			sleep(2);
			
			WebElement forgotPasswordLink = driver.findElement(By.cssSelector("body > app-root > app-login > div > mat-card > div > mat-card-content > mat-card-actions > a:nth-child(5)"));
			forgotPasswordLink.click();
			
			
			
			WebElement emailElement = driver.findElement(By.id("email"));
			emailElement.sendKeys("brijeshkanchan7@gmail.com");
			
			
			
			WebElement submitElement = driver.findElement(By.id("submit"));
			submitElement.click();
			
			sleep(5);
			System.out.println(driver.getCurrentUrl());
			
			sleep(5);
			//Check URL
			assertEquals("http://localhost:4200/login", driver.getCurrentUrl());
			
		
	  }
	  
	  @Test
	  public void testUserChangePassword() {
		  driver.get("http://localhost:4200/changePassword");
			
			sleep(2);
					
			WebElement createPassElement = driver.findElement(By.id("create"));
			createPassElement.sendKeys("abcd");
			
			WebElement confirmPassElement = driver.findElement(By.id("confirm"));
			confirmPassElement.sendKeys("abcd");
			
			sleep(5);
			
			WebElement saveElement=driver.findElement(By.cssSelector("body > app-root > app-changepassword > div > mat-card > div > mat-card-content > mat-card-actions > button > span"));
			saveElement.click();
			sleep(10);
			System.out.println(driver.getCurrentUrl());
			
			sleep(5);
			//Check URL
			assertEquals("http://localhost:4200/login", driver.getCurrentUrl());
			
		
	  }
	  
}
