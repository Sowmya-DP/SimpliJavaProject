package com.testscases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRealTimeUsercase {
	public static void main(String args[])

	{
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		//Relatvie xpath from plugin - //input[@name='name350e29e9']
		WebElement FullName = driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));

		FullName.sendKeys("Sowmya");

		

		

	}

}
