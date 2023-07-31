package testScenarios;

import java.util.List;

import org.testng.annotations.Test;

import pageobjects.RequestAccessDataValidation_Page;
import util.base;

public class RequestAccessDataValidationTest extends base{
	public RequestAccessDataValidation_Page RAD;
	
	
	@Test
	public void dataValidation() throws Throwable{
		RequestAccessRolesForNewHireNormalFlowTest RARR=new RequestAccessRolesForNewHireNormalFlowTest();
		List<String> tabledata=RARR.requestInITView();
		//RARR.requestInITView();
		
		RAD=new RequestAccessDataValidation_Page(driver);
		//RAD.Userids().click();
		//RAD.ItView().click();
		Thread.sleep(5000);
		/*RAD.MoreButton().click();
		RAD.InSight().click();
		Thread.sleep(5000);
		RAD.ITILCMDB().click();
		Thread.sleep(5000);*/
		driver.get("https://jiraet-qa.cotiviti.com/secure/ObjectSchema.jspa?id=25");
		RAD.RBAMatrix().click();
		Thread.sleep(10000);
		RAD.Advance().click();
		String roleName="Medical Policy -Testing";
		String departName="Hyderabad - KPO";
		String data1="\"Role Title\" IN (";
		String data2=") AND \"u_department\" IN (";
		RAD.SearchQuery().sendKeys(data1+"\"" +roleName+"\""+data2+"\""+departName+"\")");
		
		RAD.SearchButton().click();
		String tabledata1=tabledata.get(0);
		System.out.println(tabledata1);
		String tabledata2=tabledata.get(1);
		System.out.println(tabledata2);
		
	}

}
