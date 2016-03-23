package Selenium_Test;
import java.io.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginPage
{
	
	private WebDriver driver = null;
	
	public LoginPage()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://core.p2p.tribstage.com/login");
	}
	
    		
		public HomePage LoginToP2PWithValidUser(String username, String password)
		{
			
			driver.findElement(By.name("username")).sendKeys(username);;
			driver.findElement(By.name("password")).sendKeys(password);;
			driver.findElement(By.className("graphicButton")).click();
			
			return new HomePage(driver);
		}
		
		public String LoginToP2PWithInvalidUser(String username, String password){
			String message;
			
			driver.findElement(By.name("username")).sendKeys(username);;
			driver.findElement(By.name("password")).sendKeys(password);;
			driver.findElement(By.className("graphicButton")).click();
			message = driver.findElement(By.className("graphicButton")).getText();
			
			return message;
		}

   	
    
	

}
