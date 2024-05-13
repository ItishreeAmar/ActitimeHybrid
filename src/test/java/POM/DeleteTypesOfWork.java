package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Helper;
import Utils.basePage;

public class DeleteTypesOfWork extends basePage
{
	JavascriptExecutor js;
	
	@FindBy(xpath = "(//div[@class='components-Dropdown-trigger--SPOLzjyM'])[13]")
	 private WebElement typesOfWorkOption;
	
	@FindBy(xpath = "(//div[@class='components-ItemListPage-ItemActions-ItemActionTrigger-trigger--EUSDGTKQ components-ItemListPage-ItemActions-ItemActionTrigger-withLabel--ilmcnHVS'])[2]")
	 private WebElement delete;
	
	@FindBy(xpath = "//button[contains(.,'OK, Delete')]")
	 private WebElement OkDelete;
	
	 
	 public DeleteTypesOfWork(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	
	 public void deletetypesofwork() throws Throwable
	 {
		 Thread.sleep(2000);
		 Helper.heighlightElement(driver, typesOfWorkOption);
		 typesOfWorkOption.click();
		 Thread.sleep(2000);
		 Helper.heighlightElement(driver, delete);
		 delete.click();
		 Thread.sleep(2000);
		 Helper.heighlightElement(driver, OkDelete);
		 OkDelete.click();
		 
	 }
	
	
	
}
