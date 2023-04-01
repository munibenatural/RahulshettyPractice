package Selenium_Examples.Seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemanth S\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(url);
		WebElement txt_box=driver.findElement(By.xpath("//input[@name='email']"));
		Actions builder=new Actions(driver);
		Action click_context=builder.moveToElement(txt_box).click().keyDown(txt_box, Keys.SHIFT).sendKeys(txt_box, "Manikyam Raju").keyUp(txt_box, Keys.SHIFT).doubleClick(txt_box).contextClick().build();
		click_context.perform();

	}

}
