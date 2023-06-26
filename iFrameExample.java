package com.testscases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



//https://jqueryui.com/droppable/    jquery link
public class iFrameExample {
	public static void main(String args[])

	{

	

	System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");

	

	WebDriver driver = new ChromeDriver();

	

	driver.manage().window().maximize();

	

	driver.get("https://the-internet.herokuapp.com/iframe");
	
	//Switch into the iFrame

	

		WebElement iframeElement = driver.findElement(By.id("mce_0_ifr"));

		

		driver.switchTo().frame(iframeElement);

		

		WebElement ParainsideIFrame = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));

		

		System.out.println(ParainsideIFrame.getText());

		//To switch back the selenium control the main webpage we have switch the control back to default content

		

		driver.switchTo().defaultContent();

		

		//To click on file

		

		driver.findElement(By.xpath("//span[text()='File']")).click();

	

	}

}
