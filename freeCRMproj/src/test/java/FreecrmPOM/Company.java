package FreecrmPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import StepDefinition.LoginApp;

public class Company
{
	   WebDriver driver;
		By cmpnySlect = By.xpath("//span[contains(text(),'Companies')]");
		By createcomp = By.xpath(" //button[normalize-space()='Create']");
		By name = By.xpath(" //div[@class='ui right corner labeled input']//input[@name='name']");
		By PA = By.xpath("//button[normalize-space()='Public']");
		By PA1 = By.xpath("//button[normalize-space()='Private']");
		By website = By.xpath("//input[@name='url']");
		By StrAdd = By.xpath("//input[@name='address']");
		By city = By.xpath("//input[@placeholder='City']");
		By state = By.xpath("//input[@placeholder='State / County']");
		By postcd = By.xpath("//input[@placeholder='Post Code']");
		By countryadd = By.xpath("//div[@name='country']//div[@role='alert'][normalize-space()='United States']");
		//By countryadd = By.xpath("//div[@role='alert'][normalize-space()='United States']//i[@class='us flag']");
		By countryadd1 = By.xpath("//div[@class='six wide fields']//div[100]");
		
		By countryphone = By.xpath("//div[@name='hint']//div[@role='alert'][normalize-space()='United States']");
		By countryphone1 = By.xpath("//div[@class='four fields']//div[102]");
		By number = By.xpath("//input[@placeholder='Number']");
		By Homenumber = By.xpath("//input[@placeholder='Home, Work, Mobile...']");
		By tags = By.xpath("//div[@class='ui fluid multiple search selection dropdown']//input[@type='text']");
		By desc = By.xpath("//textarea[@name='description']");
		//By desc1 = By.xpath("//b[normalize-space()='Sponsored']");
		By social = By.xpath("//div[@name='channel_type']//i[@class='dropdown icon']");
		By social1 = By.xpath("//div[contains(text(),'Twitter')]");
		By socialhandle = By.xpath("//input[@placeholder='Twitter handle']");
		By ind = By.xpath("//input[@name='industry']");
		By emp = By.xpath("//input[@name='num_employees']");
		By ssym = By.xpath("//input[@name='symbol']");
		By arev = By.xpath("//input[@name='annual_revenue']");
		By priority = By.xpath("//div[@name='priority']//i[@class='dropdown icon']");
		By priority1 = By.xpath("//span[normalize-space()='Medium']");
		By status = By.xpath("//div[@name='status']//i[@class='dropdown icon']");
		By status1 = By.xpath("//span[normalize-space()='Active']");
		By source = By.xpath("//div[@name='source']//i[@class='dropdown icon']");
		By source1 = By.xpath("//div[@name='source']//div[3]");
		By category = By.xpath("//div[@name='category']//i[@class='dropdown icon']");
		By category1 = By.xpath("//div[@name='category']//div[3]");
		By vat = By.xpath("//input[@name='vat_number']");
		By iden = By.xpath("//input[@name='identifier']");
		//By img = By.xpath("//input[@name='image']");
		By save = By.xpath("//button[normalize-space()='Save']");

		
		By edit = By.xpath("//a[@href='/companies/edit/f11a6d18-caf3-4bc3-b0c2-286ba6076fbb']");
		By editadd = By.xpath("//input[@placeholder='City']");
		
		By delete = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/button[1]/i[1]");
		By delete1 = By.xpath("//button[normalize-space()='Delete']");
		
		By recover = By.xpath("//i[@class='trash alternate outline icon']");
		By recover1 = By.xpath("//a[normalize-space()='Company (1)']");
		By recover2 = By.xpath("//td[@class='collapsing']");
		By recover3 = By.xpath("//button[normalize-space()='Restore Selected']");
		By recover4 = By.xpath("//button[normalize-space()='OK']");

		By filter = By.xpath("//button[normalize-space()='Show Filters']");
		By filsear = By.xpath("//div[@name='name']//i[@class='dropdown icon']");
		By filsear1 = By.xpath("//div[@name='name']//div[@role='listbox']//div[1]");
		By filoper = By.xpath("//div[@name='operator']//i[@class='dropdown icon']");
		By filoper1 = By.xpath("//span[normalize-space()='Contains']");
		By filval = By.xpath("//div[@class='field value']//input[@placeholder='Value']");
		By filbut = By.xpath("//i[@class='search small icon']");
		
