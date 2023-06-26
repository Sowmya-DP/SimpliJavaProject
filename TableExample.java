package com.testscases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {
	
	public static void main(String args[]) throws AWTException, InterruptedException

	{

		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		

		WebDriver driver = new ChromeDriver();

		

		driver.manage().window().maximize();

		

		driver.get("https://the-internet.herokuapp.com/tables");

		

		List<WebElement> ColNames = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));

		

		

		List<WebElement> rowSize = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		
		List<WebElement> value = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));

		

		System.out.println("The totla number of cols are" +ColNames.size());

		

		System.out.println("The total number of rows are" +rowSize.size());

		

		for(int i=0;i<ColNames.size();i++)

		{

			System.out.println(ColNames.get(i).getText());
			System.out.println(value.get(i).getText());

		}

		//First row
		List<WebElement> row1 = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));

		for(int i=0;i<row1.size();i++) {

			System.out.println("only First row" +row1.get(i).getText());

			

		}
		

	}
		



}
