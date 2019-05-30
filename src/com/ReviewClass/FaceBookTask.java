package com.ReviewClass;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class FaceBookTask extends CommonMethods {

	public static void main (String [] args) throws InterruptedException
	{
		CommonMethods.setUpDriver("chrome", "http://www.facebook.com");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Dennis");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Moldova");
		driver.findElement(By.cssSelector("input[aria-label^='Mobile']")).sendKeys("12345678910");
		driver.findElement(By.cssSelector("input[aria-label$='word']")).sendKeys("idontknow");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("select[name$='nth']")).sendKeys("September");
		driver.findElement(By.cssSelector("select[id*='day']")).sendKeys("6");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("select[id^='ye']")).sendKeys("1993");
		
		driver.quit();
	}
}
