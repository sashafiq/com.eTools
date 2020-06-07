package com.eTools.Pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eTools.base.TestBase;

public class ReportsPage extends TestBase {
private Actions act;
private String[] microassesdateofFieldVisitShadow = {"app-shell","micro-assessments-page-main","ma-report-page-main","assign-engagement"};
private String[] specialauditdateofFieldVisitShadow = {"app-shell","special-audits-page-main","sa-report-page-main","assign-engagement"};

String[] dateofFieldVisitShadow = {"app-shell","#audits","#report","#assignEngagement","#dateVisitInput"};


private String dateofFieldReportToIptext="#dateDisplayinputContainer > iron-icon";
private String dateofFieldCommentsRecivedIptext="#dateDisplayinputContainer > iron-icon";
private String DraftReporttext="#dateDisplayinputContainer > iron-icon";
private String CommentsRecivedIptext1="#dateDisplayinputContainer > iron-icon";

private String[] exchangearteshadow = {"app-shell","audits-page-main","audit-report-page-main","assign-engagement","etools-currency-amount-input","paper-input"};
private String[] spotcheckexchangearteshadow = {"app-shell","spot-checks-page-main","sc-report-page-main","assign-engagement","etools-currency-amount-input","paper-input"};
String dateofFieldVisitText="#dateDisplayinputContainer > iron-icon";
private String exchangerate="#input";

private String[] summaryauditshadow = {"app-shell","#audits","#report","#findingsSummary"};
private String summaryauditshadowtext="etools-content-panel > list-element > div > paper-icon-button";

// private String[] auditexpenditureshadow = {"app-shell","audits-page-main","audit-report-page-main","findings-summary","etools-currency-amount-input","paper-input"};
// private String auditexpenditure="#input-49 > input";

private String[] saveshadow = {"app-shell","audits-page-main","audit-report-page-main","findings-summary","etools-dialog"};
private String save="#dialog > div > paper-button.confirm-btn";

private String[] attachmentTabShadow = {"app-shell","#audits"};
private String attachmentTab="#pageTabs > paper-tab:nth-child(5) > span";


private String[] specialauditattachmentTabShadow = {"app-shell","special-audits-page-main"};
private String[] spotcheckattachmentTabShadow = {"app-shell","#spot-checks"};


private String[] internalcontrolshadow= {"app-shell","#spot-checks","#report","#internalControls","etools-content-panel > div.row-h.group > paper-textarea","#input-56"};

private String internalcontrol="#textarea";

public ReportsPage() throws InterruptedException
{
Thread.sleep(2000);
}



public void populatespecialAuditDataInEngagementStatus() {
try {
act=new Actions(driver);
//getShadowElement(dateofFieldVisitShadow,driver,dateofFieldVisitText).click();    
// Thread.sleep(2000);

//Click Date Ip Calender
String[] datefieldshadow = {"app-shell","#special-audits","#report","#assignEngagement","#dateVisitInput"};
String datefieldvalue="#dateDisplayinputContainer";
getShadowElement(datefieldshadow, driver,datefieldvalue).click();
Thread.sleep(1000);
//Select Date IP
String[] todaysdateshadow = {"app-shell","#special-audits","#report","#assignEngagement","#dateVisitInput","#calendar"};
String todaysdate="div.dateSticker.today";
getShadowElement(todaysdateshadow, driver,todaysdate).click();
Thread.sleep(1000);

//Click Date draft report Calender
String[] datedraftshadow = {"app-shell","#special-audits","#report","#assignEngagement","#draftReportToIpInput"};
String datedraftvalue="#dateDisplayinputContainer";
getShadowElement(datedraftshadow, driver,datedraftvalue).click();
Thread.sleep(1000);
//Select Date draft report
String[] todaysdateshadow1 = {"app-shell","#special-audits","#report","#assignEngagement","#draftReportToIpInput","#calendar"};
String todaysdate1="div.dateSticker.today";
getShadowElement(todaysdateshadow1, driver,todaysdate1).click();
Thread.sleep(1000);

//Click Date Comments report Calender
String[] datecommentshadow = {"app-shell","#special-audits","#report","#assignEngagement","#commentsReceivedByIpInput"};
String datecommentsvalue="#dateDisplayinputContainer";
getShadowElement(datecommentshadow, driver,datecommentsvalue).click();
Thread.sleep(1000);
//Select Date Comments report
String[] todaysdateshadow2 = {"app-shell","#special-audits","#report","#assignEngagement","#commentsReceivedByIpInput","#calendar"};
String todaysdate2="div.dateSticker.today";
getShadowElement(todaysdateshadow2, driver,todaysdate2).click();
Thread.sleep(1000);

//Click Date draft report unicef Calender
String[] datedraftunicefshadow = {"app-shell","#special-audits","#report","#assignEngagement","#draftReportUnicefInput"};
String datedraftunicefvalue="#dateDisplayinputContainer";
getShadowElement(datedraftunicefshadow, driver,datedraftunicefvalue).click();
Thread.sleep(1000);
//Select Date draft unicef report
String[] todaysdateshadow3 = {"app-shell","#special-audits","#report","#assignEngagement","#draftReportUnicefInput","#calendar"};
String todaysdate3="div.dateSticker.today";
getShadowElement(todaysdateshadow3, driver,todaysdate3).click();
Thread.sleep(1000);

//Click Date Comments report unicef Calender
String[] datecommentunicefshadow = {"app-shell","#special-audits","#report","#assignEngagement","#commentsReceivedUnicefInput"};
String datecommentsunicefvalue="#dateDisplayinputContainer";
getShadowElement(datecommentunicefshadow, driver,datecommentsunicefvalue).click();
Thread.sleep(1000);
//Select Date Comments report
String[] todaysdateshadow4 = {"app-shell","#special-audits","#report","#assignEngagement","#commentsReceivedUnicefInput","#calendar"};
String todaysdate4="div.dateSticker.today";
getShadowElement(todaysdateshadow4, driver,todaysdate4).click();
Thread.sleep(1000);

} catch (InterruptedException e) {

e.printStackTrace();
}

}
public void clickOnSpotCheckAttachmentTab()
{

try {
 JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", getShadowElement(spotcheckattachmentTabShadow, driver,attachmentTab));

Thread.sleep(3000);
getShadowElement(spotcheckattachmentTabShadow, driver,attachmentTab).click();
Thread.sleep(3000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}

public void clickOnAttachmentTab() throws InterruptedException
{

getShadowElement(attachmentTabShadow, driver,attachmentTab).click();
Thread.sleep(3000);

}
public void clickOnMicroassessmentAttachmentTab() throws InterruptedException
{
String attachmentTab="#pageTabs > paper-tab:nth-child(7) > span";

String[] attachmentTabShadow = {"app-shell","#micro-assessments"};

JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", getShadowElement(attachmentTabShadow, driver,attachmentTab));
        Thread.sleep(5000);

getShadowElement(attachmentTabShadow, driver,attachmentTab).click();
Thread.sleep(3000);

}
public void clickOnSpecialAuditAttachmentTab()
{

try {
getShadowElement(specialauditattachmentTabShadow, driver,attachmentTab).click();
Thread.sleep(3000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}

public void populateAuditDataInEngagementStatus() {
try {
act=new Actions(driver);
//getShadowElement(dateofFieldVisitShadow,driver,dateofFieldVisitText).click();    
// Thread.sleep(2000);

//Click Date Ip Calender
String[] datefieldshadow = {"app-shell","#audits","#report","#assignEngagement","#dateVisitInput"};
String datefieldvalue="#dateDisplayinputContainer";
getShadowElement(datefieldshadow, driver,datefieldvalue).click();
Thread.sleep(1000);
//Select Date IP
String[] todaysdateshadow = {"app-shell","#audits","#report","#assignEngagement","#dateVisitInput","#calendar"};
String todaysdate="div.dateSticker.today";
getShadowElement(todaysdateshadow, driver,todaysdate).click();
Thread.sleep(1000);

//Click Date draft report Calender
String[] datedraftshadow = {"app-shell","#audits","#report","#assignEngagement","#draftReportToIpInput"};
String datedraftvalue="#dateDisplayinputContainer";
getShadowElement(datedraftshadow, driver,datedraftvalue).click();
Thread.sleep(1000);
//Select Date draft report
String[] todaysdateshadow1 = {"app-shell","#audits","#report","#assignEngagement","#draftReportToIpInput","#calendar"};
String todaysdate1="div.dateSticker.today";
getShadowElement(todaysdateshadow1, driver,todaysdate1).click();
Thread.sleep(1000);

//Click Date Comments report Calender
String[] datecommentshadow = {"app-shell","#audits","#report","#assignEngagement","#commentsReceivedByIpInput"};
String datecommentsvalue="#dateDisplayinputContainer";
getShadowElement(datecommentshadow, driver,datecommentsvalue).click();
Thread.sleep(1000);
//Select Date Comments report
String[] todaysdateshadow2 = {"app-shell","#audits","#report","#assignEngagement","#commentsReceivedByIpInput","#calendar"};
String todaysdate2="div.dateSticker.today";
getShadowElement(todaysdateshadow2, driver,todaysdate2).click();
Thread.sleep(1000);

//Click Date draft report unicef Calender
String[] datedraftunicefshadow = {"app-shell","#audits","#report","#assignEngagement","#draftReportUnicefInput"};
String datedraftunicefvalue="#dateDisplayinputContainer";
getShadowElement(datedraftunicefshadow, driver,datedraftunicefvalue).click();
Thread.sleep(1000);
//Select Date draft unicef report
String[] todaysdateshadow3 = {"app-shell","#audits","#report","#assignEngagement","#draftReportUnicefInput","#calendar"};
String todaysdate3="div.dateSticker.today";
getShadowElement(todaysdateshadow3, driver,todaysdate3).click();
Thread.sleep(1000);

//Click Date Comments report unicef Calender
String[] datecommentunicefshadow = {"app-shell","#audits","#report","#assignEngagement","#commentsReceivedUnicefInput"};
String datecommentsunicefvalue="#dateDisplayinputContainer";
getShadowElement(datecommentunicefshadow, driver,datecommentsunicefvalue).click();
Thread.sleep(1000);
//Select Date Comments report
String[] todaysdateshadow4 = {"app-shell","#audits","#report","#assignEngagement","#commentsReceivedUnicefInput","#calendar"};
String todaysdate4="div.dateSticker.today";
getShadowElement(todaysdateshadow4, driver,todaysdate4).click();
Thread.sleep(1000);
//Select Currency report
String[] currencyshadow = {"app-shell","#audits","#report","#assignEngagement","#currency_of_report","#main"};
String currencyvalue="#input-84 > input";

getShadowElement(currencyshadow, driver,currencyvalue).click();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);

} catch (InterruptedException e) {

e.printStackTrace();
}

}
public void populatemicroDataInEngagementStatus() {
try {
act=new Actions(driver);
//getShadowElement(dateofFieldVisitShadow,driver,dateofFieldVisitText).click();    
// Thread.sleep(2000);

//Click Date Ip Calender
String[] datefieldshadow = {"app-shell","#micro-assessments","#report","#assignEngagement","#dateVisitInput"};
String datefieldvalue="#dateDisplayinputContainer";
getShadowElement(datefieldshadow, driver,datefieldvalue).click();
Thread.sleep(1000);
//Select Date IP
String[] todaysdateshadow = {"app-shell","#micro-assessments","#report","#assignEngagement","#dateVisitInput","#calendar"};
String todaysdate="div.dateSticker.today";
getShadowElement(todaysdateshadow, driver,todaysdate).click();
Thread.sleep(1000);

//Click Date draft report Calender
String[] datedraftshadow = {"app-shell","#micro-assessments","#report","#assignEngagement","#draftReportToIpInput"};
String datedraftvalue="#dateDisplayinputContainer";
getShadowElement(datedraftshadow, driver,datedraftvalue).click();
Thread.sleep(1000);
//Select Date draft report
String[] todaysdateshadow1 = {"app-shell","#micro-assessments","#report","#assignEngagement","#draftReportToIpInput","#calendar"};
String todaysdate1="div.dateSticker.today";
getShadowElement(todaysdateshadow1, driver,todaysdate1).click();
Thread.sleep(1000);

//Click Date Comments report Calender
String[] datecommentshadow = {"app-shell","#micro-assessments","#report","#assignEngagement","#commentsReceivedByIpInput"};
String datecommentsvalue="#dateDisplayinputContainer";
getShadowElement(datecommentshadow, driver,datecommentsvalue).click();
Thread.sleep(1000);
//Select Date Comments report
String[] todaysdateshadow2 = {"app-shell","#micro-assessments","#report","#assignEngagement","#commentsReceivedByIpInput","#calendar"};
String todaysdate2="div.dateSticker.today";
getShadowElement(todaysdateshadow2, driver,todaysdate2).click();
Thread.sleep(1000);

//Click Date draft report unicef Calender
String[] datedraftunicefshadow = {"app-shell","#micro-assessments","#report","#assignEngagement","#draftReportUnicefInput"};
String datedraftunicefvalue="#dateDisplayinputContainer";
getShadowElement(datedraftunicefshadow, driver,datedraftunicefvalue).click();
Thread.sleep(1000);
//Select Date draft unicef report
String[] todaysdateshadow3 = {"app-shell","#micro-assessments","#report","#assignEngagement","#draftReportUnicefInput","#calendar"};
String todaysdate3="div.dateSticker.today";
getShadowElement(todaysdateshadow3, driver,todaysdate3).click();
Thread.sleep(1000);

//Click Date Comments report unicef Calender
String[] datecommentunicefshadow = {"app-shell","#micro-assessments","#report","#assignEngagement","#commentsReceivedUnicefInput"};
String datecommentsunicefvalue="#dateDisplayinputContainer";
getShadowElement(datecommentunicefshadow, driver,datecommentsunicefvalue).click();
Thread.sleep(1000);
//Select Date Comments report
String[] todaysdateshadow4 = {"app-shell","#micro-assessments","#report","#assignEngagement","#commentsReceivedUnicefInput","#calendar"};
String todaysdate4="div.dateSticker.today";
getShadowElement(todaysdateshadow4, driver,todaysdate4).click();
Thread.sleep(1000);


} catch (InterruptedException e) {

e.printStackTrace();
}

}

public void populaterisk() throws InterruptedException
{
JavascriptExecutor js = (JavascriptExecutor) driver;
act= new Actions(driver);
String[] riskshadowdrp = {"app-shell","#micro-assessments","#report","#primaryRisk","#riskAssessmentInput","#main"};
String riskvaluedrp="#input-60";
getShadowElement(riskshadowdrp, driver,riskvaluedrp).click();
Thread.sleep(1000);
String[] riskvalueshadow = {"app-shell","#micro-assessments","#report","#primaryRisk","#riskAssessmentInput","#optionsList"};
String riskvalue="paper-listbox > paper-icon-item:nth-child(1)";
getShadowElement(riskvalueshadow, driver,riskvalue).click();
Thread.sleep(1000);

//act.sendKeys(Keys.TAB).perform();
//Thread.sleep(1000);

String[] justificationshadow = {"app-shell","#micro-assessments","#report","#primaryRisk","#briefJustification","#input-53"};
String justificationvalue="#textarea";

getShadowElement(justificationshadow, driver,justificationvalue).sendKeys("Test");

   js.executeScript("arguments[0].scrollIntoView();", getShadowElement(justificationshadow, driver,justificationvalue));

//act.sendKeys(Keys.TAB).perform();
//Thread.sleep(1000);
/// act.sendKeys(Keys.ENTER).perform();
// Thread.sleep(1000);
//act.sendKeys(Keys.TAB).perform();
//Thread.sleep(1000);
//act.sendKeys("Test").perform();
//Thread.sleep(1000);


}

public void populatedatacontrol() throws InterruptedException
{
JavascriptExecutor js = (JavascriptExecutor) driver;
String[] internalcontrolshadow = {"app-shell","#micro-assessments","#report","#controlFindings"};
String internalcontrolval="etools-content-panel > div > div > paper-icon-button";

js.executeScript("arguments[0].scrollIntoView();", getShadowElement(internalcontrolshadow, driver,internalcontrolval));
Thread.sleep(1000);
getShadowElement(internalcontrolshadow, driver,internalcontrolval).click();
Thread.sleep(4000);
String[] descriptionshadow = {"app-shell","#micro-assessments","#report","#controlFindings","etools-dialog:nth-child(4) > div > div > div:nth-child(1) > div > paper-input"};
String descriptionvalue="#input-55 > input";
getShadowElement(descriptionshadow, driver,descriptionvalue).sendKeys("Test");
Thread.sleep(1000);
String[] recommendationshadow = {"app-shell","#micro-assessments","#report","#controlFindings","etools-dialog:nth-child(4) > div > div > div:nth-child(2) > div > paper-textarea","#input-48"};
String recommendation="#textarea";
getShadowElement(recommendationshadow, driver,recommendation).sendKeys("Test");
Thread.sleep(1000);
String[] addbtnshadow = {"app-shell","#micro-assessments","#report","#controlFindings","etools-dialog:nth-child(4)"};
String addbtn="#dialog > div > paper-button.confirm-btn";
getShadowElement(addbtnshadow, driver,addbtn).click();
Thread.sleep(3000);
}
public void fillImplemnetingPartnerQuestionnaire() throws InterruptedException
{
// risk-tab:nth-child(4)
JavascriptExecutor js = (JavascriptExecutor) driver;
String[] implementshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(3)","div > etools-content-panel"};
String implementval="div > div > paper-icon-button";

// getShadowElement(implementshadow, driver,implementval).click();
Thread.sleep(1000);
int j=2;
for (int i=66 ; i<=86;i=i+2)
{

System.out.println("i value:"+i);
//#input-88
//risk-tab:nth-child(4)
String[] questionshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(3)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#main"};
String questionvalue="#input-"+i;
System.out.println("Quetsion input vaue:"+questionvalue);
if (i==74 || i==86)
{
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(questionshadow, driver,questionvalue));
}
getShadowElement(questionshadow, driver,questionvalue).click();
Thread.sleep(2000);

String[] riskassessmentshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(3)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#optionsList"};

String riskassessmentval="paper-listbox > paper-icon-item:nth-child(2)";

getShadowElement(riskassessmentshadow, driver,riskassessmentval).click();
Thread.sleep(2000);
j=j+1;
}

}
public void fillProgramManagementQuestionnaire() throws InterruptedException
{

// risk-tab:nth-child(4)
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
String[] implementshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(4)","div > etools-content-panel"};
String implementval="div > div > paper-icon-button";

getShadowElement(implementshadow, driver,implementval).click();
Thread.sleep(1000);
int j=2;
for (int i=88 ; i<=102;i=i+2)
{

System.out.println("i value:"+i);
//#input-88
//risk-tab:nth-child(4)
String[] questionshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(4)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#main"};
String questionvalue="#input-"+i;
System.out.println("Quetsion input vaue:"+questionvalue);
if (i==96 || i==102)
{
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(questionshadow, driver,questionvalue));
}
getShadowElement(questionshadow, driver,questionvalue).click();
Thread.sleep(2000);

String[] riskassessmentshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(4)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#optionsList"};

String riskassessmentval="paper-listbox > paper-icon-item:nth-child(2)";

getShadowElement(riskassessmentshadow, driver,riskassessmentval).click();
Thread.sleep(2000);
j=j+1;
}

}
public void fillOrganizationalQuestionnaire() throws InterruptedException
{
// risk-tab:nth-child(4)
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
String[] implementshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(5)","div > etools-content-panel"};
String implementval="div > div > paper-icon-button";

getShadowElement(implementshadow, driver,implementval).click();
Thread.sleep(1000);
int j=2;
for (int i=104 ; i<=118;i=i+2)
{

System.out.println("i value:"+i);
//#input-88
//risk-tab:nth-child(4)
String[] questionshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(5)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#main"};
String questionvalue="#input-"+i;
System.out.println("Quetsion input vaue:"+questionvalue);
if (i==110 || i==118)
{
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(questionshadow, driver,questionvalue));
}
getShadowElement(questionshadow, driver,questionvalue).click();
Thread.sleep(2000);

String[] riskassessmentshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(5)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#optionsList"};

String riskassessmentval="paper-listbox > paper-icon-item:nth-child(2)";

getShadowElement(riskassessmentshadow, driver,riskassessmentval).click();
Thread.sleep(2000);
j=j+1;
}

}
public void fillaccountingQuestionnaire1() throws InterruptedException
{
// risk-tab:nth-child(4)
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
String[] implementshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel"};
String implementval="div > div > paper-icon-button";

getShadowElement(implementshadow, driver,implementval).click();
Thread.sleep(1000);
int j=4;
for (int i=136 ; i<=142;i=i+2)
{

System.out.println("i value:"+i);
//#input-88
//risk-tab:nth-child(4)

// div > etools-content-panel > list-element:nth-child(4) > div:nth-child(2) > etools-dropdown
String[] questionshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#main"};
String questionvalue="#input-"+i;
System.out.println("Quetsion input vaue:"+questionvalue);
if (i==140 )
{
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(questionshadow, driver,questionvalue));
}
getShadowElement(questionshadow, driver,questionvalue).click();
Thread.sleep(2000);

String[] riskassessmentshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#optionsList"};

String riskassessmentval="paper-listbox > paper-icon-item:nth-child(2)";

getShadowElement(riskassessmentshadow, driver,riskassessmentval).click();
Thread.sleep(2000);
j=j+1;
}

}
public void fillaccountingQuestionnaire2() throws InterruptedException
{

// risk-tab:nth-child(4)
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
String[] implementshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel"};
String implementval="div > div > paper-icon-button";

getShadowElement(implementshadow, driver,implementval).click();
Thread.sleep(1000);
int j=10;
for (int i=144 ; i<=148;i=i+2)
{

System.out.println("i value:"+i);
//#input-88
//risk-tab:nth-child(4)

// div > etools-content-panel > list-element:nth-child(4) > div:nth-child(2) > etools-dropdown
String[] questionshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#main"};
String questionvalue="#input-"+i;
System.out.println("Quetsion input vaue:"+questionvalue);
if ( i==146 || i==148)
{
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(questionshadow, driver,questionvalue));
}
getShadowElement(questionshadow, driver,questionvalue).click();
Thread.sleep(2000);

String[] riskassessmentshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#optionsList"};

String riskassessmentval="paper-listbox > paper-icon-item:nth-child(2)";

getShadowElement(riskassessmentshadow, driver,riskassessmentval).click();
Thread.sleep(2000);
j=j+1;
}

}
public void fillaccountingQuestionnaire3() throws InterruptedException
{

// risk-tab:nth-child(4)
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
String[] implementshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel"};
String implementval="div > div > paper-icon-button";

getShadowElement(implementshadow, driver,implementval).click();
Thread.sleep(1000);
int j=15;
for (int i=150 ; i<=156;i=i+2)
{

System.out.println("i value:"+i);
//#input-88
//risk-tab:nth-child(4)

// div > etools-content-panel > list-element:nth-child(4) > div:nth-child(2) > etools-dropdown
String[] questionshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#main"};
String questionvalue="#input-"+i;
System.out.println("Quetsion input vaue:"+questionvalue);
if ( i==152 ||i==156)
{
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(questionshadow, driver,questionvalue));
}
getShadowElement(questionshadow, driver,questionvalue).click();
Thread.sleep(2000);

String[] riskassessmentshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#optionsList"};

String riskassessmentval="paper-listbox > paper-icon-item:nth-child(2)";

getShadowElement(riskassessmentshadow, driver,riskassessmentval).click();
Thread.sleep(2000);
j=j+1;
}

}
public void fillaccountingQuestionnaire4() throws InterruptedException
{

// risk-tab:nth-child(4)
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
String[] implementshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel"};
String implementval="div > div > paper-icon-button";

getShadowElement(implementshadow, driver,implementval).click();
Thread.sleep(1000);
int j=21;
for (int i=158 ; i<=168;i=i+2)
{

System.out.println("i value:"+i);
//#input-88
//risk-tab:nth-child(4)

// div > etools-content-panel > list-element:nth-child(4) > div:nth-child(2) > etools-dropdown
String[] questionshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#main"};
String questionvalue="#input-"+i;
System.out.println("Quetsion input vaue:"+questionvalue);
if ( i==158 || i== 162 || i== 166)
{
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(questionshadow, driver,questionvalue));
}
getShadowElement(questionshadow, driver,questionvalue).click();
Thread.sleep(2000);

String[] riskassessmentshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#optionsList"};

String riskassessmentval="paper-listbox > paper-icon-item:nth-child(2)";

getShadowElement(riskassessmentshadow, driver,riskassessmentval).click();
Thread.sleep(2000);
j=j+1;
}

}
public void fillaccountingQuestionnaire5() throws InterruptedException
{
// div > etools-content-panel > list-element:nth-child(29) > div:nth-child(2) > etools-dropdown // risk-tab:nth-child(4)
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
String[] implementshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel"};
String implementval="div > div > paper-icon-button";

getShadowElement(implementshadow, driver,implementval).click();
Thread.sleep(1000);
int j=29;
for (int i=170 ; i<=172;i=i+2)
{

System.out.println("i value:"+i);
//#input-88
//risk-tab:nth-child(4)

// div > etools-content-panel > list-element:nth-child(4) > div:nth-child(2) > etools-dropdown
String[] questionshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#main"};
String questionvalue="#input-"+i;
System.out.println("Quetsion input vaue:"+questionvalue);
if ( i== 172 )
{
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(questionshadow, driver,questionvalue));
}
getShadowElement(questionshadow, driver,questionvalue).click();
Thread.sleep(2000);

String[] riskassessmentshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#optionsList"};

String riskassessmentval="paper-listbox > paper-icon-item:nth-child(2)";

getShadowElement(riskassessmentshadow, driver,riskassessmentval).click();
Thread.sleep(2000);
j=j+1;
}

}
public void fillaccountingQuestionnaire6() throws InterruptedException
{
//div > etools-content-panel > list-element:nth-child(33) > div:nth-child(2) > etools-dropdowniv:nth-child(2) > etools-dropdown
// risk-tab:nth-child(4)
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
String[] implementshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel"};
String implementval="div > div > paper-icon-button";

getShadowElement(implementshadow, driver,implementval).click();
Thread.sleep(1000);
int j=33;
for (int i=174 ; i<=188;i=i+2)
{

System.out.println("i value:"+i);
//#input-88
//risk-tab:nth-child(4)

// div > etools-content-panel > list-element:nth-child(4) > div:nth-child(2) > etools-dropdown
String[] questionshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#main"};
String questionvalue="#input-"+i;
System.out.println("Quetsion input vaue:"+questionvalue);
if ( i== 176|| i==182||i== 186)
{
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(questionshadow, driver,questionvalue));
}
getShadowElement(questionshadow, driver,questionvalue).click();
Thread.sleep(2000);

String[] riskassessmentshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#optionsList"};

String riskassessmentval="paper-listbox > paper-icon-item:nth-child(2)";

getShadowElement(riskassessmentshadow, driver,riskassessmentval).click();
Thread.sleep(2000);
j=j+1;
}

}

