package ObjectRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//POM with PageObjectFactory
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='app_logo']")
	WebElement logo;
	
	@FindBy(id="react-burger-menu-btn")
	WebElement menubutton;
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement Hlogo()
	{
		return logo;
	}
	public WebElement HMenu()
	{
		return menubutton;
	}
	
}
