package testScenarios;

import org.testng.annotations.Test;

import pageobjects.InternalDistrubtionListPortalView2_Page;
import pageobjects.RequestAccessRolesForNewHirePortalView_Page;
import util.base;

public class RequestAccessRolesForNewHirePortalViewTest extends base {
	public RequestAccessRolesForNewHirePortalView_Page RA;
	
	@Test
	public void requestCreation() throws Throwable{
		RA=new RequestAccessRolesForNewHirePortalView_Page(driver);
		RA.AccountIDIcon().click();
		RA.MainFrame();
		Thread.sleep(5000);
		RA.Category().click();
		RA.NamesList("RBA");
		RA.SubCategory().click();
		RA.NamesList("Request Access Roles for New Hire");
		RA.SelectDepartment().click();
		Thread.sleep(5000);
		RA.Departnames("Aetna RCA");
		RA.SelectRoles().click();
		Thread.sleep(5000);
		RA.Rolenames("Auditor");
		Thread.sleep(5000);
		RA.StartDate().sendKeys("4/Feb/2022");
		RA.Justification().sendKeys("Testing");
		driver.switchTo().parentFrame();
		RA.Createbutton().click();
		RA.TicketLink2();
		RA.TicketLink().click();
		multipleWindowHandling();
		
		
	}

}
