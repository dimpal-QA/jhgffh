package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Incident {
	WebDriver driver;
	   public Incident(WebDriver driver1){
		   this.driver=driver1;
	   }
	   private By icon= By.xpath("//div[@data-url='/servicedesk/customer/portal/7/create/108']");
	   
	   public WebElement iconclick(){
	        return driver.findElement(icon);
	    }

}
