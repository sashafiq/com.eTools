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

public class AddNewAssessmentPage extends TestBase {


private String[] addnewengagementshadow = {"app-shell","engagements-page-main","engagements-list-view","pages-header-element"};
private String addnewengagementbtn="div > div > div > paper-button.add-btn > a";

//private String addnewengagementbtn="#listPage > pages-header-element > div > div > div > paper-button.add-btn.style-scope.pages-header-element.x-scope.paper-button-0 > a";
//private String addnewengagementbtn= "div > div > div > paper-button.add-btn > a";
private String[] purchaseordershadow = {"app-shell","engagements-page-main","new-engagement-view","engagement-info-details","paper-input"};    
//private String purchaseordernametxt="#input";
// private String purchaseordernametxt="#purchaseOrder";
private String purchaseordernametxt="#input-6 > input";
//private String[] poitemshadow = {"app-shell","engagements-page-main","new-engagement-view","engagement-info-details","etools-searchable-multiselection-menu","paper-icon-button"};    
// private String poitemdrp="#icon";
private String[] poitemshadow = {"app-shell","engagements-page-main","new-engagement-view","engagement-info-details","etools-dropdown"};
private String poitemdrp="#main > iron-icon";
private Actions act;

private String[] peridostartdateshadow = {"app-shell","engagements-page-main","new-engagement-view","engagement-info-details","datepicker-lite"};    
private String peridostartdateshadowtext ="#dateDisplayinputContainer > iron-icon";
private String[] dateselectshadow = {"etools-datepicker","paper-date-picker","paper-calendar"};

private String[] periodenddateshadow={"app-shell","engagements-page-main","new-engagement-view","engagement-info-details"};    
private String periodenddatetext="#periodEndDateInput";

private String[] totalvalueshadow = {"app-shell","engagements-page-main","new-engagement-view","engagement-info-details","etools-currency-amount-input","paper-input"};    
private String[] addstaffcheckboxshadow = {"app-shell","engagements-page-main","new-engagement-view","engagement-staff-members-tab"};    


private String totalvaluetext="#input-31 > input";
private String addstaffcheckbox="etools-content-panel > div.panel-content.group > list-element:nth-child(4) > div.checkbox > paper-checkbox";


private String[] clickcreatebtnshadow = {"app-shell","#engagements","#creationPage","#sidebar > status-tab-element","etools-content-panel > div.status-buttons > action-buttons"};    
private String createbtn="paper-button";

private String[] engagementtitleshadow = {"app-shell","audits-page-main","pages-header-element"};    
private String engagementtitle="div > div > span";

private String[] engagementtitlemicroshadow = {"app-shell","micro-assessments-page-main","pages-header-element"};
String [] engagementtypeshadow={"app-shell","engagements-page-main","new-engagement-view","engagement-info-details","etools-dropdown"};    


private String[] engagementtitlespotcheckshadow={"app-shell","spot-checks-page-main","pages-header-element"};

private String[] engagementtitlespecilauditshadow={"app-shell","special-audits-page-main","pages-header-element"};
//#engagementType
//private String engagmenttypedrp="#icon";
private String engagmenttypedrp="#input-24 > input";

// private String [] engagementvalueshadow={"app-shell","engagements-page-main","new-engagement-view","engagement-info-details","#engagementType"};

private String [] engagementvalueshadow={"app-shell","engagements-page-main","new-engagement-view","partner-details-tab","etools-dropdown"};

private String engagmentvaluedrp="#dropdownMenu > div > div.list-wrapper.no-search > paper-listbox > paper-item:nth-child(2) > span";

private String engagmentvaluespotcheckdrp="#dropdownMenu > div > div.list-wrapper.no-search > paper-listbox > paper-item:nth-child(3) > span";
//private String engagmentvalueauditdrp="#dropdownMenu > div > div.list-wrapper.no-search > paper-listbox > paper-item:nth-child(1) > span";

private String engagmentvalueauditdrp="paper-listbox > paper-icon-item:nth-child(1) > paper-item-body > span";


private String engagmentvaluspecialauditdrp="#dropdownMenu > div > div.list-wrapper.no-search > paper-listbox > paper-item:nth-child(4) > span";

private String engagmentvaluespecialauditdrp="#dropdownMenu > div > div.list-wrapper.no-search > paper-listbox > paper-item:nth-child(4) > span";
//Data IP was contacted
//private String[] datipwascontactshadow = {"app-shell","engagements-page-main","new-engagement-view","engagement-info-details","datepicker-lite","calendar-lite"};

private String[] datipwascontactshadow = {"app-shell","engagements-page-main","new-engagement-view","engagement-info-details","datepicker-lite","calendar-lite"};
//private String[] todaysdateshadow = {"app-shell","action-points-page-main","action-points-new","action-point-details","datepicker-lite","calendar-lite"};
private String datipwascontact ="#dateDisplayinputContainer > iron-icon";

private String dateokbtn="#dialog > div > paper-button:nth-child(3)";

//  Select partner detail section
private String [] partnerdetailsshadow={"app-shell","engagements-page-main","new-engagement-view","partner-details-tab","etools-dropdown"};    
private String partnerdetailsdrp="#main > iron-icon";
// Select parrtner details value
private String [] partnerdetailssvaluehadow={"app-shell","engagements-page-main","new-engagement-view","partner-details-tab","#partner"};
private String partnerdetailssvaluedrp="#dropdownMenu > div > div.list-wrapper > paper-listbox > paper-item:nth-child(1) > span";

public AddNewAssessmentPage() throws InterruptedException
{
Thread.sleep(2000);
}

public void clickOnaddnewEngenment() {
try {
//driver.findelement(by.csspath()).click;
//driver=driver;
Thread.sleep(1000);
getShadowElement(addnewengagementshadow,driver, addnewengagementbtn).click();
// driver.findElement(By.cssSelector(addnewengagementbtn)).click();

// getShadowElement(addactionpointbtnshadow,driver,addactionpointbtn).click();;

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
// New engagement for Audit
public void addAuditNewEngagement(String purchaseorder)
{
JavascriptExecutor js = (JavascriptExecutor) driver;
try {

Thread.sleep(1000);
getShadowElement(purchaseordershadow, driver,purchaseordernametxt).sendKeys(purchaseorder);
act= new Actions(driver);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
getShadowElement(poitemshadow, driver,poitemdrp).click();
Thread.sleep(1000);
//Select value from the PO Item
String[] poitemvalueshadow = {"app-shell","#engagements","#creationPage","#engagementDetails","etools-content-panel > div > div:nth-child(3) > etools-dropdown","#optionsList"};
String poitemvalue="paper-listbox > paper-icon-item";
getShadowElement(poitemvalueshadow, driver,poitemvalue).click();
Thread.sleep(1000);
//Click Date Ip Calender
String[] dateipshadow = {"app-shell","#engagements","#creationPage","#engagementDetails","#contactedDateInput"};
String dateipvalue="#dateDisplayinputContainer";
getShadowElement(dateipshadow, driver,dateipvalue).click();
Thread.sleep(3000);
//Select Date IP
String[] todaysdateshadow = {"app-shell","#engagements","#creationPage","#engagementDetails","#contactedDateInput","#calendar"};
String todaysdate="div.dateSticker.today";
getShadowElement(todaysdateshadow, driver,todaysdate).click();
Thread.sleep(1000);
//Click on Engagement Type - Audit
String[] audittypevalueshadow={"app-shell","engagements-page-main","new-engagement-view","engagement-info-details"};
String audittypevalue="#engagementType";
getShadowElement(audittypevalueshadow, driver,audittypevalue).click();
Thread.sleep(1000);
//Select Enagement type audit
String[] engagementtypevalueshadow={"app-shell","#engagements","#creationPage","#engagementDetails","#engagementType","#optionsList"};
String engagmenttypevaluedrp="paper-listbox > paper-icon-item:nth-child(1)";

getShadowElement(engagementtypevalueshadow, driver,engagmenttypevaluedrp).click();
Thread.sleep(1000);
// Focus on  Engagement type
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(audittypevalueshadow, driver,audittypevalue));
Thread.sleep(1000);

//Click Period Start Calender
String[] startdateshadow = {"app-shell","#engagements","#creationPage","#engagementDetails","#periodStartDateInput"};
String stardate="#dateDisplayinputContainer";
getShadowElement(startdateshadow, driver,stardate).click();
Thread.sleep(1000);

//Select Period Start Date
String[] periodstartdatevalueshadow={"app-shell","#engagements","#creationPage","#engagementDetails","#periodStartDateInput","#calendar"};
String periodstartdatevalue="div.dateSticker.today";
Thread.sleep(1000);
getShadowElement(periodstartdatevalueshadow, driver,periodstartdatevalue).click();
Thread.sleep(1000);

// Click Period End date
String[] enddateshadow = {"app-shell","#engagements","#creationPage","#engagementDetails","#periodEndDateInput"};
String enddate="#dateDisplayinputContainer";
getShadowElement(enddateshadow, driver,enddate).click();
Thread.sleep(1000);

String[] periodenddatevalueshadow={"app-shell","#engagements","#creationPage","#engagementDetails","#periodEndDateInput","#calendar"};
String periodenddatevalue="div.dateSticker.today";
getShadowElement(periodenddatevalueshadow, driver,periodenddatevalue).click();
Thread.sleep(1000);
 // Enter Text in Total Value
getShadowElement(totalvalueshadow, driver,totalvaluetext).clear();
getShadowElement(totalvalueshadow, driver,totalvaluetext).sendKeys("1,000");
Thread.sleep(3000);
//  Select partner detail section
getShadowElement(partnerdetailsshadow, driver,partnerdetailsdrp).click();
Thread.sleep(1000);
// Select Partner
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
//Add staff team members
String[] auditstaffshadow={"app-shell","#engagements","#creationPage","#staffMembers"};
String auditstaff="etools-content-panel > div.panel-content.group > list-element:nth-child(11) > div.checkbox > paper-checkbox";
// Focus on  hr_staffm-38@yahoo
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(auditstaffshadow, driver,auditstaff));
//Click on Staff -  hr_staffm-38@yahoo.com
getShadowElement(auditstaffshadow, driver,auditstaff).click();
      Thread.sleep(1000);
     // Focus on Create Button
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(clickcreatebtnshadow, driver,createbtn));
Thread.sleep(1000);
getShadowElement(clickcreatebtnshadow, driver,createbtn).click();
Thread.sleep(5000);

} catch (InterruptedException e) {

e.printStackTrace();
}

}

