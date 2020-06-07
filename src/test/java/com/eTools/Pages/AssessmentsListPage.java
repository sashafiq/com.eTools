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

public class AssessmentsListPage extends TestBase {


private String addanewassessmentbtn="page-content-header > div > div:nth-child(2) > paper-button";
private String[] addanewassessmentbtnshadow = {"app-shell","#appHeadLayout > main > assessments-list"};    

private String search="#input-7 > input[type=search]";
private String[] searchshadow = {"app-shell","#appHeadLayout > main > assessments-list","section.elevation.page-content.filters > etools-filters","#filters > paper-input"};    

public AssessmentsListPage() throws InterruptedException
{
Thread.sleep(2000);
}

public void clickOnaddNewAssessment() {
try {

Thread.sleep(1000);
System.out.println("Click on add action point");
getShadowElement(addanewassessmentbtnshadow,driver,addanewassessmentbtn).click();
Thread.sleep(4000);
// JavascriptExecutor js = (JavascriptExecutor) driver;
// js.executeScript("window.scrollBy(0,5000)");
} catch (InterruptedException e) {

e.printStackTrace();
}

}

    public void searchClickAssessment(String assessment) throws InterruptedException
    {
    getShadowElement(searchshadow,driver,search).clear();
    getShadowElement(searchshadow,driver,search).sendKeys(assessment);
    Thread.sleep(5000);
     String referencelink="table > tbody > tr:nth-child(1) > td:nth-child(1) > a";
     String[] referencelinkshadow = {"app-shell","#appHeadLayout > main > assessments-list","section.elevation.page-content.no-padding > etools-table"};    

    getShadowElement(referencelinkshadow,driver,referencelink).click();
    Thread.sleep(6000);
    }
   
   
    public void ClickAssessment(String assessment) {
//String[] text1 = null;
Actions act = new Actions(driver);
JavascriptExecutor js = (JavascriptExecutor) driver;
try {
System.out.println("Assessment newly created:"+assessment);
// String[] nextbuttonshadow = {"app-shell","#appHeadLayout > main > assessments-list","section.elevation.page-content.no-padding > etools-table","table > tbody > tr:nth-child(16) > td > etools-pagination","span:nth-child(2) > paper-dropdown-menu"};    
// String nextbutton="#menuButton > div > paper-input > iron-icon";
// table > tbody > tr:nth-child(16) > td > etools-pagination
// JavascriptExecutor js = (JavascriptExecutor) driver;
  //  js.executeScript("arguments[0].scrollIntoView();", getShadowElement(nextbuttonshadow, driver,nextbutton));
// getShadowElement(nextbuttonshadow, driver,nextbutton).click();
// Thread.sleep(2000);
// System.out.println(" Clicked dropdown number selection button");
// String[] value50selectshadow = {"app-shell","#appHeadLayout > main > assessments-list","section.elevation.page-content.no-padding > etools-table","table > tbody > tr:nth-child(13) > td > etools-pagination"};    
// String value50select = "span:nth-child(2) > paper-dropdown-menu > paper-listbox > paper-item:nth-child(4)";
//getShadowElement(value50selectshadow, driver,value50select).click();
// Thread.sleep(5000);
String sflag="false";
int j=1;
do{

for(int i=1;i<=20;i++)
{
 String referencelink="table > tbody > tr:nth-child("+i+") > td:nth-child(1) > a";
    String[] referencelinkshadow = {"app-shell","#appHeadLayout > main > assessments-list","section.elevation.page-content.no-padding > etools-table"};    
    js.executeScript("arguments[0].scrollIntoView();", getShadowElement(referencelinkshadow,driver,referencelink));
    Thread.sleep(4000);
    String text= getShadowElement(referencelinkshadow,driver,referencelink).getText();
    System.out.println("actual text:"+text);
System.out.println("expected title:"+assessment);
    if(text.toString().equals(assessment))
{

System.out.println("matched");
System.out.println("actual text:"+text);
System.out.println("expected title:"+assessment);

// act1.sendKeys(Keys.PAGE_DOWN).build().perform();
getShadowElement(referencelinkshadow,driver,referencelink).click();
sflag="true";
Thread.sleep(8000);
break;
}

}
// j=j+1;if (j>1)
if (sflag!="true" )
{
String[] nextbuttonshadow = {"app-shell","#appHeadLayout > main > assessments-list","section.elevation.page-content.no-padding > etools-table","table > tbody > tr:nth-child(21) > td > etools-pagination"};    
String nextbutton="span.pagination-item.pagination-btns > paper-icon-button:nth-child(3)";
// table > tbody > tr:nth-child(16) > td > etools-pagination

js.executeScript("arguments[0].scrollIntoView();", getShadowElement(nextbuttonshadow, driver,nextbutton));
getShadowElement(nextbuttonshadow, driver,nextbutton).click();
Thread.sleep(2000);
}
} while(sflag!="true");

} catch (InterruptedException e) {

e.printStackTrace();
}

}

}
