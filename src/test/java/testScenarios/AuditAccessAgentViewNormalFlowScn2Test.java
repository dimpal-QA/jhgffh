package testScenarios;

import org.testng.annotations.Test;

import pageobjects.AuditAccessAgentViewNormalFlowScn1_Page;
import pageobjects.AuditAccessAgentViewNormalFlowScn2_Page;
import util.base;

public class AuditAccessAgentViewNormalFlowScn2Test extends base {
	
	public AuditAccessAgentViewNormalFlowScn2_Page AAA;
	@Test
	public void requestInIT() throws Throwable{
		AuditAccessPortalViewScn2Test AAP=new AuditAccessPortalViewScn2Test();
		AAP.requestCreation();
		AAA=new AuditAccessAgentViewNormalFlowScn2_Page(driver);
		
		System.out.println("Status of main ticket after creation is : " + AAA.Status());
		Thread.sleep(20000);
		driver.navigate().refresh();
		System.out.println("Status of main ticket when approval required : " + AAA.Status());
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
		
		Thread.sleep(20000);
		driver.navigate().refresh();
		System.out.println("Status of main ticket when subtask is created : " + AAA.Status());
		AAA.SubtaskLink().click();
		Thread.sleep(5000);
		System.out.println("Ticket Number of SubTask : " + AAA.SubTaskTicketNo());
		System.out.println("Status of subtask : " + AAA.Status());
		Thread.sleep(5000);
		
		AAA.EditIssue().click();
		AAA.AssignmentGroup("TestAssignmentGroupJira");
		AAA.SubmitButton().click();
		AAA.AssignToMe().click();
		Thread.sleep(5000);
		AAA.InProgress().click();
		Thread.sleep(3000);
		System.out.println("Status of Subtask when clicked on Inprogress button: " + AAA.Status());
		
		Thread.sleep(5000);
		AAA.OnHold().click();
		AAA.SubState("Awaiting User Information");
		AAA.switchToFrameByTagName();
		AAA.Comment().sendKeys("OnHold");
		AAA.switchToDefaultFrame();
		AAA.SubmitForPopup().click();
		Thread.sleep(5000);
		System.out.println("Status of Subtask when clicked on OnHold button: " + AAA.Status());
		
		AAA.CommentButton().click();
		AAA.switchToFrameByTagName();
		AAA.Comment().sendKeys("Comment Added");
		AAA.switchToDefaultFrame();
		AAA.SharedwithCustomer().click();
		
		Thread.sleep(5000);
		AAA.ParentTask().click();
		System.out.println("Status of main ticket: " + AAA.Status());
		AAA.CancelRequestButton().click();
		AAA.switchToFrameByTagName();
		AAA.Comment().sendKeys("OnHold");
		AAA.switchToDefaultFrame();
		AAA.SubmitForPopup().click();
		Thread.sleep(10000);
		System.out.println("Status of main ticket when clicked on CancelRequest button: " + AAA.Status());
		
		
		Thread.sleep(10000);
		AAA.SubtaskLink().click();
		Thread.sleep(10000);
		System.out.println("Status of Subtask after Main ticket is Cancelled: " + AAA.Status());
		
		
		
	}
	}