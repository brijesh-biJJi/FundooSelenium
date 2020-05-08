package com.bridgelabz.fundoo.UserService;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.fundoo.AbstractChromeWebDriverTest;

public class UserServiceTest extends AbstractChromeWebDriverTest{
  @Test
  public void testLogin() {
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
