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

public class PSEAQuestionaryPage extends TestBase {

Actions act;
private String addanewassessmentbtn="#main > iron-icon";
private String[] addanewassessmentbtnshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-details-page","assessment-info","#partner"};    

private String followupbtn="#tabs > paper-tab:nth-child(3) > span";
private String[] followupshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","page-content-header > etools-tabs"};
private String submitbtn="paper-button";

private String[] submitbtnshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","page-content-header > div > assessment-status-transition-actions"};
private String[] yesbtnshadow = {"etools-dialog"};    
private String yesbtn = "#dialog > div > paper-button.confirm-btn";

public PSEAQuestionaryPage() throws InterruptedException
{
Thread.sleep(2000);
}
public void clickOnsubmitbutton() throws InterruptedException
{
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(submitbtnshadow,driver,submitbtn));
 Thread.sleep(2000);
getShadowElement(submitbtnshadow, driver,submitbtn).click();
Thread.sleep(2000);
getShadowElement(yesbtnshadow, driver,yesbtn).click();
Thread.sleep(6000);
}
public void fillQuestionary(String assesmenttype) {
JavascriptExecutor js = (JavascriptExecutor) driver;

try {
int j=22;
for (int i=4; i<=9;i++)
{
String questionarybtn="etools-content-panel > div:nth-child(2) > paper-icon-button";
String[] questionaryshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-questionnaire-page","questionnaire-item:nth-child("+i+")"};    

//questionnaire-item:nth-child(5)
// act= new Actions(driver);

    getShadowElement(questionaryshadow,driver,questionarybtn).click();
    Thread.sleep(2000);
//Select Progressing radio btn
   String progressbtn="#radioContainer";
String[] progressbtnshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-questionnaire-page","questionnaire-item:nth-child("+i+")","#questionnaireAnswerElement","#ratingElement > paper-radio-button.orange"};    
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(progressbtnshadow,driver,progressbtn));
 Thread.sleep(2000);
getShadowElement(progressbtnshadow,driver,progressbtn).click();
// questionnaire-item:nth-child(5)

if (assesmenttype == "Unicef" )
{
//Enter Text in comments section
  String commentstext="#textarea";
 
 String[] commentstextshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-questionnaire-page","questionnaire-item:nth-child("+i+")","#questionnaireAnswerElement","#commentsElement","#input-"+j};
 j=j+2;
//  #input-25 questionnaire-item:nth-child(5) #questionnaireAnswerElement #commentsElement #input-23
 //"#input-23"
// questionnaire-item:nth-child(6)
getShadowElement(commentstextshadow,driver,commentstext).sendKeys("Test");
}
//Select code of conduct
//String codeofconduct="#checkboxContainer";
//String[] codeofconductshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-questionnaire-page","questionnaire-item:nth-child("+i+")","#questionnaireAnswerElement","paper-checkbox:nth-child(5)"};    
//getShadowElement(codeofconductshadow,driver,codeofconduct).click();
 // Click Save button        
String savebtn="etools-content-panel > div.layout-horizontal.right-align.row-padding-v > paper-button.primary";
String[] savebtnshadow = {"app-shell","#appHeadLayout > main > assessment-tabs","div > assessment-questionnaire-page","questionnaire-item:nth-child("+i+")"};  
getShadowElement(savebtnshadow,driver,savebtn).click();
Thread.sleep(3000);
}
} catch (InterruptedException e) {

e.printStackTrace();
}

}

public void clickonfollowupTab() throws InterruptedException
{
JavascriptExecutor js = (JavascriptExecutor) driver;

js.executeScript("arguments[0].scrollIntoView();", getShadowElement(followupshadow, driver,followupbtn));

getShadowElement(followupshadow, driver,followupbtn).click();
Thread.sleep(2000);

}
}