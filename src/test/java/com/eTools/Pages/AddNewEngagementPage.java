package com.eTools.Pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eTools.base.TestBase;

public class AddNewEngagementPage extends TestBase {
	

	private String[] addnewengagementshadow = {"app-shell","engagements-page-main","engagements-list-view","pages-header-element"};
	//private String addnewengagementbtn="div > div > div > paper-button.add-btn > a";
	private String addnewengagementbtn="#listPage > pages-header-element > div > div > div > paper-button.add-btn.style-scope.pages-header-element.x-scope.paper-button-0 > a";
	private String[] purchaseordershadow = {"app-shell","engagements-page-main","new-engagement-view","engagement-info-details","paper-input"};		    
	//private String purchaseordernametxt="#input";
	private String purchaseordernametxt="#purchaseOrder";
	private String[] poitemshadow = {"app-shell","engagements-page-main","new-engagement-view","engagement-info-details","etools-searchable-multiselection-menu","paper-icon-button"};		    
	private String poitemdrp="#icon";
	private Actions act;
	
	private String[] peridostartdateshadow = {"app-shell","engagements-page-main","new-engagement-view","engagement-info-details","etools-datepicker-button"};		    
	private String peridostartdateshadowtext ="iron-icon";
	private String[] dateselectshadow = {"etools-datepicker","paper-date-picker","paper-calendar"};
	
	private String[] periodenddateshadow={"app-shell","engagements-page-main","new-engagement-view","engagement-info-details"};		    
	private String periodenddatetext="#periodEndDateInput";
	
	private String[] totalvalueshadow = {"app-shell","engagements-page-main","new-engagement-view","engagement-info-details","etools-currency-amount-input","paper-input"};		    
	private String[] addstaffcheckboxshadow = {"app-shell","engagements-page-main","new-engagement-view","engagement-staff-members-tab","paper-checkbox"};		    
	
	
	private String totalvaluetext="#input";
	private String addstaffcheckbox="#checkboxContainer";
	
	private String[] clickcreatebtnshadow = {"app-shell","engagements-page-main","new-engagement-view","status-tab-element","action-buttons"};		    
	private String createbtn="paper-button";
	
	private String[] engagementtitleshadow = {"app-shell","audits-page-main","pages-header-element"};		    
	private String engagementtitle="div > div > span";
	
	private String[] engagementtitlemicroshadow = {"app-shell","micro-assessments-page-main","pages-header-element"};
	String [] engagementtypeshadow={"app-shell","engagements-page-main","new-engagement-view","engagement-info-details","#engagementType","paper-icon-button"};		    
	
	
	private String[] engagementtitlespotcheckshadow={"app-shell","spot-checks-page-main","pages-header-element"};
	
	private String[] engagementtitlespecilauditshadow={"app-shell","special-audits-page-main","pages-header-element"};
	//#engagementType
	private String engagmenttypedrp="#icon";
				
	private String [] engagementvalueshadow={"app-shell","engagements-page-main","new-engagement-view","engagement-info-details","#engagementType"};	
	private String engagmentvaluedrp="#dropdownMenu > div > div.list-wrapper.no-search > paper-listbox > paper-item:nth-child(2) > span";
	private String engagmentvaluespotcheckdrp="#dropdownMenu > div > div.list-wrapper.no-search > paper-listbox > paper-item:nth-child(3) > span";
	private String engagmentvalueauditdrp="#dropdownMenu > div > div.list-wrapper.no-search > paper-listbox > paper-item:nth-child(1) > span";
	private String engagmentvaluspecialauditdrp="#dropdownMenu > div > div.list-wrapper.no-search > paper-listbox > paper-item:nth-child(4) > span";

	private String engagmentvaluespecialauditdrp="#dropdownMenu > div > div.list-wrapper.no-search > paper-listbox > paper-item:nth-child(4) > span";
//Data IP was contacted	
	private String[] datipwascontactshadow = {"app-shell","engagements-page-main","new-engagement-view","engagement-info-details","#contactedDate"};		    
	private String datipwascontact ="iron-icon";
	 
	private String dateokbtn="#dialog > div > paper-button:nth-child(3)";
	 
//  Select partner detail section
	private	String [] partnerdetailsshadow={"app-shell","engagements-page-main","new-engagement-view","partner-details-tab","#partner","paper-icon-button"};		    
	private	String partnerdetailsdrp="#icon";
// Select parrtner details value 		
	private	String [] partnerdetailssvaluehadow={"app-shell","engagements-page-main","new-engagement-view","partner-details-tab","#partner"};	
	private	String partnerdetailssvaluedrp="#dropdownMenu > div > div.list-wrapper > paper-listbox > paper-item:nth-child(1) > span";

