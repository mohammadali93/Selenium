package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathUsingStartsWith {

	public static void main(String [] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[starts-with(@id,'password')]")).sendKeys("secret_sauce");
		
	}
}
