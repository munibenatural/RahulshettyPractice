package Selenium_Examples.Seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextEx {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hemanth S\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Hemanth%20S/Desktop/LinkText.html");
		
		WebElement link=driver.findElement(By.linkText("Clcik Here"));
		link.click();
		driver.navigate().back();
		Thread.sleep(5000);
		WebElement link1=driver.findElement(By.partialLinkText("Me"));
		link1.click();
		

	}

}
