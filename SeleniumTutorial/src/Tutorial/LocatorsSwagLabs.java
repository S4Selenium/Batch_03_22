package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsSwagLabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://www.saucedemo.com/");
		//Locators id,name,xpath,css selector
		driver.findElement(By.cssSelector("#user-name")).click();
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		//tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@placeholder='Password'and @type='password']")).click();
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		//partial linked text
		//driver.findElement(By.partialLinkText("book")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.tagName("img")).click();
		driver.findElement(By.xpath("(//img)[3]")).click();
		Thread.sleep(3000);
		//for my second commit
		
		

	}

}
