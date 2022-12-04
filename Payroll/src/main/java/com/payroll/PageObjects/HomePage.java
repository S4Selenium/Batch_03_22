package com.payroll.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.Actions.Action;
import com.payroll.BaseClass.BaseClass;

public class HomePage extends BaseClass {
	
	public static WebDriver driver;	
	
	
	@FindBy(xpath = "//a[normalize-space()='Dashboard']")
	WebElement DashBoard;

	@FindBy(xpath = "//a[normalize-space()='Company']")
	WebElement company;
	
	@FindBy(xpath = "//a[@href='/payrollapp/client/index']")
	WebElement Client;

	@FindBy(xpath = "//a[normalize-space()='Workers']")
	WebElement worker;
	
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement Dashboard() {
		return DashBoard;
	}

	public WebElement company()

	{
		act.explicitWait(driver,company, 10);
		return company;
		
	}

	public WebElement worker() {
		return worker;
	}
	
	public Client ClientsTab()
	{
	    
		Action act = new Action();
		act.click(driver, Client);
		return new Client(driver);
	}
	
}
