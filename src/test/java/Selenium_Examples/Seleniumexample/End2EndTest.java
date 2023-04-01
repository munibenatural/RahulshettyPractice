package Selenium_Examples.Seleniumexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class End2EndTest extends SelectOption {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemanth S\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//*[@id='autosuggest']")).sendKeys("Ind");
		Thread.sleep(3000); 
		List<WebElement> drop=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		for(WebElement drop1:drop)
		{
			if(drop1.getText().equalsIgnoreCase("India"))
			{
				drop1.click();
				break;
			}
			{
				
			}
		}
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(3000);
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		
		WebElement currency=driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));
		
		Select selectCurrency=new Select(currency);
		selectCurrency.selectByIndex(1);
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();
		
	}

}
