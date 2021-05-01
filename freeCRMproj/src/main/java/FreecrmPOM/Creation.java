package FreecrmPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Creation
{
	WebDriver driver;
	
	
   
	By createcomp = By.xpath(" //button[normalize-space()='Create']");
	By name = By.xpath(" //div[@class='ui right corner labeled input']//input[@name='name']");
	//By access = By.xpath("//button[@class='ui small fluid positive toggle button']");
	By website = By.xpath("//input[@name='url']");
	//By StrAdd = By.xpath(" //input[@placeholder='Street Address'");
//	By city = By.xpath("//input[@placeholder='City']");
//	By state = By.xpath("//input[@placeholder='State / County']");
//	By postcd = By.xpath("//input[@placeholder='Post Code']");
	
	
	 public Creation(WebDriver driver)
	    {
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	    	this.driver = driver;
	    }
	    
	    public void companyToCreate()
	  
	    {
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	    	 driver.findElement(createcomp).click();
	    	
	    }
	
	    public void entername(String NM)
	    {	
	    	
             driver.findElement(name).sendKeys(NM);
	    	
	    }
	
	    public void enterweb(String WS)
	    {
	    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	    	driver.findElement(website).sendKeys(WS);
	    	
	    }
	
//    public void enterstradd(String SA)
//    {
//    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
//    	driver.findElement(StrAdd).sendKeys(SA);
//	    }
//	
//	    public void entercity(String CA)
//	    {
//	    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
//	    	driver.findElement(city).sendKeys(CA);
//	    }
//	
//	    public void enterstate(String ST)
//	    {
//	    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
//	    	driver.findElement(state).sendKeys(ST);
//	    }
//	    
//        public void enterpostcd(String PC)
//        {
//        	
//        	driver.findElement(postcd).sendKeys(PC);
//        }
//
//        
		  
        

}
