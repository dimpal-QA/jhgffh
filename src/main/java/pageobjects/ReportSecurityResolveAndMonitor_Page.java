package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.base;

public class ReportSecurityResolveAndMonitor_Page extends base{
	public WebDriver driver;
	public ReportSecurityResolveAndMonitor_Page(WebDriver driver6) {
		this.driver = driver6;
	}
	By editIssue=By.id("edit-issue");
	By applicationType=By.id("customfield_11325-field");
	By subcategory=By.id("customfield_11666:1");
	By assignmentGroup=By.id("customfield_11333-field");
	By submit=By.xpath("//input[@id='accxiaedit-issue-submit']"); 
	By assignToMe=By.id("assign-to-me"); 
	By workflow=By.id("opsbar-transitions_more");
	By resolveAndMonitor=By.id("action_id_171");
	By activeButton=By.id("action_id_441");
	By comment=By.id("tinymce");
	By submitForPopup=By.id("accxiaissue-workflow-transition-submit"); 
	By closeButton=By.id("action_id_281");
	By verfiedByCustomer=By.xpath("//label[@for='customfield_11660-1']");
	
	public WebElement EditIssue(){
		return driver.findElement(editIssue);
	}	
	

	public void ApplicationType(String applicationName) throws Throwable{
		clearData_ProvideData(applicationType,applicationName );
			}
	
	public void Subcategory(String subcategoryName){
		dropdownHandle(subcategory, subcategoryName);
		
	}
	public void AssignmentGroup(String assignmentgroupName) throws Throwable{
		WebElement ele=driver.findElement(assignmentGroup);
		explicitWaitCondition(ele);
		clearData_ProvideData(assignmentGroup,assignmentgroupName);
	}
	
public WebElement SubmitButton(){		
		return driver.findElement(submit);
	}
public WebElement AssignToMe(){
	return driver.findElement(assignToMe);
}

public WebElement WorkFlow(){
	return driver.findElement(workflow);
}
public WebElement ResolveAndMonitor(){
	return driver.findElement(resolveAndMonitor);
}

public WebElement ActiveButton(){
	return driver.findElement(activeButton);
}
public WebElement Comment(){
	return driver.findElement(comment);
}
public WebElement SubmitForPopup(){
	return driver.findElement(submitForPopup);
}
public WebElement CloseButton(){
	return driver.findElement(closeButton);
}
public WebElement VerfiedByCustomer(){
	return driver.findElement(verfiedByCustomer);
}


}
