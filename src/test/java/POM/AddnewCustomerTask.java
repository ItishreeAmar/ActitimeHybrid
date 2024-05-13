package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Helper;
import Utils.basePage;

public class AddnewCustomerTask extends basePage
{
	JavascriptExecutor js;
	 
	@FindBy(xpath = "//div[@class='addNewContainer']")
	private WebElement addcustomer;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement newCustomer;
	
	public AddnewCustomerTask(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addNewCustomer() throws Throwable
	{
		Helper.heighlightElement(driver, addcustomer);
		addcustomer.click();
		Helper.heighlightElement(driver, addcustomer);
		newCustomer.click();
	}
	
}
