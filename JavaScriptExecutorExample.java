package com.testscases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {
	
	public static void main(String args[]) throws AWTException, InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com");
		
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		//We use execute script method to inject javascirpt on the webpage
		
		//To scroll down the page
		js.executeScript("window.scrollBy(0,800)", "");
		
		//To scroll up the page
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-300)", "");
		
		WebElement ScrollLink = driver.findElement(By.xpath("//a[text()='Hovers']"));
		
		
		//To scroll to the element which is displayed on the screen
		js.executeScript("arguments[0].scrollIntoView()", ScrollLink);
		
		//To click on an element
		
		js.executeScript("arguments[0].click()", ScrollLink);
		
	}

}
