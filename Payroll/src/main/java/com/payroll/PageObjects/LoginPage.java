package com.payroll.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.payroll.BaseClass.BaseClass;

public class LoginPage extends BaseClass

{
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

}
