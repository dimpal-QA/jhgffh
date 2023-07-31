package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	WebDriver driver;

	public Login_Page(WebDriver driver1) {
		this.driver = driver1;
	}
	// public Login_Page(){
	// super();
	// }

	By username = By.xpath("//input[@id='login-form-username']");
	By password = By.xpath("//input[@id='login-form-password']");
	By tandc = By.xpath("//a[text()='Terms & Conditions']");
	By accept = By.xpath("//button[text()='Accept']");
	By submit = By.xpath("//input[@id='login-form-submit']");
	By portalpage = By.xpath("//a[text()='ServiceDesk Portal']");

	public WebElement EmailID() {
		return driver.findElement(username);
	}

	public WebElement UserPassword() {
		return driver.findElement(password);
	}

	public WebElement TermsAndCondition() {
		return driver.findElement(tandc);
	}

	public WebElement Accept() {
		return driver.findElement(accept);
	}

	public WebElement submit() {
		return driver.findElement(submit);
	}

	public WebElement portalLink() {
		return driver.findElement(portalpage);
	}

}
