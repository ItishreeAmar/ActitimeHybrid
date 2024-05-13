package Utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SingleScreenShot implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("execution start on test sucess");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("execution start on test  onTestsucess");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		TakesScreenshot ts = (TakesScreenshot) baseTest.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/Failed.png");
		
		try 
		{
			FileHandler.copy(source, dest);
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("execution start on test skip");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("execution start on test  onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("execution start on test  onTestFailedButWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("execution start on test  onstart");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("execution start on test  onFinish");
	}
	
	
	
}
