package Selenium_Examples.Seleniumexample;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SelectOption {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemanth S\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		/*Assert.assertFalse(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
;		//System.out.println(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
		driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).click();
		//System.out.println(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());*/
		
		
		 driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		Thread.sleep(3000);
		for(int i=0;i<5;i++)
		{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		
		}
		System.out.println(driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).getText());
	
	}

}
