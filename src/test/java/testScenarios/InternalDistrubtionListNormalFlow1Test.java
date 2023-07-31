package testScenarios;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.InternalDistrubtionListNormalFlow1_Page;
import util.base;

public class InternalDistrubtionListNormalFlow1Test extends base{
	
	public InternalDistrubtionListNormalFlow1_Page IDL;
	
	@Test
	public void requestCreationInIT() throws Throwable{
		InternalDistrubtionListPortalViewTest IDLP=new InternalDistrubtionListPortalViewTest();
		IDLP.requestCreation();
		IDL=new InternalDistrubtionListNormalFlow1_Page(driver);
		
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
		Thread.sleep(5000);
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
		
		IDL.CloseButton().click();
		IDL.CloseCode("Solved Permanently");
		IDL.CloseNotes().sendKeys("Closed");		
		IDL.switchToFrameByTagName();
		IDL.Comment().sendKeys("Closed Subtask");
		IDL.switchToDefaultFrame();
		IDL.SubmitForPopup().click();
		Thread.sleep(15000);
		System.out.println("Status of Subtask when clicked on Close button: " + IDL.Status());
		

		Thread.sleep(10000);
		IDL.ParentTask().click();
		Thread.sleep(10000);
		System.out.println("Status of Main ticket after Subtask is closed: " + IDL.Status());
	}

}
