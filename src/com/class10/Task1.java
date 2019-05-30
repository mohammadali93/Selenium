package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

//Open chrome browser
//Go to “https://the-internet.herokuapp.com/”
//Click on “Click on the “Sortable Data Tables” link
//Verify tables consist of 4 rows and 6 columns
//Print name of all column headers//*[@id="content"]/ul/li[40]/a
//Print data of all rows
public class Task1 extends CommonMethods {

	public static void main (String [] args)
	{
	
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[40]/a"));
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		for(WebElement row : rows) {
			String st=row.getText();
			System.out.println(st);
		}
		
		
		
	}
}
