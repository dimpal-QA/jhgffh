package testScenarios;

import org.testng.annotations.Test;

import pageobjects.ReportSecurityComment_Page;
import pageobjects.ReportSecurityReopen_Page;
import util.base;

public class ReportSecurityCommentTest extends base  {
public ReportSecurityComment_Page RSS;
	
	@Test
	public void commentAdded() throws Throwable{
		ReportSecurityPortalViewTest portal=new ReportSecurityPortalViewTest();
		portal.requestCreation();
		RSS = new ReportSecurityComment_Page(driver);
		RSS.EditIssue().click();
		RSS.Subcategory("Network/Hardware Issues");
		RSS.AssignmentGroup("TestAssignmentGroupJira");
		RSS.SubmitButton().click();
		
		
		RSS.AssignToMe().click();
         RSS.CommentButton().click();
         RSS.switchToFrameByTagName();
 		RSS.Comment().sendKeys("Comment Added");
 		RSS.switchToDefaultFrame();
 		RSS.SharedwithCustomer().click();
 		
 		RSS.CloseButton().click();
		RSS.VerfiedByCustomer().click();
		RSS.switchToFrameByTagName();
		RSS.Comment().click();
		RSS.Comment().sendKeys("Closed Ticket compeletly");
		RSS.switchToDefaultFrame();
		RSS.SubmitForPopup().click();
 		
}
}