public void fillaccountingQuestionnaire7() throws InterruptedException
{

//div > etools-content-panel > list-element:nth-child(29) > div:nth-child(2) > etools-dropdown
// risk-tab:nth-child(4)
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
String[] implementshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel"};
String implementval="div > div > paper-icon-button";

getShadowElement(implementshadow, driver,implementval).click();
Thread.sleep(1000);
int j=43;

for (int i=190 ; i<=190;i=i+2)
{

System.out.println("i value:"+i);
//#input-88
//risk-tab:nth-child(4)

// div > etools-content-panel > list-element:nth-child(4) > div:nth-child(2) > etools-dropdown
String[] questionshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#main"};
String questionvalue="#input-"+i;
System.out.println("Quetsion input vaue:"+questionvalue);
if (  i==190)
{
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(questionshadow, driver,questionvalue));
}
getShadowElement(questionshadow, driver,questionvalue).click();
Thread.sleep(2000);

String[] riskassessmentshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#optionsList"};

String riskassessmentval="paper-listbox > paper-icon-item:nth-child(2)";

getShadowElement(riskassessmentshadow, driver,riskassessmentval).click();
Thread.sleep(2000);
j=j+1;
}

}
public void fillaccountingQuestionnaire8() throws InterruptedException
{
//div > etools-content-panel > list-element:nth-child(46) > div:nth-child(2) > etools-dropdown
// risk-tab:nth-child(4)
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
String[] implementshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel"};
String implementval="div > div > paper-icon-button";

getShadowElement(implementshadow, driver,implementval).click();
Thread.sleep(1000);
int j=46;

for (int i=192 ; i<=198;i=i+2)
{

System.out.println("i value:"+i);
//#input-88
//risk-tab:nth-child(4)

// div > etools-content-panel > list-element:nth-child(4) > div:nth-child(2) > etools-dropdown
String[] questionshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#main"};
String questionvalue="#input-"+i;
System.out.println("Quetsion input vaue:"+questionvalue);
if ( i==196|| i==198)
{
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(questionshadow, driver,questionvalue));
}
getShadowElement(questionshadow, driver,questionvalue).click();
Thread.sleep(2000);

String[] riskassessmentshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(6)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#optionsList"};

String riskassessmentval="paper-listbox > paper-icon-item:nth-child(2)";

getShadowElement(riskassessmentshadow, driver,riskassessmentval).click();
Thread.sleep(2000);
j=j+1;
}

}
public void fillfixedassestsQuestionnaire1() throws InterruptedException
{
// risk-tab:nth-child(4)
//div > etools-content-panel > list-element:nth-child(4) > div:nth-child(2) > etools-dropdown
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
String[] implementshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(7)","div > etools-content-panel"};
String implementval="div > div > paper-icon-button";

getShadowElement(implementshadow, driver,implementval).click();
Thread.sleep(1000);
int j=4;
for (int i=200 ; i<=206;i=i+2)
{

System.out.println("i value:"+i);
//#input-88
//risk-tab:nth-child(4)
String[] questionshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(7)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#main"};
String questionvalue="#input-"+i;
System.out.println("Quetsion input vaue:"+questionvalue);
if (i==202 || i== 206)
{
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(questionshadow, driver,questionvalue));
}
getShadowElement(questionshadow, driver,questionvalue).click();
Thread.sleep(2000);

String[] riskassessmentshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(7)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#optionsList"};

String riskassessmentval="paper-listbox > paper-icon-item:nth-child(2)";

getShadowElement(riskassessmentshadow, driver,riskassessmentval).click();
Thread.sleep(2000);
j=j+1;
}

}
public void fillfixedassestsQuestionnaire2() throws InterruptedException
{
// risk-tab:nth-child(4)
//div > etools-content-panel > list-element:nth-child(4) > div:nth-child(2) > etools-dropdown
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
String[] implementshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(7)","div > etools-content-panel"};
String implementval="div > div > paper-icon-button";

getShadowElement(implementshadow, driver,implementval).click();
Thread.sleep(1000);
int j=10;
for (int i=208 ; i<=216;i=i+2)
{

System.out.println("i value:"+i);
//#input-88
//risk-tab:nth-child(4)
String[] questionshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(7)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#main"};
String questionvalue="#input-"+i;
System.out.println("Quetsion input vaue:"+questionvalue);
if (i==202 || i== 206)
{
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(questionshadow, driver,questionvalue));
}
getShadowElement(questionshadow, driver,questionvalue).click();
Thread.sleep(2000);

String[] riskassessmentshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(7)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#optionsList"};

String riskassessmentval="paper-listbox > paper-icon-item:nth-child(2)";

getShadowElement(riskassessmentshadow, driver,riskassessmentval).click();
Thread.sleep(2000);
j=j+1;
}

}
public void fillfinancialreportQuestionnaire() throws InterruptedException
{
// risk-tab:nth-child(4)

Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
String[] implementshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(8)","div > etools-content-panel"};
String implementval="div > div > paper-icon-button";

getShadowElement(implementshadow, driver,implementval).click();
Thread.sleep(1000);
int j=2;
for (int i=120 ; i<=134;i=i+2)
{

System.out.println("i value:"+i);
//#input-88
//risk-tab:nth-child(4)
String[] questionshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(8)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#main"};
String questionvalue="#input-"+i;
System.out.println("Quetsion input vaue:"+questionvalue);
if (i==122 || i==  126 || i==130| i==134)
{
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(questionshadow, driver,questionvalue));
}
getShadowElement(questionshadow, driver,questionvalue).click();
Thread.sleep(2000);

String[] riskassessmentshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(8)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#optionsList"};

String riskassessmentval="paper-listbox > paper-icon-item:nth-child(2)";

getShadowElement(riskassessmentshadow, driver,riskassessmentval).click();
Thread.sleep(2000);
j=j+1;
}

}
public void fillprocurementQuestionnaire1() throws InterruptedException
{
//div > etools-content-panel > list-element:nth-child(4) > div:nth-child(2) > etools-dropdown
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
String[] implementshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(9)","div > etools-content-panel"};
String implementval="div > div > paper-icon-button";

getShadowElement(implementshadow, driver,implementval).click();
Thread.sleep(1000);
int j=4;
for (int i=218 ; i<=248;i=i+2)
{

System.out.println("i value:"+i);
//#input-88
//risk-tab:nth-child(4)
String[] questionshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(9)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#main"};
String questionvalue="#input-"+i;
System.out.println("Quetsion input vaue:"+questionvalue);
if (i==220 || i==224 || i==228 ||  i==232 ||   i==236 || i== 242 || i==248 )

{
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(questionshadow, driver,questionvalue));
}
getShadowElement(questionshadow, driver,questionvalue).click();
Thread.sleep(2000);

String[] riskassessmentshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(9)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#optionsList"};

String riskassessmentval="paper-listbox > paper-icon-item:nth-child(2)";

getShadowElement(riskassessmentshadow, driver,riskassessmentval).click();
Thread.sleep(2000);
j=j+1;
}

}
public void fillprocurementQuestionnaire2() throws InterruptedException
{
//div > etools-content-panel > list-element:nth-child(22) > div:nth-child(2) > etools-dropdown
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
String[] implementshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(9)","div > etools-content-panel"};
String implementval="div > div > paper-icon-button";

getShadowElement(implementshadow, driver,implementval).click();
Thread.sleep(1000);
int j=22;
for (int i=250 ; i<=256;i=i+2)
{

System.out.println("i value:"+i);
//#input-88
//risk-tab:nth-child(4)
String[] questionshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(9)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#main"};
String questionvalue="#input-"+i;
System.out.println("Quetsion input vaue:"+questionvalue);
if ( i== 252)

{
js.executeScript("arguments[0].scrollIntoView();", getShadowElement(questionshadow, driver,questionvalue));
}
getShadowElement(questionshadow, driver,questionvalue).click();
Thread.sleep(2000);

String[] riskassessmentshadow = {"app-shell","#micro-assessments","#questionnaire","risk-tab:nth-child(9)","div > etools-content-panel > list-element:nth-child("+j+") > div:nth-child(2) > etools-dropdown","#optionsList"};

String riskassessmentval="paper-listbox > paper-icon-item:nth-child(2)";

getShadowElement(riskassessmentshadow, driver,riskassessmentval).click();
Thread.sleep(2000);
j=j+1;
}

}
public void populateSubjectarea() throws InterruptedException
{
for (int i=2;i<=8;i++)
{

String[] impparshadow = {"app-shell","#micro-assessments","#report","#internalControls","etools-content-panel > subject-area-element:nth-child("+i+")"};
String imppartnerval="#listElement > div > paper-icon-button";
getShadowElement(impparshadow, driver,imppartnerval).click();
Thread.sleep(3000);
String[] riskassesment1 = {"app-shell","#micro-assessments","#report","#internalControls","#riskAssessmentInput","#main"};
String riskassesmentdrp1="#input-62";
getShadowElement(riskassesment1, driver,riskassesmentdrp1).click();
Thread.sleep(1000);

String[] riskassesmentvalshadow1 = {"app-shell","#micro-assessments","#report","#internalControls","#riskAssessmentInput","#optionsList"};
String riskassesmentvalue1="paper-listbox > paper-icon-item:nth-child(2)";
getShadowElement(riskassesmentvalshadow1, driver,riskassesmentvalue1).click();
Thread.sleep(2000);
String[] justificationshadow = {"app-shell","#micro-assessments","#report","#internalControls","#briefJustification","#input-54"};
String justificationvalue="#textarea";
getShadowElement(justificationshadow, driver,justificationvalue).sendKeys("Test");
Thread.sleep(1000);
String[] savebtnshadow = {"app-shell","#micro-assessments","#report","#internalControls","etools-dialog"};
String savebtn="#dialog > div > paper-button.confirm-btn";
getShadowElement(savebtnshadow, driver,savebtn).click();

Thread.sleep(5000);
}
}
public void clickOnQuestionaryTab() throws InterruptedException
{

String[]questionshadow = {"app-shell","#micro-assessments"};
String questionval="#pageTabs > paper-tab:nth-child(4)";
JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", getShadowElement(questionshadow, driver,questionval));
Thread.sleep(2000);
getShadowElement(questionshadow, driver,questionval).click();

Thread.sleep(2000);
}




