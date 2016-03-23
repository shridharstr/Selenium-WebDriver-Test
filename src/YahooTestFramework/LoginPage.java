package YahooTestFramework;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import Selenium_Test.HomePage;

public class LoginPage
{
	private WebDriver driver = null;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LoginPage()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https://in.yahoo.com/");
	}
	
    		
		public YahooHomePage LoginWithValidUser(String username, String password)
		{
			
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("passwd")).sendKeys(password);
			driver.findElement(By.name("signin")).click();
			
			return new YahooHomePage(driver);
		}
		
		public ForgotPasswordPage GetIntoAccount(String username)
		{
			driver.findElement(By.id("forgotLnk")).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.name("verifyYid")).click();
			
			return new ForgotPasswordPage(driver);
		}
		
		public String LoginWithInvalidUser(String username, String password){
			
			String message;
			
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("passwd")).sendKeys(password);
			driver.findElement(By.name("signin")).click();
			message = driver.findElement(By.className("mbr-login-error mbr-text-align pure-u-1")).getText();
			
			return message;
		}


	
}
