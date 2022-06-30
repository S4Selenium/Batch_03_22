package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	By username= By.id("user-name");
	By password=By.cssSelector("input[placeholder*='Pass']");
	By login=By.id("login-button");
	
	/*
	 * public LoginPage(WebDriver driver) { // TODO Auto-generated constructor stub
	 * this.driver=driver; }
	 */
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement username()
	{
		return driver.findElement(username);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement login()
	{
		return driver.findElement(login);
	}


}
