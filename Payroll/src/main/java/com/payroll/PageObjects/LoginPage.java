package com.payroll.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.payroll.BaseClass.BaseClass;
import com.payroll.Actions.Action;

public class LoginPage extends BaseClass

{
	Action act = new Action();
	public static WebDriver driver;	
	
	@FindBy(id = "loginform-username")
	WebElement username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginbutton;

	@FindBy(linkText = "reset it']")
	WebElement resetit;

	@FindBy(id = "loginform-rememberme")
	WebElement rememberme;

	@FindBy(xpath = "//div[@class='col-sm-4 form-area inner']//child::h1")
	WebElement loginlogo;
	
	
	@FindBy(xpath = "//p[normalize-space()='Incorrect username or password.']")
	WebElement errormsg;
	
	public LoginPage(WebDriver driver) {
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

	public WebElement resetit() {
		return resetit;
	}

	public WebElement rememberme() {
		return rememberme;
	}

	public WebElement loginlogo() {
		return loginlogo;
	}

	   public HomePage loginfnt(String Uname, String Pwd)
	   { 
		   act.type(username,Uname);
		   act.type(password,Pwd);
		   act.click(driver, loginbutton);
		   return new HomePage(driver);
	   }
	   
	   public String errormsg()
	   {
		  
	   String msg = errormsg.getText();
	   return msg;
	   
	   }
	

	

	

}
