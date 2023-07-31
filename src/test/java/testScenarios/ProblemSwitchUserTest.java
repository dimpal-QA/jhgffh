package testScenarios;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pageobjects.ProblemSwitchUser_Page;
import util.base;

public class ProblemSwitchUserTest extends base {
	public ProblemSwitchUser_Page PS;
	
	@Test
	public void switchUser() throws Throwable{
		PS=new ProblemSwitchUser_Page(driver);
		
		Thread.sleep(5000);
		PS.Userids().click();
		PS.ItView().click();
		Thread.sleep(5000);
		
		
		PS.SwitchUserIcon().click();
		Thread.sleep(5000);
		PS.SwitchUser().click();
		Thread.sleep(10000);
		//driver.navigate().refresh();
		PS.SwitchUserName4().click();
		Thread.sleep(5000);
		PS.SwitchUserName2().sendKeys("Gundala");
		Thread.sleep(5000);
		PS.SwitchUserName2().sendKeys(Keys.ENTER);
		//PS.SwitchUserName3("Gundala");		
		PS.RunButton().click();		
		PS.Here().click();
		
		PS.CreateMenu().click();
		PS.IssueType("Problem");
	
	}

}
