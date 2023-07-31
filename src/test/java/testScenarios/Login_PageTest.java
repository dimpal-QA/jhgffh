package testScenarios;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Login_Page;
import util.base;


    public class Login_PageTest extends base {
    	public Login_PageTest(){
    		super();
    	}
    	   	 
      	public  Login_Page lp;

      	
      	
        
		@BeforeMethod
        public void Driver() throws IOException {
        initializeDriver();
        
            
        }
        @Test
        public  void basepage(){
        	lp= new Login_Page(driver);
        	
            lp.EmailID().sendKeys(prop.getProperty("email"));
            lp.UserPassword().sendKeys(prop.getProperty("password"));
            lp.TermsAndCondition().click();
            lp.Accept().click();
            lp.submit().click();
            lp.portalLink().click();
            windowHandler();
          
        }

        
        
}
