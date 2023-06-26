package com.testscases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {
public static void main(String args[]) throws InterruptedException

{

	//Step 1 - Set the location of the browser utils exe in the program
	System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

	//Step 2 - Create an object for Chrome driver with respect to WebDriver interface

	WebDriver driver = new ChromeDriver();
	
	//Best Practise to follow is to maximize the browser before running the test
	driver.manage().window().maximize();

	

	//Give the URL to be navigated, we use get method to navigate to a URL
	driver.get("https://the-internet.herokuapp.com/login");

	Thread.sleep(5000);
	
	//Automatically close the browser session
	driver.close();

	
}
}