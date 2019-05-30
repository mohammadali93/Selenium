package com.class5;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinkCount {

	public static void main(String [] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/moham/SELENIUM/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The number of links "+links.size());
		
		int count=0;
		Iterator<WebElement>it= links.iterator();
		while(it.hasNext()) {
		
			WebElement text=it.next();
			String linkText=text.getText();
			if(!linkText.isEmpty()) {
				System.out.println(linkText);
				count++;
			}
		}
		System.out.println("Total number of links with text "+count);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
