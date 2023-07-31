package testScenarios;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Incident;
import util.base;

public class Incident_creation extends base {
	Login_PageTest loginapp;

	   public Incident_creation(){
		   super();
	   } 
	
	@BeforeTest
	public void Driver() throws IOException{
		initializeDriver();
		loginapp=new Login_PageTest(); 
		
	}
	@Test
	public void createreq() throws IOException, InterruptedException{
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		loginapp.basepage();
		Incident ic = new Incident(driver);
		ic.iconclick().click();
	}
		
	

}
