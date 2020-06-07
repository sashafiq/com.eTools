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

public class PSEAAssessmenttPage extends TestBase {

Actions act;
private String addanewassessmentbtn="#main > iron-icon";
private String[] addanewassessmentbtnshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-details-page","assessment-info","#partner"};    

private String partnerorganization="#input-15 > input";
private String[] partnerorganizationshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-details-page","assessment-info","#partner","#main"};    
private String partnerorganizationval="paper-listbox > paper-icon-item.iron-selected";
private String[] partnerorganizationvalshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-details-page","assessment-info","#partner","#optionsList"};    

private String unicefocalpoint="#labelAndInputContainer";
private String[] unicefocalpointshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-details-page","assessment-info","etools-content-panel > etools-dropdown-multi","#main","#container"};    
private String assesmentdate="div.input-wrapper";
private String[] assesmentdateshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-details-page","assessment-info","#assessmentDate","#dateDisplayinputContainer"};    
private String savebtn="etools-content-panel > div.layout-horizontal.right-align.row-padding-v > paper-button.primary";

private String[] savebtnshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-details-page","assessment-info"};    

private String[] savebtnshadowpostunicef = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-details-page","assessor-info"};    

private String unicefstaff="#main";
private String[] unicefstaffshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-details-page","assessor-info","#unicefUser"};    

private String assessingfirm="etools-content-panel > div:nth-child(3) > paper-radio-group > paper-radio-button:nth-child(2)";
private String[] assessingfirmshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-details-page","assessor-info"};    

private String externalindividual="etools-content-panel > div:nth-child(3) > paper-radio-group > paper-radio-button:nth-child(3)";
private String[] externalindividualshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-details-page","assessor-info"};

private String[] assignbtnshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","page-content-header > div > assessment-status-transition-actions"};    
private String assignbtn = "paper-button.primary.right-icon";    

private String[] yesbtnshadow = {"etools-dialog"};    
private String yesbtn = "#dialog > div > paper-button.confirm-btn";


private String[] questionaryshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","page-content-header > etools-tabs"};    
private String questionarybtn = "#tabs > paper-tab:nth-child(2) > span";

private String[] actionpointheadershadow = {"app-shell","#appHeadLayout > main > assessment-tabs"};    
private String actionpointheader = "page-content-header > h1";

public PSEAAssessmenttPage() throws InterruptedException
{
Thread.sleep(2000);
}

public void createNewAssessment(String sAssessor) {
try {
act= new Actions(driver);
Thread.sleep(1000);
System.out.println("Create NewAssessment Method");
getShadowElement(addanewassessmentbtnshadow,driver,addanewassessmentbtn).click();;
Thread.sleep(1000);
// getShadowElement(partnerorganizationvalshadow,driver,partnerorganizationval).click();;
// Thread.sleep(3000);
// getShadowElement(partnerorganizationvalshadow,driver,partnerorganizationval).click();;
act.sendKeys("263CHAT").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
Thread.sleep(3000);
getShadowElement(unicefocalpointshadow,driver,unicefocalpoint).click();
Thread.sleep(3000);
act.sendKeys("Sajjad Shafiq").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
getShadowElement(assesmentdateshadow,driver,assesmentdate).click();
Thread.sleep(1000);
JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", getShadowElement(assesmentdateshadow,driver,assesmentdate));
String todaysdate="div.dateSticker.today";
String[] todaysdateshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-details-page","assessment-info","#assessmentDate","#calendar"};    
  getShadowElement(todaysdateshadow, driver,todaysdate).click();
Thread.sleep(2000);
getShadowElement(savebtnshadow, driver,savebtn).click();
Thread.sleep(4000);
js.executeScript("arguments[0].scrollIntoView();",  getShadowElement(unicefstaffshadow,driver,unicefstaff));

if (sAssessor == "unicefstaff")
{
getShadowElement(unicefstaffshadow,driver,unicefstaff).click();
Thread.sleep(3000);
act.sendKeys("Sajjad Shafiq").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);
// act.sendKeys(Keys.TAB).perform();
// Thread.sleep(2000);
// act.sendKeys(Keys.TAB).perform();
// Thread.sleep(2000);
getShadowElement(savebtnshadowpostunicef, driver,savebtn).click();
Thread.sleep(4000);
}

else if(sAssessor == "AssessingFirm")
{
System.out.println("Accessing firm");
getShadowElement(assessingfirmshadow,driver,assessingfirm).click();
Thread.sleep(3000);
String ponumber="#input-22 > input";
String[] ponumbershadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-details-page","assessor-info","#assessingFirm","#poNumber"};    
      getShadowElement(ponumbershadow,driver,ponumber).sendKeys("0047035426");
      String getfirmlink="div.layout-horizontal.row-padding-v > paper-button";
String[] getfirmshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-details-page","assessor-info","#assessingFirm"};    
    getShadowElement(getfirmshadow,driver,getfirmlink).click();
    Thread.sleep(6000);
   
getShadowElement(savebtnshadowpostunicef, driver,savebtn).click();
Thread.sleep(4000);
String firmstaff="table > tbody > tr:nth-child(1) > td:nth-child(1) > paper-checkbox";
String[] firmstaffshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-details-page","assessor-info","#firmStaffMembers","etools-content-panel > div.w100 > etools-table"};    
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(firmstaffshadow,driver,firmstaff));
Thread.sleep(2000);
getShadowElement(firmstaffshadow,driver,firmstaff).click();
    Thread.sleep(3000);
 
}
else
{ //External Individual
getShadowElement(externalindividualshadow,driver,externalindividual).click();
Thread.sleep(3000);
String external="#main";
String[] externalshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-details-page","assessor-info","#externalIndividual","#externalIndiv"};    
    getShadowElement(externalshadow,driver,external).click();
    Thread.sleep(3000);
    // String externalval="#input-22";
// String[] externalshadowval = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-details-page","assessor-info","#externalIndividual","#externalIndiv","#searchbox","#searchInput"};    
    //getShadowElement(externalshadowval,driver,externalval).sendKeys("xyz xyz");
    act.sendKeys("HR22 Tester Test").perform();
Thread.sleep(2000);
// act.sendKeys(Keys.TAB).perform();
// Thread.sleep(1000);
// act.sendKeys(Keys.ENTER).perform();
// Thread.sleep(2000);
String externalval="paper-listbox > paper-icon-item:nth-child(2) > paper-item-body > span";
String[] externalshadowval = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-details-page","assessor-info","#externalIndividual","#externalIndiv","#optionsList"};    
    getShadowElement(externalshadowval,driver,externalval).click();
    Thread.sleep(2000);
 
 
getShadowElement(savebtnshadowpostunicef, driver,savebtn).click();
Thread.sleep(4000);
}




} catch (InterruptedException e) {

e.printStackTrace();
}

}


public void assignAssessment() throws InterruptedException
{

JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", getShadowElement(assignbtnshadow, driver,assignbtn));

getShadowElement(assignbtnshadow, driver,assignbtn).click();
Thread.sleep(2000);
getShadowElement(yesbtnshadow, driver,yesbtn).click();
}
public void clickonQuationaryTab() throws InterruptedException
{
  getShadowElement(questionaryshadow, driver,questionarybtn).click();
Thread.sleep(2000);

}
public String getAssessments()
{
String assessment=null;

assessment=getShadowElement(actionpointheadershadow, driver,actionpointheader).getText();
String[] assessmentvalue=assessment.split(":");

return assessmentvalue[0];
}
}