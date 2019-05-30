package com.class9;

import utils.CommonMethods;

public class DriversTest extends CommonMethods {

	public static void main(String[] args) {
		
		setUpDriver("firefox", "http://google.com");
		driver.quit();
	}
}
