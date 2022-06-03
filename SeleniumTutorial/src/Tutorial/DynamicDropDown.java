package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
		WebDriver driver= WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		Thread.sleep(3000);
		driver.findElement(By.id("select2-4qt1-container")).click();
		//driver.findElement(By.className("select2-search__field")).click();
		//driver.findElement(By.className("select2-search__field")).sendKeys("India");
		
		Thread.sleep(3000);
		
		
		
	}

}
