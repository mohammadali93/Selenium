package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		try {
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("Ali");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.lastName")).sendKeys("Dodge Wala");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.address.street")).sendKeys("21 monarch dr");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.address.city")).sendKeys("Sterling");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.address.state")).sendKeys("VA");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("20164");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("7034442111");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.ssn")).sendKeys("000000000");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.username")).sendKeys("KameeraForLife");
		Thread.sleep(3000);
		driver.findElement(By.id("customer.password")).sendKeys("GotoSleep01");
		Thread.sleep(3000);
		driver.findElement(By.id("repeatedPassword")).sendKeys("GotoSleep01");
		driver.findElement(By.className("button")).click();
	}catch(Exception e) {
		e.getStackTrace();
	}
	}
}
