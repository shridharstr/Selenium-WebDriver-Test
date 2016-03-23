package Selenium_Test;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage 
{
	private WebDriver driver = null;
	
	public HomePage(WebDriver driver)
	{
	   this.driver = driver;	
	}
	
	{
	
	
	 
	
	    //driver.findElement(By.id("userNameItem")).getText();
		//driver.findElement(By.linkText("Logout"));
		
	
	
	if(((WebElement) driver).getText().contains("Welcome, Rishikesh") == true)
		System.out.println("Valid User!");
	else
		System.out.println("Invalid User!");


}
}
