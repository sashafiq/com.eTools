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

public class PSEAFollowupPage extends TestBase {

Actions act;
private String actionpointbtn="#icon";
private String[] actionpointshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > follow-up-page","etools-content-panel > div > paper-icon-button"};    

private String description="#textarea";
private String[] descriptionshadow = {"follow-up-dialog","#descriptionInput","#input-34"};    
//private String[] descriptionshadow = {"follow-up-dialog","#descriptionInput","#input-20"};    
private String assigned="#main > iron-icon";

private String[] assignedshadow = {"follow-up-dialog","#assignedToInput"};    

private String section="#main > iron-icon";
private String[] sectionshadow = {"follow-up-dialog","#sectionInput"};    
private String office="#main > iron-icon";
private String[] officeshadow = {"follow-up-dialog","#officeInput"};    
private String duedate="#dateDisplayinputContainer > iron-icon";
private String[] duedateshadow = {"follow-up-dialog","#dueDateInput"};    
private String addbtn="#dialog > div > paper-button.confirm-btn";
private String[] addbtnshadow = {"follow-up-dialog","etools-dialog"};

private String submitbtn="paper-button.primary.right-icon";
private String[] submitbtnshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","page-content-header > div > assessment-status-transition-actions"};
private String[] yesbtnshadow = {"etools-dialog"};    
private String yesbtn = "#dialog > div > paper-button.confirm-btn";

private String finalizebtn="paper-button.success.right-icon";
private String[] finalizebtnshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","page-content-header > div > assessment-status-transition-actions"};

private String Actionpoint="table > tbody > tr > td:nth-child(1) > a";

private String[] Actionpointshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > follow-up-page","etools-content-panel > etools-table"};



public PSEAFollowupPage() throws InterruptedException
{
Thread.sleep(2000);
}

public void createActionPoint() throws InterruptedException
{
JavascriptExecutor js = (JavascriptExecutor) driver;
act= new Actions(driver);
getShadowElement(actionpointshadow,driver,actionpointbtn).click();
Thread.sleep(3000);
getShadowElement(descriptionshadow,driver,description).sendKeys("Test");
Thread.sleep(3000);
getShadowElement(assignedshadow,driver,assigned).click();
Thread.sleep(1000);
act.sendKeys("Sajjad Shafiq").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);
getShadowElement(sectionshadow,driver,section).click();
Thread.sleep(1000);
act.sendKeys("Communication").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);
getShadowElement(officeshadow,driver,office).click();
act.sendKeys("Bulawayo").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);
// js.executeScript("arguments[0].scrollIntoView();",  getShadowElement(addbtnshadow, driver,addbtn));
// Thread.sleep(2000);

     getShadowElement(duedateshadow,driver,duedate).click();
    Thread.sleep(2000);
  //  String todaysdate="div.dateSticker.today";
    String todaysdate="#dateContainer > div:nth-child(1) > div:nth-child(4)";
String[] todaysdateshadow = {"follow-up-dialog","#dueDateInput","#calendar"};
    js.executeScript("arguments[0].scrollIntoView();",  getShadowElement(todaysdateshadow, driver,todaysdate));
    Thread.sleep(2000);
  getShadowElement(todaysdateshadow, driver,todaysdate).click();
Thread.sleep(2000);
getShadowElement(addbtnshadow, driver,addbtn).click();
Thread.sleep(4000);
}

public void clickOnsubmitbutton() throws InterruptedException
{
getShadowElement(submitbtnshadow, driver,submitbtn).click();
Thread.sleep(2000);
getShadowElement(yesbtnshadow, driver,yesbtn).click();
Thread.sleep(2000);
}
public void clickOnfinalizebutton() throws InterruptedException
{
String finalizebtn=" paper-button.success.right-icon.responsive";

String[] finalizebtnshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","page-content-header > div > assessment-status-transition-actions"};

getShadowElement(finalizebtnshadow, driver,finalizebtn).click();
Thread.sleep(2000);
getShadowElement(yesbtnshadow, driver,yesbtn).click();
Thread.sleep(2000);
}

