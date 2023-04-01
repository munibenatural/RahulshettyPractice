package Selenium_Examples.Seleniumexample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemanth S\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		WebElement mobile=driver.findElement(By.xpath("//div[@id='nav-xshop-container']//following-sibling::a[3]"));
		
		mobile.click();
		String parent=driver.getWindowHandle();
		Set<String> childs=driver.getWindowHandles();
		Iterator<String> itr=childs.iterator();
		
		while(itr.hasNext())
		{
			String childWindow=itr.next();
			
			if(!parent.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				
				driver.findElement(By.xpath("//div[@id='nav-subnav'] //child::a[5]")).click();
				
			}
			
		}
		driver.switchTo().window(parent);
		
	}

}
