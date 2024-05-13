package TestNG;

import org.testng.annotations.Test;

import Utils.base;
import Utils.baseTest;
public class Login_CreatLeaveType_Logout_ActiTime extends baseTest
{
	@Test
	public static void LoginCreatLeaveTypeLogout() throws Throwable 
	{
		base.obj();
		login.loginM();		
		Thread.sleep(2000);
		home.settings();
		Thread.sleep(2000);
		optn.settingOptionleaveType();
		Thread.sleep(2000);
		leavetype.newleavetype();
	}
}
