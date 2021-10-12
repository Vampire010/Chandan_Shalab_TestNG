package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Browser_Config.Browser_Launcher;

public class Make_Appointment_Page_loc extends Browser_Launcher
{
	
	public void Make_appointment()
	{
		
		LogIn_Page lp = new LogIn_Page();
		lp.login_page_loc();
		
		
		WebElement Facility = driver.findElement(By.id("combo_facility"));
		
		Select Facility_dropdown = new Select(Facility);
		Facility_dropdown.selectByValue("Tokyo CURA Healthcare Center");
		
		WebElement readmission = driver.findElement(By.id("chk_hospotal_readmission"));
		readmission.click();

		WebElement radio_program_medicaid = driver.findElement(By.id("radio_program_medicaid"));
		radio_program_medicaid.click();
		
		WebElement visit_date = driver.findElement(By.id("txt_visit_date"));
		visit_date.sendKeys("12/10/2021");
		
		WebElement comment = driver.findElement(By.id("txt_comment"));
		comment.sendKeys("Genral CheckUp");
		
		WebElement Book_Appointment = driver.findElement(By.id("btn-book-appointment"));
		Book_Appointment.click();
		
	}
	

}
