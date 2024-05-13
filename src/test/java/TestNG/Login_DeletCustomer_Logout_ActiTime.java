package TestNG;

import org.testng.annotations.Test;

import Utils.base;
import Utils.baseTest;
public class Login_DeletCustomer_Logout_ActiTime extends baseTest
{

	@Test
	public static void LoginDeletCustomerLogout() throws Throwable
	{
		base.obj();
		login.loginM();
		Thread.sleep(2000);
		home.task();
		dlt.delete();
	}

}
