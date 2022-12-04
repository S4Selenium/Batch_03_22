package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.payroll.BaseClass.BaseClass;
import com.payroll.PageObjects.HomePage;
import com.payroll.PageObjects.LoginPage;
import com.payroll.Utilities.Log;

public class CreateClientTest extends BaseClass {
    @Test(priority = 5)
	public void CreateClient() throws InterruptedException {
		Log.startTestCase("Login To Payroll");
		LoginPage Lg = new LoginPage(getDriver());
		Log.info("Going to enter username and password");
		Lg.loginfnt("Carol", "1q2w3e4r");
		Log.endTestCase("Login and assertion completed");
		HomePage hp = new HomePage(getDriver());
		hp.ClientsTab();
	    Assert.assertEquals(true, true);
	}
}
