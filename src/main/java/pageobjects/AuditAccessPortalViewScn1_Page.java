package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.base;

public class AuditAccessPortalViewScn1_Page extends base {
	public WebDriver driver;
	public AuditAccessPortalViewScn1_Page(WebDriver driver12){
		this.driver=driver12;		
	}
	
	By accountIDIcon = By.xpath("//div[@data-url='/servicedesk/customer/portal/7/create/179']");
	By mainframe = By.xpath("//iframe[@id='rw_iframe']");
	By category=By.xpath("//div[@class='field-container']//div[@id='s2id_customfield_13223']");
	By namesList = By.xpath("//div[@class='select2-search']//following::ul//li");
	By subCategory=By.xpath("//div[@class='field-container']//div[@id='s2id_customfield_13223:1']");
	By activityAction=By.xpath("//div[@id='s2id_customfield_17008']");
	By accessLevel=By.xpath("//div[@class='field-container']//div[@id='s2id_customfield_13314']");
	By employeeName=By.xpath("//div[@class='field-container']//div[@id='s2id_customfield_16220']");
	By employeeName2=By.xpath("//ul[@class='select2-choices']//li[@class='select2-search-field']//input");
	By auditType=By.xpath("//div[@class='field-container']//div[@id='s2id_customfield_13316']");
	By multipleAuditNumbers=By.xpath("//div[@class='field-container']//textarea[@id='customfield_13317']"); 
	By auditNumber=By.xpath("//div[@id='s2id_customfield_13318_multi']");
	By auditNumbersList=By.xpath("//div[@id='select2-drop']//ul[@class='select2-results']//li//following::div//span");
	By auditNumbersList2=By.xpath("//ul[@class='select2-choices']//li[@class='select2-search-field']//input[@id='s2id_autogen155']");
	By justification=By.xpath("//div[@class='field-container']//textarea[@id='customfield_11543']");
	By create = By.xpath("//div[@class='rw_item_footer']//following::span[text()='Create']");
	By ticketLink = By.xpath("//a[@class='rw_request_key rw_request_key_link']");
	
	
	public WebElement AccountIDIcon() {
		return driver.findElement(accountIDIcon);
	}
	
public void MainFrame() {		
		WebElement ele=driver.findElement(mainframe);
		switchtoFrame(ele);
	}
public WebElement Category() {
	return driver.findElement(category);
}
public void NamesList(String droptext){
	suggestionHandler(namesList,droptext);		
	}
public WebElement SubCategory() {
	return driver.findElement(subCategory);
}
public void SubCategoryNames(String droptext){
	suggestionHandler(namesList,droptext);		
	}
public WebElement ActivityAction() {
	return driver.findElement(activityAction);
}
public WebElement AccessLevel() {
	return driver.findElement(accessLevel);
}
public WebElement EmployeeName() {
	return driver.findElement(employeeName);
}

public void EmployeeName2(String text) throws Throwable {
	multipleSuggestionsAdding(employeeName2, text);
	}

public WebElement AuditType() {
	return driver.findElement(auditType);
}
public WebElement MultipleAuditNumbers() {
	return driver.findElement(multipleAuditNumbers);
}
public WebElement AuditNumber() {
	return driver.findElement(auditNumber);
}
public void AuditNumbersList(String text) throws Throwable {
	multipleSuggestionsAdding(auditNumbersList2, text);
	
	
}
public void AuditNumbersList2(String droptext){
	suggestionHandler(auditNumbersList,droptext);		
	}
public WebElement Justification() {
	return driver.findElement(justification);
}
public WebElement Createbutton(){
	return driver.findElement(create);
}
public WebElement TicketLink(){
	WebElement ele=driver.findElement(ticketLink);
	explicitWaitCondition(ele);
	return ele;
	}

public WebElement TicketLink2(){
	WebElement ticketno=driver.findElement(ticketLink);
	System.out.println("Ticket Number of Main Task : " + ticketno.getText());
	return ticketno;	
}



}
