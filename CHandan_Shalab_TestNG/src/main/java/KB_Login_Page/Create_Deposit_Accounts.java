package KB_Login_Page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Create_Deposit_Accounts extends Login_Page_Locaters
{
	
	String Displayed_name = "sathya";
	String Login_username = "sathya123";
	String Login_password = "1234";
	public void Create_New_Deposit_Account() throws IOException
	{
		
		Login_Page();
		
		// Click on Create a new deposit account   
		WebElement Create_New_Deposit_Account_clik= driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/table/tbody/tr/td[3]/table/tbody/tr[1]/td/span"));
		Create_New_Deposit_Account_clik.click();
		
		
		//Enter Displayed name
		WebElement Displayed_names = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table[1]/tbody/tr[1]/td[2]/input"));
		Displayed_names.sendKeys(Displayed_name);
		
		
		//Enter Login_username
		WebElement Login_usernames =driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table[1]/tbody/tr[2]/td[2]/input"));
		Login_usernames.sendKeys(Login_username);
		
		//Login_password
		WebElement Login_passwords = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table[1]/tbody/tr[3]/td[2]/input"));
		Login_passwords.sendKeys(Login_password);

		//submit_Btn
		WebElement New_Accnt_Submit = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table[2]/tbody/tr/td[1]/span"));
		New_Accnt_Submit.submit(); 
	
	}
}
