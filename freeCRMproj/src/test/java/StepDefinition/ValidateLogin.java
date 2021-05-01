package StepDefinition;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import FreecrmPOM.Company;
import FreecrmPOM.Creation;
import FreecrmPOM.LoginPOM;



public class ValidateLogin
{
		   WebDriver driver;
	  
	
	@Test
	public void checklogin() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ujalali\\Documents\\SeleniumSoftware\\Chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
	    driver.manage().window().maximize();
	    driver.get("https://ui.cogmento.com/");
	    
	    
	    
		LoginPOM login = new LoginPOM(driver);	
   
        login.enteremail("jalaliumang01@gmail.com");
        login.enterpass("madsumang");
        login.clicklogin();
  //  driver.close();
    
        Company companyData= new Company(driver);
   
	    companyData.companyToSelect();
	
	
	    Creation CreateCompany = new Creation(driver);
	    
	    CreateCompany.companyToCreate();
	    
	    CreateCompany.entername("Amazon");
	    CreateCompany.enterweb("https://www.amazon.in/");
	    
//	    CreateCompany.enterstradd("1234 Main Street");
//	    CreateCompany.entercity("New York");
//	    CreateCompany.enterstate("United States");
//	    CreateCompany.enterpostcd("10018");
//        CreateCompany.entercountry("United States")
    }
	
//	@Test
//	public void selectCompanies() 
//	{
//		System.out.println("Inside hehkjhd");
//		Company companyData= new Company(driver);
//		 
//		
//		companyData.companyToSelect();
//		System.out.println("Inside hehkjhd");
//    
//    }
}
