package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskMercuryTours {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys();
		driver.findElement(By.name("lastName")).sendKeys("ashmit");
		driver.findElement(By.name("phone")).sendKeys("1234561234");
		driver.findElement(By.id("userName")).sendKeys("johndoe@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("22 GoraGali");
		driver.findElement(By.name("city")).sendKeys("Murree");
		driver.findElement(By.name("state")).sendKeys("Pakistan");
		driver.findElement(By.name("postalCode")).sendKeys("22012");
		driver.findElement(By.id("email")).sendKeys("idontknow");
		driver.findElement(By.name("password")).sendKeys("mekekaypata");
		driver.findElement(By.name("confirmPassword")).sendKeys("mekekaypata");
		driver.findElement(By.name("register")).click();
		driver.quit();
		
		
		
	}
}
