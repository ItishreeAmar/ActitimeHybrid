package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Helper;
import Utils.basePage;



public class _1_ActiTimeLogin extends basePage 
{
	
	 //locator for user name
	 @FindBy(xpath = "//input[@placeholder='Username']")
	 private WebElement usernametextfield;
	 
	 //locator for password
	 @FindBy(xpath = "//input[@name='pwd']")
	 private WebElement passwordtextfiled;
	 
	 //locator for check box
	 @FindBy(xpath = "//input[@id='keepLoggedInCheckBox']")
	 private WebElement checkbox;
	 
	 //locator for login button
	 @FindBy(xpath = "//a[@id='loginButton']")
	 private WebElement login;
	 
	 
	 public _1_ActiTimeLogin(WebDriver driver) throws Throwable
	 {
		 
		 PageFactory.initElements(driver, this);
	 }



	public void loginM() throws Throwable
	 {
		Helper.heighlightElement(driver, usernametextfield);
		 usernametextfield.sendKeys(username);
		 Thread.sleep(2000);
		 Helper.heighlightElement(driver, passwordtextfiled);
		 passwordtextfiled.sendKeys(password);
		 js=(JavascriptExecutor) driver;
		 
		 if (checkbox.isDisplayed()) 
		 {
			 Helper.heighlightElement(driver, checkbox);
			 js.executeScript("arguments[0].click()", checkbox);
			 System.out.println("check box ix selected:-" + checkbox.isSelected());
		 }
		 else 
		 {
			 System.out.println("check box is not present");
			
		}
		 Thread.sleep(2000);
		 js.executeScript("arguments[0].click()", login);
		 
	 }
	 
}