public void addMicroAssesmentNewEngagement(String purchaseorder)
{
JavascriptExecutor js = (JavascriptExecutor) driver;
act= new Actions(driver);
try {

Thread.sleep(1000);
getShadowElement(purchaseordershadow, driver,purchaseordernametxt).sendKeys(purchaseorder);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
//Select PO Item drop down
getShadowElement(poitemshadow, driver,poitemdrp).click();
Thread.sleep(1000);
//Select value from the PO Item
String[] poitemvalueshadow = {"app-shell","#engagements","#creationPage","#engagementDetails","etools-content-panel > div > div:nth-child(3) > etools-dropdown","#optionsList"};
String poitemvalue="paper-listbox > paper-icon-item";
getShadowElement(poitemvalueshadow, driver,poitemvalue).click();
Thread.sleep(1000);
//Click Date Ip Calender
String[] dateipshadow = {"app-shell","#engagements","#creationPage","#engagementDetails","#contactedDateInput"};
String dateipvalue="#dateDisplayinputContainer";
getShadowElement(dateipshadow, driver,dateipvalue).click();
Thread.sleep(3000);
//Select Date IP
String[] todaysdateshadow = {"app-shell","#engagements","#creationPage","#engagementDetails","#contactedDateInput","#calendar"};
String todaysdate="div.dateSticker.today";
getShadowElement(todaysdateshadow, driver,todaysdate).click();
Thread.sleep(1000);
// Click on Engagement Type
String[] engagementtypevalueshadow={"app-shell","engagements-page-main","new-engagement-view","engagement-info-details"};
String engagmenttypevalue="#engagementType";
getShadowElement(engagementtypevalueshadow, driver,engagmenttypevalue).click();
Thread.sleep(1000);
//Select Enagement type Micro assessment
String[] microassesmentshadow={"app-shell","#engagements","#creationPage","#engagementDetails","#engagementType","#optionsList"};
String microassesmentvalue="paper-listbox > paper-icon-item:nth-child(2)";
getShadowElement(microassesmentshadow, driver,microassesmentvalue).click();
Thread.sleep(1000);
//  Select partner detail section
getShadowElement(partnerdetailsshadow, driver,partnerdetailsdrp).click();
Thread.sleep(1000);
   // Select Partner
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
//Add staff team members
String[] auditstaffshadow={"app-shell","#engagements","#creationPage","#staffMembers"};
String auditstaff="etools-content-panel > div.panel-content.group > list-element:nth-child(11) > div.checkbox > paper-checkbox";
   js.executeScript("arguments[0].scrollIntoView();", getShadowElement(auditstaffshadow, driver,auditstaff));
// Select  hr_staffm-38@yahoo Audit staff checkbox
   getShadowElement(auditstaffshadow, driver,auditstaff).click();
   Thread.sleep(1000);
// Select focus on create button  
   js.executeScript("arguments[0].scrollIntoView();", getShadowElement(clickcreatebtnshadow, driver,createbtn));
// Click on Create buton
   getShadowElement(clickcreatebtnshadow, driver,createbtn).click();
Thread.sleep(5000);

} catch (InterruptedException e) {

e.printStackTrace();
}

}


