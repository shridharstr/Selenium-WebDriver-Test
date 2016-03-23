package YahooTestFramework;

import org.testng.annotations.Test;


public class POMClass
{
	  LoginPage loginpage = new LoginPage();
	
/* @Test 
  public void VerifyUserLogin()
  {
	  YahooHomePage homepage = loginpage.LoginWithValidUser("shri_str", "PrancingPony25");
	  //String homepage = loginpage.LoginWithInvalidUser("shri_str", "PrancngPony25");
	  
	  if(homepage==null)
		  System.out.println("Home page does not exist!!");
	  else
		  homepage.displayMessage();		 
  
	  
   }
  */
  @Test
  public void ForgotPassword()
  {
	  ForgotPasswordPage forgotPass = loginpage.GetIntoAccount("shri_str");
	  if(forgotPass == null)
		  System.out.println("Forgot Password page found!");
	  else
		  System.out.println("Forgot Password page does not exist!!");
  }
  
  
  

}
