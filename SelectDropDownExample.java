package com.testscases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownExample {
	public static void main(String args[])

	{

	System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

	

	WebDriver driver = new ChromeDriver();

	

	driver.manage().window().maximize();

	

	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	
	WebElement Day = driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Day')]"));

	

	Select DayofBirth = new Select(Day);

	

	DayofBirth.selectByIndex(1);

	

	DayofBirth.selectByValue("08");

	

	DayofBirth.selectByVisibleText("17");
	
	driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");

	

	

	driver.switchTo().frame("iframeResult");

	

	//Switch to frame option to doing the selection

	

	

	

	WebElement CarSelect = driver.findElement(By.name("cars"));

	

	Select s1 = new Select(CarSelect);

	//select teh value in the drop down

	s1.selectByValue("volvo");

	s1.selectByValue("audi");

	

	//All the selected value will be removed 

	s1.deselectAll();

	

	

	s1.selectByValue("volvo");

	}
}
