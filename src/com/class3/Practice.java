package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main (String [] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://ebay.com");
		Thread.sleep(3000);
		driver.findElement(By.id("gh-hide-if-nocss")).sendKeys("momibaba2");
	}
}