		By export = By.xpath("//button[normalize-space()='Export']");
		By exportok = By.xpath("//button[normalize-space()='OK']");
		By expdoc = By.xpath("//span[normalize-space()='Documents']");
		By expfol = By.xpath("//a[@href='/documents/folder/5bee68fe-70dd-4013-9356-68db305f0c77']");
		//By expdown = By.xpath("//a[@href='https://api.cogmento.com/api/1/documents/download/49d931f2-690f-45db-b1c4-da6ff1df2a16/?_token=97712335a13b503a3887aee00a380417f16cf709");
		By errormes = By.xpath("//span[@class='inline-error-msg']");
		
		
		
	    public Company(WebDriver driver) 
	    {
	    	System.out.println("Inside company constructor");
	    	this.driver = driver;
	    }
	    
	    public void companyToSelect()	    
	    {
	    	
	    	System.out.println("Inside hehkjhd");
	    	LoginApp.driver.findElement(cmpnySlect).click();
	    	
	    }
	    
	    public void companyTocreate()
	    {
	    	LoginApp.driver.findElement(createcomp).click();
	    }
	    
	    public void entername(String NM)
	    {	
	    	
             LoginApp.driver.findElement(name).sendKeys(NM);
	    	
	    }
	    
	    
	    public void access()
	    {
	    	
	    	LoginApp.driver.findElement(PA).click();
             LoginApp.driver.findElement(PA1).click();
	    }
	    
	    
	    public void enterweb(String WS)
	    {
	    	
	    	 LoginApp.driver.findElement(website).sendKeys(WS);
	    	
	    }
	    
	    
	    public void enteradd(String add,String cit, String state1,String postal)
	    {
	    	
	    	 LoginApp.driver.findElement(StrAdd).sendKeys(add);
	    	 LoginApp.driver.findElement(city).sendKeys(cit);
	    	 LoginApp.driver.findElement(state).sendKeys(state1);
	    	 LoginApp.driver.findElement(postcd).sendKeys(postal);
	    	 LoginApp.driver.findElement(countryadd).click();
	    	 LoginApp.driver.findElement(countryadd1).click();
	    	
	    }
	    
	      
	    public void enterphone(String PH,String PH1 )
	    {
	    	
	    	LoginApp.driver.findElement(countryphone).click();
	    	LoginApp.driver.findElement(countryphone1).click();
	    	LoginApp.driver.findElement(number).sendKeys(PH);
	    	LoginApp.driver.findElement(Homenumber).sendKeys(PH1);
	    	
	    }
	    
		public void entertag(String TG)
		{
			LoginApp.driver.findElement(tags).sendKeys(TG);
		}
		
		public void enterdescription(String DS)
		{
			LoginApp.driver.findElement(desc).sendKeys(DS);
			//LoginApp.driver.findElement(desc1).click();
		}
		
		public void entersocial(String SO)
		{
			LoginApp.driver.findElement(social).click();
			LoginApp.driver.findElement(social1).click();
			LoginApp.driver.findElement(socialhandle).sendKeys(SO);
		}
		
		public void enterind(String IN)
		{
			LoginApp.driver.findElement(ind).sendKeys(IN);
		}
		
		public void enteremp(String EM)
		{
			LoginApp.driver.findElement(emp).sendKeys(EM);
		}
	    
		public void enterstock(String SS)
		{
			LoginApp.driver.findElement(ssym).sendKeys(SS);
		}
		
		public void enterrev(String AR)
		{
			LoginApp.driver.findElement(arev).sendKeys(AR);
		}
		
		public void enterpriority()
		{
			LoginApp.driver.findElement(priority).click();
			LoginApp.driver.findElement(priority1).click();
		}
		
		public void enterstatus()
		{
			LoginApp.driver.findElement(status).click();
			LoginApp.driver.findElement(status1).click();
		}
		
