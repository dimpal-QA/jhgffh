package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.base;

public class ReportSecurityPortalView_Page extends base {
	public WebDriver driver;

	public ReportSecurityPortalView_Page(WebDriver driver1) {
		this.driver = driver1;
	}

	By reportSecurityIcon = By.xpath("//div[@data-url='/servicedesk/customer/portal/7/create/109']");
	By mainframe = By.xpath("//iframe[@id='rw_iframe']");
	By issue = By.xpath("//input[@id='summary']");
	By description = By.xpath("//textarea[@id='description']");

	By notified = By.xpath("//div[@id='s2id_customfield_11390']");
	By notifiedNames = By.xpath("//div[@class='select2-search']//following::ul//li");

	By PHI_PI = By.xpath("//div[@class='field-container']//div[@id='s2id_customfield_11391']");
	By PHI_PI_value = By.xpath("//div[@class='select2-search']//following::ul//li");
	By clients_Impacted = By.xpath("//fieldset[@class='field-group group']//div[@class='radio']//following::label");
	By create = By.xpath("//div[@class='rw_item_footer']//following::span[text()='Create']");
	By ticketLink = By.xpath("//a[@class='rw_request_key rw_request_key_link']");

	
	
	
	
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
}