public void populateMicroassesDataInEngagementStatus() {
try {

//getShadowElement(microassesdateofFieldVisitShadow,driver,dateofFieldVisitText).click();    
Thread.sleep(2000);
act= new Actions(driver);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);

getShadowElement(microassesdateofFieldVisitShadow,driver,dateofFieldReportToIptext).click();    
Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);

getShadowElement(microassesdateofFieldVisitShadow,driver,dateofFieldCommentsRecivedIptext).click();    
Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);

getShadowElement(microassesdateofFieldVisitShadow,driver,DraftReporttext).click();    
Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);

getShadowElement(microassesdateofFieldVisitShadow,driver,CommentsRecivedIptext1).click();    
Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
getShadowElement(exchangearteshadow,driver,exchangerate).clear();
getShadowElement(exchangearteshadow,driver,exchangerate).sendKeys("1000");

} catch (InterruptedException e) {

e.printStackTrace();
}

}

public void populatespotcheckDataInEngagementStatus() {
try {

act= new Actions(driver);
String[] spotcheckdateofFieldVisitShadow = {"app-shell","#spot-checks","#report","#assignEngagement","#dateVisitInput"};
String dateofFieldVisitText="#dateDisplayinputContainer > iron-icon";
getShadowElement(spotcheckdateofFieldVisitShadow,driver,dateofFieldVisitText).click();    
Thread.sleep(2000);
String[] todaysdateshadow = {"app-shell","#spot-checks","#report","#assignEngagement","#dateVisitInput","#calendar"};
String todaysdate="div.dateSticker.today";
   getShadowElement(todaysdateshadow, driver,todaysdate).click();
Thread.sleep(1000);
   String[] spotcheckdraftreportShadow = {"app-shell","#spot-checks","#report","#assignEngagement","#draftReportToIpInput"};
String spotcheckdraftreport="#dateDisplayinputContainer > iron-icon";
getShadowElement(spotcheckdraftreportShadow,driver,spotcheckdraftreport).click();    
Thread.sleep(2000);
String[] todaysdateshadow2 = {"app-shell","#spot-checks","#report","#assignEngagement","#draftReportToIpInput","#calendar"};
String todaysdate2="div.dateSticker.today";
getShadowElement(todaysdateshadow2, driver,todaysdate2 ).click();
Thread.sleep(1000);
String[] spotcheckdatecommentsShadow = {"app-shell","#spot-checks","#report","#assignEngagement","#commentsReceivedByIpInput"};
String spotcheckdatecomments="#dateDisplayinputContainer > iron-icon";
getShadowElement(spotcheckdatecommentsShadow,driver,spotcheckdatecomments).click();    
Thread.sleep(2000);
String[] todaysdateshadow3 = {"app-shell","#spot-checks","#report","#assignEngagement","#commentsReceivedByIpInput","#calendar"};
String todaysdate3="div.dateSticker.today";
getShadowElement(todaysdateshadow3, driver,todaysdate3).click();
String[] unicefdratreportShadow = {"app-shell","#spot-checks","#report","#assignEngagement","#draftReportUnicefInput"};
   String unicefdratreport="#dateDisplayinputContainer > iron-icon";
getShadowElement(unicefdratreportShadow,driver,unicefdratreport).click();    
Thread.sleep(2000);
String[] todaysdateshadow4 = {"app-shell","#spot-checks","#report","#assignEngagement","#draftReportUnicefInput","#calendar"};
String todaysdate4="div.dateSticker.today";
getShadowElement(todaysdateshadow4, driver,todaysdate4).click();
String[] unicefdatecommentsShadow = {"app-shell","#spot-checks","#report","#assignEngagement","#commentsReceivedUnicefInput"};
    String unicefdatecomments="#dateDisplayinputContainer > iron-icon";
getShadowElement(unicefdatecommentsShadow,driver,unicefdatecomments).click(); Thread.sleep(2000);
Thread.sleep(2000);
String[] todaysdateshadow5 = {"app-shell","#spot-checks","#report","#assignEngagement","#commentsReceivedUnicefInput","#calendar"};
String todaysdate5="div.dateSticker.today";
getShadowElement(todaysdateshadow5, driver,todaysdate5).click();
String[] currencyofreportsshadow = {"app-shell","#spot-checks","#report","#assignEngagement","#currency_of_report"};
String currencyofreports="#main > iron-icon";
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);

} catch (InterruptedException e) {

e.printStackTrace();
}

}

