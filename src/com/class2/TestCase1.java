package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 1: Amazon Page Title Verification:
//Open chrome browser
//Go to “https://www.amazon.com/”
//Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
public class TestCase1 {
	public static void main(String [] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://amazon.com");
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("Amazon")) {
			System.out.println("this is amazon");
		}else {
			System.out.println("this is not amazon");
		}
		driver.close();
	}
}
