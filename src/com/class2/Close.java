package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main (String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");
		//driver.close();
		driver.quit();
	}
}
