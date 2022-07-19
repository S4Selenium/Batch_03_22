package TestCases;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.payroll.BaseClass.BaseClass;
import com.payroll.PageObjects.LoginPage;
import com.payroll.Utilities.ExcelRead;
import com.payroll.Utilities.Log;

public class LoginTest extends BaseClass {

	@BeforeTest
	public void firstcall() {
		launchApp();
	}

	@Test(priority = -1)
	public void LoginTest() throws InterruptedException {
		Log.startTestCase("Login To Payroll");
		LoginPage Lg = new LoginPage(driver);
		String Expected = "https://www.qabible.in/payrollapp/site/index";
		Log.info("Going to enter username and password");
		Lg.loginfnt("Carol", "1q2w3e4r");
		Log.endTestCase("Login and assertion completed");
	}
	
	  
	@Test(dataProvider = "getlogin")
	public void InvalidLogin(String Username, String Password) throws InterruptedException {
		Log.startTestCase("Login To Payroll");
		LoginPage Lg = new LoginPage(driver);
		String Expected = "https://www.qabible.in/payrollapp/site/index";
		Log.info("Going to enter username and password");
		Lg.loginfnt(Username, Password);
		String exp = "Incorrect username or password.";
		Thread.sleep(5000);
		Assert.assertEquals(exp, Lg.errormsg());
		Log.endTestCase("Login and assertion completed");
	}

	@DataProvider
	public Object[][] getlogin() {
		Object[][] data = new Object[2][2];
		data[0][0] = "carolwrong";
		data[0][1] = "1q2w3e4r";
		data[1][0] = "carol";
		data[1][1] = "1q2w3e4rwrong";
		return data;
	  
	  }
	 

}
