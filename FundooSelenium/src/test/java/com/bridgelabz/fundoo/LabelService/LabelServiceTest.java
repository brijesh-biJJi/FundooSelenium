package com.bridgelabz.fundoo.LabelService;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bridgelabz.fundoo.AbstractChromeWebDriverTest;

public class LabelServiceTest extends AbstractChromeWebDriverTest {
	
	@Test
	public void testCreateLabel() 
	{
		driver.get("http://localhost:4200/login");
		
		WebElement emailElement = driver.findElement(By.id("email"));
		emailElement.sendKeys("brijeshkanchan7@gmail.com");
		
		sleep(2);
		
		WebElement passwordElement = driver.findElement(By.id("pass"));
		passwordElement.sendKeys("abcd");
		
		sleep(2);
		
		WebElement submitElement = driver.findElement(By.id("submit"));
		submitElement.click();
		
		
		sleep(15);
		
		driver.manage().window().maximize();
		
		WebElement sideNavElement = driver.findElement(By.id("sideMenu"));
		sideNavElement.click();
		
		sleep(2);
		
		WebElement editLabelElement = driver.findElement(By.id("onClickEditLabel"));
		editLabelElement.click();
		
		
		WebElement createLabelElement = driver.findElement(By.id("onClickCreateLabel"));
		createLabelElement.sendKeys("Test label");
																	
		WebElement submitLabelElement = driver.findElement(By.id("onClickSubmitLabel"));
		submitLabelElement.click();
		
		sleep(2);
		
		
		
		WebElement element = driver.findElement(By.id("onClickRefresh"));
		element.click();
		sleep(10);
		
		
		WebElement sideElement = driver.findElement(By.id("sideMenu"));
		sideElement.click();
		
		sleep(5);
		
		
	}
	
	@Test
	public void testEditLabel() {
		extentTest=extentReport.createTest("EditLabelTest");
		driver.get("http://localhost:4200/login");
		
		WebElement emailElement = driver.findElement(By.id("email"));
		emailElement.sendKeys("brijeshkanchan7@gmail.com");
		
		sleep(2);
		
		WebElement passwordElement = driver.findElement(By.id("pass"));
		passwordElement.sendKeys("abcd");
		
		sleep(2);
		
		WebElement submitElement = driver.findElement(By.id("submit"));
		submitElement.click();
		
		
		sleep(15);
		
		driver.manage().window().maximize();
		
		WebElement sideNavElement = driver.findElement(By.id("sideMenu"));
		sideNavElement.click();
		
		sleep(2);
		
		WebElement editLabelElement = driver.findElement(By.id("onClickEditLabel"));
		editLabelElement.click();
		
		
		WebElement inputLabelElement = driver.findElement(By.id("inputLabel"));
		inputLabelElement.clear();
		inputLabelElement.sendKeys("Edited Label");
																	
		WebElement clickEditLabelElement = driver.findElement(By.id("clickEdit"));
		clickEditLabelElement.click();
		

		sleep(1);
		
		WebElement element = driver.findElement(By.id("onClickRefresh"));
		element.click();
		sleep(10);
		
		
		WebElement sideElement = driver.findElement(By.id("sideMenu"));
		sideElement.click();
		
		sleep(5);
	}
	
	
	@Test
	public void testDeleteLabel() {
		extentTest=extentReport.createTest("DeleteLabelrTest");
		driver.get("http://localhost:4200/login");
		
		WebElement emailElement = driver.findElement(By.id("email"));
		emailElement.sendKeys("brijeshkanchan7@gmail.com");
		
		sleep(2);
		
		WebElement passwordElement = driver.findElement(By.id("pass"));
		passwordElement.sendKeys("abcd");
		
		sleep(2);
		
		WebElement submitElement = driver.findElement(By.id("submit"));
		submitElement.click();
		
		
		sleep(15);
		
		driver.manage().window().maximize();
		
		WebElement sideNavElement = driver.findElement(By.id("sideMenu"));
		sideNavElement.click();
		
		sleep(2);
		
		WebElement editLabelElement = driver.findElement(By.id("onClickEditLabel"));
		editLabelElement.click();
		
		sleep(2);
		WebElement deleteLabelElement = driver.findElement(By.id("deleteLabel"));
		deleteLabelElement.click();
																	
		
		sleep(1);
		
		WebElement element = driver.findElement(By.id("onClickRefresh"));
		element.click();
		sleep(10);
		
		
		WebElement sideElement = driver.findElement(By.id("sideMenu"));
		sideElement.click();
		
		sleep(5);
	}
	
	@Test
	public void testAddLabel() {
		driver.get("http://localhost:4200/login");
		
		WebElement emailElement = driver.findElement(By.id("email"));
		emailElement.sendKeys("brijeshkanchan7@gmail.com");
		
		sleep(2);
		
		WebElement passwordElement = driver.findElement(By.id("pass"));
		passwordElement.sendKeys("abcd");
		
		sleep(2);
		
		WebElement submitElement = driver.findElement(By.id("submit"));
		submitElement.click();
		
		
		sleep(15);
		
		driver.manage().window().maximize();
		
		WebElement sideNavElement = driver.findElement(By.id("sideMenu"));
		sideNavElement.click();
		
		sleep(2);
		
		WebElement moreElement = driver.findElement(By.id("moreIcon"));
		moreElement.click();
		
		
		WebElement addLabelElement = driver.findElement(By.id("addLabel"));
		addLabelElement.click();
		
		
		WebElement searchLabelElement = driver.findElement(By.id("searchLabel"));
		searchLabelElement.sendKeys("fir");
		
		sleep(3);
		WebElement checkLabelElement = driver.findElement(By.cssSelector("#checkLabel > label > div"));
		checkLabelElement.click();
		
		
		
		WebElement element = driver.findElement(By.id("onClickRefresh"));
		element.click();
		
		sleep(5);
	}
	
	@Test
	public void testSearchAndAddLabel() {
		driver.get("http://localhost:4200/login");
		
		WebElement emailElement = driver.findElement(By.id("email"));
		emailElement.sendKeys("brijeshkanchan7@gmail.com");
		
		sleep(2);
		
		WebElement passwordElement = driver.findElement(By.id("pass"));
		passwordElement.sendKeys("abcd");
		
		sleep(2);
		
		WebElement submitElement = driver.findElement(By.id("submit"));
		submitElement.click();
		
		
		sleep(15);
		
		driver.manage().window().maximize();
		
		WebElement sideNavElement = driver.findElement(By.id("sideMenu"));
		sideNavElement.click();
		
		sleep(2);
		
		WebElement moreElement = driver.findElement(By.id("moreIcon"));
		moreElement.click();
		
		
		WebElement addLabelElement = driver.findElement(By.id("addLabel"));
		addLabelElement.click();
		
		sleep(2);
		WebElement searchLabelElement = driver.findElement(By.id("searchLabel"));
		searchLabelElement.sendKeys("new label");
		
		sleep(3);
		
		WebElement createLabelElement = driver.findElement(By.id("createLabel"));
		createLabelElement.click();
		
		sleep(2);
		WebElement element = driver.findElement(By.id("onClickRefresh"));
		element.click();
		sleep(10);
		
		
		WebElement sideElement = driver.findElement(By.id("sideMenu"));
		sideElement.click();
		
		sleep(5);
	}
	
}
