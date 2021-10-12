package Test_Runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestPages.LogIn_Page;
import TestPages.Make_Appointment_Page_loc;

public class Book_Appointment_Test 
{
	String Browser_Type = "chrome";
	String Test_Url = "https://katalon-demo-cura.herokuapp.com/profile.php#login";
	
	Make_Appointment_Page_loc mkp = new Make_Appointment_Page_loc();
	
	@BeforeMethod
	public void opne_Browser()
	{
		mkp.browser(Browser_Type, Test_Url);
	}
	
	@Test
	public void Tc1()
	{ 
		mkp.Make_appointment();
	}
	
	@AfterMethod
	public void close_Browser() throws InterruptedException
	{
		Thread.sleep(3000);
		mkp.driver.close();
	}

}
