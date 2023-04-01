package Selenium_Examples.Seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lenskart {

	public static void main(String[] args) throws InterruptedException {
		
		
;		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hemanth S\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.lenskart.com/");
		
		WebElement popup=driver.findElement(By.xpath("//button[@id='wzrk-cancel']"));
		popup.click();
	
		Thread.sleep(3000);
		WebElement eyeglasslink=driver.findElement(By.xpath("//div[@class='widget-title'][1]"));
		
		Actions hover=new Actions(driver);
		hover.moveToElement(eyeglasslink);
		hover.click().build().perform();

	}

}
