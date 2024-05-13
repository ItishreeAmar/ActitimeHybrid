package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Helper;
import Utils.basePage;

public class _2_ActiTimeHomePage extends basePage
{
	//declaration

	@FindBy(xpath = "//td[@class='logoutCell preventPanelsHiding']")
	private WebElement logout;
	
	@FindBy(xpath = "//div[@id='container_tasks']")
	private WebElement task;
	
	@FindBy(xpath = "(//div[contains(@class,'settings')])[1]")
	private WebElement settingoption;
	
	
	//initialization
	public  _2_ActiTimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void task()
	{
		task.click();
	}
	
	public void settings() throws Throwable
	{
		Helper.heighlightElement(driver, settingoption);
		settingoption.click();
	}
	
	public void teardown() throws Throwable
	{
		Helper.heighlightElement(driver, logout);
		logout.click();
		Thread.sleep(5000);
		driver.quit();
	}	
	
}
