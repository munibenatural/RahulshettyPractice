package Selenium_Examples.Seleniumexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Table {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemanth S\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/elements");
		
		WebElement textBox_sideIcon=driver.findElement(By.xpath("//span[text()='Text Box']"));
		textBox_sideIcon.click();
		
		WebElement enterName=driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		enterName.sendKeys("Ashok");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("Ashok@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("#123,rajajinagar,bangalore");
		driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("india");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		
		
		/*
		 * List<WebElement> col=driver.findElements(By.xpath(
		 * ".//div[@id='leftcontainer']/table/thead/tr/th"));
		 * System.out.println("Total coloumns are:"+col.size()); List<WebElement>
		 * Rows=driver.findElements(By.xpath(
		 * ".//div[@id='leftcontainer']/table/tbody/tr"));
		 * System.out.println("Total coloumns are:"+Rows.size());
		 */
		
		
		
	}

}
