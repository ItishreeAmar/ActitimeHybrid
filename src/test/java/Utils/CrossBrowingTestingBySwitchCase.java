package Utils;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class CrossBrowingTestingBySwitchCase extends base
{
	@Parameters("browser")
	@BeforeMethod
	public void startMethod( String browser ) throws Throwable
	{
		switch( browser.toLowerCase())
		{
		case "chrome":
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://online.actitime.com/jsp3/login.do");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  base.obj();
		  break;
		
		case "edge":
		
			  driver = new EdgeDriver();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			  driver.get("https://online.actitime.com/jsp3/login.do");
			  driver.manage().window().maximize();
			  Thread.sleep(2000);
			  base.obj();
			  break;
		
		case "firefox":
		
			  driver = new FirefoxDriver();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			  driver.get("https://online.actitime.com/jsp3/login.do");
			  driver.manage().window().maximize();
			  Thread.sleep(2000);
			  base.obj();
			  break;
		}
	}
	
	@Parameters
	@AfterMethod
	public void endMethod() throws Throwable
	{
		home.teardown();
	}
}
