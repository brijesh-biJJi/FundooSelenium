package com.bridgelabz.fundoo.UserService;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.bridgelabz.fundoo.AbstractChromeWebDriverTest;

public class ChangePasswordTest extends AbstractChromeWebDriverTest{
  
	JavascriptExecutor jse;
	  @Test
	  public void testChangePassword() {
		  driver.get("http://localhost:4200/changePassword");
			
			sleep(2);
					
			WebElement createPassElement = driver.findElement(By.id("create"));
			createPassElement.sendKeys("abcd");
			
			WebElement confirmPassElement = driver.findElement(By.id("confirm"));
			confirmPassElement.sendKeys("abcd");
			
			sleep(2);
			jse=(JavascriptExecutor)driver;
//			jse.executeScript("scroll(0,100)");
			screenCapture(new Exception().getStackTrace()[0].getMethodName());
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//			JavascriptExecutor executor = (JavascriptExecutor)driver;
//			executor.executeScript("arguments[0].click();", element);
//			
//			sleep(2);
			WebElement submitElement = driver.findElement(By.id("submit"));
			submitElement.click();
		
		
			sleep(10);
			
			
			screenCapture(new Exception().getStackTrace()[0].getMethodName());
			//Check URL
			assertEquals("http://localhost:4200/login", driver.getCurrentUrl());
			
	  }
}
