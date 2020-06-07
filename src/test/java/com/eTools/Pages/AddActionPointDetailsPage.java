package com.eTools.Pages;

import java.text.DateFormat;
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

public class AddActionPointDetailsPage extends TestBase {


private String partner="etools-content-panel > div:nth-child(5) > div > paper-input";
private String todaysdate="#dateContainer > div:nth-child(3) > div.dateSticker.today";
private String descriptiontxt="#input-14 > input";
private String[] descriptiontxtshadow = {"app-shell","action-points-page-main","action-points-new","action-point-details","paper-input"};    

private String assigneedrp="#main > iron-icon";
private String[] assigneedrpshadow = {"app-shell","action-points-page-main","action-points-new","action-point-details","etools-dropdown"};    

private String assigneedrpvalue="paper-listbox > paper-icon-item:nth-child(1) > paper-item-body > span";
private String[] assigneedrpvalueshadow = {"app-shell","action-points-page-main","action-points-new","action-points-details","etools-dropdown","esmm-options-list"};    

private String sectionofassigneedrp="etools-content-panel > div:nth-child(6) > div:nth-child(2) > etools-dropdown";
private String[] sectionofassigneedrpshadow = {"app-shell","action-points-page-main","action-points-new","action-point-details","etools-content-panel"};    

private String officeofassigneedrp="etools-content-panel > div:nth-child(6) > div:nth-child(3) > etools-dropdown";
private String[] officeofassigneedrpshadow = {"app-shell","action-points-page-main","action-points-new","action-point-details","etools-content-panel"};    

private String dueondate="#dateDisplayinputContainer > iron-icon";
private String[] dueondateshadow = {"app-shell","action-points-page-main","action-points-new","action-point-details","datepicker-lite"};    
private Actions act;
//private String todaysdate="#dateContainer > div:nth-child(1) > div.dateSticker.today";

private String[] todaysdateshadow = {"app-shell","action-points-page-main","action-points-new","action-point-details","datepicker-lite","calendar-lite"};    
//private Actions act;
// #dateContainer > div:nth-child(5) > div.dateSticker.today


private String createdbtn="paper-button";
private String[] createdbtnshadow = {"app-shell","action-points-page-main","action-points-new","status-element","etools-action-button"};    

private String actionpointmsg="span";
private String[] actionpointmsgshadow = {"app-shell","multi-notification-list","multi-notification-item"};    

private String actionpointOKbutton="paper-button";
private String[] actionpointOKbuttonshadow = {"app-shell","multi-notification-list","multi-notification-item"};    


private String addactionstaken="#icon";
private String[] addactionstakenshadow = {"app-shell","#action-points","iron-pages > action-points-item","#pageContent > action-point-comments","etools-content-panel > div:nth-child(1) > paper-icon-button"};    

private String addactionstext="#input-21 > input";

private String[] addactionstextshadow = {"open-add-comments","#commentDialog > div > div > paper-input"};    

private String savebtn="#dialog > div > paper-button.confirm-btn";

private String[] savebtnshadow = {"open-add-comments","#commentDialog"};  



private String completebtndrp="#icon";
private String[] completebtndrpshadow = {"app-shell","#action-points","iron-pages > action-points-item","#sidebar > status-element","etools-content-panel > div.bottom-container > etools-action-button","paper-button > paper-menu-button > paper-icon-button"};    


private String completebtn="paper-button > paper-menu-button > paper-listbox";
private String[] completebtnshadow = {"app-shell","#action-points","iron-pages > action-points-item","#sidebar > status-element","etools-content-panel > div.bottom-container > etools-action-button"};    



private String actionpointcompletemsg="span";
private String[] actionpointcompletemsgshadow = {"app-shell","multi-notification-list","multi-notification-item"};    


private String test="etools-content-panel > div:nth-child(6) > div:nth-child(1) > etools-dropdown";
private String[] testshadow = {"app-shell","action-points-page-main","action-points-new","action-point-details"};    

private String test1="paper-listbox > paper-icon-item:nth-child(6) > paper-item-body > span";
private String[] test1shadow = {"app-shell","action-points-page-main","action-points-item","action-point-details","etools-dropdown","esmm-options-list"};    


private String partnerdrp="#main > iron-icon";
private String[] partnershadow = {"app-shell","action-points-page-main","iron-pages > action-points-new","#ap-details","etools-content-panel > div:nth-child(3) > div:nth-child(1) > etools-dropdown"};    

private String partnervalue="paper-listbox > paper-icon-item.iron-selected > paper-item-body > span";
private String[] partnervalueshadow = {"app-shell","action-points-page-main","action-points-new","action-points-details","etools-dropdown","esmm-options-list"};    

private String pdssfadrp="#main > iron-icon";
private String[] pdssfashadow = {"app-shell","action-points-page-main","action-points-new","action-points-details","etools-dropdown"};    

private String pdssfadrpvalue="paper-listbox > paper-icon-item.iron-selected > paper-item-body > span";
private String[] pdssfadrpvalueshadow = {"app-shell","action-points-page-main","action-points-new","action-points-details","etools-dropdown","esmm-options-list"};    

private String cpoutputdrp="#main > iron-icon";
private String[] cpoutputdrpshadow = {"app-shell","action-points-page-main","action-points-new","action-points-details","etools-dropdown"};    

private String cpoutputdrpvalue="paper-listbox > paper-icon-item.iron-selected > paper-item-body > span";
private String[] cpoutputdrpvalueshadow = {"app-shell","action-points-page-main","action-points-new","action-points-details","etools-dropdown","esmm-options-list"};    

private String locationdrp="#main > iron-icon";
private String[] locationdrpshadow = {"app-shell","action-points-page-main","action-points-new","action-points-details","etools-dropdown"};    

private String locationdrpvalue="paper-listbox > paper-icon-item.iron-selected > paper-item-body > span";
private String[] locationdrpvalueshadow = {"app-shell","action-points-page-main","action-points-new","action-points-details","etools-dropdown","esmm-options-list"};    

private String sectionassigndrp="#main > iron-icon";
private String[] sectionassigndrpshadow = {"app-shell","action-points-page-main","action-points-new","action-points-details","etools-dropdown"};    

private String sectionassigndrpvalue="paper-listbox > paper-icon-item.iron-selected > paper-item-body > span";
private String[] sectionassigndrpvalueshadow = {"app-shell","action-points-page-main","action-points-new","action-points-details","etools-dropdown","esmm-options-list"};    

private String officeassigndrp="#main > iron-icon";
private String[] officeassigndrpshadow = {"app-shell","action-points-page-main","action-points-new","action-points-details","etools-dropdown"};    

private String officeassigndrpvalue="paper-listbox > paper-icon-item:nth-child(1) > paper-item-body > span";
private String[] officeassigndrpvalueshadow = {"app-shell","action-points-page-main","action-points-new","action-points-details","etools-dropdown","esmm-options-list"};    

public AddActionPointDetailsPage() throws InterruptedException
{

Thread.sleep(2000);
}

public void createActionPoint() {
try {

Thread.sleep(1000);
//Click on Partner dropdown
getShadowElement(partnershadow, driver,partnerdrp).click();
act= new Actions(driver);
act.sendKeys("ACTION 24").perform();
Thread.sleep(2000);
// act.sendKeys(Keys.TAB).perform();
// Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);

// getShadowElement(partnervalueshadow, driver,partnervalue).click();
//Click on PD/SSFA dropdown
// getShadowElement(pdssfashadow, driver,pdssfadrp).click();
act.sendKeys(Keys.TAB).perform();
// act.sendKeys(Keys.ENTER).perform();
act.sendKeys("GREEN SCHOOLS PROGRAM 2018-2019").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);

//Click on PD/SSFA value
//getShadowElement(pdssfadrpvalueshadow, driver,pdssfadrpvalue).click();
//Click on CP Output dropdown
//getShadowElement(cpoutputdrpshadow, driver,cpoutputdrp).click();
act.sendKeys(Keys.TAB).perform();
act.sendKeys("Output: OUTP 7.1: POVERTY & SOCIAL INCLUSION").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
//Click on Partner
// getShadowElement(cpoutputdrpvalueshadow, driver,cpoutputdrpvalue).click();
//Click on Location dropdown
act.sendKeys(Keys.TAB).perform();
//getShadowElement(locationdrpshadow, driver,locationdrp).click();
act.sendKeys("Bulawayo [Province - ZW10]").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
//Click on Location dropdown
//getShadowElement(locationdrpvalueshadow, driver,locationdrpvalue).click();

//Enter Text in Description
getShadowElement(descriptiontxtshadow, driver,descriptiontxt).sendKeys("ActionPoint");


//Click on Assignee

//
//Select Section of Assignee
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys("Sajjad Shafiq").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
//Select office of Assignee
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys("Child Protection").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys("Bulawayo").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
// High priority Check box
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
/*
getShadowElement(assigneedrpshadow, driver,assigneedrp).click();
//Select Assignee drop down value
//getShadowElement(assigneedrpvalueshadow, driver,assigneedrpvalue).click();
//Click on Section on Assignee
getShadowElement(sectionassigndrpshadow, driver,sectionassigndrp).click();
//Select Assignee drop down value
//getShadowElement(sectionassigndrpvalueshadow, driver,sectionassigndrpvalue).click();

//Click on Office of Assignee
getShadowElement(officeassigndrpshadow, driver,officeassigndrp).click();
//Select Office of Assignee drop down value
getShadowElement(officeassigndrpvalueshadow, driver,officeassigndrpvalue).click();
*/

//

//Select Due Date
getShadowElement(dueondateshadow, driver,dueondate).click();
Thread.sleep(1000);
act.sendKeys(Keys.PAGE_DOWN).perform();
Thread.sleep(1000);

java.util.Date date= new Date();
DateFormat dateFormat = new SimpleDateFormat("dd");
String todaydate= dateFormat.format(date);
System.out.println(todaydate);

// if todaydate
//  String todaysdate="#dateContainer > div:nth-child(1) > div.dateSticker.today";
String todaysdate="div.dateSticker.today";
getShadowElement(todaysdateshadow, driver,todaysdate).click();
Thread.sleep(1000);
//getShadowElement(officeofassigneedrpshadow, driver,officeofassigneedrp).click();
//click on period start date..calender

//WebElement e1 = driver.findElement(By.cssSelector("body > etools-datepicker:nth-child(3)"));
//WebElement eh1 = expandRootElement(e1, driver);
//Click the OK Button in calender
// String date="#dateContainer > div:nth-child(4) > div.dateSticker.today";
// String[] dateshadow1 = {"app-shell","action-points-page-main","action-points-new","action-point-details","datepicker-lite","calendar-lite"};    
// getShadowElement(dateshadow1, driver,date).click();

Thread.sleep(1000);

getShadowElement(createdbtnshadow, driver,createdbtn).click();
Thread.sleep(8000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,5000)");
Actions act1= new Actions(driver);
act1.sendKeys(Keys.PAGE_DOWN).perform();

} catch (InterruptedException e) {

e.printStackTrace();
}

}

