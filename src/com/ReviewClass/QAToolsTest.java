package com.ReviewClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class QAToolsTest extends CommonMethods{

	public static void main(String[] args) {
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/automation-practice-form/");
		// looping thru sex
		List<WebElement>list=driver.findElements(By.name("sex"));
		
		for( WebElement ele :list) {
			if(ele.isEnabled()) {
				ele.click();
			}
		}
	
	}
}
