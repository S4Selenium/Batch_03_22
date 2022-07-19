package Tutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		//Implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://login.yahoo.com/?.");
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("ABC");
		//Using Java
		/*
		 * driver.findElement(By.xpath("//label[@for='persistent']")).click();
		 * driver.findElement(By.id("mbr-forgot-link")).click();
		 * 
		 * 
		 */
		
		//Using JavaScriptExecutor
		JavascriptExecutor jscript =(JavascriptExecutor) driver;
		WebElement Stay = driver.findElement(By.xpath("//label[@for='persistent']"));
		WebElement forgot = driver.findElement(By.id("mbr-forgot-link"));
		jscript.executeScript("arguments[0].click();",Stay);
		Thread.sleep(5000);
		jscript.executeScript("alert('Hello')");
		Thread.sleep(5000);
		
	}

}
