package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.base;

public class ReportSecurity extends base{
	public WebDriver driver;

	public ReportSecurity(WebDriver driver1) {
		this.driver = driver1;
	}

	By reportSecurityIcon = By.xpath("//div[@data-url='/servicedesk/customer/portal/7/create/109']");
	By mainframe = By.xpath("//iframe[@id='rw_iframe']");
	By issue = By.xpath("//input[@id='summary']");
	By description = By.xpath("//textarea[@id='description']");
	
	
By notified=By.xpath("//div[@id='s2id_customfield_11390']");
By notifiedNames=By.xpath("//div[@class='select2-search']//following::ul//li");
	
	
	By PHI_PI=By.xpath("//div[@class='field-container']//div[@id='s2id_customfield_11391']");
	By PHI_PI_value=By.xpath("//div[@class='select2-search']//following::ul//li");
	By clients_Impacted=By.xpath("//fieldset[@class='field-group group']//div[@class='radio']//following::label");
	By create=By.xpath("//div[@class='rw_item_footer']//following::span[text()='Create']");
	By ticketLink=By.xpath("//a[@class='rw_request_key rw_request_key_link']");
	By editIssue=By.id("edit-issue");
	By applicationType=By.id("customfield_11325-field");
	
	
	By businessUnit=By.id("customfield_11328-field");
	By subBusinessUnit=By.id("customfield_11329-field");
	
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
	

	public WebElement ReportSecurityss() {
		return driver.findElement(reportSecurityIcon);
	}

	public void MainFrame() {
		
		//return driver.findElement(mainframe);
		WebElement ele=driver.findElement(mainframe);
		switchtoFrame(ele);
	}

	public WebElement issue() {
		return driver.findElement(issue);
	}
	
	
	
/*
	public WebElement Notified() {
		return driver.findElement(notified);
		
		
	}
*/	
	/*public void NotifiedName(String name){
		try{
		sendkeysByJC(notified,name);
		}catch(Exception b)
		{
	b.getMessage();
	b.getStackTrace();
		}
		System.out.println("a");
	}
	
	*/
	public void who_else_notified(String text) throws Throwable
	{
		mouseaction().sendKeys(Keys.TAB).perform();
		mouseaction().sendKeys(text).build().perform();
		Thread.sleep(1000);
		mouseaction().sendKeys(Keys.ENTER).perform();
		
	}
	
	
	public WebElement description() {
		return driver.findElement(description);
	}
	
	public WebElement PHI_PI_involved(){
		return driver.findElement(PHI_PI);		
	}
	
	public void PHI_PI_valueSelection(String droptext){
		suggestionHandler(PHI_PI_value,droptext);		
			
	}
	
	public void Clients_impactedButton(String radioText){
		suggestionHandler(clients_Impacted,radioText);
	}
	
	public WebElement Createbutton(){
		return driver.findElement(create);
	}
	
	public WebElement TicketLink(){
		WebElement ele=driver.findElement(ticketLink);
		explicitWaitCondition(ele);
		return ele;
		
	}
	
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
	
	
	
	public void BusinessUnit(String businessUnitName) throws Throwable{
		clearData_ProvideData(businessUnit, businessUnitName);
	}
	
	public void SubBusinessUnit(String SubbusinessUnitName) throws Throwable{
		clearData_ProvideData(subBusinessUnit, SubbusinessUnitName);
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
		/*WebElement ele=driver.findElement(submit);
		explicitWaitCondition(ele);
		return ele;*/
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
