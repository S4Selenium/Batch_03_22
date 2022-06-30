package Tutorial;

import org.testng.annotations.Test;

public class VehicleInsurance {
	
	@Test(priority= 1,groups= {"Reg"})
	public void WebLogin()
	{
		System.out.println("Veh Insurance WebLogin");
	}
	//If priority not given it will have default priority = 0
	@Test(groups= {"Reg"})
	public void WebLogout()
	{
		System.out.println("Veh Insurance WebLogout");
	}
	//If priority not given it will have default priority = 0
	@Test
	public void MobileLogin()
	{
		System.out.println("Veh Insurance MobileLogin");
	}
	@Test(priority=-4)
	public void MobileLogout()
	{
		System.out.println("Veh Insurance MobileLogout");
	}

}
