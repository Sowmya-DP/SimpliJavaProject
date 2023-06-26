package com.testscases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement CheckBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

		

		//To check if the element is displayed on the web page

		System.out.println(CheckBox1.isDisplayed());

		//To check if the element is enabled on the web page to any action

		System.out.println(CheckBox1.isEnabled());

		

		//To check if the element is selected on the web page

		System.out.println(CheckBox1.isSelected());


	}

}
