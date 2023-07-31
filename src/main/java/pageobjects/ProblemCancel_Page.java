package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.base;

public class ProblemCancel_Page extends base {
public	WebDriver driver;
public ProblemCancel_Page(WebDriver driver10){
	this.driver=driver10;
}
By issues=By.xpath("//ul[@class='aui-nav']/li/a[@id='find_link']");
By ticketNo=By.xpath("(//a[@class='aui-icon-container issue-link'])[1]");
By editIssue=By.id("edit-issue");
By assignmentGroup=By.id("customfield_11333-field");
By submit=By.xpath("//input[@id='accxiaedit-issue-submit']"); 
By assignIssue=By.id("assign-issue");
By assigneeInPopup=By.id("assignee-field");
By assigneeSubmit=By.xpath("//input[@id='accxiaassign-issue-submit']"); 
By assignToMe=By.id("assign-to-me"); 
By commentButton=By.id("comment-issue");
By comment=By.id("tinymce");
By sharedwithCustomer=By.id("accxiasd-external-submit");
By cancelProblem=By.id("action_id_51");
By submitForPopup=By.id("accxiaissue-workflow-transition-submit");









public WebElement Issues(){
	return driver.findElement(issues);
}
public WebElement TicketNo(){
	return driver.findElement(ticketNo);
}

public WebElement EditIssue(){
	return driver.findElement(editIssue);
}
public void AssignmentGroup(String assignmentgroupName) throws Throwable{
	WebElement ele=driver.findElement(assignmentGroup);
	explicitWaitCondition(ele);
	clearData_ProvideData(assignmentGroup,assignmentgroupName);
}
 public WebElement SubmitButton(){		
	return driver.findElement(submit);
}
 public WebElement AssignIssue(){
		return driver.findElement(assignIssue);
	}
 
 public void AssigneeInPopup(String text) throws Throwable{
	 clear_sendData(assigneeInPopup, text);
 }
 public WebElement AssigneeSubmit(){		
		return driver.findElement(assigneeSubmit);
	}
 public WebElement AssignToMe(){
		return driver.findElement(assignToMe);
	}
 public WebElement CommentButton(){
		return driver.findElement(commentButton);
	}
 public WebElement Comment(){
		return driver.findElement(comment);
	}
public WebElement  SharedwithCustomer(){
	return driver.findElement( sharedwithCustomer);
}
public WebElement CancelProblem(){
	return driver.findElement(cancelProblem);
}
public WebElement SubmitForPopup(){
	return driver.findElement(submitForPopup);
}


}
