package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMercuryTours {

	public static void main (String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("nepali");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("sekander");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123-456-8900");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("alif***girls@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("22 SouthBend st");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Islamabad");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("BaraKahu");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("20192");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("SekanderIsLazy");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("121()");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("121()");
		driver.findElement(By.name("register")).click();
		driver.quit();
	}
}
