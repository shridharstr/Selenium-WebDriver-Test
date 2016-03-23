package ChicagoTribuneFramework;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.DataProvider;

public class SearchText 
{
	public WebDriver driver;
	
	public SearchText(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	
	
	/*public void SearchTerm(String term)
	{ 
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.className("trb_nh_sm")).click();
		driver.findElement(By.name("Query")).sendKeys(term);
		driver.findElement(By.className("trb_nh_sf_s")).click();
		System.out.println("Search Results Displayed!");
	} */ 

	
}
