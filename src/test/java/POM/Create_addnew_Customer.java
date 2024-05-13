package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Helper;
import Utils.basePage;

public class Create_addnew_Customer extends basePage
{
	
	@FindBy(xpath = "//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']//div[@class='dropdownButton']")
	private WebElement selectCustomer;
	
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement name;
	
	public Create_addnew_Customer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void createNewTask() throws Throwable
	{
		Helper.heighlightElement(driver, selectCustomer);
		selectCustomer.click();
		Thread.sleep(3000);
		Helper.heighlightElement(driver, name);
		name.click();
		
	}
}
