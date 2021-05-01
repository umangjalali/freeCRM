package StepDefinition;

import org.openqa.selenium.By;
import cucumber.api.java.en.Then;

public class CreateCompany
{
	//WebDriver driver;
	
	@Then("^user click on company module$")
	public void user_click_on_company_module() throws Throwable
	{
		//LoginApp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	    Thread.sleep(2000);
		LoginApp.driver.findElement(By.xpath("//span[contains(text(),'Companies')]")).click();
		
	}

	@Then("^user clicks on create company$")
	public void user_clicks_on_create_company() throws Throwable
   {
		 Thread.sleep(1500);
		LoginApp.driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
	}
	
}
