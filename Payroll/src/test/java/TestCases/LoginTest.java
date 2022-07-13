package TestCases;
import java.util.ArrayList;
import org.testng.annotations.Test;
import com.payroll.BaseClass.BaseClass;
import com.payroll.Utilities.ExcelRead;

public class LoginTest extends BaseClass {
	
	/*
	 * @BeforeTest public void firstcall() { launchApp(); }
	 */
	
	/*
	 * @Test public void LoginTest() throws InterruptedException {
	 * 
	 * LoginPage Lg = new LoginPage(driver); Lg.username().click();
	 * Lg.username().sendKeys("carol"); Lg.password().click();
	 * Lg.password().sendKeys("1q2w3e4r"); Lg.loginbutton().click(); String
	 * Expected="https://www.qabible.in/payrollapp/site/index";
	 * //Thread.sleep(5000);(Replace this) String Actual=driver.getCurrentUrl();
	 * //Assert.assertEquals(Actual, Expected);
	 * 
	 * }
	 */
	
	@Test
	public void createclient() throws Exception
	{
		ExcelRead data = new ExcelRead();
		ArrayList exceldata = data.getData("Epdetails");
		System.out.println(exceldata.get(0));
		System.out.println(exceldata.get(1));
		System.out.println(exceldata.get(2));
		System.out.println(exceldata.get(3));
		System.out.println(exceldata.get(4));
		System.out.println(exceldata.get(5));
		System.out.println(exceldata.get(6));
		System.out.println(exceldata.get(7));
		System.out.println(exceldata.get(8));
		
        
	  
	  
	}
	
	

}
