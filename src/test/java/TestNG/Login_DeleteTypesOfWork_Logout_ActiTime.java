package TestNG;
import org.testng.annotations.Test;

import Utils.base;
import Utils.baseTest;
public class Login_DeleteTypesOfWork_Logout_ActiTime extends baseTest
{
	@Test
	public static void Login_DeleteTypesOfWorkLogout() throws Throwable 
	{
		base.obj();
		login.loginM();
		Thread.sleep(2000);
		home.settings();
		Thread.sleep(2000);
		optn.settingOptionTypesofwork();
		Delettypofwk.deletetypesofwork();
			
	}
}
