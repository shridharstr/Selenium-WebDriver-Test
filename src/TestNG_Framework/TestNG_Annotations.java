package TestNG_Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_Annotations
{
  @Test
  public void TestCase1()
  {
	  System.out.println("Inside Test Case 1");
  }
  
  @Test
  public void TestCase2()
  {
	  System.out.println("Inside Test Case 2");
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Inside BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Inside AfterMethod");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Inside BeforeClass");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("Inside AfterClass");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Inside BeforeTest");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("Inside AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("Inside BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("Inside AfterSuite");
  }

}
