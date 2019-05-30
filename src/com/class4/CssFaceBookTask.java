package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssFaceBookTask {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.cssSelector("input[name^='email']")).sendKeys("Nepali");
		driver.findElement(By.cssSelector("input[name$='word']")).sendKeys("butterchicken");
		
		driver.findElement(By.cssSelector("input[name*='conf']")).sendKeys("butterchicken");
		driver.findElement(By.cssSelector("input[name$='ter']")).click();
		
	}
}
