package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Helper;
import Utils.basePage;

public class Delete_Customer extends basePage
{
	JavascriptExecutor js;
	 @FindBy(xpath = "(//div[@class='title'])[10]")
	 private WebElement customerbutton;
	 
	 @FindBy(xpath = "(//div[@class='editButton'])[1]")
	 private WebElement custmorsettingbutton;
	 
	 @FindBy(xpath = "(//div[contains(@class,'actionButton')])[8]")
	 private WebElement actionbutton;
	 
	 @FindBy(xpath = "(//div[@class='title'][normalize-space()='Delete'])[1]")
	 private WebElement deletebutton;     
			 
	 @FindBy(xpath = "(//span[@class='submitTitle buttonTitle'])[1]")
	 private WebElement permanetdeletebutton;
	 
	 public Delete_Customer(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void delete() throws Throwable
	 {
		 Helper.heighlightElement(driver, customerbutton);
		 customerbutton.click();
		 Thread.sleep(2000);
		 Helper.heighlightElement(driver, custmorsettingbutton);
		 custmorsettingbutton.click();
		 Thread.sleep(2000);
		 Helper.heighlightElement(driver, actionbutton);
		 actionbutton.click();
		 Thread.sleep(2000);
		 Helper.heighlightElement(driver, deletebutton);
		 deletebutton.click();
		 Thread.sleep(2000);
		 action.moveToElement(permanetdeletebutton).perform();
		 Helper.heighlightElement(driver, permanetdeletebutton);
		 permanetdeletebutton.click();
	 }
	 
	 
	 
	 
	 
}
