package com.class7;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class iFrame extends CommonMethods {

	public static void main (String []args) throws InterruptedException
	{
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("input#name")).sendKeys("neapli");
		
		
		driver.quit();
		
	
	}
}
