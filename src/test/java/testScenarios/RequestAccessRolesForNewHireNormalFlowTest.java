package testScenarios;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import pageobjects.RequestAccessRolesForNewHireNormalFlow_Page;
import util.base;

public class RequestAccessRolesForNewHireNormalFlowTest extends base {
	public RequestAccessRolesForNewHireNormalFlow_Page RA;
	
	
	@Test
	public List<String> requestInITView() throws Throwable{
		RequestAccessRolesForNewHirePortalViewTest RAR=new RequestAccessRolesForNewHirePortalViewTest();
		RAR.requestCreation();
		RA=new RequestAccessRolesForNewHireNormalFlow_Page(driver);
		System.out.println("Status of main ticket after creation is : " + RA.Status());
		Thread.sleep(20000);
		driver.navigate().refresh();
		System.out.println("Status of main ticket when approval required : " + RA.Status());
		RA.SwitchUserIcon().click();
		Thread.sleep(5000);
		RA.SwitchUser().click();
		Thread.sleep(5000);
		RA.SwitchUserNamebox().click();
		Thread.sleep(5000);
		RA.SwitchUserName2("Gundala");
		RA.RunButton().click();		
		RA.Here().click();
		
		RA.SeviceDeskPortal().click();
		multipleWindowHandling();
		Thread.sleep(5000);
		RA.Userids().click();
		RA.Approvals().click();
		RA.TicketToApprove().click();
		RA.ApproveFromPortal().click();
		Thread.sleep(10000);
		driver.navigate().back();
		RA.navigatingToOther();
		RA.ReturnToYourSession().click();
		
		Thread.sleep(5000);
		RA.Issues().click();
		Thread.sleep(5000);
		RA.TicketNo().click();
		Thread.sleep(10000);
		System.out.println("Status of main ticket when ticket is approved : " + RA.Status());
		
		List<String> data=new ArrayList();
		
		String primaryName=RA.SecondApprovalName1().getText();
		//RA.SecondApprovalName1();
		String secondaryName=RA.SecondApprovalName2().getText();
		//RA.SecondApprovalName2();
		data.add(primaryName);
		data.add(secondaryName);
		return  data;
		
	}

}