		public void entersource()
		{
			LoginApp.driver.findElement(source).click();
			LoginApp.driver.findElement(source1).click();
		}
		
		public void entercategory()
		{
			LoginApp.driver.findElement(category).click();
			LoginApp.driver.findElement(category1).click();
		}
		
		public void entervat(String VT)
		{
			LoginApp.driver.findElement(vat).sendKeys(VT);
		}
		
		public void enterident(String ID)
		{
			LoginApp.driver.findElement(iden).sendKeys(ID);
		}
		
//		public void enterimg()
//		{
//			driver.findElement(img).click();
//		}
		
		public void savecom()
		{
			LoginApp.driver.findElement(save).click();
		}
		
		public void editcom(String EC)
		{
			LoginApp.driver.findElement(edit).click();
			LoginApp.driver.findElement(editadd).sendKeys(EC);
			LoginApp.driver.findElement(save).click();
		}
		
		public void delcom()
		{
			LoginApp.driver.findElement(delete).click();
			LoginApp.driver.findElement(delete1).click();
		}
		
		public void reccom()
		{
			LoginApp.driver.findElement(recover).click();
			LoginApp.driver.findElement(recover1).click();
			LoginApp.driver.findElement(recover2).click();
			LoginApp.driver.findElement(recover3).click();
			LoginApp.driver.findElement(recover4).click();
		}

		public void filcom(String FC)
		{
			LoginApp.driver.findElement(filter).click();
			LoginApp.driver.findElement(filsear).click();
			LoginApp.driver.findElement(filsear1).click();
			LoginApp.driver.findElement(filoper).click();
			LoginApp.driver.findElement(filoper1).click();
			LoginApp.driver.findElement(filval).sendKeys(FC);
			LoginApp.driver.findElement(filbut).click();
		}
		
		public void expcom()
		{
			LoginApp.driver.findElement(export).click();
			LoginApp.driver.findElement(exportok).click();
			LoginApp.driver.findElement(expdoc).click();
			LoginApp.driver.findElement(expfol).click();
			//LoginApp.driver.findElement(expdown).click();
		}
		
		public void invalidnm(String IN) throws InterruptedException
		{
			
			LoginApp.driver.findElement(name).sendKeys(IN);
			 Thread.sleep(1000);
			 LoginApp.driver.findElement(save).click();
		}
		
		public boolean checkname()
		{
			try {
				LoginApp.driver.findElement(errormes).isDisplayed();
				return true;
			}
			catch(NoSuchElementException e)
			{
				return false;
			}
		}
		
		public void invalidzip(String ZP,String post) throws InterruptedException
	    {
			 LoginApp.driver.findElement(name).sendKeys(ZP);
			 Thread.sleep(1000);
			 LoginApp.driver.findElement(postcd).sendKeys(post);
			 LoginApp.driver.findElement(save).click();
			 
		}
		
		public boolean checkpost()
		{
			try {
				LoginApp.driver.findElement(errormes).isDisplayed();
				return true;
			}
			catch(NoSuchElementException e)
			{
				return false;
			}
		}
		
		public void invalidph(String ph,String phn) throws InterruptedException
		{
			 LoginApp.driver.findElement(name).sendKeys(ph);
		     Thread.sleep(1000);
		     LoginApp.driver.findElement(number).sendKeys(phn);
		     LoginApp.driver.findElement(save).click();
		}
	
		public boolean checkphone()
		{
			try {
				LoginApp.driver.findElement(errormes).isDisplayed();
				return true;
			}
			catch(NoSuchElementException e)
			{
				return false;
			}
		}
		
		public void invalidemp(String em,String em1) throws InterruptedException
	    {
		     LoginApp.driver.findElement(name).sendKeys(em);
		     Thread.sleep(1000);
			 LoginApp.driver.findElement(emp).sendKeys(em1);
			 LoginApp.driver.findElement(save).click();
			 
		}
		
		public boolean checknoemp()
		{
			try {
				LoginApp.driver.findElement(errormes).isDisplayed();
				return true;
			}
			catch(NoSuchElementException e)
			{
				return false;
			}
		}
	
}


