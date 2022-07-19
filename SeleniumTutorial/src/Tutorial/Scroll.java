package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		//Scrolling 3 different ways 
		//Page Bottom
		//Particular element ---done
		//Page (x,y)---done
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,250)");
		//Thread.sleep(5000);
	    driver.findElement(By.xpath("(//a[@href='/blog'])[2]")).click();
		//js.executeScript("arguments[0].scrollIntoView();",link);
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		
		

	}

}
