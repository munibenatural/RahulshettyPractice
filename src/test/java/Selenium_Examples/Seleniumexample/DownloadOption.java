package Selenium_Examples.Seleniumexample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadOption {

	public static void main(String[] args) {
		String url = "https://demo.guru99.com/test/yahoo.html";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemanth S\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		WebElement download = driver.findElement(By.xpath("//a[@id='messenger-download']"));

		String sourceLocation = download.getAttribute("href");
		String wgetcommand = "cmd /c D:\\\\Wget\\\\wget.exe -P D: --no-check-certificate http://demo.guru99.com/selenium/msgr11us.exe"
				+ sourceLocation;
		try {
			@SuppressWarnings("deprecation")
			Process exec = Runtime.getRuntime().exec(wgetcommand);
			int extvalue = exec.exitValue();
			System.out.println(extvalue);
		} catch (IOException ex) {
			System.out.println(ex.toString());

		}

	}

}
