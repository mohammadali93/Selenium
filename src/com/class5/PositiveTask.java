package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveTask {

	public static String userName="performance_glitch_user";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// maximize window
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		WebElement userNameTxt = driver.findElement(By.cssSelector("input[data-test='username']"));
		userNameTxt.sendKeys("performance_glitch_user");
		WebElement pwdTxt = driver.findElement(By.cssSelector("input[type$='word']"));
		pwdTxt.clear();
		pwdTxt.sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("input[class$='action']")).click();
		
		boolean ImageisDisplayed = driver.findElement(By.cssSelector("div[class^='peek']")).isDisplayed();

		if (ImageisDisplayed) {
			System.out.println("WebOrder logo is displayed");
		} else {
			System.out.println("WebOrder logo is NOT displayed");
		}
		
		WebElement proText = driver.findElement(By.xpath("//div[@class='product_label']"));
		//String value = proText.getText();
		

		
		if (proText.isDisplayed()) {
			System.out.println(userName + " is logged in. Test case PASS");
		} else {
			System.out.println(userName + " is NOT logged in. Test case FAIL");
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
