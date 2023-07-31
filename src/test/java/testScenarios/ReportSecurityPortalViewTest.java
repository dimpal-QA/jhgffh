package testScenarios;

import org.testng.annotations.Test;

import pageobjects.ReportSecurity;
import pageobjects.ReportSecurityPortalView_Page;
import util.base;

public class ReportSecurityPortalViewTest extends base {
public ReportSecurityPortalView_Page RS;	
	
	
	@Test
	public   void requestCreation() throws Throwable {

		RS = new ReportSecurityPortalView_Page(driver);
		RS.ReportSecurityss().click();
		RS.MainFrame();
		RS.issue().sendKeys("Issue");
		RS.description().sendKeys("Description");
		Thread.sleep(3000);
		RS.who_else_notified("Gundala");
		
		RS.PHI_PI_involved().click();
		RS.PHI_PI_valueSelection("No");
		RS.Clients_impactedButton("Individual Team affected");
		driver.switchTo().parentFrame();
		RS.Createbutton().click();
		RS.TicketLink().click();
		multipleWindowHandling();
}
}