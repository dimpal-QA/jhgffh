package testScenarios;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pageobjects.ProblemNormalFlow_Page;
import util.base;

public class ProblemNormalFlowTest extends base {
	public ProblemNormalFlow_Page PNF;
	
	@Test
	public void requestEdit() throws Throwable{
		ProblemCreationTest PCC=new ProblemCreationTest();
		PCC.requestCreation();
		PNF= new ProblemNormalFlow_Page(driver);
		Thread.sleep(10000);
		PNF.Issues().click();
		Thread.sleep(10000);
		PNF.TicketNo().click();
		Thread.sleep(5000);
		PNF.EditIssue().click();
		PNF.AssignmentGroup("TestAssignmentGroupJira");
		PNF.SubmitButton().click();
		Thread.sleep(5000);
		PNF.AssignToMe().click();
		Thread.sleep(5000);
		PNF.RootCauseIdentified().click();
		Thread.sleep(10000);
		//PNF.Assignee("dimpal");
		//PNF.AssignToMe2().click();
		
		PNF.RootCause().sendKeys("Root Cause");		
		PNF.SubmitforPopup().click();
		Thread.sleep(10000);
		
		driver.navigate().refresh();
		PNF.CorrectiveActionButton().click();
		PNF.CorrectiveAction().sendKeys("Corrective Action");
		PNF.SubmitforPopup().click();
		
		
		Thread.sleep(10000);
		PNF.ResolveProblem().click();
		PNF.SubmitforPopup().click();
		
		Thread.sleep(5000);
		//PNF.CloseProblemButton().click();
		/*PNF.Assignee("shane");
		mouseaction().sendKeys(Keys.TAB).perform();*/
		Thread.sleep(10000);
		PNF.AssigneeClosed2("Knable, Shane");
		PNF.ClosedCode("Solved Permanently");
		PNF.RepeatedProblem("Yes");
		PNF.switchToFrameByTagName();
		PNF.Comment().click();
		PNF.Comment().sendKeys("CLosed Ticket");
		PNF.switchToDefaultFrame();
		PNF.SubmitforPopup().click();
		
	}

}
