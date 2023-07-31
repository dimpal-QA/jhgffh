package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.base;

public class ProblemCreation_Page extends base {
	public WebDriver driver;
	public ProblemCreation_Page(WebDriver driver8) {
		this.driver = driver8;
	}
	
	By userids=By.xpath("//span[@class='rw_item_count rw_color_red']");
	By itView=By.id("com.onresolve.jira.groovy.groovyrunner:ITVIEW");
	By createmenu=By.id("create-menu");
	By next=By.id("issue-create-submit");
	By assignmentGroup=By.id("customfield_11333-field");
	By application=By.id("customfield_11325-field");
	By summary=By.xpath("//input[@id='summary']");
	By comment=By.id("tinymce");
	By description=By.xpath("//iframe[@id='mce_0_ifr']");
	By symptoms=By.id("customfield_11721");
	By linkedIncident=By.xpath("//div[@class='sr-rs__control css-yk16xz-control']");
	By linkedIncidentList=By.xpath("//div[@class='sr-rs__menu css-9g7j0m-menu']");
	By createButton=By.id("create-issue-submit");
	public WebElement Userids(){
		return driver.findElement(userids);
	}
	public WebElement ItView(){
		return driver.findElement(itView);
	}
	
	
	
	public WebElement CreateMenu(){
		return driver.findElement(createmenu);
	}
	public WebElement Next(){
		return driver.findElement(next);
	}
	
	public void AssignmentGroup(String assignmentgroupName) throws Throwable{
		WebElement ele=driver.findElement(assignmentGroup);
		explicitWaitCondition(ele);
		clearData_ProvideData(assignmentGroup,assignmentgroupName);
	}
	
	public void Application(String applicationName) throws Throwable{
		clearData_ProvideData(application, applicationName);
			}
	
	public WebElement Summary() {
		return driver.findElement(summary);
	}
	public WebElement Comment(){
		return driver.findElement(comment);
	}
	public void DescriptionFrame() {
		driver.switchTo().frame(driver.findElement(description));
	}
	
	public WebElement Symptoms() {
		return driver.findElement(symptoms);
	}
	public WebElement LinkedIncident() {
		return driver.findElement(linkedIncident);
	}
	public WebElement LinkedIncidentList() {
		return driver.findElement(linkedIncidentList);
	}
	public WebElement CreateButton() {
		return driver.findElement(createButton);
	}

	
	
	

}
