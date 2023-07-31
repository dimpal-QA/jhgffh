package testScenarios;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.ProblemCreation_Page;
import util.base;

public class ProblemCreationTest extends base{
	public ProblemCreation_Page PC;
	
	@Test
	public void requestCreation() throws Throwable{
		PC=new ProblemCreation_Page(driver);
		PC.Userids().click();
		PC.ItView().click();
		PC.CreateMenu().click();
		PC.AssignmentGroup("@Corp HRIS");
		PC.Application("Abstraction Reporting");
		PC.Summary().sendKeys("Summary");
		PC.DescriptionFrame();	
		PC.Comment().click();
		PC.Comment().sendKeys("Description");
		PC.switchToDefaultFrame();
		PC.Symptoms().sendKeys("Symptoms");
		Thread.sleep(10000);
		PC.LinkedIncident().click();
		/*PC.LinkedIncident().sendKeys(Keys.ARROW_DOWN);
		PC.LinkedIncident().sendKeys(Keys.ENTER);*/
		//Thread.sleep(10000);
		//PC.LinkedIncidentList().sendKeys(Keys.ARROW_DOWN);
		//PC.LinkedIncidentList().sendKeys(Keys.ARROW_DOWN);
		/*Thread.sleep(10000);
		PC.LinkedIncidentList().sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		PC.LinkedIncidentList().sendKeys(Keys.ENTER);*/
		Thread.sleep(10000);
		mouseaction().sendKeys(Keys.TAB).perform();
		Thread.sleep(10000);
		mouseaction().sendKeys(Keys.TAB).perform();
		Thread.sleep(10000);
		PC.CreateButton().click();
		

		
	}

}
