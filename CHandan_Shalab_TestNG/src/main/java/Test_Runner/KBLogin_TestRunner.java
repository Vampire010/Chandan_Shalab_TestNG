package Test_Runner;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import KB_Login_Page.Login_Page_Locaters;

public class KBLogin_TestRunner 
{
	//String Browser_Types = "chrome";
	String Test_Url = "http://mykidsbank.org/";
	
	Login_Page_Locaters  Login_Page = new Login_Page_Locaters();
	
	@Parameters("Browser_Types")
	@BeforeMethod
	public void open_browser(String Browser_Types)
	{
		Login_Page.browser(Browser_Types, Test_Url);
		
	}
	
	@Test
	public void Login_Test_Runner() throws IOException
	{
		Login_Page.Login_Page();
	}
	
	@AfterMethod
	public void close_browser()
	{
		Login_Page.driver.quit();
	}

}
