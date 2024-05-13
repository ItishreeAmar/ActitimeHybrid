package POM;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Helper;
import Utils.basePage;

public class CreateNewCustomer extends basePage
{
	JavascriptExecutor js;
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement EnterCustomerName;
	
	@FindBy(xpath = "(//textarea[@placeholder='Enter Customer Description'])[1]")
	private WebElement Description;
	
	@FindBy(xpath = "//div[contains(@class,'itemRow cpItemRow')]")
	private List<WebElement> CopyProject;
	
	@FindBy(xpath = "//div[@class='commitButtonPlaceHolder']")
	private WebElement save;
	
	public CreateNewCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Enterdetails() throws Throwable
	{
		Helper.heighlightElement(driver, EnterCustomerName);
		EnterCustomerName.sendKeys("amar");
		Helper.heighlightElement(driver, Description);
		Description.sendKeys("amar is a good boy");
		for (WebElement newcopy : CopyProject) 
		{
			Helper.heighlightElement(driver, newcopy);
			if (newcopy.getText().equals("Our company"))
			{
				newcopy.click();	
			}
		}
		Helper.heighlightElement(driver, save);
		save.click();
	}
	
}
