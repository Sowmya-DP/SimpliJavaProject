package com.testscases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AlertExample {
	
	@Test

	
	public void AlertExampleHandling() {
	
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement JSAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		
		JSAlert.click();
		
		
		Alert a1 = driver.switchTo().alert();
		
		a1.accept();
		
		WebElement JSConfirm = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		
		JSConfirm.click();
		
		System.out.println(a1.getText());
		a1.dismiss();
		
		
		
	
	}
}
