package testScenarios;

import org.testng.annotations.Test;

import pageobjects.ReportSecurityCancelTicket_Page;

import util.base;

public class ReportSecurityCancelTicketTest extends base {
	public ReportSecurityCancelTicket_Page RSS;

	@Test
	public void awaitingThirdParty_Active_Cancel() throws Throwable {

		ReportSecurityPortalViewTest portal = new ReportSecurityPortalViewTest();
		portal.requestCreation();
		RSS = new ReportSecurityCancelTicket_Page(driver);
		RSS.EditIssue().click();
		RSS.Subcategory("Network/Hardware Issues");
		RSS.AssignmentGroup("TestAssignmentGroupJira");
		RSS.SubmitButton().click();
		
		RSS.AssignToMe().click();
		RSS.WorkFlow().click();
		RSS.AwaitingThirdParty().click();
		RSS.switchToFrameByTagName();
		RSS.Comment().sendKeys("Awaiting Third Party");
		RSS.switchToDefaultFrame();
		//RSS.SubmitForPopup().click();
		
		RSS.ActiveButton().click();
		
		RSS.CancelIncident().click();
		RSS.switchToFrameByTagName();
		RSS.Comment().sendKeys("Cancel Incident");
		RSS.switchToDefaultFrame();
		//RSS.SubmitForPopup().click();
	}

}
