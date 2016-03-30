package ToolsQAProject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ToolsQAProject.FunctionalUtilities;


public class AccessoriesPage
{
	public WebDriver driver = null;
	 FunctionalUtilities util;
	 	
	
	public AccessoriesPage()
	{
		
	}
	
	public AccessoriesPage(WebDriver driver) 
	{
          this.driver = driver;
	}

	public void TestCaseOne(WebDriver driver) throws InterruptedException
	{
		Actions action = new Actions(driver);
		WebElement menu = driver.findElement(By.linkText("Product Category"));
		WebElement accessory = driver.findElement(By.xpath("//a[contains(@href,'accessories')]"));
		action.moveToElement(menu).moveToElement(accessory).build().perform();
		accessory.click();
		
		util = new FunctionalUtilities(driver);
		util.AddToCart(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
//		util.ClickOnCheckOut(driver);
		
		
	}
	
		
	
}
