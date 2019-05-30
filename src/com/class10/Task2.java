package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

//
//Open chrome browser
//Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
//Login to the application
//Verify customer “Susan McLaren” is present in the table

public class Task2 extends CommonMethods {

	public static void main(String[] args) {
		
		setUpDriver("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Tester");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr"));
		String text="Susan Mclaren";
		
		
	}
}
