package ToolsQAProject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ToolsQAProject.FunctionalUtilities;


public class AccessoriesPage extends PageObjectClass
{
	public WebDriver driver;
	public FunctionalUtilities util;
	 	
	
	public AccessoriesPage(WebDriver driver) 
	{
		super(driver);
	}

	public void TestCaseOne(WebDriver driver) throws InterruptedException
	{
		Actions action = new Actions(driver);
		WebElement menu = driver.findElement(By.linkText("Product Category"));
		WebElement accessory = driver.findElement(By.xpath("//a[contains(@href,'accessories')]"));
		action.moveToElement(menu).moveToElement(accessory).build().perform();
		accessory.click();
    	AddToCart(driver);
    	
    	util = new FunctionalUtilities(driver);
    	util.ClickOnCheckOut(driver);
    	
    	System.out.println("\nProduct Price and Total Price before update button is clicked:");
    	util.convertStringtoInt();
    	Thread.sleep(2000);
    	util.performCheckout(driver);
    	
    	System.out.println("\nProduct Price and Total Price after update button is clicked");
    	util.convertStringtoInt();
    	
    	util.removeProduct(driver);
	}

	public void GoToHomePage()
	{
		WebElement HomePage = driver.findElement(By.linkText("Home"));
		HomePage.click();
	}
			
	
}
