package com.testscases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingMutipleTabs {
@Test

	
	public void HandlingMultipleTabs() {
	
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Click Here']"));
		
//		WebElement link = driver.findElement(By.xpath("//a[text()='Click Here']"));
		
		link.click();
		
		
		//WE need get the number of tabs which is opened
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		//To print the number of tabs opened
		
		System.out.println("Total number of tabs opened" +tabs.size());
		
		//Switch my control to the newly opened, the windows takes only index hence we give 1 to swithc to 2nd window
		
		driver.switchTo().window((String)tabs.get(1));
		
		//To get the text of newly opened tab
		
		WebElement Text = driver.findElement(By.tagName("h3"));
		
		System.out.println(Text.getText());
		
		//To close the active browser tab
		
		driver.close();
		
		driver.switchTo().window((String)tabs.get(0));
		//Quit is used to close the complete browser
		driver.quit();
		

}
}
