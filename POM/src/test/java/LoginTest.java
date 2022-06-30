
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginTest {
	@Test
	public void login() throws InterruptedException
	{
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//LoginPage Object
		LoginPage pg =new LoginPage(driver);
		pg.uname().click();
		pg.uname().sendKeys("standard_user");
		pg.pwd().click();
		pg.pwd().sendKeys("secret_sauce");
		pg.loginBtn().click();
		HomePage hp= new HomePage(driver);
		boolean a =hp.Hlogo().isDisplayed();
		System.out.println(a);
		Assert.assertEquals(a, true);
		hp.HMenu().click();
		System.out.println("Whatishere"+hp.Hlogo());
		
	}
	
}
