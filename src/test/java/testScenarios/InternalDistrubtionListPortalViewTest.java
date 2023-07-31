package testScenarios;

import org.testng.annotations.Test;

import pageobjects.InternalDistrubtionListPortalView_Page;
import util.base;

public class InternalDistrubtionListPortalViewTest extends base {
	public InternalDistrubtionListPortalView_Page IDL;
	
	@Test
	public void requestCreation() throws Throwable{
	IDL=new InternalDistrubtionListPortalView_Page(driver);
	IDL.AccountIDIcon().click();
	IDL.MainFrame();
	Thread.sleep(5000);
	IDL.Category().click();
	IDL.NamesList("Messaging & Collaboration");
	IDL.SubCategory().click();
	IDL.NamesList("Internal Distribution List");
	IDL.PurposeOfTheRequest().click();
	IDL.NamesList("Creation");
	IDL.DistributionListname().sendKeys("Testing");
	//IDL.ManagerNameDL().click();
	//IDL.ManagerNameDLList("Kavitha");
	IDL.ManagerName2("Kavitha");
	IDL.EmailAddress().sendKeys("test@cotiviti.com");
	IDL.ManagerName2("Vakrala");
	IDL.Justification().sendKeys("Testing");
	driver.switchTo().parentFrame();
	IDL.Createbutton().click();
	IDL.TicketLink2();
	IDL.TicketLink().click();
	multipleWindowHandling();
	
	}
	
	
	
}
