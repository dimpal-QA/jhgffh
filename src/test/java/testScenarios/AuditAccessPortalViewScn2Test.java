package testScenarios;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pageobjects.AuditAccessPortalViewScn1_Page;
import pageobjects.AuditAccessPortalViewScn2_Page;
import util.base;

public class AuditAccessPortalViewScn2Test extends base{
	public AuditAccessPortalViewScn2_Page AAP;
@Test
public void requestCreation() throws Throwable{
	AAP=new AuditAccessPortalViewScn2_Page(driver);
	AAP.AccountIDIcon().click();
	AAP.MainFrame();
	Thread.sleep(5000);
	AAP.Category().click();
	AAP.NamesList("Production Applications");
	AAP.SubCategory().click();
	AAP.NamesList("Audit Access");
	Thread.sleep(5000);
	AAP.ActivityAction().click();
	AAP.NamesList("Add");
	AAP.AccessLevel().click();
	AAP.NamesList("Operations Manager");
	AAP.EmployeeName().click();
	Thread.sleep(5000);
	AAP.EmployeeName2("Gundala");	
	Thread.sleep(5000);
	AAP.EmployeeName2("Chava Vishnu");
	AAP.AuditType().click();
	AAP.NamesList("CCV");
	AAP.MultipleAuditNumbers().sendKeys("Testing");
	AAP.AuditNumber().click();
	AAP.AuditNumbersList("2084");
	Thread.sleep(5000);
	AAP.AuditNumbersList("2965");
	AAP.Justification().sendKeys("Testing");
	driver.switchTo().parentFrame();
	AAP.Createbutton().click();
	AAP.TicketLink2();
	AAP.TicketLink().click();
	multipleWindowHandling();
	
}
}
