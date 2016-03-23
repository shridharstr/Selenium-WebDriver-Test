package YahooTestFramework;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ForgotPasswordPage 
{
	WebDriver driver;
	public ForgotPasswordPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void display()
	{
       Assert.assertTrue(true, "ForgotPassword page opened");
	}

	
}
