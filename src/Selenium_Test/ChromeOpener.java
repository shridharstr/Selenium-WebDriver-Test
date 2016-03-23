package Selenium_Test;
import java.io.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeOpener
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://bitwisestaging.azurewebsites.net/");
		WebElement search_box = driver.findElement(By.className("searchbox"));
		WebElement search_btn = driver.findElement(By.id("searchFromheader"));
		search_box.sendKeys("Test Automation");
		search_btn.click();
		System.out.println("Search results displayed successfully!");
		
		driver.close();

	}

}
