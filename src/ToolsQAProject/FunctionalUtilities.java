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
			
	
	public void ClickOnCheckOut(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement checkoutBtn = driver.findElement(By.className("go_to_checkout"));
		Assert.assertTrue(checkoutBtn.isDisplayed());
		System.out.println("\nCheck Out button displayed properly.");
		checkoutBtn.click();
		
	}
	
	public void performCheckout(WebDriver driver) throws InterruptedException
	{
		WebElement quantity = driver.findElement(By.name("quantity"));
		quantity.clear();
		quantity.sendKeys("2");
		Assert.assertTrue(quantity.isDisplayed());
		System.out.println("Quantity updated to value=2?:"+quantity.isDisplayed());
		
        List<WebElement> update = driver.findElements(By.name("submit"));
		update.get(0).click();
	 }	
	
	public void convertStringtoInt()
	{
		List<WebElement> price = driver.findElements(By.className("pricedisplay"));
		String product_price = price.get(1).getText();
		String totalprice = price.get(2).getText();
		
		String price1 = product_price.replace("$","");
		String price2 = totalprice.replace("$", "");
		
		double newprice = Double.parseDouble(price1);
		double newtotalprice = Double.parseDouble(price2);
		
		int IntPrice = (int) newprice;
		int IntTotalPrice = (int) newtotalprice;
	
		System.out.println("Product price:"+IntPrice);
		System.out.println("Total Price:"+IntTotalPrice);
	}
	
	public void removeProduct(WebDriver driver)
	{
		List<WebElement> RemoveBtn = driver.findElements(By.name("submit"));
	    RemoveBtn.get(1).click();
	}
	    
}

