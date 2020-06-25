package com.bridgelabz.bookstore.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.bookstore.AbstractChromeWebDriverTest;

public class AdminServiceTest extends AbstractChromeWebDriverTest{
	@Test
	  public void testApproveBooks() {
		  extentTest=extentReport.createTest("ApproveBookTest");
		  driver.get("http://localhost:4200/login");
			
			WebElement emailElement = driver.findElement(By.name("email"));
			emailElement.sendKeys("nayan@gmail.com");
			
			sleep(2);
			
			WebElement passwordElement = driver.findElement(By.name("password"));
			passwordElement.sendKeys("nayankumar1");
			
			sleep(2);
			
			WebElement radioElement = driver.findElement(By.id("radioAdmin"));
			radioElement.click();
			sleep(2);
			
			WebElement loginElement = driver.findElement(By.id("submit"));
			loginElement.click();
			
			sleep(3);
			
			driver.manage().window().maximize();
			sleep(15);
			
			WebElement menuElement = driver.findElement(By.id("menuBtn"));
			menuElement.click();
			menuElement.click();
			
			sleep(3);
			
			
			WebElement sellerBookElement = driver.findElement(By.id("sellerBookBtn"));
			sellerBookElement.click();
			
			sleep(3);
			
			WebElement approveBookElement = driver.findElement(By.id("approveBtn"));
			approveBookElement.click();
			
			WebElement orderBookElement = driver.findElement(By.id("orderStatusBookBtn"));
			orderBookElement.click();
			
			sellerBookElement.click();
			
			sleep(3);
			
			
	}
	
	@Test
	  public void testRejectBooks() {
		  extentTest=extentReport.createTest("RejectBookTest");
		  driver.get("http://localhost:4200/login");
			
			WebElement emailElement = driver.findElement(By.name("email"));
			emailElement.sendKeys("nayan@gmail.com");
			
			sleep(2);
			
			WebElement passwordElement = driver.findElement(By.name("password"));
			passwordElement.sendKeys("nayankumar1");
			
			sleep(2);
			
			WebElement radioElement = driver.findElement(By.id("radioAdmin"));
			radioElement.click();
			sleep(2);
			
			WebElement loginElement = driver.findElement(By.id("submit"));
			loginElement.click();
			
			sleep(3);
			
			driver.manage().window().maximize();
			sleep(15);
			
			WebElement menuElement = driver.findElement(By.id("menuBtn"));
			menuElement.click();
			menuElement.click();
			
			sleep(3);
			
			
			WebElement sellerBookElement = driver.findElement(By.id("sellerBookBtn"));
			sellerBookElement.click();
			
			sleep(3);
			
			WebElement approveBookElement = driver.findElement(By.id("rejectBtn"));
			approveBookElement.click();
			
			
			
			sleep(3);
			
			
	}
	
	@Test
	  public void testOrderStatusBooks() {
		  extentTest=extentReport.createTest("OrderStatusBookTest");
		  driver.get("http://localhost:4200/login");
			
			WebElement emailElement = driver.findElement(By.name("email"));
			emailElement.sendKeys("nayan@gmail.com");
			
			sleep(2);
			
			WebElement passwordElement = driver.findElement(By.name("password"));
			passwordElement.sendKeys("nayankumar1");
			
			sleep(2);
			
			WebElement radioElement = driver.findElement(By.id("radioAdmin"));
			radioElement.click();
			sleep(2);
			
			WebElement loginElement = driver.findElement(By.id("submit"));
			loginElement.click();
			
			sleep(3);
			
			driver.manage().window().maximize();
			sleep(15);
			
			WebElement menuElement = driver.findElement(By.id("menuBtn"));
			menuElement.click();
			menuElement.click();
			
			sleep(3);
			
			
			WebElement orderStatusBookElement = driver.findElement(By.id("orderStatusBookBtn"));
			orderStatusBookElement.click();
			sleep(3);
			
			WebElement updateOrderStatusElement = driver.findElement(By.id("updateOrderStatusBtn"));
			updateOrderStatusElement.click();
			sleep(2);
			
			WebElement sellerBookElement = driver.findElement(By.id("sellerBookBtn"));
			sellerBookElement.click();
			orderStatusBookElement.click();
			
			sleep(3);
			
			
	}
	
	

}
