package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {

	public static void main (String [] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
