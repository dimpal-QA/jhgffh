package testScenarios;

import org.testng.annotations.Test;

import pageobjects.ProblemCancel_Page;
import util.base;

public class ProblemCancelTest extends base {
	public  ProblemCancel_Page PC;
	
	@Test
	public void requestCancel() throws Throwable{
		ProblemCreationTest PCC=new ProblemCreationTest();
		PCC.requestCreation();
		PC=new ProblemCancel_Page(driver);
		Thread.sleep(10000);
		PC.Issues().click();
		Thread.sleep(10000);
		PC.TicketNo().click();
		Thread.sleep(5000);
		PC.EditIssue().click();
		PC.AssignmentGroup("TestAssignmentGroupJira");
		PC.SubmitButton().click();
		
		
		//Assign
		Thread.sleep(15000);
		PC.AssignIssue().click();
		PC.AssigneeInPopup("Vakrala, Soujanya");
		PC.AssigneeSubmit().click();
		
		Thread.sleep(10000);
		PC.AssignToMe().click();
		
		//Comment
		Thread.sleep(10000);
		PC.CommentButton().click();		 
		PC.switchToFrameByTagName();
		PC.Comment().sendKeys("Comment Added");
		PC.switchToDefaultFrame();
		PC.SharedwithCustomer().click();
		
		
		//Cancel
		Thread.sleep(10000);
		PC.CancelProblem().click();
		
		PC.switchToFrameByTagName();
		Thread.sleep(5000);
		PC.Comment().sendKeys("Cancel Problem");
		PC.switchToDefaultFrame();
		PC.SubmitForPopup().click();
	}

}
