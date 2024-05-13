package TestNG;

import org.testng.annotations.Test;

import Utils.baseTest;

public class _1_Login_Logout  extends baseTest
{
	@Test
	public void login_Logout() throws Throwable
	{
		login.loginM(); 
		Thread.sleep(2000);
	}

}
