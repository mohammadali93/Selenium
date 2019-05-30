package com.class7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class SwitchingWindows extends CommonMethods {

	public static void main (String [] args)
	{
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		String parent=driver.getTitle();
		String ParentID= driver.getWindowHandle();
		System.out.println("title is "+parent+" and ID is "+ParentID);
		
		
		List<WebElement> newWindow=driver.findElements(By.cssSelector("[target='_blank']"));
		
		
		
		
	}
}
