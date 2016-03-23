package HoverMenu;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MenuNavigator 
{
	public WebDriver driver;
 
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium_drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("file:///C:/Hover%20Menu/hovermenusample.html");
	  driver.manage().window().maximize();
	  
  }
  
  @Test
  public void Navigate() 
  {
	  WebElement element1 = driver.findElement(By.id("home"));
	  WebElement element2 = driver.findElement(By.id("about"));
	  WebElement element3 = driver.findElement(By.id("services"));
	
	    
	  Actions action = new Actions(driver);
	        
      List<WebElement> menu = new ArrayList<WebElement>(driver.findElements(By.tagName("li")));          
      action.moveToElement(element1).moveToElement(element2).moveToElement(element3).moveToElement(menu.get(3)).moveToElement(menu.get(4)).moveToElement(menu.get(5)).build().perform(); 
      menu.get(5).click();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
	  
  }

}
