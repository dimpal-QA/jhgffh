package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.base;

public class AuditAccessAgentViewNormalFlowScn2_Page extends base {
	public WebDriver driver;

	public AuditAccessAgentViewNormalFlowScn2_Page(WebDriver driver15) {
		this.driver = driver15;
	}
	By status = By.xpath("//span[@id='status-val']");
	By switchUserIcon=By.xpath("//div[@class='aui-header-before']");
	By switchUser=By.xpath("//div[@class='aui-dropdown2-section']//ul/li[4]");
	By  switchUserNamebox=By.xpath("//div[@class='sr-rs css-1bxnjg2-container']");
	By switchUserName2=By.xpath("//div[@class='sr-rs__input']//input");
	By runButton=By.xpath("//div[@class='aui-buttons']//button[@class='aui-button aui-button-primary']");
	By here=By.xpath("//a[text()='here']");
	By seviceDeskPortal= By.xpath("//a[text()='ServiceDesk Portal']");
	By userids=By.xpath("//span[@class='rw_item_count rw_color_red']");
	By approvals=By.xpath("//span[text()='Approvals']");
	By ticketToApprove=By.xpath("//div[@class='rw_item_list rw_table']//div[@class='rw_table_cell rw_item_key rw_mobile_exclude']//span[1]");
    By approveFromPortal=By.xpath("//button[text()='Approve']"); 
    String otherUrl="https://jiraet-qa.cotiviti.com/secure/Dashboard.jspa";
    By returnToYourSession=By.xpath("//a[text()='Return to your session as ']"); 
    By issues=By.xpath("//ul[@class='aui-nav']/li/a[@id='find_link']");
	By ticketNo=By.xpath("(//a[@class='aui-icon-container issue-link'])[1]");
	By subtaskLink = By.xpath("(//a[@class='issue-link'])[2]");
	By subTaskTicketNo = By.xpath("//a[@id='key-val']");
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
	public WebElement SwitchUserIcon(){
		return driver.findElement(switchUserIcon);
	}
	public WebElement SwitchUser(){
		return driver.findElement(switchUser);
	}
	public WebElement SwitchUserNamebox(){
		return driver.findElement(switchUserNamebox);
	}
	public void SwitchUserName2(String text) throws Throwable{
		multipleSuggestionsAdding(switchUserName2, text);
	}
	public WebElement RunButton(){
		return driver.findElement(runButton);
	}
	public WebElement Here(){
		return driver.findElement(here);
	}
	public WebElement SeviceDeskPortal() {
		return driver.findElement(seviceDeskPortal);
	}

	public WebElement Userids(){
		return driver.findElement(userids);
	}
	public WebElement Approvals(){
		return driver.findElement(approvals);
	}
	public WebElement TicketToApprove(){
		return driver.findElement(ticketToApprove);
	}
	public WebElement ApproveFromPortal(){
		return driver.findElement(approveFromPortal);
	}
	public void navigatingToOther(){
		driver.navigate().to(otherUrl);
	}
	public WebElement ReturnToYourSession(){
		return driver.findElement(returnToYourSession);
	}
	public WebElement Issues(){
		return driver.findElement(issues);
	}
	public WebElement TicketNo(){
		return driver.findElement(ticketNo);
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