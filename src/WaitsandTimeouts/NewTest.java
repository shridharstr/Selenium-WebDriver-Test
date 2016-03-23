package WaitsandTimeouts;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest
{
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() 
  {
	driver = new FirefoxDriver();
	driver.get("http://core.p2p.tribstage.com/login?url=http%3A%2F%2Fcontent.p2p.tribstage.com%2F");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
  }
  
  @Test
  public void Test() 
  {
	  driver.findElement(By.id("login_username")).sendKeys("rijoshi");
	  driver.findElement(By.id("login_password")).sendKeys("Champions22");
	  driver.findElement(By.className("graphicButton")).click();
	  
	  WebDriverWait wait = new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("content_items")));
	  driver.findElement(By.className("content_items")).click();
	  driver.findElement(By.className("indexSearch")).sendKeys("HTML Story");
	  driver.findElement(By.cssSelector("input.graphicButton.inline")).click();
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[@href='/content_items/74234182/edit']")).click();
	  
	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@href='http://ngux.chicagotribune.stage.tribdev.com/ct-test-html-story-for-nlr-multiple-subscription-20160310-htmlstory.html']")));
	  driver.findElement(By.linkText("Logout")).click();
	  
  }
  
  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
