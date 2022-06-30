package Tutorial;

import org.testng.annotations.Test;

public class HomeInsurance {

	@Test(groups= {"Reg"})
	public void WebLogin()
	{
		System.out.println("Home Insurance WebLogin");
	}
	
	@Test(groups= {"Reg"})
	public void WebLogout()
	{
		System.out.println("Home Insurance WebLogout");
	}
	
	@Test
	public void MobileLogin()
	{
		System.out.println("Home Insurance MobileLogin");
	}
	@Test
	public void MobileLogout()
	{
		System.out.println("Home Insurance MobileLogout");
	}

}
