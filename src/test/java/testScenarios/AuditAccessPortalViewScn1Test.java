package testScenarios;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pageobjects.AuditAccessPortalViewScn1_Page;
import util.base;

public class AuditAccessPortalViewScn1Test extends base{
	public AuditAccessPortalViewScn1_Page AAP;
@Test
public void requestCreation() throws Throwable{
	AAP=new AuditAccessPortalViewScn1_Page(driver);
	AAP.AccountIDIcon().click();
	AAP.MainFrame();
	Thread.sleep(5000);
	AAP.Category().click();
	AAP.NamesList("Production Applications");
	AAP.SubCategory().click();
	AAP.NamesList("Audit Access");
	AAP.ActivityAction().click();
	AAP.NamesList("Add");
	AAP.AccessLevel().click();
	AAP.NamesList("Principal");
	AAP.EmployeeName().click();
	Thread.sleep(5000);
	AAP.EmployeeName2("Gundala");	
	Thread.sleep(5000);
	AAP.EmployeeName2("Chava Vishnu");
	AAP.AuditType().click();
	AAP.NamesList("Normal");
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
