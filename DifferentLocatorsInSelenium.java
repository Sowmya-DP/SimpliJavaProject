package com.testscases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocatorsInSelenium {
	public static void main(String args[])

	{

		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//Give the URL to be navigated, we use get method to navigate to a URL
		driver.get("https://the-internet.herokuapp.com/login");

		//Name - Selector
		//HTML code is - <input type="text" name="username" id="username">
		WebElement userID = driver.findElement(By.name("username"));

		//To Enter or to pass some data into the text box we use sendkeys method
		userID.sendKeys("tomsmith");

		//ID - selector
		//<input type="password" name="password" id="password">
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("SuperSecretPassword!");

		//Class - Selector
		//<button class="radius" type="submit"><i class="fa fa-2x fa-sign-in"> Login</i></button>
		WebElement LoginButton = driver.findElement(By.className("radius"));

		//Click method is used to click on any element in the webpage
		LoginButton.click();
		
		//Tag - Selector
		WebElement link = driver.findElement(By.tagName("a"));
		//link.click();

		// Link Text - Selector
		WebElement link1 = driver.findElement(By.linkText("Elemental Selenium"));

		//Partial Link Text
		WebElement link2 = driver.findElement(By.partialLinkText("Selenium"));

		//xpath
		WebElement link3 = driver.findElement(By.xpath("//a[@href='https://github.com/tourdedave/the-internet']"));
		

	}

}