public void addSpecialAuditNewEngagement(String purchaseorder)
{
JavascriptExecutor js = (JavascriptExecutor) driver;
act= new Actions(driver);
try {
Thread.sleep(1000);
// Select Purchase Order
getShadowElement(purchaseordershadow, driver,purchaseordernametxt).sendKeys(purchaseorder);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
// Select PO Item drop down box
getShadowElement(poitemshadow, driver,poitemdrp).click();
Thread.sleep(1000);
//Select value from the PO Item
String[] poitemvalueshadow = {"app-shell","#engagements","#creationPage","#engagementDetails","etools-content-panel > div > div:nth-child(3) > etools-dropdown","#optionsList"};
String poitemvalue="paper-listbox > paper-icon-item";
getShadowElement(poitemvalueshadow, driver,poitemvalue).click();
Thread.sleep(1000);
//Select Data Ip Contacted
String[] dateipshadow = {"app-shell","#engagements","#creationPage","#engagementDetails","#contactedDateInput"};
String dateipvalue="#dateDisplayinputContainer";
getShadowElement(dateipshadow, driver,dateipvalue).click();
Thread.sleep(3000);
// Select Date from Date IP
String[] todaysdateshadow = {"app-shell","#engagements","#creationPage","#engagementDetails","#contactedDateInput","#calendar"};
String todaysdate="div.dateSticker.today";
getShadowElement(todaysdateshadow, driver,todaysdate).click();
Thread.sleep(1000);
// Select Engagement type drp down
String[] engagementtypedrpshadow={"app-shell","engagements-page-main","new-engagement-view","engagement-info-details"};
String engagementtypedrpvalue="#engagementType";
getShadowElement(engagementtypedrpshadow, driver,engagementtypedrpvalue).click();
Thread.sleep(1000);
// Select Special Audit value

String[] engagementtypevalueshadow={"app-shell","#engagements","#creationPage","#engagementDetails","#engagementType","#optionsList"};
String engagmenttypevaluedrp="paper-listbox > paper-icon-item:nth-child(4)";
getShadowElement(engagementtypevalueshadow, driver,engagmenttypevaluedrp).click();
Thread.sleep(1000);
// Focus on  Engagement type
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(engagementtypedrpshadow, driver,engagementtypedrpvalue));
Thread.sleep(1000);
//Click Period Start Calender
String[] startdateshadow = {"app-shell","#engagements","#creationPage","#engagementDetails","#periodStartDateInput"};
String stardate="#dateDisplayinputContainer";
getShadowElement(startdateshadow, driver,stardate).click();
Thread.sleep(1000);
//Select Period Start Date
String[] periodstartdatevalueshadow={"app-shell","#engagements","#creationPage","#engagementDetails","#periodStartDateInput","#calendar"};
String periodstartdatevalue="div.dateSticker.today";
   getShadowElement(periodstartdatevalueshadow, driver,periodstartdatevalue).click();
Thread.sleep(1000);
// Click Period End date
String[] enddateshadow = {"app-shell","#engagements","#creationPage","#engagementDetails","#periodEndDateInput"};
String enddate="#dateDisplayinputContainer";
getShadowElement(enddateshadow, driver,enddate).click();
Thread.sleep(1000);

 // Select Period End value
String[] periodenddatevalueshadow={"app-shell","#engagements","#creationPage","#engagementDetails","#periodEndDateInput","#calendar"};
String periodenddatevalue="div.dateSticker.today";
getShadowElement(periodenddatevalueshadow, driver,periodenddatevalue).click();
Thread.sleep(1000);
// Enter value in Total value text field
getShadowElement(totalvalueshadow, driver,totalvaluetext).clear();
getShadowElement(totalvalueshadow, driver,totalvaluetext).sendKeys("1,000");
Thread.sleep(3000);
//  Select partner detail section
getShadowElement(partnerdetailsshadow, driver,partnerdetailsdrp).click();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
// Click on Specific procedure button
String[] specificprocedureshadow={"app-shell","#engagements","#creationPage","#specificProcedures"};
String specificprocedurebtn="etools-content-panel > div > div > paper-icon-button";
getShadowElement(specificprocedureshadow, driver,specificprocedurebtn).click();
Thread.sleep(1000);
// Enter text in Description
String[] descriptionshadow={"app-shell","#engagements","#creationPage","#specificProcedures","etools-dialog:nth-child(4) > div > div > div > div > paper-textarea","#input-33"};
String descriptiontext="#textarea";
getShadowElement(descriptionshadow, driver,descriptiontext).clear();
getShadowElement(descriptionshadow, driver,descriptiontext).sendKeys("Test");
Thread.sleep(1000);
// Click on Add button
String[] addbuttomshadow={"app-shell","#engagements","#creationPage","#specificProcedures","etools-dialog:nth-child(4)"};
String addbutton="#dialog > div > paper-button.confirm-btn";

getShadowElement(addbuttomshadow, driver,addbutton).click();
Thread.sleep(2000);
//Add staff team members
String[] auditstaffshadow={"app-shell","#engagements","#creationPage","#staffMembers"};
String auditstaff="etools-content-panel > div.panel-content.group > list-element:nth-child(11) > div.checkbox > paper-checkbox";
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(auditstaffshadow, driver,auditstaff));
getShadowElement(auditstaffshadow, driver,auditstaff).click();
   Thread.sleep(1000);
