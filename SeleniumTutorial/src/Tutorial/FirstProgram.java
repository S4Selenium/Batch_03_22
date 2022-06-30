package Tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProgram {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Creating a driver object
		//giving the path for chrome driver
		//OLD WAY to initiate browsers
		/*
		 * System.setProperty("webdriver.firefox.driver",
		 * "C:\\Users\\Nithin\\eclipse-workspace\\Batch_03_22\\SeleniumTutorial\\bin\\chromedriver.exe"
		 * ); WebDriver driver = new FirefoxDriver();
		 */
		
		//New way to initiate browser instance
		
		WebDriver driver=WebDriverManager.edgedriver().create();
		
		//giving the path of edge driver
		//EdgeDriver driver = new EdgeDriver();
		//System.setProperty("webdriver.edge.driver","D:\\skillup\\msedgedriver.exe");
		//EdgeDriver driver = new EdgeDriver();
		//driver.get("https://selenium.obsqurazone.com/index.php");
		//will not wait for the page to completely load
		//driver.navigate().to("https://selenium.obsqurazone.com/index.php");
		//Waits to load the completely
		driver.get("https://selenium.obsqurazone.com/index.php");
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getPageSource());
		//driver.close();
	    //driver.quit();
		//for my second commit
		
		
	}

}
