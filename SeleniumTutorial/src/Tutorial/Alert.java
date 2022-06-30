package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	// ALERT switchTo()
	// IFRAME switchTo(). defaultcontent
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.findElement(By.id("runbtn")).click();
		// IFRAME
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		driver.switchTo().defaultContent();
		// driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
		driver.findElement(By.id("getwebsitebtn")).click();
		// driver.switchTo().alert().sendKeys("Selenium");
		// Thread.sleep(3000);
		// driver.switchTo().alert().accept();
		// driver.switchTo().defaultContent();
		// ALERT
		// String alertmsg = driver.switchTo().alert().getText();
		// System.out.println(alertmsg);
		// driver.switchTo().alert().accept();
		Thread.sleep(5000);

	}

}
