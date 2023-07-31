package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.base;

public class ReportSecurityAwaitingChange_Page extends base{
	public WebDriver driver;

	public ReportSecurityAwaitingChange_Page(WebDriver driver2) {
		this.driver = driver2;
	}
	By editIssue=By.id("edit-issue");
	By applicationType=By.id("customfield_11325-field");
	

	//By businessUnit=By.id("customfield_11328-field");
	//By subBusinessUnit=By.id("customfield_11329-field");
	
	
	By subcategory=By.id("customfield_11666:1");
	By assignmentGroup=By.id("customfield_11333-field");
	By submit=By.xpath("//input[@id='accxiaedit-issue-submit']"); 
	By assignToMe=By.id("assign-to-me"); 
	By workflow=By.id("opsbar-transitions_more");
	By awaitingChange=By.id("action_id_111");
	By comment=By.id("tinymce");
	By submitForPopup=By.id("accxiaissue-workflow-transition-submit"); 
	By resolve=By.id("action_id_261");
	By resolveSubcategory=By.id("customfield_11666:1");
	By closeCode=By.id("customfield_11648");
	By closeNotes=By.id("customfield_11321");
	By closeButton=By.id("action_id_281");
	By verfiedByCustomer=By.xpath("//label[@for='customfield_11660-1']");
	
	
	/*public  WebDriver EditIssue2(){
	WebElement elee=driver.findElement(editIssue);
		elementToClick(elee);
		elee.click();
		return driver;
		
	}*/
	public WebElement EditIssue(){
		return driver.findElement(editIssue);
	}
	
	

	public void ApplicationType(String applicationName) throws Throwable{
		clearData_ProvideData(applicationType,applicationName );
			}
	
	
	
	
	
	/*public void BusinessUnit(String businessUnitName) throws Throwable{
		clearData_ProvideData(businessUnit, businessUnitName);
	}
	
	public void SubBusinessUnit(String SubbusinessUnitName) throws Throwable{
		clearData_ProvideData(subBusinessUnit, SubbusinessUnitName);
	}*/
	
	
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
	public WebElement AwaitingChange(){
		return driver.findElement(awaitingChange);
	}
	public WebElement Comment(){
		return driver.findElement(comment);
	}
	public WebElement SubmitForPopup(){
		return driver.findElement(submitForPopup);
	}
	public WebElement Resolve(){
		return driver.findElement(resolve);
	}
	public void ResolveSubcategory(String resolveSubcategoryData){
		dropdownHandle(resolveSubcategory, resolveSubcategoryData);
	}
	
	public void CloseCode(String closeCodeData){
		dropdownHandle(closeCode, closeCodeData);
	}
	public WebElement CloseNotes(){
		return driver.findElement(closeNotes);
	}
	public WebElement CloseButton(){
		return driver.findElement(closeButton);
	}
	public WebElement VerfiedByCustomer(){
		return driver.findElement(verfiedByCustomer);
	}
	

}
