package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class RightClick extends CommonMethods {
	// Task for contextClick
//	 Navigate to https://www.saucedemo.com
//		 Right click on the password textbox 
//		 Close the browser 
	public static void main (String [] args) throws InterruptedException
	{
		
		CommonMethods.setUpDriver("firefox", "https://www.saucedemo.com" );
		WebElement rightClick=driver.findElement(By.cssSelector("input[id='password']"));
		Actions action= new Actions(driver);
		action.contextClick(rightClick).perform();
		Thread.sleep(3000);
		driver.quit();
	}
}
