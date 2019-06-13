package com.class12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.CommonMethods;

//TC 1: OrangeHRM Login
//
//Navigate to “https://opensource-demo.orangehrmlive.com/”
//Login to the application
//Verify user is successfully logged in
//
//Note: must use properties file
public class Task {
Properties pro;
	@Test
	public void readFile()
	{
		String filePath="src/configs/OrangeHRM.properties";
		
		try {
			FileInputStream str= new FileInputStream(filePath);
			pro= new Properties();
			pro.load(str);
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(pro.getProperty("browser"));
		System.out.println(pro.getProperty("url"));
		
		CommonMethods.setUpDriver(pro.getProperty("browser"), pro.getProperty("url"));
		CommonMethods.driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("Admin");
		CommonMethods.driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");
		CommonMethods.driver.findElement(By.cssSelector("input[name='Submit']")).click();
		
	}
}
