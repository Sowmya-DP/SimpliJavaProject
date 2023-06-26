package com.testscases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardInteractionsExample {
	public static void main(String args[]) throws AWTException

	{
	
	System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/");
	
	Robot r1 = new Robot();

	//We need to press on the keyboard key and have to release it to perform the full action,

	//***** Make sure key release is given correctly, else it will be keep on doing it in the back end

	for (int i=0; i<7; i++) {
	r1.keyPress(KeyEvent.VK_TAB);

	r1.keyRelease(KeyEvent.VK_TAB);

	}

	

	//To given enter key
	r1.keyPress(KeyEvent.VK_ENTER);

	r1.keyRelease(KeyEvent.VK_ENTER);
	}

}
