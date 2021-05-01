package FreecrmPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Company
{
	   WebDriver driver;
		By cmpnySlect = By.xpath("//span[contains(text(),'Companies')]");
	    
	    public Company(WebDriver driver) 
	    {
	    	System.out.println("Inside company constructor");
	    	this.driver = driver;
	    }
	    
	    public void companyToSelect()
	  
	    {
	    	
	    	
	    	System.out.println("Inside hehkjhd");
	    	driver.findElement(cmpnySlect).click();
	    	
	    }
	    
	   

		
	}


