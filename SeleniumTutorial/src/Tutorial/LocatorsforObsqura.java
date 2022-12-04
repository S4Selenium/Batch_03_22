package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsforObsqura {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=WebDriverManager.chromedriver().create();
		//for maximising the window
		driver.manage().window().maximize();
		//fetching the url
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.findElement(By.xpath("//a[@href='simple-form-demo.php']")).click();
		driver.findElement(By.id("single-input-field")).click();
		driver.findElement(By.id("single-input-field")).sendKeys("Sachin");
		driver.findElement(By.id("button-one")).click();
		String exp="Your Message : Sachin";
		String actual = driver.findElement(By.id("message-one")).getText();
		System.out.println(actual);
		//HARD ASSERT
	    Assert.assertEquals(actual,exp);//actual  //expected
	    System.out.println("The Assertion Passed");
		//for my second commit
		
		
		  driver.findElement(By.linkText("Checkbox Demo")).click(); Thread.sleep(3000);
		  driver.findElement(By.className("form-check-input")).click();
		  //Soft Assert
		  SoftAssert sassert = new SoftAssert();
		  String checkexp = "Success - Chis checked";
		  String checkact = driver.findElement(By.id("message-one")).getText();
		  System.out.println(checkact);
		  sassert.assertEquals(checkact,checkexp);
		  System.out.println("My soft assert failed but i got executed");
		  
		  
		  
			/*
			 * driver.findElement(By.partialLinkText("Select Input")).click();
			 * Thread.sleep(3000); // Static drop down(select class object) WebElement st =
			 * driver.findElement(By.id("single-input-field"));// taking the address of
			 * st.click(); Select dropdown = new Select(st); dropdown.selectByValue("Red");
			 * Thread.sleep(2000); driver.findElement(By.id("message-one")).click();
			 * Thread.sleep(2000); dropdown.selectByVisibleText("Green");
			 * driver.findElement(By.id("message-one")).click(); Thread.sleep(2000);
			 */
		 
		 
		
	}

}
