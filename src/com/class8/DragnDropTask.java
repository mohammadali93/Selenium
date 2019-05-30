package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class DragnDropTask extends CommonMethods {

	public static void main (String [] args) throws InterruptedException
	{
	setUpDriver("chrome", "https://jqueryui.com/droppable/");
	driver.findElement(By.cssSelector("iframe.'demo-frame'"));
	WebElement drag=driver.findElement(By.cssSelector("div#draggable"));
	WebElement drop= driver.findElement(By.cssSelector("div#droppable"));
	Actions action= new Actions(driver);
	action.dragAndDrop(drag, drop).perform();
	Thread.sleep(3000);
	driver.quit();
	}
}
