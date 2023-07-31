package testScenarios;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Problem {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "P:\\IT\\Dimpal Kharode\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jiraet-qa.cotiviti.com/login.jsp?nosso");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='login-form-username']")).sendKeys("dimpal.kharode@cotiviti.com");
		driver.findElement(By.xpath("//input[@id='login-form-password']")).sendKeys("Ruby@0148");
		driver.findElement(By.xpath("//a[text()='Terms & Conditions']")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();			
		driver.findElement(By.id("login-form-submit")).click();
		driver.findElement(By.xpath("//a[text()='ServiceDesk Portal']")).click();
		Set<String> allids=driver.getWindowHandles();
		//System.out.println(allids);
		Iterator<String> iter=allids.iterator();
		String parent=	iter.next();
		String child=iter.next();
		driver.switchTo().window(child);	
		
        
        driver.findElement(By.xpath("//span[@class='rw_item_count rw_color_red']")).click();
        driver.findElement(By.id("com.onresolve.jira.groovy.groovyrunner:ITVIEW")).click();
        driver.findElement(By.xpath("//div[@class='aui-header-before']")).click();
        driver.findElement(By.xpath("//div[@class='aui-dropdown2-section']//ul/li[4]")).click();
 WebElement userName=  driver.findElement(By.xpath("//div[@class='sr-rs css-1bxnjg2-container']"));
 Thread.sleep(10000);
// userName.sendKeys("Kavitha");
 /*Actions act=new Actions(driver);
 act.moveToElement(userName).sendKeys("userName").build().perform();*/
 JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
 jsExecutor.executeScript("arguments[0].value='testuser'", userName);
 
 
 
 

	
	}

}
