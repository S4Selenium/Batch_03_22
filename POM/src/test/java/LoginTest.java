import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ObjectRepo.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	
	@Test
	public void login() throws InterruptedException
	{
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		LoginPage lp =new LoginPage(driver);
		lp.username().click();
		lp.username().sendKeys("standard_user");
		lp.password().click();
		lp.password().sendKeys("secret_sauce");
		lp.login().click();
		Thread.sleep(3000);
		//Explicit wait
		//naughty 30 secs
		//naughty 40secs//naughty 60 
		//
		//naughty(120);
	}
	
}
