package P2P_Content_Services;
import org.testng.annotations.Test;
import ToolsQAProject.AccessoriesPage;
import ToolsQAProject.iPhonesPage;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class P2PMainClass 
{
	public static Scanner read;
	public  WebDriver driver;
	public int i;

  @Test
  public void TestCaseExecution()
  {
	driver = new FirefoxDriver();
    driver.get("http://core.p2p.tribstage.com/login?url=http%3A%2F%2Fcontent.p2p.tribstage.com%2F");
    driver.manage().window().maximize();
    
    driver.findElement(By.id("login_username")).sendKeys("rijoshi");
	driver.findElement(By.id("login_password")).sendKeys("Champions22");
	driver.findElement(By.className("graphicButton")).click();
	
	
	  driver.findElement(By.className("content_items")).click();
	  driver.findElement(By.className("indexSearch")).sendKeys("HTML Story");
	
     //WebDriverWait wait = new WebDriverWait(driver,30);
	 //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("input")));
	 WebElement SearchBtn = driver.findElement(By.xpath(".//*[@id='contentItemIndex']/div[1]/form/div[2]/div/div/input[2]"));
	 SearchBtn.click();
	
	 WebDriverWait wait = new WebDriverWait(driver,50);
	 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@href='/content_items/74297220/edit']")));
		 
	 driver.findElement(By.xpath("//a[@href='/content_items/74297220/edit']")).click();
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  read = new Scanner(System.in);
	  i = read.nextInt();
	  
	  switch(i)
	  {
	  case 1:
		  System.out.println("\nYou have selected Test Case 1");
		  System.out.println("Starting the test case execution...");
		  break;
		  
	  case 2:
		  System.out.println("\nUser has selected Test Case 2");
		  System.out.println("Starting the test case execution...");
		  break;
		  
	  case 3:
		  System.out.println("\nUser has selected Test Case 3");
		  System.out.println("Starting the test case execution...");
		  break;
		  
	  case 4:
		  System.out.println("\nUser has selected Test Case 4");
		  System.out.println("Starting the test case execution...");
		  break;
		  
	  case 5:
		  System.out.println("\nUser has selected option 5");
		  System.out.println("Exiting the program...");
		  System.exit(0);
		  break;
		  
	  default:
		  System.out.println("No such option exists!");
		  break;
	  }
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
  
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("Select the test case to execute following menu options:");
	  System.out.println("1. Test Case 1: Searching a content item in P2P");
	  System.out.println("2. Test Case 2: Creating a content item in P2P");
	  System.out.println("3. Test Case 3: Updating a content item in P2P");
	  System.out.println("4. Test Case 4: Deleting a content item in P2P");
	  System.out.println("5. Exit the program");
	  System.out.println("\nEnter the option:");
  }

  @AfterTest
  public void afterTest() 
  {
  
  }

}
