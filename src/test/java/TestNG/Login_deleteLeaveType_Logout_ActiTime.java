package TestNG;

import org.testng.annotations.Test;

import Utils.base;
import Utils.baseTest;
public class Login_deleteLeaveType_Logout_ActiTime extends baseTest
{
	@Test
	public static void LogindeleteLeaveTypeLogout() throws Throwable 
	{
		base.obj();
		login.loginM();
		Thread.sleep(2000);
		home.settings();
		Thread.sleep(2000);
		optn.settingOptionleaveType();
		Thread.sleep(2000);
		delt.deletLeavetype();
	}

}
