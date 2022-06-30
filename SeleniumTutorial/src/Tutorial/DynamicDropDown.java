package Tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
		WebDriver driver= WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.findElement(By.xpath("(//span[@role='textbox'])[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("w");
		Thread.sleep(5000);
		String a = "Wyoming";
		
		List<WebElement> choices = driver.findElements(By.xpath("//li[@role='option']"));
		for(WebElement option:choices)
		{
			if(option.getText().equalsIgnoreCase("wyoming"))
			{
				System.out.println(option);
				option.click();
				break;
			}
		}
		String b = driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[1]")).getText();
		Thread.sleep(5000);
		Assert.assertEquals(b,a);
		
		
	}

}
