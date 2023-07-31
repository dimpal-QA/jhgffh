package testScenarios;

import org.testng.annotations.Test;

import pageobjects.ReportSecurity;
import pageobjects.ReportSecurityAwaitingChange_Page;
import util.base;

public class ReportSecurityAwaitingChangeTest extends base {
	public ReportSecurityAwaitingChange_Page RSS;

	@Test

	public void requestInIT() throws Throwable{
		
	ReportSecurityPortalViewTest portal=new ReportSecurityPortalViewTest();
	portal.requestCreation();
	RSS = new ReportSecurityAwaitingChange_Page(driver);
	

	RSS.EditIssue().click();
	/*RSS.ApplicationType("ADFS");
	

	Thread.sleep(10000);
	RSS.BusinessUnit("IT Infrastructure");

	Thread.sleep(10000);
	
	RSS.SubBusinessUnit("Production - Systems");
	
	//Thread.sleep(10000);
	Thread.sleep(20000);*/
	
	RSS.Subcategory("Network/Hardware Issues");
	Thread.sleep(10000);
	RSS.AssignmentGroup("TestAssignmentGroupJira");
	RSS.SubmitButton().click();
	
	RSS.AssignToMe().click();
	
	//Awaiting Change 
	RSS.WorkFlow().click();
	RSS.AwaitingChange().click();
	RSS.switchToFrameByTagName();
	RSS.Comment().sendKeys("Awaiting Change");
	RSS.switchToDefaultFrame();
	RSS.SubmitForPopup().click();
	
	RSS.Resolve().click();
	RSS.ResolveSubcategory("Data Correctness Issue");
	RSS.CloseCode("Repeated");
	RSS.CloseNotes().sendKeys("Resolved");
	RSS.switchToFrameByTagName();
	RSS.Comment().click();
	RSS.Comment().sendKeys("Resolved Ticket");
	RSS.switchToDefaultFrame();
	RSS.SubmitForPopup().click();
	
	RSS.CloseButton().click();
	RSS.VerfiedByCustomer().click();
	RSS.switchToFrameByTagName();
	RSS.Comment().click();
	RSS.Comment().sendKeys("Closed Ticket compeletly");
	RSS.switchToDefaultFrame();
	RSS.SubmitForPopup().click();
	

}
}
