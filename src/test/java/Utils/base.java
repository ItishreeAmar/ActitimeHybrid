package Utils;

import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import POM.AddnewCustomerTask;
import POM.Creat_New_Leave_Type;
import POM.CreateNewCustomer;
import POM.DeleteTypesOfWork;
import POM.Delete_Customer;
import POM.Delete_leaveType_Option;
import POM.NewTypesOfWork;
import POM.SettingOptions;
import POM._1_ActiTimeLogin;
import POM._2_ActiTimeHomePage;

public class base implements Autoconstant
{
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static _1_ActiTimeLogin login;
	public static _2_ActiTimeHomePage home;
	public static AddnewCustomerTask Addcustmr;
	public static CreateNewCustomer creatcustmr;
	public static SettingOptions optn ;
	public static NewTypesOfWork ntw;
	public static Creat_New_Leave_Type leavetype ;
	public static Delete_Customer dlt;
	public static Delete_leaveType_Option delt;
	public static DeleteTypesOfWork Delettypofwk;
	public static Actions action;
	public static Robot r;
	
	
	
	
	public static  void obj() throws Throwable 
	{
	  
	   login = new _1_ActiTimeLogin(driver);
	   home  = new _2_ActiTimeHomePage(driver);
		Addcustmr = new AddnewCustomerTask(driver);
		creatcustmr = new CreateNewCustomer(driver);
		optn  = new SettingOptions(driver);
		ntw  = new NewTypesOfWork(driver);
		leavetype = new Creat_New_Leave_Type(driver);
		dlt  = new Delete_Customer(driver);
		delt  = new Delete_leaveType_Option(driver);
		Delettypofwk = new DeleteTypesOfWork(driver);
		js = (JavascriptExecutor) driver;
		action = new Actions(driver);
		r = new Robot();
		
		
		
		
	
	}

}
