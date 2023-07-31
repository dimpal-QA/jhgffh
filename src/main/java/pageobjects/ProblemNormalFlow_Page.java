package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.base;

public class ProblemNormalFlow_Page extends base {
	public WebDriver driver;
	public ProblemNormalFlow_Page(WebDriver driver9) {
		this.driver = driver9;
	}
	By issues=By.xpath("//ul[@class='aui-nav']/li/a[@id='find_link']");
		By ticketNo=By.xpath("(//a[@class='aui-icon-container issue-link'])[1]");
		By editIssue=By.id("edit-issue");
	By assignmentGroup=By.id("customfield_11333-field");
	By submit=By.xpath("//input[@id='accxiaedit-issue-submit']"); 
	By assignToMe=By.id("assign-to-me"); 
	By rootCauseIdentified=By.xpath("//a[@id='action_id_11']");
	By assignee=By.id("assignee-field");
	//By assignToMe2=By.id("assign-to-me-trigger");
	By rootCause=By.id("customfield_11664");
	By correctiveActionButton=By.id("action_id_21");
	By correctiveAction=By.id("customfield_11663");
	By resolveProblem=By.id("action_id_31");
	By submitforPopup=By.id("accxiaissue-workflow-transition-submit");
	By closeProblemButton=By.id("action_id_41");
	By assigneeClosed=By.id("assignee-single-select");
	By problemGroupAssignee=By.id("assignee-field");
	By closedCode=By.id("customfield_11648");
	By repeatedProblem=By.id("customfield_11665");
	By comment=By.id("tinymce");
	
	
	
	
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
     public WebElement AssignToMe(){
 		return driver.findElement(assignToMe);
 	}
     
     public WebElement RootCauseIdentified(){
  		return driver.findElement(rootCauseIdentified);
  	}
     public void Assignee(String AssigneeName) throws Throwable{
 		WebElement ele=driver.findElement(assignee);
 		explicitWaitCondition(ele);
 		clearData_ProvideData(assignee,AssigneeName);
 	}
     public WebElement RootCause(){
    		return driver.findElement(rootCause);
     }
   /*  public WebElement AssignToMe2(){
   		return driver.findElement(assignToMe2);
   	}*/
     public WebElement CorrectiveActionButton(){
    		return driver.findElement(correctiveActionButton);
    	}
     
     public WebElement CorrectiveAction(){
 		return driver.findElement(correctiveAction);
 	}
     public WebElement ResolveProblem(){
  		return driver.findElement(resolveProblem);
  	}
     public WebElement SubmitforPopup(){
   		return driver.findElement(submitforPopup);
   	}
     public WebElement CloseProblemButton(){
    		return driver.findElement(closeProblemButton);
    	}
     public void AssigneeClosed(String AssigneeName) throws Throwable{
  		WebElement ele=driver.findElement(assigneeClosed);
  		explicitWaitCondition(ele);
  		clearData_ProvideData(assigneeClosed,AssigneeName);
  	}
     
     public void AssigneeClosed2(String text) throws Throwable{
    	 clear_sendData(problemGroupAssignee, text);
     }
     public void ClosedCode(String closedCodeData){
 		dropdownHandle(closedCode, closedCodeData);
 	}
     public void RepeatedProblem(String repeatedProblemData){
  		dropdownHandle(repeatedProblem, repeatedProblemData);
  	}
     public WebElement Comment(){
 		return driver.findElement(comment);
 	}
     
     
     
}
