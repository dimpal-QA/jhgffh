package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.base;

public class RequestAccessRolesForNewHirePortalView_Page extends base{
	public WebDriver driver;
	public RequestAccessRolesForNewHirePortalView_Page(WebDriver driver16){
		this.driver=driver16;
	}
	By accountIDIcon = By.xpath("//div[@data-url='/servicedesk/customer/portal/7/create/179']");
	By mainframe = By.xpath("//iframe[@id='rw_iframe']");
	By category=By.xpath("//div[@class='field-container']//div[@id='s2id_customfield_13223']");
	By namesList = By.xpath("//div[@class='select2-search']//following::ul//li");
	By subCategory=By.xpath("//div[@class='field-container']//div[@id='s2id_customfield_13223:1']");
	By selectDepartment=By.id("s2id_customfield_13380");
	By departnames=By.xpath("//div[@class='select2-search']//following::ul//li");
	By selectRoles=By.id("s2id_customfield_13381");
	By startDate=By.xpath("//div[@class='cp-date-picker']//input[@id='customfield_11551']");
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
public WebElement SelectDepartment() {
	return driver.findElement(selectDepartment);
}
public void Departnames(String droptext) {
	suggestionHandler(departnames,droptext);
}
public WebElement SelectRoles() {
	return driver.findElement(selectRoles);
}
public void Rolenames(String droptext) {
	suggestionHandler(departnames,droptext);
}
public WebElement StartDate() {
	return driver.findElement(startDate);
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
