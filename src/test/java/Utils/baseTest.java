package Utils;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseTest extends base 
{
	@BeforeMethod
	public void startMethod() throws Throwable
	{
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get(AppURL);
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  base.obj();
	}
	
	@AfterMethod
	public void endMethod() throws Throwable
	{
		home.teardown();
	}
}
