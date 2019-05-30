package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Users//moham//SELENIUM//geckodriver-v0.24.0-win64//geckodriver.exe/");
		WebDriver driver= new FirefoxDriver();
		driver.get("http:amazon.com");
		
	}
}
