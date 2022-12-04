package TestCases;
import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.payroll.Actions.Action;
import com.payroll.BaseClass.BaseClass;
import com.payroll.PageObjects.HomePage;
import com.payroll.PageObjects.LoginPage;
import com.payroll.Utilities.Log;

public class LoginTest extends BaseClass {
	 //Action act = new Action();
	//HOW TO KEEP THE OBJECTS
	@Test(priority = -1)
	public void LoginTest() throws InterruptedException {
		Log.startTestCase("Login To Payroll");
		Log.info("Going to enter username and password");
		LoginPage Lg = new LoginPage(getDriver());
		Lg.loginfnt("Carol", "1q2w3e4r");
		HomePage Hp = new HomePage(getDriver());
		act.explicitWait(getDriver(), Hp.company(),10);
	    boolean actual = act.findElement(getDriver(),Hp.company()); 
		Assert.assertEquals(actual, true);
		Log.endTestCase("Login and assertion completed");
	}
	
	@Test(dataProvider = "getlogin",priority=2)
	public void InvalidLogin(String Username, String Password) throws InterruptedException {
		Log.startTestCase("Login To Payroll");
		//LoginPage Lg = new LoginPage(getDriver());
		Log.info("Going to enter username and password");
		LoginPage Lg = new LoginPage(getDriver());
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
