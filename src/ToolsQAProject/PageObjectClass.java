package ToolsQAProject;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public abstract class PageObjectClass
{
	protected WebDriver driver;
	public PageObjectClass(WebDriver driver)
	{
		this.driver = driver;
	}
	
	protected void AddToCart(WebDriver driver) throws InterruptedException
	{
		/*List<WebElement> cartButtons = new ArrayList<WebElement>();
		cartButtons = driver.findElements(By.className("wpsc_buy_button")); 
				
		for(int i=0; i<cartButtons.size(); i++)
		{
			cartButtons.get(i).click();
		    Thread.sleep(2000);
		    
		    if(i!=cartButtons.size()- 4)
		    {
			WebElement continueBtn = driver.findElement(By.linkText("Continue Shopping"));
			continueBtn.click();
		    }
		    else
		    {
		    	WebElement checkoutBtn = driver.findElement(By.className("go_to_checkout"));	
		    	checkoutBtn.click();
		    	Thread.sleep(1000);
		    }
			Thread.sleep(1000);
		}
		*/
		Thread.sleep(1000);
		WebElement cartButton = driver.findElement(By.className("wpsc_buy_button"));
		cartButton.click();
	}

	
	public abstract void GoToHomePage();
}
