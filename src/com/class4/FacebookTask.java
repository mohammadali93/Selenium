package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask {

	public static void main (String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http:facebook.com");
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("momibaba2@gmail.com");
		driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("nepali01");
		driver.findElement(By.xpath("//input[starts-with(@aria-label,'Log In')]")).click();
		driver.close();
		
		
	}
}
