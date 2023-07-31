package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.base;

public class RequestAccessRolesForNewHireNormalFlow_Page extends base {
	public WebDriver driver;
	public RequestAccessRolesForNewHireNormalFlow_Page(WebDriver driver16){
		this.driver=driver16;
	}
	By status = By.xpath("//span[@id='status-val']");
	By switchUserIcon=By.xpath("//div[@class='aui-header-before']");
	By switchUser=By.xpath("//div[@class='aui-dropdown2-section']//ul/li[5]");
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
	By secondApprovalName1=By.xpath("(//ul[@class='_3fel3kSzra']//span[@class='_3YxuPeDif0']//span[@class='_394JahcMfb'])[1]");
	By secondApprovalName2=By.xpath("(//ul[@class='_3fel3kSzra']//span[@class='_3YxuPeDif0']//span[@class='_394JahcMfb'])[2]");
	
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
	public WebElement SecondApprovalName1(){
		WebElement name=driver.findElement(secondApprovalName1);
		System.out.println("Primary Role Owner Name : " + name.getText());
		return name;	
	}
	public WebElement SecondApprovalName2(){
		WebElement name2=driver.findElement(secondApprovalName2);
		System.out.println("Secondary Role Owner Name : " + name2.getText());
		return name2;	
	}


}
