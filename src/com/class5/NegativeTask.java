package com.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeTask {

	public static String name= "nepali";
	public static String pass= "Meri jaan ka tukda";
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// maximize window
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		WebElement userNameTxt = driver.findElement(By.cssSelector("input[data-test='username']"));
		userNameTxt.sendKeys(name);
		WebElement pwdTxt = driver.findElement(By.cssSelector("input[type$='word']"));
		pwdTxt.clear();
		pwdTxt.sendKeys(pass);
		
		driver.findElement(By.cssSelector("input[class$='action']")).click();
		WebElement ErrorMsg=driver.findElement(By.cssSelector("h3[data-test='error']"));
		String msg= ErrorMsg.getText();
		if(msg.contains("UserName and Password")) {
			System.out.println(name+"username doesnt match");
		}else {
			System.out.println("username matches");
		}
		driver.quit();
	}
}