public void populateSpotCheckOverviewData() throws InterruptedException
{
String[] overviewtotalamountShadow = {"app-shell","#spot-checks","#report","#overviewEngagement","etools-content-panel > div:nth-child(2) > div:nth-child(1) > etools-currency-amount-input","#currencyInput"};
String overviewtotalamounttext="#input-51";

//  JavascriptExecutor js = (JavascriptExecutor) driver;
   //    js.executeScript("arguments[0].scrollIntoView();",  getShadowElement(overviewtotalamountShadow,driver,overviewtotalamounttext));


Thread.sleep(2000);
act = new Actions(driver);
for (int i =1;i<=6;i++)
{
act.sendKeys(Keys.TAB).perform();;
}
Thread.sleep(1000);
for (int i =1;i<=4;i++)
{
act.sendKeys(Keys.BACK_SPACE).perform();
}
Thread.sleep(1000);
act.sendKeys("1000").perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
for (int i =1;i<=4;i++)
{
act.sendKeys(Keys.BACK_SPACE).perform();
}
Thread.sleep(1000);
act.sendKeys("1000").perform();
Thread.sleep(1000);
// getShadowElement(overviewtotalamountShadow,driver,overviewtotalamounttext).click();
// getShadowElement(overviewtotalamountShadow,driver,overviewtotalamounttext).sendKeys("1000");
// for (int i =1;i<=4;i++)
// {
// act.sendKeys(Keys.BACK_SPACE).perform();
// }
//getShadowElement(overviewtotalamountShadow,driver,overviewtotalamounttext).clear();
// Thread.sleep(1000);
// getShadowElement(overviewtotalamountShadow,driver,overviewtotalamounttext).sendKeys("1000");
//Thread.sleep(1000);
// act.sendKeys("2000");
// Thread.sleep(1000);
// String[] overviewtotalamountineligibleShadow = {"app-shell","#spot-checks","#report","#overviewEngagement","etools-content-panel > div:nth-child(2) > div:nth-child(2) > etools-currency-amount-input","#currencyInput"};
// String overviewtotalamountineligible="#input-52";
// getShadowElement(overviewtotalamountineligibleShadow,driver,overviewtotalamountineligible).click();
// getShadowElement(overviewtotalamountineligibleShadow,driver,overviewtotalamountineligible).sendKeys("1000");
// for (int i =1;i<=4;i++)
// {
// act.sendKeys(Keys.BACK_SPACE).perform();
// }
//getShadowElement(overviewtotalamountineligibleShadow,driver,overviewtotalamountineligible).clear();
// Thread.sleep(1000);
// getShadowElement(overviewtotalamountineligibleShadow,driver,overviewtotalamountineligible).sendKeys("1000");
// Thread.sleep(1000);
//act.sendKeys("2000");
Thread.sleep(1000);
}

