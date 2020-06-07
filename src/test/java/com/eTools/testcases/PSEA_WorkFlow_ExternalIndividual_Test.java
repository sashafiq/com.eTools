package com.eTools.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import com.eTools.util.ExcelLib;
import com.eTools.util.HTMLReport;
import com.eTools.util.TestUtil;
import com.relevantcodes.extentreports.LogStatus;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.eTools.Pages.AttachmentsPage;
import com.eTools.Pages.AuditorEngagementPage;
import com.eTools.Pages.GridPage;
import com.eTools.Pages.LoginPage;
import com.eTools.Pages.PSEAAssessmenttPage;
import com.eTools.Pages.PSEAFollowupPage;
import com.eTools.Pages.PSEAQuestionaryPage;
import com.eTools.Pages.ReportsPage;
import com.eTools.base.TestBase;
import com.eTools.Pages.AddNewEngagementPage;
import com.eTools.Pages.AssessmentsListPage;
import com.eTools.Pages.AddActionPointDetailsPage;
import com.eTools.Pages.AddNewAssessmentPage;
import com.eTools.Pages.ActionPointsHomePage;
import com.relevantcodes.extentreports.LogStatus;
import com.eTools.base.TestBase;
import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class PSEA_WorkFlow_ExternalIndividual_Test extends TestBase {

public WebDriver driver=null;
public HTMLReport ht;

public  ExcelLib datatable;
public int row;
static ExtentTest externalIndReport;
static ExtentReports report;
LoginPage loginPage;
GridPage GridPage;
AssessmentsListPage assessmentlistPage;
PSEAAssessmenttPage asessmentpage;
PSEAQuestionaryPage questionarypage;
ReportsPage reportspage;
String reportPath;
String testdataPath;
public String TestCaseName="PSEA_Extern_WorkFlowTest";
public String engagementTitle;
PSEAFollowupPage followuppage;
public String assessment;
AddActionPointDetailsPage actionpointpage;
//Constructor
public PSEA_WorkFlow_ExternalIndividual_Test() throws IOException{
super();
}

@BeforeTest
//Initialize the Input Test data and also HTML Report
public void setUp() throws IOException{
//To call all the methods in the base class.
//Getting data from excel
testdataPath = System.getProperty("user.dir")+ "/src/test/resources/TestData/"+TestCaseName+".xlsx";
reportPath=System.getProperty("user.dir")+ "/src/test/resources/Results/"+TestCaseName+".html";
ht=new HTMLReport(reportPath,TestCaseName);
//Test data initialize
report = new ExtentReports(System.getProperty("user.dir")+"\\PSEA_Extern_WorkFlowTest.html");
externalIndReport = report.startTest("PSEA_Extern_WorkFlowTest");
}

@Test(priority=0)
//@Test(groups="SmokeTest")
//@Test(enabled=false)
public void LoginTest(final ITestContext testContext) throws InterruptedException, IOException{
String browserName = prop.getProperty("browser");
initialization(browserName);
//Initializing the login page
loginPage = new LoginPage();
loginPage.clickonSigninBtn();
loginPage.UnicefSignIn(prop.getProperty("encryuserid"),prop.getProperty("encrypwd"));
Thread.sleep(8000);
System.out.println("Login title tite:+"+loginPage.validateLoginPageTitle());
Assert.assertEquals(loginPage.validateLoginPageTitle(),"eTools | Dashboard");
ht.WriteResult("Login Test Step", "Expected  results: eTools | Dashboard should dispay", "Actual  results : eTools | Dashboard displayed", "PASS", "");
externalIndReport.log(LogStatus.PASS, "Actual  results : eTools | Dashboard displayed");
Thread.sleep(1000);
}

@Test(priority=1)
//@Test(groups="SmokeTest")
//@Test(enabled=false)
public void AddNewAssessmentTest(final ITestContext testContext) throws InterruptedException, IOException{
//Initialize the GridPage page
GridPage = new GridPage();
GridPage.clickGridIcon();
//GridPage.clickPSEALink();;
Thread.sleep(9000);
assessmentlistPage=new AssessmentsListPage();
assessmentlistPage.clickOnaddNewAssessment();
asessmentpage= new PSEAAssessmenttPage();
asessmentpage.createNewAssessment("ExternalIndividual");
assessment=asessmentpage.getAssessments();
System.out.println("Newly created assessment :"+assessment);
externalIndReport.log(LogStatus.PASS, "Newly created assessment : "+assessment);
asessmentpage.assignAssessment();
Thread.sleep(5000);
closeBrowsers();
}

@Test(priority=2)
//@Test(groups="SmokeTest")
//@Test(enabled=false)
public void SubmitAuditTest() throws InterruptedException, IOException, AWTException{
//String assessment="ZIM/2020PSEA20";
initialization(prop.getProperty("incogbrowser"));
loginPage = new LoginPage();
String title = loginPage.validateLoginPageTitle();
Assert.assertEquals(title, "eTools");
loginPage.clickonSigninBtn();
Thread.sleep(3000);
loginPage.auditorSignIn(prop.getProperty("externindividualaudior"), prop.getProperty("auditorpassword"));
Thread.sleep(4000);
externalIndReport.log(LogStatus.PASS, "Actual  results : Audir login -> eTools | Dashboard displayed");
ht.WriteResult("Auditor Login Test Step", "Expected  results: eTools page should dispay in Incognito browser", "Actual  results : eTools page displayed in incognito browser", "PASS", "");
System.out.println("assessment tite in complete audit test:"+assessment);
assessmentlistPage=new AssessmentsListPage();
assessmentlistPage.ClickAssessment(assessment);
asessmentpage= new PSEAAssessmenttPage();
asessmentpage.clickonQuationaryTab();
questionarypage=new PSEAQuestionaryPage();
questionarypage.fillQuestionary("External");
Thread.sleep(6000);
externalIndReport.log(LogStatus.PASS, "Populate questionary -> assessment : "+assessment);
questionarypage.clickOnsubmitbutton();
Thread.sleep(3000);
externalIndReport.log(LogStatus.PASS, "Submit the assessment : "+assessment);
closeBrowsers();
}

@Test(priority=3)
//@Test(groups="SmokeTest")
//@Test(enabled=false)
public void FinalizeAuditTest() throws InterruptedException, IOException, AWTException{
//String assessment="ZIM/2020PSEA20";
String browserName = prop.getProperty("browser");
initialization(browserName);
//Initializing the login page
loginPage = new LoginPage();
loginPage.clickonSigninBtn();
loginPage.UnicefSignIn(prop.getProperty("encryuserid"),prop.getProperty("encrypwd"));
Thread.sleep(8000);
System.out.println("Login title tite:+"+loginPage.validateLoginPageTitle());
Assert.assertEquals(loginPage.validateLoginPageTitle(),"eTools | Dashboard");
ht.WriteResult("Login Test Step", "Expected  results: eTools | Dashboard should dispay", "Actual  results : eTools | Dashboard displayed", "PASS", "");
externalIndReport.log(LogStatus.PASS, "Actual  results : eTools | Dashboard displayed");
Thread.sleep(1000);
GridPage = new GridPage();
GridPage.clickGridIcon();
//GridPage.clickPSEALink();
Thread.sleep(4000);
assessmentlistPage=new AssessmentsListPage();
assessmentlistPage.ClickAssessment(assessment);
questionarypage=new PSEAQuestionaryPage();
questionarypage.clickonfollowupTab();
followuppage=new PSEAFollowupPage();
followuppage.createActionPointExternal();
Thread.sleep(4000);
externalIndReport.log(LogStatus.PASS, "Create Action Point : "+assessment);
followuppage.clickOnfinalizebutton();
externalIndReport.log(LogStatus.PASS, "Finalize the assessment : "+assessment);
followuppage.clickOnCreatedActionPoint();
actionpointpage= new AddActionPointDetailsPage();

actionpointpage.AddActionsTaken();
Thread.sleep(3000);
actionpointpage.CompleteActionPoint();
String actionpointcompletedmsg=actionpointpage.getActionPointCompleteMsg();
System.out.println("Complete action point:+"+actionpointcompletedmsg);
Assert.assertTrue(actionpointcompletedmsg.contains("Action Point successfully completed")); ht.WriteResult("Complete Action Point", "Expected  results: Action Point successfully completed", "Actual  results : "+actionpointcompletedmsg, "PASS", "");
externalIndReport.log(LogStatus.PASS, "Complete Action Point : Expected  results: Action Point successfully completed :  Actual  results : "+actionpointcompletedmsg);
Thread.sleep(4000);
closeBrowsers();
}

@AfterTest
public static void endTest()
{
report.endTest(externalIndReport);
report.flush();
}

}