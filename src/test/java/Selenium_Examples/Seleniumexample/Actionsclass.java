package Selenium_Examples.Seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemanth S\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement home=driver.findElement(By.linkText("Home"));
		WebElement td_home=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]"));
		
		Actions mouseHover=new Actions(driver);
		Action MouseOverHome=mouseHover.moveToElement(home).build();
		String bgcolor=td_home.getCssValue("color"); 
		System.out.println(bgcolor);
		MouseOverHome.perform();
		Thread.sleep(4000);
		String bgcolor1=td_home.getCssValue("color");
		System.out.println(bgcolor1);
		
		
		

	}

}
