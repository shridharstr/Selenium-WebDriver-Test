package ToolsQAProject;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import ToolsQAProject.iPhonesPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;
import ToolsQAProject.BrowserHandler;
import ToolsQAProject.AccessoriesPage;

public class MainTestClass 
{ FunctionalUtilities util;
	public static Scanner read;
	private static AccessoriesPage showAccessory;
	private static iPhonesPage iPhoneObj;
	public  WebDriver driver;
	public int i;
	
  @Test
  public void TestStarter() throws FileNotFoundException, IOException, InterruptedException 
  {
	MainTestClass mainObj = new MainTestClass();  
	System.out.println("\nSelect the browser to run the test case -");
	String browser = read.next();
	BrowserHandler openBrowser = new BrowserHandler();
	showAccessory = new AccessoriesPage();
	iPhoneObj = new iPhonesPage();
	
	driver = openBrowser.getWebDriver(browser);
	driver.get("http://store.demoqa.com/");
	//mainObj.getURLFromPropertyFile();
	
	driver.manage().window().maximize();
	
	if(i == 1)
		showAccessory.TestCaseOne(driver);
    else
	   iPhoneObj.TestCaseTwo(driver);
	util=new FunctionalUtilities(driver);
	util.performCheckout();
  }
  
  /*public Iterator getURLFromPropertyFile() throws FileNotFoundException, IOException
  {
       Properties prop;
       File file;
       Collection collection;
       Iterator url;      

       file = new File("C:\\selenium_drivers\\FileInput.properties");
       FileInputStream fis = new FileInputStream(file);
       prop = new Properties();
       prop.load(fis);
       collection = prop.values();
       url = collection.iterator();
         
     return url;
  }
 */
  
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
		  System.out.println("\nUser has selected option 3");
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
	 driver.quit();
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("Select the operation to perform the following menu options:");
	  System.out.println("1. Test Case 1: Adding an accessory from the product category menu");
	  System.out.println("2. Test Case 2: Adding an iPhone from the product category menu");
	  System.out.println("3. Exit the program");
	  System.out.println("\nEnter the option:");
  }

  @AfterTest
  public void afterTest() 
  {
  }

}
