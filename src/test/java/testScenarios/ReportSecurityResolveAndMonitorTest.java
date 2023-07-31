package testScenarios;


import org.testng.annotations.Test;

import pageobjects.ReportSecurityResolveAndMonitor_Page;
import util.base;

public class ReportSecurityResolveAndMonitorTest extends base {
	public ReportSecurityResolveAndMonitor_Page RSS;
	@Test
	public void resolveAndMonitor_Active_Cancel() throws Throwable {
		ReportSecurityPortalViewTest portal = new ReportSecurityPortalViewTest();
		portal.requestCreation();
		RSS= new ReportSecurityResolveAndMonitor_Page(driver);
		RSS.EditIssue().click();
		RSS.Subcategory("Network/Hardware Issues");
		RSS.AssignmentGroup("TestAssignmentGroupJira");
		RSS.SubmitButton().click();
		
		RSS.AssignToMe().click();
		RSS.WorkFlow().click();
		RSS.ResolveAndMonitor().click();
		RSS.switchToFrameByTagName();
		RSS.Comment().sendKeys("Resolve And Monitor");
		RSS.switchToDefaultFrame();
		RSS.SubmitForPopup().click();
		
		RSS.ActiveButton().click();
		
		RSS.CloseButton().click();
		RSS.VerfiedByCustomer().click();
		RSS.switchToFrameByTagName();
		RSS.Comment().click();
		RSS.Comment().sendKeys("Closed Ticket compeletly");
		RSS.switchToDefaultFrame();
		RSS.SubmitForPopup().click();
	}

}
