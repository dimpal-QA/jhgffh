package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.base;

public class RequestAccessDataValidation_Page extends base {
	public WebDriver driver;

	public RequestAccessDataValidation_Page(WebDriver driver17) {
		this.driver = driver17;
	}

	By userids = By.xpath("//span[@class='rw_item_count rw_color_red']");
	By itView = By.id("com.onresolve.jira.groovy.groovyrunner:ITVIEW");
	By moreButton=By.xpath("//a[@id='aui-responsive-header-dropdown-0-trigger']");
	By inSight=By.xpath("(//a[text()='Insight'])[1]");
	By iTILCMDB=By.xpath("//a[text()='ITIL CMDB']");
	By rBAMatrix=By.xpath("//li[@id='rlabs_jstree_10101']");
	By advance=By.xpath("//a[@id='rlabs-advancedsearch-switcher-item-to-advanced']");
	By searchQuery=By.xpath("//input[@id='rlabs-advanced-search-input']");
	By searchButton=By.xpath("//button[@id='rlabs-object-advanced-search-button']");
	
	
	
	
	
	
	public WebElement Userids(){
		return driver.findElement(userids);
	}
	public WebElement ItView(){
		return driver.findElement(itView);
	}
	public WebElement MoreButton(){
		return driver.findElement(moreButton);
	}
	public WebElement InSight(){
		return driver.findElement(inSight);
	}
	public WebElement ITILCMDB(){
		return driver.findElement(iTILCMDB);
	}
	public WebElement RBAMatrix(){
		return driver.findElement(rBAMatrix);
	}
	public WebElement Advance(){
		return driver.findElement(advance);
	}
	public WebElement SearchQuery(){
		return driver.findElement(searchQuery);
	}
	public WebElement SearchButton(){
		return driver.findElement(searchButton);
	}
	

}