public void clickOnfinalizeexternalbutton() throws InterruptedException
{
getShadowElement(finalizebtnshadow, driver,finalizebtn).click();
Thread.sleep(2000);
getShadowElement(yesbtnshadow, driver,yesbtn).click();
Thread.sleep(2000);
}
public void createActionPointAssessingFirm() throws InterruptedException
{
JavascriptExecutor js = (JavascriptExecutor) driver;
act= new Actions(driver);
getShadowElement(actionpointshadow,driver,actionpointbtn).click();
Thread.sleep(3000);
String[] descriptionshadow1 = {"follow-up-dialog","#descriptionInput","#input-21"};    
getShadowElement(descriptionshadow1,driver,description).sendKeys("Test");
Thread.sleep(3000);
getShadowElement(assignedshadow,driver,assigned).click();
Thread.sleep(1000);
act.sendKeys("Sajjad Shafiq").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);
getShadowElement(sectionshadow,driver,section).click();
Thread.sleep(1000);
act.sendKeys("Communication").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);
getShadowElement(officeshadow,driver,office).click();
act.sendKeys("Bulawayo").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);
// js.executeScript("arguments[0].scrollIntoView();",  getShadowElement(addbtnshadow, driver,addbtn));
// Thread.sleep(2000);

     getShadowElement(duedateshadow,driver,duedate).click();
    Thread.sleep(2000);
  //  String todaysdate="div.dateSticker.today";
    String todaysdate="#dateContainer > div:nth-child(1) > div:nth-child(4)";
String[] todaysdateshadow = {"follow-up-dialog","#dueDateInput","#calendar"};
    js.executeScript("arguments[0].scrollIntoView();",  getShadowElement(todaysdateshadow, driver,todaysdate));
    Thread.sleep(2000);
  getShadowElement(todaysdateshadow, driver,todaysdate).click();
Thread.sleep(2000);
getShadowElement(addbtnshadow, driver,addbtn).click();
Thread.sleep(4000);
}
public void createActionPointExternal() throws InterruptedException
{
JavascriptExecutor js = (JavascriptExecutor) driver;
act= new Actions(driver);
getShadowElement(actionpointshadow,driver,actionpointbtn).click();
Thread.sleep(3000);

String[] descriptionshadow1 = {"follow-up-dialog","#descriptionInput","#input-23"};    
getShadowElement(descriptionshadow1,driver,description).sendKeys("Test");
Thread.sleep(3000);
getShadowElement(assignedshadow,driver,assigned).click();
Thread.sleep(1000);
act.sendKeys("Sajjad Shafiq").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);
getShadowElement(sectionshadow,driver,section).click();
Thread.sleep(1000);
act.sendKeys("Communication").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);
getShadowElement(officeshadow,driver,office).click();
act.sendKeys("Bulawayo").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);
// js.executeScript("arguments[0].scrollIntoView();",  getShadowElement(addbtnshadow, driver,addbtn));
// Thread.sleep(2000);

     getShadowElement(duedateshadow,driver,duedate).click();
    Thread.sleep(2000);
  //  String todaysdate="div.dateSticker.today";
    String todaysdate="#dateContainer > div:nth-child(1) > div:nth-child(4)";
String[] todaysdateshadow = {"follow-up-dialog","#dueDateInput","#calendar"};
    js.executeScript("arguments[0].scrollIntoView();",  getShadowElement(todaysdateshadow, driver,todaysdate));
    Thread.sleep(2000);
  getShadowElement(todaysdateshadow, driver,todaysdate).click();
Thread.sleep(2000);
getShadowElement(addbtnshadow, driver,addbtn).click();
Thread.sleep(4000);
}
public void clickOnCreatedActionPoint() throws InterruptedException
{
getShadowElement(Actionpointshadow, driver,Actionpoint).click();
Thread.sleep(2000);

}

}