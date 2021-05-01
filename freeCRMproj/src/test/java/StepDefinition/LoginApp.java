package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginApp 
{
	public static WebDriver driver;

	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ujalali\\Documents\\SeleniumSoftware\\Chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
	}
	
	@Given("^User logins to the application$")
	public void user_logins_to_the_application() throws Throwable
	{
			    driver.manage().window().maximize();
	    driver.get("https://ui.cogmento.com/");
	    WebDriverWait wait = new WebDriverWait(driver, 20);
    	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui fluid large blue submit button']")));
	}

	@Then("^User enter the email as \"([^\"]*)\"$")
	public void user_enter_the_email_as(String arg1) throws Throwable 
	{
		driver.findElement(By.name("email")).sendKeys(arg1);
	}

	@Then("^user enter the password  as \"([^\"]*)\"$")
	public void user_enter_the_password_as(String arg1) throws Throwable 
	{
		 driver.findElement(By.name("password")).sendKeys(arg1);
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable 
	{
		 driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
	    	WebElement element = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header item']")));

	}


}
