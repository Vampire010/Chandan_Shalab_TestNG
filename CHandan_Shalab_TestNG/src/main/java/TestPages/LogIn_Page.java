package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser_Config.Browser_Launcher;

public class LogIn_Page extends Browser_Launcher
{
	//LogIn_Page lp = new LogIn_Page();

	public void login_page_TC1()
	{
	WebElement menu_toggle = driver.findElement(By.id("menu-toggle"));
	menu_toggle.click();
	
	WebElement Login_lnk = driver.findElement(By.xpath("/html/body/nav/ul/li[3]/a"));
	Login_lnk.click();
	
	WebElement username = driver.findElement(By.id("txt-username"));
	username.sendKeys("John Doe");
	
	WebElement password = driver.findElement(By.id("txt-password"));
	password.sendKeys("ThisIsNotAPassword");
	
	WebElement Login_btn = driver.findElement(By.id("btn-login"));
	Login_btn.click();
	}
	
	
	public void login_page_TC2()
	{
	WebElement menu_toggle = driver.findElement(By.id("menu-toggle"));
	menu_toggle.click();
	
	WebElement Login_lnk = driver.findElement(By.xpath("/html/body/nav/ul/li[3]/a"));
	Login_lnk.click();
	
	WebElement username = driver.findElement(By.id("txt-username"));
	username.sendKeys("John123");
	
	WebElement password = driver.findElement(By.id("txt-password"));
	password.sendKeys("fvjhavbkdv");
	
	WebElement Login_btn = driver.findElement(By.id("btn-login"));
	Login_btn.click();
	}
}
