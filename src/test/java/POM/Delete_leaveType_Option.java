package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Helper;
import Utils.basePage;

public class Delete_leaveType_Option extends basePage
{
	JavascriptExecutor js;
	
	@FindBy(xpath = "(//div[@data-for='itemListPageTooltip'])[5]")
	private WebElement leaveTypeOption;
	
	@FindBy(xpath = "//span[contains(.,'Delete')]")
	private WebElement delet;
	
	@FindBy(xpath = "//button[contains(.,'OK, Delete')]")
	private WebElement ok_delet;
	
	public Delete_leaveType_Option(WebDriver driver)
	{
		PageFactory.initElements(driver	, this);
	}
	
	public void deletLeavetype() throws Throwable
	{
		Helper.heighlightElement(driver, leaveTypeOption);
		leaveTypeOption.click();
		Thread.sleep(2000);
		Helper.heighlightElement(driver, delet);
		delet.click();
		Thread.sleep(2000);
		Helper.heighlightElement(driver, ok_delet);
		ok_delet.click();
		
	}
	
}
