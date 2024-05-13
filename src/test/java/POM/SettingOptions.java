package POM;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Helper;
import Utils.basePage;

public class SettingOptions extends basePage
{
	
	JavascriptExecutor js;
	
	@FindBy(xpath = "//a[@class='item_link']")
	private List<WebElement> settingoption;
	
	@FindBy(xpath = "//div[@class='components-Buttons-text--nMvosf0O']")
	private WebElement newtype;
	
	@FindBy(id = "popup_menu_item_3")
	private WebElement leavetype;
	
	public SettingOptions(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void settingOptionTypesofwork() throws Throwable
	{
		for (WebElement newsetting : settingoption) 
		{
			Helper.heighlightElement(driver, newsetting);
			System.out.println(newsetting.getText());
			if (newsetting.getText().equals("Types of Work"))
			{
				Helper.heighlightElement(driver, newsetting);
				newsetting.click();
				break;
			}
		}
	}
	public void newtyp() throws Throwable
	{
		Helper.heighlightElement(driver, leavetype);
		newtype.click();
	}
	
	
	
	
	public void settingOptionleaveType() throws Throwable
	{
		for (WebElement newsetting : settingoption) 
		{
			Helper.heighlightElement(driver, newsetting);
			System.out.println(newsetting.getText());
			if (newsetting.getText().equals("Leave Types"))
			{
				Helper.heighlightElement(driver, newsetting);
				newsetting.click();
				break;
			}
		}
	}
	
	public void newleavetyp() throws Throwable
	{
		Helper.heighlightElement(driver, leavetype);
		leavetype.click();
	}
	
	
	
}
