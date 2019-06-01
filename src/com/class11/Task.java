package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.seleniumhq.jetty9.util.IO;

import utils.CommonMethods;

//TC 1: Upload file and Take Screenshot
//
//Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
//Upload file
//Verify file got successfully uploaded and take screenshot
public class Task extends CommonMethods{

	static String expected="File uploaded!";
	public static void main (String [] args)
	{
		setUpDriver("chrome", "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload");
		String upload= "C:/Users/moham/Downloads/IMG_6426.jpg";
		driver.findElement(By.cssSelector("input[type='file']")).sendKeys(upload);;
		
		driver.findElement(By.cssSelector("button[type='button']")).click();
		
		Alert al= driver.switchTo().alert();
		String tx= al.getText();
		al.accept();
		System.out.println("This is the alert text "+tx);
		if(tx.contentEquals(expected))
		{
			System.out.println("File is Uploaded");
		}else {
			System.out.println("File is not Uploaded");
		}
		TakesScreenshot camera= (TakesScreenshot)driver;
		File selfie= camera.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(selfie, new File("ScreenShots/WebTool/shot.jpg"));
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Upload successfully");
		}
		driver.quit();
	}
	
}
