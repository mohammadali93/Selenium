package com.GroupTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class Task1 extends CommonMethods{

//	 Users Application Form Fill
//	 1.Open chrome browser
//	 2.Go to “http://uitestpractice.com/”
//	3.Click on “Forms” link
//	4.Fill out the entire form
//	5.Close the browser
//
		
		public static void main(String[] args) {
			setUpDriver("chrome", "http://uitestpractice.com/" );
		driver.findElement(By.cssSelector("a[href='/Students/Form']")).click();
		//first name
		driver.findElement(By.cssSelector("input#firstname")).sendKeys("Sweet");
		//last name
		driver.findElement(By.cssSelector("input#lastname")).sendKeys("Chilli");
		
		driver.findElements(By.cssSelector("input#lastname"));
		//selecting radio button
		Select select= new Select(driver.findElement(By.cssSelector("input[type='radio']")));
		select.selectByIndex(1);
		
		
		
		
		}
			
		
	
}
