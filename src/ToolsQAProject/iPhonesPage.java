package ToolsQAProject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ToolsQAProject.FunctionalUtilities;

public class iPhonesPage extends PageObjectClass
{
	public WebDriver driver;
	public FunctionalUtilities util;
	
	public iPhonesPage(WebDriver driver) 
	{
		super(driver);
	}
	
	public void TestCaseTwo(WebDriver driver) throws InterruptedException
	{
		Actions action = new Actions(driver);
		WebElement product = driver.findElement(By.linkText("Product Category"));
		WebElement iPhone = driver.findElement(By.xpath("//a[contains(@href,'iphones')]")); 
		
		action.moveToElement(product).moveToElement(iPhone).build().perform();
		iPhone.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		AddToCart(driver);
		util = new FunctionalUtilities(driver);
		
		util.ClickOnCheckOut(driver);
		util.performCheckout(driver);
		
		System.out.println("Product Price and Total Price before update button is clicked:");
    	util.convertStringtoInt();
    	
    	System.out.println("Product Price and Total Price after update button is clicked");
    	util.convertStringtoInt();
    	
    	util.removeProduct(driver);
	}

	public void GoToHomePage()
	{
		WebElement HomePage = driver.findElement(By.linkText("Home"));
		HomePage.click();
	}
}
