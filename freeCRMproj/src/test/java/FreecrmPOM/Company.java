package FreecrmPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Company
{
	   WebDriver driver;
		By cmpnySlect = By.xpath("//span[contains(text(),'Companies')]");
		By createcomp = By.xpath(" //button[normalize-space()='Create']");
		By name = By.xpath(" //div[@class='ui right corner labeled input']//input[@name='name']");
		By PA = By.xpath("//button[normalize-space()='Public']");
		By PA1 = By.xpath("//button[normalize-space()='Private']");
		By website = By.xpath("//input[@name='url']");
		By StrAdd = By.xpath(" //input[@placeholder='Street Address'");
		By city = By.xpath("//input[@placeholder='City']");
		By state = By.xpath("//input[@placeholder='State / County']");
		By postcd = By.xpath("//input[@placeholder='Post Code']");
		By countryadd = By.xpath("//div[@name='country']//i[@class='dropdown icon']");
		By countryadd1 = By.xpath("//div[contains(text(),'India')]");
		By countryphone = By.xpath(" //div[@name='hint']//i[@class='dropdown icon']");
		By countryphone1 = By.xpath("//div[@role='alert']//i[@class='in flag']");
		By number = By.xpath("//input[@placeholder='Number']");
		By Homenumber = By.xpath("//input[@placeholder='Home, Work, Mobile...']");
		By tags = By.xpath("//div[@class='ui fluid multiple search selection dropdown']//input[@type='text']");
		By desc = By.xpath("//div[@class='ui fluid multiple search selection dropdown']//input[@type='text']");
		By social = By.xpath("//div[@name='channel_type']//i[@class='dropdown icon']");
		By social1 = By.xpath("//div[contains(text(),'Twitter')]");
		By socialhandle = By.xpath("//input[@placeholder='Twitter handle']");
		By ind = By.xpath("//input[@name='industry']");
		By emp = By.xpath("//input[@name='num_employees']");
		By ssym = By.xpath("//input[@name='symbol']");
		By arev = By.xpath("//input[@name='annual_revenue']");
		By priority = By.xpath("//div[@name='priority']//i[@class='dropdown icon']");
		By priority1 = By.xpath("//div[contains(text(),'Medium')]");
		By status = By.xpath("//div[@name='status']//i[@class='dropdown icon']");
		By status1 = By.xpath("//div[contains(text(),'New')]");
		By source = By.xpath("//div[@name='source']//i[@class='dropdown icon']");
		By source1 = By.xpath("//div[contains(text(),'Referral')]");
		By category = By.xpath("//div[@name='category']//i[@class='dropdown icon']");
		By category1 = By.xpath("//div[contains(text(),'Partner')]");
		By vat = By.xpath("//input[@name='vat_number']");
		By iden = By.xpath("//input[@name='identifier']");
		//By img = By.xpath("//input[@name='image']");
		By save = By.xpath("//button[normalize-space()='Save']");

		
		By edit = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[2]/button[1]/i[1]");
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
		By filsear1 = By.xpath("//div[contains(text(),'Name')]");
		By filoper = By.xpath("//div[@name='operator']//i[@class='dropdown icon']");
		By filoper1 = By.xpath("//div[contains(text(),'Contains')]");
		By filval = By.xpath("//div[@class='field value']//input[@placeholder='Value']");
		By filbut = By.xpath("//i[@class='search small icon']");
		
		
		
		
		
		
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
	    
	    public void companyTocreate()
	    {
	    	driver.findElement(createcomp).click();
	    }
	    
	    public void entername(String NM)
	    {	
	    	
             driver.findElement(name).sendKeys(NM);
	    	
	    }
	    
	    
	    public void access()
	    {
	    	
	    	 driver.findElement(PA).click();
             driver.findElement(PA1).click();
	    }
	    
	    
	    public void enterweb(String WS)
	    {
	    	
	    	driver.findElement(website).sendKeys(WS);
	    	
	    }
	    
	    
	    public void enteradd(String add,String cit, String state1,String postal)
	    {
	    	
	    	driver.findElement(StrAdd).sendKeys(add);
	    	driver.findElement(city).sendKeys(cit);
	    	driver.findElement(state).sendKeys(state1);
	    	driver.findElement(postcd).sendKeys(postal);
	    	driver.findElement(countryadd).click();
	    	driver.findElement(countryadd1).click();
	    }
	    
	      
	    public void enterphone(String PH,String PH1 )
	    {
	    	
	    	driver.findElement(countryphone).click();
	    	driver.findElement(countryphone1).click();
	    	driver.findElement(number).sendKeys(PH);
	    	driver.findElement(Homenumber).sendKeys(PH1);
	    	
	    }
	    
		public void entertag(String TG)
		{
			driver.findElement(tags).sendKeys(TG);
		}
		
		public void enterdescription(String DS)
		{
			driver.findElement(desc).sendKeys(DS);
		}
		
		public void entersocial(String SO)
		{
			driver.findElement(social).click();
			driver.findElement(social1).click();
			driver.findElement(socialhandle).sendKeys(SO);
		}
		
		public void enterind(String IN)
		{
			driver.findElement(ind).sendKeys(IN);
		}
		
		public void enteremp(String EM)
		{
			driver.findElement(emp).sendKeys(EM);
		}
	    
		public void enterstock(String SS)
		{
			driver.findElement(ssym).sendKeys(SS);
		}
		
		public void enterrev(String AR)
		{
			driver.findElement(arev).sendKeys(AR);
		}
		
		public void enterpriority()
		{
			driver.findElement(priority).click();
			driver.findElement(priority1).click();
		}
		
		public void enterstatus()
		{
			driver.findElement(status).click();
			driver.findElement(status1).click();
		}
		
		public void entersource()
		{
			driver.findElement(source).click();
			driver.findElement(source1).click();
		}
		
		public void entercategory()
		{
			driver.findElement(category).click();
			driver.findElement(category1).click();
		}
		
		public void entervat(String VT)
		{
			driver.findElement(vat).sendKeys(VT);
		}
		
		public void enterident(String ID)
		{
			driver.findElement(iden).sendKeys(ID);
		}
		
//		public void enterimg()
//		{
//			driver.findElement(img).click();
//		}
		
		public void savecom()
		{
			driver.findElement(save).click();
		}
		
		public void editcom(String EC)
		{
			driver.findElement(edit).click();
			driver.findElement(editadd).sendKeys(EC);
			driver.findElement(save).click();
		}
		
		public void delcom()
		{
			driver.findElement(delete).click();
			driver.findElement(delete1).click();
		}
		
		public void reccom()
		{
			driver.findElement(recover).click();
			driver.findElement(recover1).click();
			driver.findElement(recover2).click();
			driver.findElement(recover3).click();
			driver.findElement(recover4).click();
		}

		public void filcom(String FC)
		{
			driver.findElement(filter).click();
			driver.findElement(filsear).click();
			driver.findElement(filsear1).click();
			driver.findElement(filoper).click();
			driver.findElement(filoper1).click();
			driver.findElement(filval).sendKeys(FC);
			driver.findElement(filbut).click();
		}
		
	}


