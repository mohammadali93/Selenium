package com.class6;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Open chrome browser
//Go to “https://www.facebook.com”
//Verify:
//month dd has 12 month options
//day dd has 31 day options
//year dd has 115 year options
//Select your date of birth    
//Quit browser
public class FaceBookTask {

	public static void select(WebElement element,String sel) {
        Select select = new Select(element);
		
		List <WebElement> options = select.getOptions();
		System.out.println("Number of elements = "+options.size());
		
		Iterator <WebElement> it = options.iterator();
		while(it.hasNext()) {
			String option = it.next().getText();
			System.out.println(option);
		}
		select.selectByVisibleText(sel);
	}

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement months = driver.findElement(By.cssSelector("select#month"));
		FaceBookTask.select(months,"Sep");
		
		WebElement days = driver.findElement(By.cssSelector("select#day"));
		FaceBookTask.select(days,"6");
		
		WebElement years = driver.findElement(By.cssSelector("select#year"));
		FaceBookTask.select(years,"1993");
		
		Thread.sleep(5000);
		driver.quit();






	}
}
