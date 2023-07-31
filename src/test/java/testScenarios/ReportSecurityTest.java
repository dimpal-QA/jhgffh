package testScenarios;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.ReportSecurity;
import util.base;

public class ReportSecurityTest extends base {
	
	// Login_PageTest loginTest;
	/*public ReportSecurityTest() {
		super();
	}*/

	/*
	 * //@BeforeTest public void LaunchDrivers() throws IOException { //
	 * initializeDriver(); // loginTest=new Login_PageTest(); }
	 */
	public ReportSecurity RS;
	
	
	
	
	
	@Test
	public void requestCreation() throws Throwable {
				

		RS = new ReportSecurity(driver);
		RS.ReportSecurityss().click();
		RS.MainFrame();
		RS.issue().sendKeys("Issue");
		RS.description().sendKeys("Description");
		Thread.sleep(3000);
		/*RS.Notified().click();
		System.out.println("clicked");
		Thread.sleep(3000);
		
		RS.NotifiedName("Gundala");
		System.out.println("data entered");
		RS.Notified().sendKeys("Gundala");
		RS.enteredDataSelection(text, value);
		RS.notified().sendKeys("Gundala");
		RS.NotifiedName("Gundala, Kavitha");
		*/
		RS.who_else_notified("Gundala");
		
		RS.PHI_PI_involved().click();
		RS.PHI_PI_valueSelection("No");
		RS.Clients_impactedButton("Individual Team affected");
		driver.switchTo().parentFrame();
		RS.Createbutton().click();
		RS.TicketLink().click();
		multipleWindowHandling();
		
		
		RS.EditIssue().click();		
		
		
		RS.Subcategory("Network/Hardware Issues");		
		RS.AssignmentGroup("TestAssignmentGroupJira");		
		RS.SubmitButton().click();
		
		RS.AssignToMe().click();
		RS.WorkFlow().click();
		RS.AwaitingChange().click();
		RS.switchToFrameByTagName();
		RS.Comment().sendKeys("Awaiting Change");
		RS.switchToDefaultFrame();
		RS.SubmitForPopup().click();
		
		RS.Resolve().click();
		RS.ResolveSubcategory("Data Correctness Issue");
		RS.CloseCode("Repeated");
		RS.CloseNotes().sendKeys("Resolved");
		RS.switchToFrameByTagName();
		RS.Comment().click();
		RS.Comment().sendKeys("Resolved Ticket");
		RS.switchToDefaultFrame();
		RS.SubmitForPopup().click();
		
		RS.CloseButton().click();
		RS.VerfiedByCustomer().click();
		RS.switchToFrameByTagName();
		RS.Comment().click();
		RS.Comment().sendKeys("Closed Ticket compeletly");
		RS.switchToDefaultFrame();
		RS.SubmitForPopup().click();
		
		

	}

	
}
