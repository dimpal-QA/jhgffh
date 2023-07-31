package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.base;

public class InternalDistrubtionListPortalView2_Page extends base{
	public WebDriver driver;
	public InternalDistrubtionListPortalView2_Page(WebDriver driver13){
		this.driver=driver13;		
	}
	By accountIDIcon = By.xpath("//div[@data-url='/servicedesk/customer/portal/7/create/179']");
	By mainframe = By.xpath("//iframe[@id='rw_iframe']");
	By category=By.xpath("//div[@class='field-container']//div[@id='s2id_customfield_13223']");
	By namesList = By.xpath("//div[@class='select2-search']//following::ul//li");
	By subCategory=By.xpath("//div[@class='field-container']//div[@id='s2id_customfield_13223:1']");
	By purposeOfTheRequest=By.xpath("//div[@class='field-container']//div[@id='s2id_customfield_13323']");
	By distributionListname=By.xpath("//div[@class='field-container']//input[@id='customfield_13328']");
	//By managerNameDL=By.xpath("//div[@class='field-container']//div[@id='s2id_customfield_13329']");
	//By managerNameDLList=By.xpath("//div[@class='select2-search']//following::ul//li//div[@class='select2-result-label']//span");
	By emailAddress=By.xpath("//div[@class='field-container']//input[@id='customfield_13331']");
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
public WebElement PurposeOfTheRequest() {
	return driver.findElement(purposeOfTheRequest);
}
public WebElement DistributionListname() {
	return driver.findElement(distributionListname);
}

/*public WebElement ManagerNameDL() {
	return driver.findElement(managerNameDL);
}
public void ManagerNameDLList(String droptext){
	suggestionHandler(managerNameDLList,droptext);		
	}*/



public void ManagerName2(String text) throws Throwable
{
	directsuggestionHandle(text);
	
}

public WebElement EmailAddress() {
	return driver.findElement(emailAddress);
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
