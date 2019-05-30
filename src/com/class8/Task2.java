package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task2 extends CommonMethods {
//	
//	Ahead to http://uitestpractice.com/Students/Index
//	Click on the Actions
//	Handle the drag and drop
//	Close the browser
	
	public static void main (String [] args) throws InterruptedException
	{
		setUpDriver("chrome", " http://uitestpractice.com/Students/Index");
		WebElement drag=driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop= driver.findElement(By.xpath("div[class='col col-md-4 col-offset-8']"));
		Actions action= new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
		
	}
}
