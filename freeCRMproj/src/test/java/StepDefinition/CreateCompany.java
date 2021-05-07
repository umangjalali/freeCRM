package StepDefinition;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;



//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import FreecrmPOM.Company;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateCompany
{
	WebDriver driver;
	
	Company CreateCompany = new Company(driver);
	 
	 // Company companyData= new Company(driver);
	   
	@Test(priority = 1)
	@When("^user click on company module$")
	public void user_click_on_company_module() throws Throwable
	{
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);	
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	    Thread.sleep(2000);
		//LoginApp.driver.findElement(By.xpath("//span[contains(text(),'Companies')]")).click();
		
		CreateCompany.companyToSelect();
		
		
		
	}

	
	@Test(priority = 2)
	@Then("^user clicks on create company$")
	public void user_clicks_on_create_company() throws Throwable
   {
		LoginApp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 CreateCompany.companyTocreate();
		
	}
	
	@Test(priority = 3)
    @Then("^user enters the valid name$")
	public void user_enters_the_valid_name() throws Throwable
    {
	   
    	 CreateCompany.entername("BMW");
 	  
    
    
    }

	@Test(priority = 4)
	@Then("^user access the public button$")
	public void user_access_the_public_button() throws Throwable
	{
	   
	   CreateCompany.access();
	   
	}

	@Test(priority = 5)
	@Then("^user enters the url of the company website$")
	public void user_enters_the_url_of_the_company_website() throws Throwable
	{
	 
		  CreateCompany.enterweb("https://www.bmw.in/en/index.html");
	}

	@Test(priority = 6)
	@Then("^user enter the address of the company$")
	public void user_enter_the_address_of_the_company() throws Throwable 
	{

		LoginApp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		CreateCompany.enteradd("Bldg No-8","Gurgaon","Haryana","122001");
		
	}

	@Test(priority = 7)
	@Then("^user enters the phone number of the company$")
	public void user_enters_the_phone_number_of_the_company() throws Throwable
	{
		
	    CreateCompany.enterphone("9234560912","0120-264243");
	   
	}

	@Test(priority = 8)
	@Then("^user enter the tags associated to it$")
	public void user_enter_the_tags_associated_to_it() throws Throwable
	{
		CreateCompany.entertag("Sponsored");
	}

	@Test(priority = 9)
	@Then("^user enters the description of the company$")
	public void user_enters_the_description_of_the_company() throws Throwable
	{
	   CreateCompany.enterdescription("BMW is the leading manufacturer of the luxurious cars in the world.");
	}

	@Test(priority = 10)
	@Then("^user selects the social channels linked to the company$")
	public void user_selects_the_social_channels_linked_to_the_company() throws Throwable
	{
		
	    CreateCompany.entersocial("https://twitter.com/bmwindia");
	}

	@Test(priority = 11)
	@Then("^user enters the industry associated with the company$")
	public void user_enters_the_industry_associated_with_the_company() throws Throwable 
	{
		
		 CreateCompany.enterind("Manufacturing");
	}
	
	@Test(priority = 12)
	@Then("^user enters the number of employees in the company$")
	public void user_enters_the_number_of_employees_in_the_company() throws Throwable 
	{
		 CreateCompany.enteremp("116,324");
	}

	@Test(priority = 13)
	@Then("^user enters the stock symbol of the company$")
	public void user_enters_the_stock_symbol_of_the_company() throws Throwable 
	{
	     CreateCompany.enterstock("BMW.DE");
	}

	@Test(priority = 14)
	@Then("^user enters the annual revenue of the company$")
	public void user_enters_the_annual_revenue_of_the_company() throws Throwable 
	{
	    CreateCompany.enterrev("615.08Cr");
	}

	@Test(priority = 15)
	@Then("^user selects the priority of the company$")
	public void user_selects_the_priority_of_the_company() throws Throwable
	{
	    CreateCompany.enterpriority();
	   
	}

	@Test(priority = 16)
	@Then("^user selects the status of the company$")
	public void user_selects_the_status_of_the_company() throws Throwable 
	{
	     CreateCompany.enterstatus();
	    
	
	}
	
	@Test(priority = 17)
	@Then("^user selects the source of the company$")
	public void user_selects_the_source_of_the_company() throws Throwable 
	{
	    CreateCompany.entersource();
	   
	}

	@Test(priority = 18)
	@Then("^user selects the category of the company$")
	public void user_selects_the_category_of_the_company() throws Throwable 
	{
	    CreateCompany.entercategory();
	   
	}

	@Test(priority = 19)
	@Then("^user enters the VAT number of the company$")
	public void user_enters_the_VAT_number_of_the_company() throws Throwable
	{
	    CreateCompany.entervat("012");
	}

	@Test(priority = 20)
	@Then("^user enters the identifier of the company$")
	public void user_enters_the_identifier_of_the_company() throws Throwable
	{
	   CreateCompany.enterident("BMW India");
	}

//	@Then("^user is able to upload the image$")
//	public void user_is_able_to_upload_the_image() throws Throwable 
//	{
//	   CreateCompany.enterimg();
//	}
	
	@Test(priority = 21)
	@Then("user is able to create a company$")
	public void user_is_able_to_create_a_company() throws Throwable
	{
		CreateCompany.savecom();
	}

	//\"([^\"]*)\"
	
	@Test(priority = 3)
	@Then("^user enters the invalid ([^\\\"]*)$")
	public void user_enters_the_invalid(String arg1) throws Throwable 
	{
	    CreateCompany.invalidnm(arg1);
	   boolean b =  CreateCompany.checkname();
	  // driver.close();
	   assertTrue(b);
	   //driver.quit();
	}
	
	@Test(priority = 3)
	@Then("^user write the invalid address of the company where ([^\\\"]*)$")
	public void user_write_the_invalid_address_of_the_company_where(String arg2) throws Throwable 
	{
		CreateCompany.invalidzip("BMW",arg2);
	   boolean b1 =  CreateCompany.checkpost();
	   driver.close();
	   assertTrue(b1);
	}

	@Test(priority = 3)
	@Then("^user enter the invalid ([^\\\"]*)$")
	public void user_enter_the_invalid(String arg3) throws Throwable 
	{
		CreateCompany.invalidph("BMW",arg3);
		   boolean b2 =  CreateCompany.checkphone();
		  // driver.close();
		   assertTrue(b2);
	}

	@Test(priority = 3)
	@Then("^enters the invalid number ([^\\\"]*)$")
	public void enters_the_invalid_number(String arg4) throws Throwable 
	{
	   CreateCompany.invalidemp("BMW",arg4);   
	   boolean b3 =  CreateCompany.checknoemp();
	   //driver.close();
	   assertTrue(b3);
	}



}