public String getActionPointSaveMsg() throws InterruptedException {
String actionpointsavemsg=getShadowElement(actionpointmsgshadow, driver,actionpointmsg).getText();
getShadowElement(actionpointOKbuttonshadow, driver,actionpointOKbutton).click();
Thread.sleep(3000);
// JavascriptExecutor js = (JavascriptExecutor) driver;
// js.executeScript("window.scrollBy(0,1000)");
// Actions act1= new Actions(driver);
// act1.sendKeys(Keys.PAGE_DOWN).perform();
// Actions act= new Actions(driver);
// for (int i=1;i<=34;i++)
// {
// act.sendKeys(Keys.TAB).perform();
// Thread.sleep(800);
// }
return actionpointsavemsg;

}

public void AddActionsTaken() throws InterruptedException {
Thread.sleep(1000);
//JavascriptExecutor js = (JavascriptExecutor) driver;
// js.executeScript("window.scrollBy(0,5000)");
//Actions act1= new Actions(driver);
//// act1.sendKeys(Keys.PAGE_DOWN).perform();
Thread.sleep(1000);
   JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", getShadowElement(addactionstakenshadow, driver,addactionstaken));
       Thread.sleep(1000);
getShadowElement(addactionstakenshadow, driver,addactionstaken).click();
Thread.sleep(1000);
getShadowElement(addactionstextshadow, driver,addactionstext).sendKeys("Test");
Thread.sleep(1000);
getShadowElement(savebtnshadow, driver,savebtn).click();
Thread.sleep(1000);

}
public void CompleteActionPoint() throws InterruptedException {
getShadowElement(completebtndrpshadow, driver,completebtndrp).click();
Thread.sleep(1000);
// Actions act2= new Actions(driver);
//act2.sendKeys(Keys.ENTER).perform();
getShadowElement(completebtnshadow, driver,completebtn).click();


Thread.sleep(1000);
}
public String getActionPointCompleteMsg() {
String actionpointcompletemessage=getShadowElement(actionpointcompletemsgshadow, driver,actionpointcompletemsg).getText();
return actionpointcompletemessage;

}
}
