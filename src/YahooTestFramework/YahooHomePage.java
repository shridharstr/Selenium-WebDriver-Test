package YahooTestFramework;

import org.openqa.selenium.WebDriver;

public class YahooHomePage 
{
	WebDriver driver;
	public YahooHomePage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void displayMessage()
	{
		System.out.println("User logged in successfully!");
	}
	
	
	

}
