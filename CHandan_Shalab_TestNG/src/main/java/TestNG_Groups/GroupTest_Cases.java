package TestNG_Groups;

import org.testng.annotations.Test;

import TestPages.Make_Appointment_Page_loc;
import Test_Runner.Book_Appointment_Test;
import Test_Runner.LoginTest;

public class GroupTest_Cases 
{
	
	LoginTest lgintst = new LoginTest();
	Book_Appointment_Test	mp = new Book_Appointment_Test();
	
	@Test( groups = "Smoke_Test" )
	public void lgn_Tc1() throws InterruptedException
	{
		lgintst.opne_Browser();
		lgintst.Tc1();
		lgintst.close_Browser();
	}
	
	@Test( groups = "Functional_Test" )
	public void lgn_Tc2() throws InterruptedException
	{
		lgintst.opne_Browser();
		lgintst.Tc2();
		lgintst.close_Browser();	
	}

	@Test( groups = { "Functional_Test", "Smoke_Test"})
	public void Makeapnt_tc() throws InterruptedException
	{
		mp.opne_Browser();
		mp.Tc1();
		mp.close_Browser();
	}

}
