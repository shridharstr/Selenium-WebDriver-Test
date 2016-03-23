package Selenium_Test;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import Selenium_Test.LoginPage;
import Selenium_Test.HomePage;


public class POMClass 
{
	
	private static HomePage home;
	
	
	public static void main(String[] args) 
	{
		LoginPage login = new LoginPage();
				
		home = login.LoginToP2PWithValidUser("rijoshi", "Champions22");
				
		System.out.println("Log in successfully!");
		
	
		
        
    System.out.println("Logged out successfully!");
    
	
	}

}