// Focus on Create button and Click on create button
   js.executeScript("arguments[0].scrollIntoView();", getShadowElement(clickcreatebtnshadow, driver,createbtn));
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


public void addSpotCheckEngagement(String purchaseorder)
{
JavascriptExecutor js = (JavascriptExecutor) driver;
try {
Thread.sleep(1000);
// Enter Pusrchase Order
getShadowElement(purchaseordershadow, driver,purchaseordernametxt).sendKeys(purchaseorder);
act= new Actions(driver);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
// Select PO Item drp down
getShadowElement(poitemshadow, driver,poitemdrp).click();
Thread.sleep(1000);
//Select value from the PO Item

String[] poitemvalueshadow = {"app-shell","#engagements","#creationPage","#engagementDetails","etools-content-panel > div > div:nth-child(3) > etools-dropdown","#optionsList"};
String poitemvalue="paper-listbox > paper-icon-item";
getShadowElement(poitemvalueshadow, driver,poitemvalue).click();
Thread.sleep(1000);
//Click Date Ip Calender
String[] dateipshadow = {"app-shell","#engagements","#creationPage","#engagementDetails","#contactedDateInput"};
String dateipvalue="#dateDisplayinputContainer";
getShadowElement(dateipshadow, driver,dateipvalue).click();
Thread.sleep(3000);
// Select Date Ip
String[] todaysdateshadow = {"app-shell","#engagements","#creationPage","#engagementDetails","#contactedDateInput","#calendar"};
String todaysdate="div.dateSticker.today";
getShadowElement(todaysdateshadow, driver,todaysdate).click();
Thread.sleep(1000);
// Click Engagement Type
String[] engagementtypeshadow={"app-shell","engagements-page-main","new-engagement-view","engagement-info-details"};
String engagementtypevalue="#engagementType";
getShadowElement(engagementtypeshadow, driver,engagementtypevalue).click();
Thread.sleep(1000);
// Select Spot check engagement Type
String[] engagementtypevalueshadow={"app-shell","#engagements","#creationPage","#engagementDetails","#engagementType","#optionsList"};
String engagmenttypevaluedrp="paper-listbox > paper-icon-item:nth-child(3)";

getShadowElement(engagementtypevalueshadow, driver,engagmenttypevaluedrp).click();
Thread.sleep(1000);
// Focus on  Engagement type
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(poitemshadow, driver,poitemdrp));
Thread.sleep(1000);
//Click Period Start Calender
String[] startdateshadow = {"app-shell","#engagements","#creationPage","#engagementDetails","#periodStartDateInput"};
String stardate="#dateDisplayinputContainer";
getShadowElement(startdateshadow, driver,stardate).click();
Thread.sleep(1000);
//Select Period Start Date
String[] periodstartdatevalueshadow={"app-shell","#engagements","#creationPage","#engagementDetails","#periodStartDateInput","#calendar"};
String periodstartdatevalue="div.dateSticker.today";
getShadowElement(periodstartdatevalueshadow, driver,periodstartdatevalue).click();
Thread.sleep(1000);
// Click Period End date
String[] enddateshadow = {"app-shell","#engagements","#creationPage","#engagementDetails","#periodEndDateInput"};
String enddate="#dateDisplayinputContainer";
getShadowElement(enddateshadow, driver,enddate).click();
Thread.sleep(1000);
//Select Perido End value
String[] periodenddatevalueshadow={"app-shell","#engagements","#creationPage","#engagementDetails","#periodEndDateInput","#calendar"};
String periodenddatevalue="div.dateSticker.today";
getShadowElement(periodenddatevalueshadow, driver,periodenddatevalue).click();
Thread.sleep(1000);
// Enter value in Total value text field.
getShadowElement(totalvalueshadow, driver,totalvaluetext).clear();
getShadowElement(totalvalueshadow, driver,totalvaluetext).sendKeys("1,000");
Thread.sleep(3000);
//  Select partner detail section
getShadowElement(partnerdetailsshadow, driver,partnerdetailsdrp).click();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
//Add staff team members
String[] auditstaffshadow={"app-shell","#engagements","#creationPage","#staffMembers"};
String auditstaff="etools-content-panel > div.panel-content.group > list-element:nth-child(11) > div.checkbox > paper-checkbox";
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(auditstaffshadow, driver,auditstaff));
getShadowElement(auditstaffshadow, driver,auditstaff).click();
    Thread.sleep(1000);
  // Click on Create Button
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(clickcreatebtnshadow, driver,createbtn));
getShadowElement(clickcreatebtnshadow, driver,createbtn).click();
Thread.sleep(5000);
getShadowElement(clickcreatebtnshadow, driver,createbtn).click();
Thread.sleep(5000);

} catch (InterruptedException e) {

e.printStackTrace();
}

}

}
