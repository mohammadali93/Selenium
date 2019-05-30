package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

//	TC 2: Syntax Page URL Verification:
//		Open chrome browser
//		Navigate to “https://www.syntaxtechs.com/”
//		Navigate to “https://www.google.com/”
//		Navigate back to Syntax Technologies Page
//		Refresh current page
//		Verify url contains “Syntax”
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://syntaxtechs.com");
		driver.get("https://www.google.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	
		String title= driver.getTitle();
		if(title.equalsIgnoreCase("syntax")) {
			System.out.println("this is syntax");
		}else {
			System.out.println("this is not syntax");
		}
		driver.quit();
		
	}
}
