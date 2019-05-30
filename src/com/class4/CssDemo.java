package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo {

	public static void main (String [] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input[data-test='username']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input.btn_action")).click();
	}
}
