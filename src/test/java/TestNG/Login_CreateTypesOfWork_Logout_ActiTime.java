package TestNG;

import org.testng.annotations.Test;

import Utils.base;
import Utils.baseTest;
public class Login_CreateTypesOfWork_Logout_ActiTime extends baseTest
{

	@Test
	public static void LoginCreateTypesOfWorkLogout() throws Throwable 
	{
		base.obj();
		login.loginM();
		Thread.sleep(2000);
		home.settings();
		Thread.sleep(2000);
		optn.settingOptionTypesofwork();
		Thread.sleep(2000);
		optn.newtyp();
		Thread.sleep(2000);
		ntw.newtypesofWork();
		
		
	}

}
