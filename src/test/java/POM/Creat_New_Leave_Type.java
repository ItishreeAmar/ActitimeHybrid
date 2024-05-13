package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Helper;
import Utils.basePage;

public class Creat_New_Leave_Type extends basePage
{
	JavascriptExecutor js;
	 @FindBy(xpath = "(//div[contains(.,'New Type')])[3]")
	 private WebElement newleave;
	 
	 @FindBy(xpath = "(//input[@class='components-Input-input--VrbmUCOo'])[1]")
	 private WebElement EnterNameofLeaveType;
	 
	 @FindBy(xpath = "//button[@type='submit']")
	 private WebElement savebutton;
	 
	 public Creat_New_Leave_Type(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	
	 public void newleavetype() throws Throwable
	 {
		 Helper.heighlightElement(driver, newleave);
		 newleave.click();
		 Helper.heighlightElement(driver, EnterNameofLeaveType);
		 Thread.sleep(2000);
		 EnterNameofLeaveType.sendKeys("jay shree ram ");
		 Thread.sleep(2000);
		 Helper.heighlightElement(driver, savebutton);
		 savebutton.click();
	 }
}
