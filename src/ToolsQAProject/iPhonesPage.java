package ToolsQAProject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ToolsQAProject.FunctionalUtilities;

public class iPhonesPage 
{
	private FunctionalUtilities util;
	
	public void TestCaseTwo(WebDriver driver) throws InterruptedException
	{
		Actions action = new Actions(driver);
		WebElement product = driver.findElement(By.linkText("Product Category"));
		WebElement iPhone = driver.findElement(By.xpath("//a[contains(@href,'iphones')]")); 
		
		action.moveToElement(product).moveToElement(iPhone).build().perform();
		iPhone.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		util = new FunctionalUtilities(driver);
		util.AddToCart(driver);
		util.ClickOnCheckOut(driver);
		util.performCheckout();
	}

}
