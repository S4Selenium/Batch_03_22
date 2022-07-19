package com.payroll.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.Actions.Action;
import com.payroll.BaseClass.BaseClass;

public class HomePage extends BaseClass {
	
	public static WebDriver driver;	
	
	@FindBy(id = "loginform-username")
	WebElement username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginbutton;
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement username() {
		return username;
	}

	public WebElement password()

	{
		return password;
	}

	public WebElement loginbutton() {
		return loginbutton;
	}
	
	public Client ClientsTab()
	{
	    
		Action act = new Action();
		act.click(driver, username);
		return new Client(driver);
	}
	
}
