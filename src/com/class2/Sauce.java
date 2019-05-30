package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce {

	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2500);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2500);
		driver.findElement(By.className("btn_action")).click();
		driver.close();
	}
}
