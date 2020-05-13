package com.bridgelabz.fundoo.NoteService;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.UpAction;
import org.testng.annotations.Test;

import com.bridgelabz.fundoo.AbstractChromeWebDriverTest;

public class NoteServiceTest extends AbstractChromeWebDriverTest {
	
	
	
	@Test
	public void testCreateNote() 
	{
		driver.get("http://localhost:4200/login");
		
		WebElement emailElement = driver.findElement(By.id("email"));
		emailElement.sendKeys("brijeshkanchan7@gmail.com");
		
		sleep(2);
		
		WebElement passwordElement = driver.findElement(By.id("pass"));
		passwordElement.sendKeys("abcd");
		
		sleep(2);
		screenCapture(new Exception().getStackTrace()[0].getMethodName());
		WebElement loginElement = driver.findElement(By.id("submit"));
		loginElement.click();
		
		sleep(10);
		driver.get("http://localhost:4200/dashboard");
		driver.manage().window().maximize();
		sleep(15);
		
		
		WebElement createElement = driver.findElement(By.id("takeANote"));
		createElement.click();
		
		WebElement titleElement = driver.findElement(By.id("noteTitle"));
		titleElement.sendKeys("Fourth Selenium Note");
		
		sleep(2);
		
		WebElement descElement = driver.findElement(By.id("noteDesc"));
		descElement.sendKeys("test Fourth Note");
		
		sleep(2);
		screenCapture(new Exception().getStackTrace()[0].getMethodName());
		WebElement submitElement = driver.findElement(By.id("submit"));
		submitElement.click();
		
		sleep(15);
		
		
		WebElement element = driver.findElement(By.id("onClickRefresh"));
		element.click();
		sleep(10);
		screenCapture(new Exception().getStackTrace()[0].getMethodName());
	}
	
	@Test
	public void testUpdateNote() {
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
		driver.get("http://localhost:4200/dashboard");
		sleep(15);
		
		driver.manage().window().maximize();
		
		WebElement sideNavElement = driver.findElement(By.id("sideMenu"));
		sideNavElement.click();
		
		WebElement matTitleElement = driver.findElement(By.id("matTitle"));
		matTitleElement.click();
		
		WebElement updateTitleElement = driver.findElement(By.id("title"));
		updateTitleElement.clear();
		updateTitleElement.sendKeys("Selenium Note title test");
		
		WebElement descTitleElement = driver.findElement(By.id("desc"));
		descTitleElement.clear();
		descTitleElement.sendKeys("Selenium Note desc test");
		
		sleep(2);
		screenCapture(new Exception().getStackTrace()[0].getMethodName());
		WebElement closeElement = driver.findElement(By.id("close"));
		closeElement.click();
		
		sleep(10);
		screenCapture(new Exception().getStackTrace()[0].getMethodName());
	}
	
	
	
	
}
