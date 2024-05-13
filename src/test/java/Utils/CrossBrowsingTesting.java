package Utils;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowsingTesting extends base
{
	
	@BeforeMethod
	public void startMethod(  ) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://online.actitime.com/jsp3/login.do");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  base.obj();
		
		
	}
	
	@Parameters
	@AfterMethod
	public void endMethod() throws Throwable
	{
		home.teardown();
	}
}
