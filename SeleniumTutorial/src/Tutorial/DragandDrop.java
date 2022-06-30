package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(5000);
		//drag
		WebElement first = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		//drop
		WebElement second = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions act = new Actions(driver);
		act.dragAndDrop(first, second).perform();
		Thread.sleep(5000);
		
	
		
		
	}

}
