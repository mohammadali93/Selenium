package com.class6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



//TC 1: Tools QA check all elements
//Open chrome browser
//Go to “https://www.toolsqa.com/automation-practice-form/”
//Fill out:
//First Name
//Last Name
//Check that sex radio buttons are enabled and select “Male”
//Check all Years of Experience radio buttons are clickable
//Date
//Select both checkboxes for profession
//Check all Automation Tools checkboxes are clickable and keep “Selenium WebDriver” option as selected
//Quit browser
	
public class TaskQA {
	public static void main (String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",  "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.toolsqa.com/automation-practice-form/");
	
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("ali");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Mohammad");
	
		//Check that sex radio buttons are enabled and select “Male”
		List<WebElement> button=driver.findElements(By.name("sex"));
		String value= "Male";
		for(WebElement but : button) {
			String value1=but.getAttribute("value");
			if(but.isEnabled()) {
				but.click();
				
				if(!value.equalsIgnoreCase(value1)) {
					but.click();
				}
			}
		}
				//Check all Years of Experience radio buttons are clickable
				
				List<WebElement> radioExp= driver.findElements(By.xpath("//input[@name='exp']"));
				
				for( WebElement rad:radioExp) {
					if(rad.isEnabled()) {
						rad.click();
						Thread.sleep(3000);
					}
			}
				//Date
				
				driver.findElement(By.cssSelector("input[id='datepicker']")).sendKeys("05/21/2019");
				
				//Select both checkboxes for profession
				
				List<WebElement> clickable= driver.findElements(By.name("profession"));
				
				for(WebElement clicks : clickable) {
					if(clicks.isEnabled()) {
						clicks.click();
					}
						
				}
				
				//Check all Automation Tools checkboxes are clickable and keep “Selenium WebDriver” option as selected
				
				List<WebElement>CheckBox=driver.findElements(By.name("tool"));
				
				for(WebElement box :CheckBox) {
					String str= "Selenium WebDriver";
					if(box.isEnabled()) {
						box.click();
						String str1= box.getAttribute("str");
						System.out.println(str1);
						
						if(!str.equalsIgnoreCase(str1)) {
							box.click();
		}
		}
	}
				
				driver.quit();
	}
}
		





