package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String [] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		//driver.get("http://google.com");
		driver.navigate().to("http://walmart.com");
		Thread.sleep(1000);
		driver.navigate().to("http:google.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	}
}
