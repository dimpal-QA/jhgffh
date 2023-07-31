package testScenarios;

import org.testng.annotations.Test;

import pageobjects.AuditAccessAgentViewNormalFlowScn1_Page;
import util.base;

public class AuditAccessAgentViewNormalFlowScn1Test extends base {
	
	public AuditAccessAgentViewNormalFlowScn1_Page AAA;
	@Test
	public void requestInIT() throws Throwable{
		AuditAccessPortalViewScn1Test AAP=new AuditAccessPortalViewScn1Test();
		AAP.requestCreation();
		AAA=new AuditAccessAgentViewNormalFlowScn1_Page(driver);
		
		System.out.println("Status of main ticket after creation is : " + AAA.Status());
		Thread.sleep(20000);
		driver.navigate().refresh();
		System.out.println("Status of main ticket when subtask is created : " + AAA.Status());
		AAA.SubtaskLink().click();
		Thread.sleep(5000);
		System.out.println("Ticket Number of First SubTask : " + AAA.SubTaskTicketNo());
		System.out.println("Status of First Subtask : " + AAA.Status());
		Thread.sleep(5000);
		AAA.EditIssue().click();
		AAA.AssignmentGroup("TestAssignmentGroupJira");
		AAA.SubmitButton().click();
		AAA.AssignToMe().click();
		Thread.sleep(5000);
		AAA.InProgress().click();
		Thread.sleep(3000);
		System.out.println("Status of First subtask when clicked on Inprogress button: " + AAA.Status());
		Thread.sleep(5000);
		AAA.OnHold().click();
		AAA.SubState("Awaiting User Information");
		AAA.switchToFrameByTagName();
		AAA.Comment().sendKeys("OnHold");
		AAA.switchToDefaultFrame();
		AAA.SubmitForPopup().click();
		Thread.sleep(5000);
		System.out.println("Status of First subtask when clicked on OnHold button: " + AAA.Status());
		
		AAA.CommentButton().click();
		AAA.switchToFrameByTagName();
		AAA.Comment().sendKeys("Comment Added");
		AAA.switchToDefaultFrame();
		AAA.SharedwithCustomer().click();
		
		AAA.CloseButton().click();
		AAA.CloseCode("Transferred");
		AAA.CloseNotes().sendKeys("Closed");
		AAA.AccAndIdApprover("Gundala");
		AAA.switchToFrameByTagName();
		AAA.Comment().sendKeys("Closed Subtask");
		AAA.switchToDefaultFrame();
		AAA.SubmitForPopup().click();
		Thread.sleep(10000);
		System.out.println("Status of First subtask when clicked on Close button: " + AAA.Status());
		
		Thread.sleep(10000);
		AAA.ParentTask().click();
		Thread.sleep(10000);
		System.out.println("Status of main ticket after First subtask is closed: " + AAA.Status());
		
		AAA.SwitchUserIcon().click();
		Thread.sleep(5000);
		AAA.SwitchUser().click();
		Thread.sleep(5000);
		AAA.SwitchUserNamebox().click();
		Thread.sleep(5000);
		AAA.SwitchUserName2("Gundala");
		AAA.RunButton().click();		
		AAA.Here().click();
		
		AAA.SeviceDeskPortal().click();
		multipleWindowHandling();
		Thread.sleep(5000);
		AAA.Userids().click();
		AAA.Approvals().click();
		AAA.TicketToApprove().click();
		AAA.ApproveFromPortal().click();
		Thread.sleep(10000);
		driver.navigate().back();
		AAA.navigatingToOther();
		AAA.ReturnToYourSession().click();
		
		Thread.sleep(5000);
		AAA.Issues().click();
		Thread.sleep(5000);
		AAA.TicketNo().click();
		Thread.sleep(10000);
		System.out.println("Status of main ticket when ticket is approved : " + AAA.Status());
		
		AAA.SecondSubtaskLink().click();
		Thread.sleep(5000);
		System.out.println("Ticket Number of Second SubTask : " + AAA.SubTaskTicketNo());
		System.out.println("Status of Second subtask : " + AAA.Status());
		Thread.sleep(5000);
		AAA.EditIssue().click();
		AAA.AssignmentGroup("TestAssignmentGroupJira");
		AAA.SubmitButton().click();
		AAA.AssignToMe().click();
		Thread.sleep(5000);
		AAA.InProgress().click();
		Thread.sleep(3000);
		System.out.println("Status of Second subtask when clicked on Inprogress button: " + AAA.Status());
		Thread.sleep(5000);
		AAA.CloseButton().click();
		AAA.CloseCode("Solved Permanently");
		AAA.CloseNotes().sendKeys("Closed");
		AAA.switchToFrameByTagName();
		AAA.Comment().sendKeys("Closed Second Subtask");
		AAA.switchToDefaultFrame();
		AAA.SubmitForPopup().click();
		Thread.sleep(10000);
		System.out.println("Status of Second subtask when clicked on Close button: " + AAA.Status());
		
		
		Thread.sleep(10000);
		AAA.ParentTask().click();
		Thread.sleep(10000);
		System.out.println("Status of main ticket after Second subtask is closed: " + AAA.Status());
	}
	}