	public AddNewEngagementPage() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	public void clickOnaddnewEngenment() {
		try {
			//driver.findelement(by.csspath()).click;
			//driver=driver;
			Thread.sleep(1000);
		//	getShadowElement(addnewengagementshadow,driver, addnewengagementbtn).click();
			driver.findElement(By.cssSelector(addnewengagementbtn)).click();
			Thread.sleep(3000);	
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
				
		}
	
	public String getAuditEngagementTitle()
	{
	String tittle=getShadowElement(engagementtitleshadow, driver,engagementtitle).getText();
		return tittle;
	}
	
	public String getMicroassesmentEngagementTitle()
	{
	String tittle=getShadowElement(engagementtitlemicroshadow, driver,engagementtitle).getText();
		return tittle;
	}
	
	public String getSpotcheckEngagementTitle()
	{
	String tittle=getShadowElement(engagementtitlespotcheckshadow, driver,engagementtitle).getText();
		return tittle;
	}
	public String getSpecialAuditEngagementTitle()
	{
	String tittle=getShadowElement(engagementtitlespecilauditshadow, driver,engagementtitle).getText();
		return tittle;
	}
// New engsament for Auidt and spot check
public void addNewEngagement(String purchaseorder, String engagementtype)
{
	try {
		//driver.findelement(by.csspath()).click;
		//driver=driver;
		Thread.sleep(1000);
		getShadowElement(purchaseordershadow, driver,purchaseordernametxt).sendKeys(purchaseorder);
		 act= new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		getShadowElement(poitemshadow, driver,poitemdrp).click();
		Thread.sleep(1000);
		//Select value from the PO Item
		act.sendKeys(Keys.TAB).perform();//
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();//
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();//
		Thread.sleep(1000);
		
		//Getting current date
		Date dNow = new Date( );
		SimpleDateFormat ft =new SimpleDateFormat ("dd MMM yyyy");
		System.out.println("Current Date: " + ft.format(dNow));
		System.out.println("Current Date: " + ft.format(dNow).toString());		
	
		//#  Click on engagementType Drop downbox
		getShadowElement(engagementtypeshadow, driver,engagmenttypedrp).click();
		Thread.sleep(1000);
		
		if (engagementtype.equalsIgnoreCase("spotcheck"))
		{
		//Select Engagement Value		
		getShadowElement(engagementvalueshadow, driver,engagmentvaluespotcheckdrp).click();		
		Thread.sleep(1000);
		}
		else if (engagementtype.equalsIgnoreCase("audit") )
		{
			getShadowElement(engagementvalueshadow, driver,engagmentvalueauditdrp).click();		
			Thread.sleep(1000);
			
		}
		else if ( engagementtype.equalsIgnoreCase("special audit"))
		{
			getShadowElement(engagementvalueshadow, driver,engagmentvaluspecialauditdrp).click();		
			Thread.sleep(1000);
		}
		
		//Date Ip was contacted date selection	
		
		getShadowElement(datipwascontactshadow,driver,datipwascontact).click();		
		getShadowElement(datipwascontactshadow,driver,dateokbtn).click();
		

		//click on period start date..calender
		getShadowElement(peridostartdateshadow,driver,peridostartdateshadowtext).click();			    
		//getShadowElement(dateselectshadow,driver,"div[date='2019-04-25']").click();
		WebElement e1 = driver.findElement(By.cssSelector("body > etools-datepicker:nth-child(3)"));
		WebElement eh1 = expandRootElement(e1, driver);
		//Click the OK Button in calender
		eh1.findElement(By.cssSelector("#dialog > div > paper-button:nth-child(3)")).click();
		Thread.sleep(1000);
		
// Click on period end date	
		getShadowElement(periodenddateshadow, driver,periodenddatetext).click();

		//Click OK button
		WebElement e2 = driver.findElement(By.cssSelector("body > etools-datepicker:nth-child(4)"));
		WebElement eh2 = expandRootElement(e2, driver);//returns shadow root
		eh2.findElement(By.cssSelector("#dialog > div > paper-button:nth-child(3)")).click();//click ok button
		
			getShadowElement(totalvalueshadow, driver,totalvaluetext).clear();
			getShadowElement(totalvalueshadow, driver,totalvaluetext).sendKeys("1,000");

			if (engagementtype.equalsIgnoreCase("audit") || engagementtype.equalsIgnoreCase("special audit"))
			{
				
				//select shared audit
				act.sendKeys(Keys.TAB).perform();
				act.sendKeys(Keys.TAB).perform();
				Thread.sleep(1000);
				act.sendKeys(Keys.TAB).perform();
				act.sendKeys(Keys.TAB).perform();
				act.sendKeys(Keys.ENTER).perform();
				Thread.sleep(1000);
			}
		
		
		
		//  Select partner detail section
		getShadowElement(partnerdetailsshadow, driver,partnerdetailsdrp).click();
		Thread.sleep(1000);		
		getShadowElement(partnerdetailssvaluehadow, driver,partnerdetailssvaluedrp).click();
		Thread.sleep(1000);
		
		//Adding specific procesdure to be performed
		if (engagementtype.equalsIgnoreCase("special audit"))
		{
			 String[] specificprocedureshadow = {"app-shell","engagements-page-main","new-engagement-view","specific-procedure","paper-icon-button"};		    
			 String specificprocedure="#icon";
			getShadowElement(specificprocedureshadow, driver,specificprocedure).click();
			
			 String[] descriptionshadow = {"app-shell","engagements-page-main","new-engagement-view","specific-procedure","paper-textarea","iron-autogrow-textarea"};		    
			 String description="#textarea";
			getShadowElement(descriptionshadow, driver,description).sendKeys("Test");
			String[] addbtnshadow = {"app-shell","engagements-page-main","new-engagement-view","specific-procedure","dialog-element"};		    
			 String addbtn="#buttons > paper-button.btn-confirm.right";
			 
			 
			getShadowElement(addbtnshadow, driver,addbtn).click();
		}
		
		
		
		//Add staff team members
		getShadowElement(addstaffcheckboxshadow, driver,addstaffcheckbox).click();
		Thread.sleep(2000);
			//click create button
		getShadowElement(clickcreatebtnshadow, driver,createbtn).click();
		Thread.sleep(5000);

		
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
		
}	
	
public void addMicroAssesmentNewEngagement(String purchaseorder)
{
	try {
		//driver.findelement(by.csspath()).click;
		//driver=driver;
		Thread.sleep(1000);
		//getShadowElement(purchaseordershadow, driver,purchaseordernametxt).sendKeys(purchaseorder);
		
		driver.findElement(By.cssSelector(purchaseordernametxt)).sendKeys(purchaseorder);
		 act= new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		getShadowElement(poitemshadow, driver,poitemdrp).click();
		Thread.sleep(1000);
		//Select value from the PO Item
		act.sendKeys(Keys.TAB).perform();//
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();//
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();//
		Thread.sleep(1000);
		
		//Getting current date
		Date dNow = new Date( );
		SimpleDateFormat ft =new SimpleDateFormat ("dd MMM yyyy");
		System.out.println("Current Date: " + ft.format(dNow));
		System.out.println("Current Date: " + ft.format(dNow).toString());		
	
		//#  Click on engagementType Drop downbox
		getShadowElement(engagementtypeshadow, driver,engagmenttypedrp).click();
		Thread.sleep(1000);
		//Select Engagement Value		
		getShadowElement(engagementvalueshadow, driver,engagmentvaluedrp).click();		
		Thread.sleep(1000);
		
		//select shared audit
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();
		//act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		//Date Ip was contacted date selection	
		
		getShadowElement(datipwascontactshadow,driver,datipwascontact).click();		
		getShadowElement(datipwascontactshadow,driver,dateokbtn).click();
		
		//  Select partner detail section
		getShadowElement(partnerdetailsshadow, driver,partnerdetailsdrp).click();
		Thread.sleep(1000);		
		getShadowElement(partnerdetailssvaluehadow, driver,partnerdetailssvaluedrp).click();
		Thread.sleep(1000);
		//Add staff team members
		getShadowElement(addstaffcheckboxshadow, driver,addstaffcheckbox).click();
		Thread.sleep(2000);
			//click create button
		getShadowElement(clickcreatebtnshadow, driver,createbtn).click();
		Thread.sleep(5000);

		
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
		
}


public void addSpecialAuditNewEngagement(String purchaseorder)
{
	try {
		//driver.findelement(by.csspath()).click;
		//driver=driver;
		Thread.sleep(1000);
		getShadowElement(purchaseordershadow, driver,purchaseordernametxt).sendKeys(purchaseorder);
		 act= new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		getShadowElement(poitemshadow, driver,poitemdrp).click();
		Thread.sleep(1000);
		//Select value from the PO Item
		act.sendKeys(Keys.TAB).perform();//
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();//
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();//
		Thread.sleep(1000);
		
		//Getting current date
		Date dNow = new Date( );
		SimpleDateFormat ft =new SimpleDateFormat ("dd MMM yyyy");
		System.out.println("Current Date: " + ft.format(dNow));
		System.out.println("Current Date: " + ft.format(dNow).toString());		
	
		//#  Click on engagementType Drop downbox
		getShadowElement(engagementtypeshadow, driver,engagmenttypedrp).click();
		Thread.sleep(1000);
		//Select Engagement Value		
		getShadowElement(engagementvalueshadow, driver,engagmentvaluespecialauditdrp).click();		
		Thread.sleep(1000);
		
		//select shared audit
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();
		//act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		//Date Ip was contacted date selection	
		
		getShadowElement(datipwascontactshadow,driver,datipwascontact).click();		
		getShadowElement(datipwascontactshadow,driver,dateokbtn).click();
		
		//  Select partner detail section
		getShadowElement(partnerdetailsshadow, driver,partnerdetailsdrp).click();
		Thread.sleep(1000);		
		getShadowElement(partnerdetailssvaluehadow, driver,partnerdetailssvaluedrp).click();
		Thread.sleep(1000);
		//Add staff team members
		getShadowElement(addstaffcheckboxshadow, driver,addstaffcheckbox).click();
		Thread.sleep(2000);
			//click create button
		getShadowElement(clickcreatebtnshadow, driver,createbtn).click();
		Thread.sleep(5000);

		
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
		
}



//******* To  be delete ***********************************
	
public  WebElement getShadowElement(String [] shadowroot, WebDriver driver,String element) {
			
			WebElement shadowElement=null;
			WebElement rootElement =null;
			int noofshadowroots = shadowroot.length;
			
			for (int loop=0;loop<=noofshadowroots-1;loop++)
			{
				if (loop==0)
				{
				 rootElement = driver.findElement(By.tagName(shadowroot[0]));
				}
				else
				{
				 rootElement = shadowElement.findElement(By.cssSelector(shadowroot[loop]));
				}
			shadowElement = (WebElement) ((JavascriptExecutor) driver)
						.executeScript("return arguments[0].shadowRoot",rootElement);
			
				}
			
			return shadowElement.findElement(By.cssSelector(element));
		}		
		



/*		
public void addAuditNewEngagement(String purchaseorder)
{
	try {
		//driver.findelement(by.csspath()).click;
		//driver=driver;
		Thread.sleep(1000);
		getShadowElement(purchaseordershadow, driver,purchaseordernametxt).sendKeys(purchaseorder);
		 act= new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		getShadowElement(poitemshadow, driver,poitemdrp).click();
		Thread.sleep(1000);
		//Select value from the PO Item
		act.sendKeys(Keys.TAB).perform();//
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();//
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();//
		Thread.sleep(1000);
		
		//Getting current date
		Date dNow = new Date( );
		SimpleDateFormat ft =new SimpleDateFormat ("dd MMM yyyy");
		System.out.println("Current Date: " + ft.format(dNow));
		System.out.println("Current Date: " + ft.format(dNow).toString());
		
		//passing the current for one control using tab
		act.sendKeys(ft.format(dNow).toString());
		Thread.sleep(1000);
		//click Engagement  type
		act.sendKeys(Keys.TAB).perform();//
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();//
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();//
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		// click on period start date

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		Date date = cal.getTime();       
	//	SimpleDateFormat format1 = new SimpleDateFormat("dd MMM yyyy");
		String periodstartdate = ft.format(date); 
		System.out.println(periodstartdate);
		act.sendKeys(Keys.TAB).perform();//
		Thread.sleep(1000);		
	
		
		//click on period start date..calender
		getShadowElement(peridostartdateshadow,driver,peridostartdateshadowtext).click();			    
		//getShadowElement(dateselectshadow,driver,"div[date='2019-04-25']").click();
		WebElement e1 = driver.findElement(By.cssSelector("body > etools-datepicker:nth-child(3)"));
		WebElement eh1 = expandRootElement(e1, driver);
		//Click the OK Button in calender
		eh1.findElement(By.cssSelector("#dialog > div > paper-button:nth-child(3)")).click();
		Thread.sleep(1000);
		
// Click on period end date	
		getShadowElement(periodenddateshadow, driver,periodenddatetext).click();

		//Click OK button
		WebElement e2 = driver.findElement(By.cssSelector("body > etools-datepicker:nth-child(4)"));
		WebElement eh2 = expandRootElement(e2, driver);//returns shadow root
		eh2.findElement(By.cssSelector("#dialog > div > paper-button:nth-child(3)")).click();//click ok button
		
			getShadowElement(totalvalueshadow, driver,totalvaluetext).clear();
			getShadowElement(totalvalueshadow, driver,totalvaluetext).sendKeys("1,000");

			//select shared audit
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);
	

		//  Select partner detail section
			getShadowElement(partnerdetailsshadow, driver,partnerdetailsdrp).click();
			Thread.sleep(1000);		
			getShadowElement(partnerdetailssvaluehadow, driver,partnerdetailssvaluedrp).click();
			Thread.sleep(1000);
			
			//Add staff team members

			getShadowElement(addstaffcheckboxshadow, driver,addstaffcheckbox).click();
			Thread.sleep(2000);
			//click create button

			String[] clickcreatebtn = {"app-shell","engagements-page-main","new-engagement-view","status-tab-element","action-buttons"};		    
			getShadowElement(clickcreatebtnshadow, driver,createbtn).click();

			Thread.sleep(1000);

		
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
		
}
*/	
}

