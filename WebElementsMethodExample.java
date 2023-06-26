package com.testscases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 1 - Set the location of the browser utils exe in the program
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

		//Step 2 - Create an object for Chrome driver with respect to WebDriver interface

		WebDriver driver = new ChromeDriver();
		
		//Best Practise to follow is to maximize the browser before running the test
		driver.manage().window().maximize();
		
			driver.get("https://the-internet.herokuapp.com/login");

			WebElement userID = driver.findElement(By.name("username"));

			userID.sendKeys("Payal Agarwal");

			userID.clear();
			userID.sendKeys("tomsmith");

			WebElement Password = driver.findElement(By.id("password"));
			Password.sendKeys("SuperSecretPassword!");
			//Example for using css selector
			WebElement button = driver.findElement(By.cssSelector("button.radius"));
			
			String PageURL = driver.getCurrentUrl();
			String PageTitle = driver.getTitle();

			System.out.println("The Page URL Before Login is - " +PageURL);
			System.out.println("The Page Title Before Login is - " +PageTitle);

			//Submit method is used when the input type is submit
			button.submit();
			
			String PageURL1 = driver.getCurrentUrl();
			String PageTitle1 = driver.getTitle();

			System.out.println("The Page URL After Login is - " +PageURL1);
			System.out.println("The Page Title After Login is - " +PageTitle1);

			//Navigate to a new URL from the existig browser
			driver.navigate().to("https://www.rediff.com/");

			

			//To come to the previous URL
			driver.navigate().back();

			

			//To go forward to the same web page
			driver.navigate().forward();

			//To refresh a page
			driver.navigate().refresh();
			
			driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
			
			WebElement CheckBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

			

			//To check if the element is displayed on the web page

			System.out.println(CheckBox1.isDisplayed());

			//To check if the element is enabled on the web page to any action

			System.out.println(CheckBox1.isEnabled());

			

			//To check if the element is selected on the web page

			System.out.println(CheckBox1.isSelected());
			
			//Get methods in selenium webelement

			

			WebElement seleniumLink = driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));

			

			//To get the CSS Value of the weblement

			

			System.out.println("To get the CSS value of the element");

			System.out.println(seleniumLink.getCssValue("color"));

			System.out.println(seleniumLink.getCssValue("text-decoration"));

			

			//To get the attribute of the webelement

			

			System.out.println("The get the attribute of any webelement");

			System.out.println(seleniumLink.getAttribute("href"));

			System.out.println(seleniumLink.getAttribute("target"));

			

			//To get the text

			

			System.out.println("To get the text inside the webelement");

			System.out.println(seleniumLink.getText());

			

			//To get the tagname

			

			System.out.println("To get the webelement tag name");

			System.out.println(seleniumLink.getTagName());
			
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));

			System.out.println("The total number of links" +allLinks.size());

			

			for(int i = 0;i<allLinks.size();i++)

			{

				

				System.out.println(allLinks.get(i).getText());

				System.out.println(allLinks.get(i).getAttribute("href"));

				

				

			}

			driver.close();
		}
	}


