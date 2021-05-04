package FreecrmPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPOM
{
	   WebDriver driver;
		By email = By.xpath("//input[@placeholder='E-mail address']");
	    By password = By.name("password");
	    By signin = By.xpath("//div[@class='ui fluid large blue submit button']");
	    
	    public LoginPOM(WebDriver driver) 
	    {
	    	
	    	this.driver = driver;
	    	WebDriverWait wait = new WebDriverWait(driver, 20);
	    	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui fluid large blue submit button']")));
	    }
	    
	    public void enteremail(String EM)
	    {	
	    	
	    	
	    	
	    	driver.findElement(email).sendKeys(EM);
	    	System.out.println("Inside email");
	    }
	    
	    public void enterpass(String PD)
	    {
	    	driver.findElement(password).sendKeys(PD);
	    	System.out.println("Inside pwd");
	    }
	    
	    public void clicklogin()
	    {
	    	driver.findElement(signin).click();
	    	WebDriverWait wait = new WebDriverWait(driver, 10);
	    	WebElement element = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header item']")));

	    }

		
	}


