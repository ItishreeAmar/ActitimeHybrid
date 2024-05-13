package Utils;

import org.openqa.selenium.WebElement;

public class basePage extends base
{
	//methods of webdriver
	public void title()
	{
		driver.getTitle();
	}
	public void url()
	{
		driver.getCurrentUrl();
	}
	
	//method of actions class
	public void click(WebElement element)
	{
		action.click(element).perform();
	}
	public void doubleclick(WebElement element)
	{
		action.doubleClick(element).perform();
	}
	public void clickContains_RightClick(WebElement element)
	{
		action.contextClick(element).perform();
	}
	public void drag_drop(WebElement element ,WebElement element1)
	{
		action.dragAndDrop(element ,element1 ).perform();
	}
	public void MouseHover_MoveToElement(WebElement element)
	{
		action.moveToElement(element).perform();
	}
	public void click_hold(WebElement element) throws Throwable
	{
		action.clickAndHold(element).perform();
		Thread.sleep(2000);
		action.release().perform();
	}
	public void scroolToelement(WebElement element)
	{
		action.scrollToElement(element).perform();
		
	}
	
	
	
	
}
