package ChicagoTribuneFramework;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class POMTest 
{
	WebDriver driver;
	private String hubURL = "http://10.10.125.54:4444/wd/hub";
	
	
	@Parameters({"browser","version"})
	@BeforeTest
	public void setup(String browser, String version) throws MalformedURLException
	{

		DesiredCapabilities caps = new DesiredCapabilities();
		
		if(browser.equalsIgnoreCase("firefox")){
		
			caps.setBrowserName("firefox");
			caps.setVersion("44.0.2");
			
		}
		
		if(browser.equalsIgnoreCase("chrome")){
			
			caps.setBrowserName("chrome");
			caps.setVersion("48.0.2564.116 m");
			
		}
		
		if(browser.equalsIgnoreCase("internet explorer")){
			
			caps.setBrowserName("internet explorer");
			caps.setVersion("11.0.9600.18124");
			
		}
		
		caps.setPlatform(Platform.WINDOWS);
				
		driver = new RemoteWebDriver(new java.net.URL(hubURL), caps);
		driver.manage().window().maximize();
		driver.get("http://www.chicagotribune.com");
		
	}
	
	@DataProvider(name="SearchParameters")
	public static Object[][] serachTerms()
	{
		return new Object[][]{{"Deadpool","Brad Pitt"}};//,"Oscars 2016", "Chicago Cubs"
	}
	
	
	@Test(dataProvider="SearchParameters") 
	//@Parameters({"param1", "param2"})
	public void SearchData(String param1, String param2)
	{
		driver.findElement(By.className("trb_nh_sm")).click();
		driver.findElement(By.name("Query")).sendKeys(param1);
		driver.findElement(By.className("trb_nh_sf_s")).click();
	    //AssertJUnit.assertTrue(true, "Test case 1 passed!");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.className("trb_search_form_input")).clear();
		driver.findElement(By.className("trb_search_form_input")).sendKeys(param2);
		driver.findElement(By.className("trb_search_form_submit")).click();
		//AssertJUnit.assertTrue(true, "Test case 2 passed!");
	}
	
	@AfterTest
	public void teardown()
	{
		
		driver.quit();
		
	}
	
	
/*	
  @Test
  public void SearchResults()
  {
	  SearchText search = new SearchText(driver);
	  search.setup();
	  search.SearchTerm("Deadpool");
	  
  }
  */
}
