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
		
		
		driver.manage().window().maximize();
		sleep(15);
		
		
		WebElement createElement = driver.findElement(By.id("takeANote"));
		createElement.click();
		
		WebElement titleElement = driver.findElement(By.id("noteTitle"));
		titleElement.sendKeys("Sixth Selenium Note");
		
		sleep(2);
		
		WebElement descElement = driver.findElement(By.id("noteDesc"));
		descElement.sendKeys("test sixth Note");
		
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
		extentTest=extentReport.createTest("FundooUpdateNoteTest");
		driver.get("http://localhost:4200/login");
		
		WebElement emailElement = driver.findElement(By.id("email"));
		emailElement.sendKeys("brijeshkanchan7@gmail.com");
		
		sleep(2);
		
		WebElement passwordElement = driver.findElement(By.id("pass"));
		passwordElement.sendKeys("abcd");
		
		sleep(2);
//		screenCapture(new Exception().getStackTrace()[0].getMethodName());
		WebElement submitElement = driver.findElement(By.id("submit"));
		submitElement.click();
		
		sleep(15);
		
		
		driver.manage().window().maximize();
		
		WebElement sideNavElement = driver.findElement(By.id("sideMenu"));
		sideNavElement.click();
		
		WebElement matTitleElement = driver.findElement(By.id("matTitle"));
		matTitleElement.click();
		
		WebElement updateTitleElement = driver.findElement(By.id("title"));
		updateTitleElement.clear();
		updateTitleElement.sendKeys("Selenium Note Update ");
		
		WebElement descTitleElement = driver.findElement(By.id("desc"));
		descTitleElement.clear();
		descTitleElement.sendKeys("Note description Update");
		
		sleep(2);
//		screenCapture(new Exception().getStackTrace()[0].getMethodName());
		WebElement closeElement = driver.findElement(By.id("close"));
		closeElement.click();
		
//		sleep(10);
//		screenCapture(new Exception().getStackTrace()[0].getMethodName());
	}
	
	@Test
	public void testArchiveNote() {
		
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
		
		WebElement archiveIcon = driver.findElement(By.id("archiveIcon"));
		archiveIcon.click();
		
		sleep(3);
		screenCapture(new Exception().getStackTrace()[0].getMethodName());
		
		WebElement sideNavElement = driver.findElement(By.id("sideMenu"));
		sideNavElement.click();
		
		sleep(2);
		
		WebElement archiveSideNavElement = driver.findElement(By.id("onClickArchive"));
		archiveSideNavElement.click();
		
		sleep(3);
		screenCapture(new Exception().getStackTrace()[0].getMethodName());
	}
	
	@Test
	public void testDeteleNOte() {
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
		
		
		
		WebElement moreElement = driver.findElement(By.cssSelector("#matdiv > div.noteIcon > app-note-icon > div > div:nth-child(9) > a > img"));
		moreElement.click();
		
		sleep(2);
		screenCapture(new Exception().getStackTrace()[0].getMethodName());
		
		WebElement deleteElement = driver.findElement(By.id("deleteIcon"));
		deleteElement.click();
		
		sleep(3);
		
		
		WebElement sideNavElement = driver.findElement(By.id("sideMenu"));
		sideNavElement.click();
		
		sleep(3);
		
		WebElement trashSideNavElement = driver.findElement(By.id("onClickTrash"));
		trashSideNavElement.click();
		
		sleep(3);
		screenCapture(new Exception().getStackTrace()[0].getMethodName());
		
		
	}
	
	@Test 
	public void testPinNote() {
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
		
		screenCapture(new Exception().getStackTrace()[0].getMethodName());
		
		WebElement pinNoteElement = driver.findElement(By.id("pin"));
		pinNoteElement.click();
		
		sleep(2);
		
		WebElement element = driver.findElement(By.id("onClickRefresh"));
		element.click();
		sleep(10);
		screenCapture(new Exception().getStackTrace()[0].getMethodName());
	}
	
	@Test 
	public void testColorNote() {
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
		
		sleep(2);
		screenCapture(new Exception().getStackTrace()[0].getMethodName());
		WebElement addColorElement = driver.findElement(By.id("addColor"));
		addColorElement.click();
		sleep(1);
		
		
		WebElement clickColorElement = driver.findElement(By.id("clickColor"));
		clickColorElement.click();
		
		sleep(2);

		WebElement element = driver.findElement(By.id("onClickRefresh"));
		element.click();
		sleep(10);
		screenCapture(new Exception().getStackTrace()[0].getMethodName());
	}
	
	
	//Labels
	
	@Test
	public void testCreateLabel() {
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
}
