package Tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
		// Clicking on flight option
		// driver.findElement(By.xpath("(//span[@class='bui-tab__text'])[2]")).click();
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.xpath("//div[@data-testid='searchbox_controller_trip_type_ONEWAY']")).click();
		
		driver.findElement(By.cssSelector(".InputCheckbox-module__field___1zQqd")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).click();
		driver.findElement(By.xpath("//input[@class='css-1tl2oa1']")).sendKeys("Delhi");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".css-qqvbcw")).click();
		driver.findElement(By.xpath("//input[@placeholder='Depart']")).click();
		driver.findElement(By.xpath("//td[@data-date='2022-06-17']")).click();
		driver.findElement(By.cssSelector(".css-ya5gr9.wide")).click();
		
		
		
		Thread.sleep(7000);
		// span[@class='bui-tab__text']
	}

}
