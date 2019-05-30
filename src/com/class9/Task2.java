package com.class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//1.Open chrome browser
//2.Go to “https://the-internet.herokuapp.com/”
//	3.Click on “Click on the “Dynamic Controls” link
//	4.Select checkbox and click Remove
//	5.Click on Add button and verify “It's back!” text is displayed
//	6.Close the browser
	
import utils.CommonMethods;

public class Task2 extends CommonMethods {

	public static void main (String  [] args)
	{
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		driver.findElement(By.xpath("//*[@id='checkbox']/input")).click();		
		driver.findElement(By.xpath("//*[@id=\'checkbox-example\']/button")).click();
		
		WebElement el= driver.findElement(By.xpath("//button[text()='Add']"));
		if(el.isDisplayed()) {
			String text= el.getText();
			System.out.println(text);
		}else {
			System.out.println("Button is not displayed");
		}
		
		
		driver.quit();
	}
}
