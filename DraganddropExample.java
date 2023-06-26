package com.testscases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DraganddropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/Chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//Give the URL to be navigated, we use get method to navigate to a URL
		driver.get("https://jqueryui.com/droppable/");
		
WebElement iFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		

		driver.switchTo().frame(iFrame);

		

		WebElement DragFrom = driver.findElement(By.id("draggable"));

		

		WebElement DropTo = driver.findElement(By.id("droppable"));

		

		Actions a1 = new Actions(driver);

		

		a1.dragAndDrop(DragFrom, DropTo).build().perform();
	}

}
