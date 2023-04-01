package Selenium_Examples.Seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploading {

	public static void main(String[] args) {
		
		String url="http://demo.guru99.com/test/upload/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemanth S\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		WebElement upload=driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		
		upload.sendKeys("C:\\Users\\Hemanth S\\Desktop\\LinkText.html");
		
		driver.findElement(By.xpath("//input[@class='field_check']")).click();
		
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();

	}

}
