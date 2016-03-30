package ToolsQAProject;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;

public class FunctionalUtilities 
{
	WebDriver driver;
	public FunctionalUtilities(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void AddToCart(WebDriver driver) throws InterruptedException
	{
		List<WebElement> cartButtons = new ArrayList<WebElement>();
		cartButtons = driver.findElements(By.className("wpsc_buy_button")); 
				
		for(int i=0; i<cartButtons.size(); i++)
		{
			cartButtons.get(i).click();
		    Thread.sleep(2000);
		    
		    if(i!=cartButtons.size()-1){
			WebElement continueBtn = driver.findElement(By.linkText("Continue Shopping"));
			continueBtn.click();
		    }
		    else{
		    	WebElement checkoutBtn = driver.findElement(By.className("go_to_checkout"));	
		    	checkoutBtn.click();
		    	Thread.sleep(1000);
		    }
			Thread.sleep(1000);
		}
		
		//WebElement cartButton = driver.findElement(By.className("wpsc_buy_button"));
		//cartButton.click();
	}
	
		
	
	public void ClickOnCheckOut(WebDriver driver)
	{
		WebElement checkoutBtn = driver.findElement(By.className("go_to_checkout"));
		Assert.assertTrue(checkoutBtn.isDisplayed());
		System.out.println("\nCheck Out button displayed properly.");
		checkoutBtn.click();
		
	}
	
	public void performCheckout()
	{
		System.out.println("remove func  ");
//		WebElement quantity = driver.findElement(By.name("quantity"));
//		quantity.clear();
//		quantity.sendKeys("2");
//		Assert.assertTrue(quantity.isDisplayed());
//		System.out.println("Quantity updated to value=2?:"+quantity.isDisplayed());
//		
//		  List<WebElement> update = driver.findElements(By.name("submit"));
//		  update.get(0).click();
	    
	    List<WebElement> RemoveBtn = driver.findElements(By.name("submit"));
	    RemoveBtn.get(1).click();
	    
	   
    }	
	    
}

