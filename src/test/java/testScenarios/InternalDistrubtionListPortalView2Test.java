package testScenarios;

import org.testng.annotations.Test;

import pageobjects.InternalDistrubtionListPortalView2_Page;
import pageobjects.InternalDistrubtionListPortalView_Page;
import util.base;

public class InternalDistrubtionListPortalView2Test extends base {
	public InternalDistrubtionListPortalView2_Page IDL;
	
	@Test
	public void requestEdit() throws Throwable{
	IDL=new InternalDistrubtionListPortalView2_Page(driver);
	IDL.AccountIDIcon().click();
	IDL.MainFrame();
	Thread.sleep(5000);
	IDL.Category().click();
	IDL.NamesList("Messaging & Collaboration");
	IDL.SubCategory().click();
	IDL.NamesList("Internal Distribution List");
	IDL.PurposeOfTheRequest().click();
	IDL.NamesList("Edit");
	IDL.DistributionListname().sendKeys("Testing");
	IDL.EmailAddress().sendKeys("test@cotiviti.com");
	//IDL.ManagerNameDL().click();
	//IDL.ManagerNameDLList("Kavitha");
	IDL.ManagerName2("Gundala, Kavitha");
	
	IDL.ManagerName2("Vakrala");
	IDL.Justification().sendKeys("Testing");
	driver.switchTo().parentFrame();
	IDL.Createbutton().click();
	IDL.TicketLink2();
	IDL.TicketLink().click();
	multipleWindowHandling();
	}
	
	
}
