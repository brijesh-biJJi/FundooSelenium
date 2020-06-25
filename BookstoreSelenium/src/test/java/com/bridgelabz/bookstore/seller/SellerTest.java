package com.bridgelabz.bookstore.seller;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.bookstore.AbstractChromeWebDriverTest;

public class SellerTest extends AbstractChromeWebDriverTest{
  
	JavascriptExecutor jse;

	
	@Test
  public void testAddBook() {
	  extentTest=extentReport.createTest("AddBookTest");
	  driver.get("http://localhost:4200/login");
		
		WebElement emailElement = driver.findElement(By.name("email"));
		emailElement.sendKeys("brijeshkanchan7@gmail.com");
		
		sleep(2);
		
		WebElement passwordElement = driver.findElement(By.name("password"));
		passwordElement.sendKeys("brijesh1");
		
		sleep(2);
		
		WebElement radioElement = driver.findElement(By.id("radioSeller"));
		radioElement.click();
		sleep(2);
		
		WebElement loginElement = driver.findElement(By.id("submit"));
		loginElement.click();
		
		sleep(3);
		
		driver.manage().window().maximize();
		sleep(15);
		
		
		WebElement clickElement = driver.findElement(By.id("addBtn"));
		clickElement.click();
		
		WebElement bookNameElement = driver.findElement(By.id("bookName"));
		bookNameElement.sendKeys("Lorem");
		
		WebElement authorElement = driver.findElement(By.id("bookAuthor"));
		authorElement.sendKeys("Richard");
		
		sleep(2);
		
		WebElement priceElement = driver.findElement(By.id("price"));
		priceElement.sendKeys("500");
		
		sleep(2);
		
		WebElement qtyElement = driver.findElement(By.id("qty"));
		qtyElement.sendKeys("50");
		
		sleep(2);
		
		WebElement descElement = driver.findElement(By.id("desc"));
		descElement.sendKeys("Discovery of filler text");
		
		sleep(2);
		WebElement submitElement = driver.findElement(By.id("submit"));
		submitElement.click();
		
		sleep(5);
		
		jse=(JavascriptExecutor)driver;
		jse.executeScript("scroll(0,500)");

		sleep(3);
  }
	
	@Test
	  public void testEditBook() {
		  extentTest=extentReport.createTest("EditBookTest");
		  driver.get("http://localhost:4200/login");
			
			WebElement emailElement = driver.findElement(By.name("email"));
			emailElement.sendKeys("brijeshkanchan7@gmail.com");
			
			sleep(2);
			
			WebElement passwordElement = driver.findElement(By.name("password"));
			passwordElement.sendKeys("brijesh1");
			
			sleep(2);
			
			
			WebElement radioElement = driver.findElement(By.id("radioSeller"));
			radioElement.click();
			
			sleep(2);
			
			WebElement loginElement = driver.findElement(By.id("submit"));
			loginElement.click();
			
			sleep(3);
			
			driver.manage().window().maximize();
			sleep(15);
			
			
			WebElement clickElement = driver.findElement(By.id("editBtn"));
			clickElement.click();
			
			WebElement bookNameElement = driver.findElement(By.id("bookName"));
			bookNameElement.sendKeys("Ram");
			
			WebElement authorElement = driver.findElement(By.id("bookAuthor"));
			authorElement.sendKeys("tripathi");
			
			sleep(2);
			
			WebElement priceElement = driver.findElement(By.id("price"));
			priceElement.sendKeys("2");
			
			sleep(2);
			
			WebElement qtyElement = driver.findElement(By.id("qty"));
			qtyElement.sendKeys("2");
			
			sleep(2);
			
			WebElement descElement = driver.findElement(By.id("desc"));
			descElement.sendKeys("Mithila");
			
			sleep(2);
			WebElement submitElement = driver.findElement(By.id("submit"));
			submitElement.click();
			
			sleep(10);
			
	  }
	
	@Test
	  public void testDeleteBook() {
		  extentTest=extentReport.createTest("DeleteBookTest");
		  driver.get("http://localhost:4200/login");
			
			WebElement emailElement = driver.findElement(By.name("email"));
			emailElement.sendKeys("brijeshkanchan7@gmail.com");
			
			sleep(2);
			
			WebElement passwordElement = driver.findElement(By.name("password"));
			passwordElement.sendKeys("brijesh1");
			
			sleep(2);
			
			WebElement radioElement = driver.findElement(By.id("radioSeller"));
			radioElement.click();
			sleep(2);
			
			WebElement loginElement = driver.findElement(By.id("submit"));
			loginElement.click();
			
			sleep(3);

			driver.manage().window().maximize();
			sleep(10);
			
			
			WebElement clickElement = driver.findElement(By.id("deleteBtn"));
			clickElement.click();
			
			sleep(5);
			
	  }
	
	@Test
	  public void testVerifyBook() {
		  extentTest=extentReport.createTest("VerifyBookTest");
		  driver.get("http://localhost:4200/login");
			
			WebElement emailElement = driver.findElement(By.name("email"));
			emailElement.sendKeys("brijeshkanchan7@gmail.com");
			
			sleep(2);
			
			WebElement passwordElement = driver.findElement(By.name("password"));
			passwordElement.sendKeys("brijesh1");
			
			sleep(2);
			
			WebElement radioElement = driver.findElement(By.id("radioSeller"));
			radioElement.click();
			sleep(2);
			
			WebElement loginElement = driver.findElement(By.id("submit"));
			loginElement.click();
			
			sleep(3);

			
			driver.manage().window().maximize();
			sleep(15);
			
			
			WebElement clickElement = driver.findElement(By.id("verifyBtn"));
			clickElement.click();
			
			sleep(5);
			
	  }
	
	@Test
	  public void testSearchBook() {
		  extentTest=extentReport.createTest("SearchBookTest");
		  driver.get("http://localhost:4200/login");
			
			WebElement emailElement = driver.findElement(By.name("email"));
			emailElement.sendKeys("brijeshkanchan7@gmail.com");
			
			sleep(2);
			
			WebElement passwordElement = driver.findElement(By.name("password"));
			passwordElement.sendKeys("brijesh1");
			
			sleep(2);
			
			WebElement radioElement = driver.findElement(By.id("radioSeller"));
			radioElement.click();
			sleep(2);
			
			WebElement loginElement = driver.findElement(By.id("submit"));
			loginElement.click();
			
			sleep(3);

			
			driver.manage().window().maximize();
			sleep(10);
			
			WebElement searchElement = driver.findElement(By.id("search"));
			searchElement.sendKeys("Sita");
			
			sleep(5);
			
	}
}
