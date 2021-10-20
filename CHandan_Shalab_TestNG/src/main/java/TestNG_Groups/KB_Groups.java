package TestNG_Groups;

import java.io.IOException;

import org.testng.annotations.Test;

import Test_Runner.KBCreate_Depsit_Accounts_TestRunner;
import Test_Runner.KBLogin_TestRunner;

public class KB_Groups 
{
	KBLogin_TestRunner kblng = new KBLogin_TestRunner();
	KBCreate_Depsit_Accounts_TestRunner cba = new KBCreate_Depsit_Accounts_TestRunner();

	//@Test(groups= "login_Module",enabled = false)
	@Test(priority = 2)
	public void Tc1() throws IOException
	{
	//	kblng.open_browser();
		kblng.Login_Test_Runner();
		kblng.close_browser();
	}

	
	//@Test(groups = {"Create_Depsit_Accont_Module","login_Module"})
	//@Test(dependsOnMethods ="Tc1" ,groups = "Create_Depsit_Accont_Module" )
	@Test(priority = 1)
	public void Tc2() throws IOException
	{
		//cba.open_browser();
		cba.Create_Deposit_Accounts_Test_Runner();
		cba.close_browser();
	}
}
