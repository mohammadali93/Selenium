package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskMercury {

	public static void main (String [] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys("neapli");
		driver.findElement(By.xpath("//input[starts-with(@name,'last')]")).sendKeys("tired");
		driver.findElement(By.xpath("//input[starts-with(@name,'ph')]")).sendKeys("1223456878");
		
		

	}
}
