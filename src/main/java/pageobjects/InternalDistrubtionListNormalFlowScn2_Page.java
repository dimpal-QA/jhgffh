package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.base;

public class InternalDistrubtionListNormalFlowScn2_Page extends base {
	public WebDriver driver;
	public InternalDistrubtionListNormalFlowScn2_Page(WebDriver driver15){
		this.driver=driver15;		
	}
	By status = By.xpath("//span[@id='status-val']");
	By subTaskTicketNo = By.xpath("//a[@id='key-val']");
	By subtaskLink = By.xpath("(//a[@class='issue-link'])[2]");
	By editIssue = By.id("edit-issue");
	By assignmentGroup = By.id("customfield_11333-field");
	By submit = By.xpath("//input[@id='accxiaedit-issue-submit']");
	By assignToMe = By.id("assign-to-me");
	By inProgress = By.id("action_id_11");
	By onHold = By.id("action_id_61");
	By subState = By.xpath("//select[@id='customfield_12711']");
	By comment = By.id("tinymce");
	By submitForPopup = By.id("accxiaissue-workflow-transition-submit");
	By commentButton = By.id("comment-issue");
	By sharedwithCustomer = By.id("accxiasd-external-submit");
	By parentTask=By.xpath("//a[@id='parent_issue_summary']");
	By cancelRequestButton=By.id("action_id_111");
	
	
	
	
	
	public String Status() {
		WebElement ticketstatus = driver.findElement(status);
		String statuss=ticketstatus.getText();
		return statuss;
		
	}
	public String SubTaskTicketNo(){
		WebElement ticketno=driver.findElement(subTaskTicketNo);
		String subtaskTicket= ticketno.getText();
		return subtaskTicket;	
	}

	public WebElement SubtaskLink() {
		return driver.findElement(subtaskLink);
		}
	public WebElement EditIssue() {
		return driver.findElement(editIssue);
	}

	public void AssignmentGroup(String assignmentgroupName) throws Throwable {
		WebElement ele = driver.findElement(assignmentGroup);
		explicitWaitCondition(ele);
		clearData_ProvideData(assignmentGroup, assignmentgroupName);
	}

	public WebElement SubmitButton() {
		return driver.findElement(submit);
	}

	public WebElement AssignToMe() {
		return driver.findElement(assignToMe);
	}

	public WebElement InProgress() {
		return driver.findElement(inProgress);
	}

	public WebElement OnHold() {
		return driver.findElement(onHold);
	}

	public void SubState(String substateName) {
		dropdownHandle(subState, substateName);
	}

	public WebElement Comment() {
		return driver.findElement(comment);
	}

	public WebElement SubmitForPopup() {
		return driver.findElement(submitForPopup);
	}

	public WebElement CommentButton() {
		return driver.findElement(commentButton);
	}

	public WebElement SharedwithCustomer() {
		return driver.findElement(sharedwithCustomer);
	}
	
	public WebElement ParentTask(){
		return driver.findElement(parentTask);
	}
	public WebElement CancelRequestButton(){
		return driver.findElement(cancelRequestButton);
	}
}
