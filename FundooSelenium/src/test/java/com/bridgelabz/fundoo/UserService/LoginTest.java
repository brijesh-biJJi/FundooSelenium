package com.bridgelabz.fundoo.UserService;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.fundoo.AbstractChromeWebDriverTest;

public class LoginTest extends AbstractChromeWebDriverTest{
	
  @Test
  public void testLogin() {
	  driver.get("http://localhost:4200/login");
		
		WebElement emailElement = driver.findElement(By.id("email"));
		emailElement.sendKeys("brijeshkanchan7@gmail.com");
		
		sleep(2);
		
		WebElement passwordElement = driver.findElement(By.id("pass"));
		passwordElement.sendKeys("abcd");
		
		sleep(2);
		screenCapture(new Exception().getStackTrace()[0].getMethodName());
		WebElement submitElement = driver.findElement(By.id("submit"));
		submitElement.click();
		
		sleep(10);
		
		WebElement brandNameElement = driver.findElement(By.cssSelector("body > app-root > app-dashboard > div > div.toolbar > mat-toolbar > span > h1"));
		System.out.println("Brand Name : "+brandNameElement.getText());
		
		sleep(2);
		screenCapture(new Exception().getStackTrace()[0].getMethodName());
		assertEquals("Fundoo", brandNameElement.getText());  
  }
  
  
}
