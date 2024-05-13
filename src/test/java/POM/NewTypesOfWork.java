package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Helper;
import Utils.basePage;

public class NewTypesOfWork extends basePage
{
	 @FindBy(xpath = "//input[@id='title']")
	 private WebElement CreateTypesOfWork;
	 
	 @FindBy(xpath = "//span[.='Save']")
	 private WebElement savebutton;
	 
	 public NewTypesOfWork(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	
	 public void newtypesofWork() throws Throwable
	 {
		 Helper.heighlightElement(driver, CreateTypesOfWork);
		 CreateTypesOfWork.sendKeys("Itishree");
		 Thread.sleep(2000);
		 Helper.heighlightElement(driver, savebutton);
		 savebutton.click();
	 }
	
}