public void populateSpotCheckInternalControlData() throws InterruptedException
{
String[] internalcontrolshadow= {"app-shell","#spot-checks","#report","#internalControls","etools-content-panel > div.row-h.group > paper-textarea","#input-57"};


String internalcontrol="#textarea";
 JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", getShadowElement(internalcontrolshadow,driver,internalcontrol));

getShadowElement(internalcontrolshadow,driver,internalcontrol).clear();
getShadowElement(internalcontrolshadow,driver,internalcontrol).sendKeys("1000");
Thread.sleep(1000);
}
public void populateSpecificProcedureData() throws InterruptedException
{
String[] specificprocedureShadow = {"app-shell","special-audits-page-main","sa-report-page-main","specific-procedure"};
String specificprocedure="etools-content-panel > list-element > div > paper-icon-button:nth-child(1)";
getShadowElement(specificprocedureShadow,driver,specificprocedure).click();
Thread.sleep(1000);

String[] findingShadow = {"app-shell","special-audits-page-main","sa-report-page-main","specific-procedure","paper-textarea","iron-autogrow-textarea"};
String finding="#textarea";
getShadowElement(findingShadow,driver,finding).sendKeys("12");
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);

}

public void populateSummaryOfAuditFindings() {
try {
// summary of audit findings
act=new Actions(driver);
getShadowElement(summaryauditshadow,driver,summaryauditshadowtext).click();
Thread.sleep(2000);
String[] auditexpenditureshadow =  {"app-shell","#audits","#report","#findingsSummary","#audited-expenditure","#currencyInput"};
String auditexpenditure="#input-50 > input";

getShadowElement(auditexpenditureshadow,driver,auditexpenditure).clear();
getShadowElement(auditexpenditureshadow,driver,auditexpenditure).sendKeys("1000");
//act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
String[] financialfindingshadow = {"app-shell","#audits","#report","#findingsSummary","#financial-findings","#currencyInput"};
String financialfinding="#input-51 > input";

getShadowElement(financialfindingshadow,driver,financialfinding).clear();
getShadowElement(financialfindingshadow,driver,financialfinding).sendKeys("100");
Thread.sleep(1000);
String[] auditexplocalshadow = {"app-shell","#audits","#report","findings-summary","#audited-expenditure-local","#currencyInput"};
String auditexplocal="#input-52 > input";

getShadowElement(auditexplocalshadow,driver,auditexplocal).clear();
getShadowElement(auditexplocalshadow,driver,auditexplocal).sendKeys("1000");
Thread.sleep(1000);
String[] financiallocalshadow = {"app-shell","#audits","#report","findings-summary","#financial-findings-local","#currencyInput"};
String financiallocal="#input-53 > input";

getShadowElement(financiallocalshadow,driver,financiallocal).clear();
getShadowElement(financiallocalshadow,driver,financiallocal).sendKeys("1000");
Thread.sleep(1000);
//String[] auditoptiondrpshadow ={"app-shell","#audits","#report","#assignEngagement","#auditOpinionDropDown","#main"};
//String auditoption="#main > iron-icon";
// getShadowElement(auditoptiondrpshadow,driver,auditoption).click();
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
getShadowElement(saveshadow,driver,save).click();
Thread.sleep(5000);

System.out.println("Click save button");
// act.sendKeys(Keys.TAB).perform();
// Thread.sleep(1000);
// act.sendKeys(Keys.TAB).perform();
// Thread.sleep(1000);
} catch (InterruptedException e) {

e.printStackTrace();
}

}



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

}