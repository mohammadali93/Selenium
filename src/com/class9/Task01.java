package com.class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

//TC 1: Verify element is present
//Open chrome browser
//Go to “https://the-internet.herokuapp.com/”
//Click on “Click on the “Dynamic Loading” link
//Click on “Example 1...” and click on “Start”
//Verify element with text “Hello World!” is displayed
//Close the browser

public class Task01 extends CommonMethods
{

	public static void main (String [] args)
	{
		setUpDriver("chrome", "https://the-internet.herokuapp.com/" );
		driver.findElement(By.xpath("//*[@id='content']/ul/li[14]/a")).click();
		driver.findElement(By.cssSelector("//*/#content > div > a:nth-child(5)")).click();
		driver.findElement(By.xpath("[@id=\'start\']/button")).click();
		
//		WebDriverWait wait= new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("[@id=\'start\']/button")));
		
		WebElement ele= driver.findElement(By.xpath("[@id=\'start\']/button"));
		
		if (ele.isDisplayed()) {
			String text=ele.getText();
			System.out.println(text);
		}else {
			System.out.println("Element is not displayed");
		}
		
		driver.quit();
	}
}
