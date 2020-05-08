package com.bridgelabz.fundoo.UserService;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.fundoo.AbstractChromeWebDriverTest;

public class UserServiceTest extends AbstractChromeWebDriverTest{
  
	@Test
	  public void testUserRegistration() {
		  driver.get("http://localhost:4200/register");
			
		  	WebElement nameElement = driver.findElement(By.id("mat-input-0"));
			nameElement.sendKeys("Vandana");
			sleep(2);
			
			WebElement emailElement = driver.findElement(By.id("mat-input-1"));
			emailElement.sendKeys("vandanasalian@gmail.com");
			
			sleep(2);
			
			WebElement passwordElement = driver.findElement(By.id("mat-input-2"));
			passwordElement.sendKeys("abcd");
			
			sleep(2);
			
			WebElement confirmPasswordElement = driver.findElement(By.id("mat-input-3"));
			confirmPasswordElement.sendKeys("abcd");
			
			sleep(2);
			WebElement phoneElement = driver.findElement(By.id("mat-input-4"));
			phoneElement.sendKeys("9874563217");
			
			WebElement submitElement = driver.findElement(By.cssSelector("body > app-root > app-registration > div > mat-card > div > form > mat-card-content > mat-card-actions > button > span"));
			submitElement.click();
			
			sleep(5);
			System.out.println(driver.getCurrentUrl());
			
			//Check URL
			assertEquals("http://localhost:4200/login", driver.getCurrentUrl());
	  }
	
	
	  @Test
	  public void testUserLogin() {
		  driver.get("http://localhost:4200/login");
			
			WebElement nameElement = driver.findElement(By.id("mat-input-0"));
			nameElement.sendKeys("brijeshkanchan7@gmail.com");
			
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
}
