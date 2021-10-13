package Test_Runner;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KB_Login_Page.Create_Deposit_Accounts;

public class KBCreate_Depsit_Accounts_TestRunner
{
	String Browser_Types = "chrome";
	String Test_url ="http://mykidsbank.org/";
	
	Create_Deposit_Accounts CDA = new Create_Deposit_Accounts();
	

	@BeforeMethod
	public void open_browser() throws IOException
	{
		CDA.browser(Browser_Types, Test_url);
		
		
	}
	
	@Test
	public void Create_Deposit_Accounts_Test_Runner() throws IOException
	{
		CDA.Create_New_Deposit_Account();
	}
	

	@AfterMethod
	public void close_browser()
	{
		CDA.driver.quit();
	}
}
