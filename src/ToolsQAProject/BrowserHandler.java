package ToolsQAProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserHandler
{
	public static WebDriver driver = null;
	
	public WebDriver getWebDriver(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\selenium_drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}	
		
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","C:\\selenium_drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
		
		return driver;
	
	}

}
