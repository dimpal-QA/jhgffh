package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.base;

public class ProblemSwitchUser_Page extends base{
	public WebDriver driver;
	public   ProblemSwitchUser_Page(WebDriver driver11){
		this.driver=driver11;
	}
	By userids=By.xpath("//span[@class='rw_item_count rw_color_red']");
	By itView=By.id("com.onresolve.jira.groovy.groovyrunner:ITVIEW");
	By switchUserIcon=By.xpath("//div[@class='aui-header-before']");
	By switchUser=By.xpath("//div[@class='aui-dropdown2-section']//ul/li[4]");
	By switchUserName=By.xpath("//div[@class='sr-rs css-1bxnjg2-container']//div[@class='sr-rs__control css-yk16xz-control']");
	By switchUserName2=By.xpath("//div[@class='sr-rs__input']//input");
	By  switchUserName4=By.xpath("//div[@class='sr-rs css-1bxnjg2-container']");
	By runButton=By.xpath("//div[@class='aui-buttons']//button[@class='aui-button aui-button-primary']");
	By here=By.xpath("//a[text()='here']");
	By createmenu=By.id("create-menu");
	By issueType=By.xpath("//div[@id='issuetype-single-select']");
	
	
	
	
	public WebElement Userids(){
		return driver.findElement(userids);
	}
	public WebElement ItView(){
		return driver.findElement(itView);
	}
	public WebElement SwitchUserIcon(){
		return driver.findElement(switchUserIcon);
	}
	public WebElement SwitchUser(){
		return driver.findElement(switchUser);
	}
	public WebElement SwitchUserName(){
		return driver.findElement(switchUserName);
	}
	public WebElement SwitchUserName2(){
		return driver.findElement(switchUserName2);
	}
	public void SwitchUserName3(String text) throws Throwable{
		WebElement ele1=driver.findElement(switchUserName2);
		mouseaction().moveToElement(ele1);
		mouseaction().sendKeys(text).build().perform();
		Thread.sleep(1000);
		mouseaction().sendKeys(Keys.ENTER).perform();
		
	}
	public WebElement SwitchUserName4(){
		return driver.findElement(switchUserName4);
	}
	public WebElement RunButton(){
		return driver.findElement(runButton);
	}
	public WebElement Here(){
		return driver.findElement(here);
	}
	public WebElement CreateMenu(){
		return driver.findElement(createmenu);
	}
	public void IssueType(String issueTypeName) throws Throwable{		
		clearData_ProvideData(issueType,issueTypeName);
	}
	
	
	
	
	
	
	

}
