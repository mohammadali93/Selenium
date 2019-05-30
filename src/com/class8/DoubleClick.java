package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class DoubleClick extends CommonMethods{

	public static void main(String [] args) throws InterruptedException
	{
		setUpDriver("firefox", "https://www.saucedemo.com" );
		
//	action.doubleClick(driver.findElement(By.cssSelector("input[type='password']"))).sendKeys("nepali").perform();
		 driver.findElement((By.xpath("//input[@data-test='password']"))).sendKeys("AAAAA");
	        Actions action = new Actions(driver);
	        action.doubleClick(driver.findElement(By.xpath("//input[@data-test='password']"))).perform();
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
