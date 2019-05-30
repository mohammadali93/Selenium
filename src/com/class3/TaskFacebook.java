package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//
//TC 1: Facebook login:
//Open chrome browser
//Go to “https://www.facebook.com/”
//Enter valid username and valid password and click login
//User successfully logged in

public class TaskFacebook {

	public static void main(String [] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http:facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("momibaba2@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("nepali01");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_8")).click();
		driver.close();
	}
}
