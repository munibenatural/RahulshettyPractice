package Selenium_Examples.Seleniumexample;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemanth S\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		String[] itemsNeeded={"Cucumber","Brocolli","Beetroot"};
		
		List<WebElement> Veges=driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=1;i<Veges.size();i++)
		{
			String name=Veges.get(i).getText();
			//Brocolli - 1 Kg
			String name1=name.trim();
			
			List<String> itemsNeededList=Arrays.asList(itemsNeeded);
			if(itemsNeededList.contains(name))
			{
				driver.findElement(By.xpath("//div[@class='product-action']//button")).click();
			
			}
			
		}

	}

}
