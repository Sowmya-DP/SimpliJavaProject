package com.testscases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadExample {

	
	public static void main(String args[]) throws AWTException, InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement FileUpload = driver.findElement(By.id("file-upload"));
		
		//FileUpload.click();
		
		Actions a1 = new Actions(driver);
		
		a1.moveToElement(FileUpload).click().build().perform();
		
		Thread.sleep(4000);
		
		//To give the exe file or the compiled file in the selenium script we havet to Runtime method
		
		Runtime.getRuntime().exec("C:\\SeleniumWorkspace\\FileUpload.exe");
		
	}
}
