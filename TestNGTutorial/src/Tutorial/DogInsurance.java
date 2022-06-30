package Tutorial;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DogInsurance {
	@BeforeSuite
	  public void BeforesuiteMethod()
	  {
		System.out.println("I will be running first SUITE");
	  }
	
	@BeforeTest
	    public void DBReset()
	    {
		        System.out.println("This method will run before Test BTEST");
	    }
	@BeforeClass
	 public void BeforeclassMethod()
	{
		System.out.println("I will be executing before each class Bclass");
	}
	@BeforeMethod
	 public void BMethod()
	 {
			System.out.println("I will be executing before EACHMETHOD");
	}
	 
	@Test(groups= {"Reg"})
	public void WebLogin()
	{
		System.out.println("Dog Insurance WebLogin");
		//Assert.assertEquals(false, true);
	}
	
	@Test(groups= {"Reg"})
	public void WebLogout()
	{
		System.out.println("Dog Insurance WebLogout");
	}
	
	@Test(groups= {"SMK"})
	public void MobileLogin()
	{
		System.out.println("Dog Insurance MobileLogin");
	}
	@Test(groups= {"SMK"})
	public void MobileLogout()
	{
		System.out.println("Dog Insurance MobileLogout");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("I will be executing after EACH METHOD");
	}
	
	@AfterClass
	public void afterclassMethod()
	{
		System.out.println("I will be executing after each class AfterClass");
	}
	@AfterTest
	public void ReportGeneration()
	{
		System.out.println("This method runs after all the test get executed AfterTest");
	}
	@AfterSuite
	  public void AftersuiteMethod()
	  {
		System.out.println("I will be running Last AfterSuite");
	  }
}
