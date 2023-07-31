package testScenarios;

import org.testng.annotations.Test;

import pageobjects.InternalDistrubtionListNormalFlowScn2_Page;
import util.base;



public class InternalDistrubtionListNormalFlowScn2Test extends base{
public InternalDistrubtionListNormalFlowScn2_Page IDL;
	
	@Test
	public void requestCreationInIT() throws Throwable{
		InternalDistrubtionListPortalView2Test IDLP=new InternalDistrubtionListPortalView2Test();
		IDLP.requestEdit();
		IDL=new InternalDistrubtionListNormalFlowScn2_Page(driver);
		
		System.out.println("Status of main ticket after creation is : " + IDL.Status());
		Thread.sleep(20000);
		driver.navigate().refresh();
		System.out.println("Status of main ticket when subtask is created : " + IDL.Status());
		IDL.SubtaskLink().click();
		Thread.sleep(5000);
		System.out.println("Ticket Number of SubTask : " + IDL.SubTaskTicketNo());
		System.out.println("Status of Subtask : " + IDL.Status());
		Thread.sleep(5000);
		
		IDL.EditIssue().click();
		IDL.AssignmentGroup("TestAssignmentGroupJira");
		IDL.SubmitButton().click();
		IDL.AssignToMe().click();
		Thread.sleep(5000);
		IDL.InProgress().click();
		Thread.sleep(3000);
		System.out.println("Status of Subtask when clicked on Inprogress button: " + IDL.Status());
		Thread.sleep(5000);
		IDL.OnHold().click();
		IDL.SubState("Awaiting User Information");
		IDL.switchToFrameByTagName();
		IDL.Comment().sendKeys("OnHold");
		IDL.switchToDefaultFrame();
		IDL.SubmitForPopup().click();
		Thread.sleep(5000);
		System.out.println("Status of Subtask when clicked on OnHold button: " + IDL.Status());
		
		IDL.CommentButton().click();
		IDL.switchToFrameByTagName();
		IDL.Comment().sendKeys("Comment Added");
		IDL.switchToDefaultFrame();
		IDL.SharedwithCustomer().click();
		
		Thread.sleep(5000);
		IDL.ParentTask().click();
		System.out.println("Status of main ticket: " + IDL.Status());
		IDL.CancelRequestButton().click();
		IDL.switchToFrameByTagName();
		IDL.Comment().sendKeys("OnHold");
		IDL.switchToDefaultFrame();
		IDL.SubmitForPopup().click();
		Thread.sleep(10000);
		System.out.println("Status of Main ticket when clicked on CancelRequest button: " + IDL.Status());
		
		
		Thread.sleep(10000);
		IDL.SubtaskLink().click();
		Thread.sleep(10000);
		System.out.println("Status of Subtask after Main ticket is Cancelled: " + IDL.Status());
		
	}
}
