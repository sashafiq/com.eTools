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


public class PSEA_WorkFlow_Unicef_Test extends TestBase {

public WebDriver driver=null;
public HTMLReport ht;

public  ExcelLib datatable;
public int row;
static ExtentTest pseaUnicefReport;
static ExtentReports report;

LoginPage loginPage;
GridPage GridPage;
AssessmentsListPage assessmentlistPage;
PSEAAssessmenttPage asessmentpage;
PSEAQuestionaryPage questionarypage;
ReportsPage reportspage;
// String path = System.getProperty("user.dir");
String reportPath;
String testdataPath;
public String TestCaseName="PSEA_Unicef_WorkFlowTest";
public String engagementTitle;
PSEAFollowupPage followuppage;
AddActionPointDetailsPage actionpointpage;
public String assessment;
//Constructor
public PSEA_WorkFlow_Unicef_Test() throws IOException{
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
report = new ExtentReports(System.getProperty("user.dir")+"\\PSEA_Unicef_WorkFlowTest.html");
pseaUnicefReport = report.startTest("PSEA_Unicef_WorkFlowTest");
}

@Test(priority=0)
//@Test(groups="SmokeTest")
// @Test(enabled=false)
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
pseaUnicefReport.log(LogStatus.PASS, "Actual  results : eTools | Dashboard displayed");
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
asessmentpage.createNewAssessment("unicefstaff");
assessment=asessmentpage.getAssessments();
System.out.println("Newly created assessment :"+assessment);
pseaUnicefReport.log(LogStatus.PASS, "Newly created assessment : "+assessment);
asessmentpage.assignAssessment();
asessmentpage.clickonQuationaryTab();
questionarypage=new PSEAQuestionaryPage();
questionarypage.fillQuestionary("Unicef");
pseaUnicefReport.log(LogStatus.PASS, "Populate questionary -> assessment : "+asessmentpage);
questionarypage.clickonfollowupTab();
PSEAFollowupPage followuppage=new PSEAFollowupPage();
followuppage.createActionPoint();
followuppage.clickOnsubmitbutton();
pseaUnicefReport.log(LogStatus.PASS, "Submit the assessment  : "+asessmentpage);
followuppage.clickOnfinalizebutton();
pseaUnicefReport.log(LogStatus.PASS, "Finalize the assessment  : "+asessmentpage);
followuppage.clickOnCreatedActionPoint();
actionpointpage= new AddActionPointDetailsPage();
actionpointpage.AddActionsTaken();
actionpointpage.CompleteActionPoint();
String actionpointcompletedmsg=actionpointpage.getActionPointCompleteMsg();
System.out.println("Complete action point:+"+actionpointcompletedmsg);
Assert.assertTrue(actionpointcompletedmsg.contains("Action Point successfully completed"));
ht.WriteResult("Complete Action Point", "Expected  results: Action Point successfully completed", "Actual  results : "+actionpointcompletedmsg, "PASS", "");
pseaUnicefReport.log(LogStatus.PASS, "Complete Action Point : Expected  results: Action Point successfully completed :  Actual  results : "+actionpointcompletedmsg);
Thread.sleep(4000);
closeBrowsers();
}

@AfterTest
public static void endTest()
{
report.endTest(pseaUnicefReport);
report.flush();
}
}
