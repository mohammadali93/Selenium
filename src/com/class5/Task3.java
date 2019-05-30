package com.class5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
//
//	* Check all Years of Experience radio buttons are clickable
//	* -----------------------------------------------
//	* Check all Automation Tools checkboxes are clickable
//	* and keep “Selenium WebDriver” option as selected
//	\
	public static void main(String [] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		List<WebElement> radioExp= driver.findElements(By.xpath("//input[@name='exp']"));
		
		for( WebElement rad:radioExp) {
			if(rad.isEnabled()) {
				rad.click();
				Thread.sleep(3000);
			}
			
		}
		List<WebElement>CheckBox=driver.findElements(By.name("tool"));
		
		for(WebElement box :CheckBox) {
			String value= "Selenium WebDriver";
			if(box.isEnabled()) {
				box.click();
				String value1= box.getAttribute("value");
				System.out.println(value1);
				
				if(!value1.equalsIgnoreCase(value)) {
					box.click();
				}
				Thread.sleep(3000);
			}
		}
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
