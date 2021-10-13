package Test_Runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestPages.LogIn_Page;
import TestPages.Make_Appointment_Page_loc;

public class LoginTest 
{
	String Browser_Type = "chrome";
	String Test_Url = "https://katalon-demo-cura.herokuapp.com/profile.php#login";
	
	LogIn_Page lt = new LogIn_Page();
	
	@BeforeMethod
	public void opne_Browser()
	{
		lt.browser(Browser_Type, Test_Url);
	}
	
	@Test( groups = "Smoke_Test" )
	public void Tc1()
	{
		lt.login_page_TC1();
	}
	
	@Test( groups = "Functional_Test" )
	public void Tc2()
	{
		lt.login_page_TC2();
	}
	

	
	
	@AfterMethod
	public void close_Browser() throws InterruptedException
	{
		Thread.sleep(3000);
			lt.driver.close();
	}
	
	
}
