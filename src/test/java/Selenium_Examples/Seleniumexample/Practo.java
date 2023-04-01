package Selenium_Examples.Seleniumexample;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemanth S\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.practo.com/");
		WebElement searchClick=driver.findElement(By.xpath("(//*[@class='c-omni-searchbox c-omni-searchbox--small'])[2]"));
		searchClick.click();
		List<WebElement> ListClick=driver.findElements(By.xpath("//*[@class='c-omni-suggestion-group']/child::div"));
		
		System.out.println(driver.manage().getCookies());
		TakesScreenshot screenShot =(TakesScreenshot)driver;
		
		
		
		/*for(int i=0;i<ListClick.size();i++)
		{
			String name="Dermotologist";
			
			if(ListClick.contains(name))
			{
				
				
			}
			
		}*/
		
		

	}

}
