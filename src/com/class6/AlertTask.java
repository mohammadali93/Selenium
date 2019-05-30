package com.class6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTask {
	
//	TC 1: JavaScript alert text verification
//	Open chrome browser
//	Go to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html”
//	Verify
//	alert box with text “I am an alert box!” is present
//	confirm box with text “Press a button!” is present
//	prompt box with text “Please enter your name” is present
//	Quit browser

	public static void main(String [] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
				
				driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
				Alert alert= driver.switchTo().alert();
				
				String str= alert.getText();
				alert.accept();
			
				System.out.println(str);
				
				Thread.sleep(3000);
				
				driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
				Alert a1= driver.switchTo().alert();
				String str1= a1.getText();
				a1.accept();
				System.out.println(str1);
				Thread.sleep(3000);

				
				driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']")).click();
				Alert a2= driver.switchTo().alert();
				String str2=a2.getText();
				//System.out.print(a2.sendKeys("tayyab"));
				a2.accept();
				System.out.println(str2);
				
				Thread.sleep(3000);
				driver.quit();
	}
	
	
}
