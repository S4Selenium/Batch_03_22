package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDP {
	
	@Test(dataProvider="getlogin")
	public void SwagLagsLogin(String Username, String Password)
	{
		System.setProperty("webdriver.chrome.driver","D:\\skillup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys(Username);
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("login-button")).click();
		driver.close();
	}
	
	
 @DataProvider
 public Object[][] getlogin()
 {
	 Object[][] data = new Object[3][2];
	 data[0][0]="standard_user";
	 data[0][1]="secret_sauce";
	 data[1][0]="locked_out_user";
	 data[1][1]="secret_sauce";
	 data[2][0]="locked_out_user";
	 data[2][1]="secret_sauce";
	return data;
 }

}
