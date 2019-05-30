package com.GroupTasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task3 extends CommonMethods {

	public static void main (String [] args)
	{
		
//		1.Open chrome browser
//		2.Go to “https://jqueryui.com/”
//		3.Click on “Datepicker”
//		4.Select August 10 of 2019
//		5.Verify date “08/10/2019” has been entered succesfully
//		6.Close browser
		
		setUpDriver("chrome", "https://jqueryui.com/");
		driver.findElement(By.xpath("//*[@id=\'sidebar\']/aside[2]/ul/li[6]/a")).click();
		WebElement frame1 =  driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.cssSelector("input#datepicker")).click();
		int expectedValue=8/29/2019;
		while(driver.findElements(By.className("//*[@id=\'ui-datepicker-div\']/table"));
		
		List <WebElement> cols=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[]"));
		) {
			
		}
		
	}
}
