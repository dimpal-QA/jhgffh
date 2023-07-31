package util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class base {
	 
   
   
    public static WebDriver driver;
    public static Properties prop;
    

    public WebDriver initializeDriver() throws IOException {
         prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/resources"
				+ "/data.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "P:\\IT\\Dimpal Kharode\\chromedriver.exe");
         driver = new ChromeDriver();

        }
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(prop.getProperty("URL"));
        return driver;
    }

    public void getScreenShotPath(String testCaseName, WebDriver driver) throws IOException{
        TakesScreenshot ts= (TakesScreenshot) driver;
        File source= ts.getScreenshotAs(OutputType.FILE);
        String destinationFile= System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
        FileUtils.copyFile(source,new File(destinationFile));
    }
    public void windowHandler(){
    	Set<String> allids=driver.getWindowHandles();
		Iterator<String> iter=allids.iterator();
		String parent=	iter.next();
		String child=iter.next();
		driver.switchTo().window(child);
    }
    
    public void multipleWindowHandling(){
    	Set<String> allwindowids=driver.getWindowHandles();
		Iterator<String> iter=allwindowids.iterator();
		while(iter.hasNext()){
		String s=iter.next();
		driver.switchTo().window(s);
		}
    }
    public void switchtoFrame(WebElement frame_id){
    	driver.switchTo().frame(frame_id);    	
    }
    
    public void suggestionHandler(By text, String dropValue){
  	List<WebElement> ApplnName= driver.findElements(text);
	for(WebElement temp: ApplnName ){
		if(temp.getText().equals(dropValue)){
			temp.click();
			break;
		}
	}
	}
    
       
    public void explicitWaitCondition(WebElement elements){
    	WebDriverWait wait = new WebDriverWait(driver,30);    	 
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
        
    }
    
    public void elementToClick(WebElement text){
    	WebDriverWait wait=new WebDriverWait(driver, 30);
    	wait.until(ExpectedConditions.elementToBeClickable(text));
    }
    
    public void clearData_ProvideData(By text,String data) throws Throwable{
    	//WebDriverWait wait = new WebDriverWait(driver,30);    	 
        //wait.until(ExpectedConditions.elementToBeClickable(text));		
    WebElement ApplicationType=driver.findElement(text);
	ApplicationType.click();
	ApplicationType.clear();
	ApplicationType.sendKeys(data);	
	ApplicationType.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	ApplicationType.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
    }
    
    public void dropdownHandle(By text,String data){
    Select s=new Select(driver.findElement(text));
	s.selectByVisibleText(data);
    }
    
    
   public void sendkeysByJC(By ele,String text){
	   WebElement webl = driver.findElement(ele);
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].value='"+text+"';", webl);
	   System.out.println("data is : "+text);
   }
   
   public Actions mouseaction()
   {
	   Actions act =new Actions(driver);
	return act;
   }
   public void switchToFrameByTagName(){
	   driver.switchTo().frame(driver.findElement(By.tagName("iframe")));   
   }
   
   public void switchToDefaultFrame(){
	   driver.switchTo().defaultContent();
   }
   public void clear_sendData(By ele,String text) throws Throwable{
	WebElement webl=  driver.findElement(ele);
	Thread.sleep(5000);
	webl.click();
	webl.sendKeys(Keys.CONTROL,Keys.chord("a"));
	webl.sendKeys(Keys.BACK_SPACE);
	Thread.sleep(5000);	
	webl.sendKeys(text);
	Thread.sleep(5000);	
	webl.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(5000);	
	webl.sendKeys(Keys.ENTER);
	    }
   
   public void directsuggestionHandle(String text) throws Throwable
   {
   	mouseaction().sendKeys(Keys.TAB).perform();
   	mouseaction().sendKeys(text).build().perform();
   	Thread.sleep(1000);
   	mouseaction().sendKeys(Keys.ENTER).perform();
   	   }
   
   public void multipleSuggestionsAdding(By ele,String text) throws Throwable{
	   WebElement webl=  driver.findElement(ele);
	   webl.sendKeys(text);
		Thread.sleep(5000);
		webl.sendKeys(Keys.ENTER);
	  
	   
   }
}
