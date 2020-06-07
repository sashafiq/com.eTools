package com.eTools.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import com.eTools.util.ExcelLib;
import com.eTools.util.HTMLReport;
import com.eTools.util.TestUtil;

import org.openqa.selenium.By;
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
import com.eTools.Pages.ReportsPage;
import com.eTools.base.TestBase;
import com.eTools.Pages.AddNewEngagementPage;

public class FAM_WorkFlow_SpecialAuditTest extends TestBase {

public WebDriver driver=null;
public HTMLReport ht;
static ExtentTest testsa;
static ExtentReports reportsa;
public  ExcelLib datatable;
public int row;

LoginPage loginPage;
GridPage GridPage;
AddNewEngagementPage addnewengpage;
AuditorEngagementPage auditorengpage;
AttachmentsPage attachmentpage;
ReportsPage reportspage;
// String path = System.getProperty("user.dir");
String reportPath;
String testdataPath;
public String TestCaseName="FAM_WorkFlow_MicroAssesmentTest";
public String engagementTitlespaudit;
//Constructor
public FAM_WorkFlow_SpecialAuditTest() throws IOException{
super();
}

@BeforeTest
//Initialize the Input Test data and also HTML Report
public void setUp() throws IOException{
//To call all the methods in the base class.
testdataPath = System.getProperty("user.dir")+ "/src/test/resources/TestData/"+TestCaseName+".xlsx";
reportPath=System.getProperty("user.dir")+ "/src/test/resources/Results/"+TestCaseName+".html";
ht=new HTMLReport(reportPath,TestCaseName);
//Test data initialize
datatable=new ExcelLib(testdataPath,"TestData");
//Extent Report
reportsa = new ExtentReports(System.getProperty("user.dir")+"\\Special_Audit_ExtentReport.html");
testsa = reportsa.startTest("SpecialAudit_Test");

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
// Login Encrypt userid and password
loginPage.UnicefSignIn(prop.getProperty("encryuserid"),prop.getProperty("encrypwd"));
Thread.sleep(9000);
System.out.println("Login title tite:+"+loginPage.validateLoginPageTitle());
Assert.assertEquals(loginPage.validateLoginPageTitle(),"eTools | Dashboard");
ht.WriteResult("Login Test Step", "Expected  results: eTools | Dashboard should dispay", "Actual  results : eTools | Dashboard displayed", "PASS", "");
testsa.log(LogStatus.PASS, "Actual  results : eTools | Dashboard displayed");
}

@Test(priority=1)
//@Test(groups="SmokeTest")
//@Test(enabled=false)
public void createEngagementTest(final ITestContext testContext) throws InterruptedException, IOException{

//Initialize the GridPage page
GridPage = new GridPage();
GridPage.clickGridIcon();
//GridPage.clickFAMLink();
Thread.sleep(9000);
addnewengpage = new AddNewEngagementPage();
addnewengpage.clickOnaddnewEngenment();
String purchseOrder=datatable.getCellValue(1, "PurchaseOrderNo");
addnewengpage.addSpecialAuditNewEngagement(purchseOrder);
Thread.sleep(9000);
//Getting the unique ID and also verifying if the title id empty or not
engagementTitlespaudit=addnewengpage.getSpecialAuditEngagementTitle();
System.out.println("engagement tite:"+engagementTitlespaudit);
Assert.assertFalse(engagementTitlespaudit.isEmpty());//If the engagement title is empty, then the testcase would fail
ht.WriteResult("New Engagement Creation Step", "Expected  results: Create New Engement", "Actual  results : New Engagement created sucessfully, New Enegement Title: "+engagementTitlespaudit, "PASS", "");
testsa.log(LogStatus.PASS, "New Engagement Creation Step:New Engagement created sucessfully, New Enegement Title: "+engagementTitlespaudit);
closeBrowsers();
}

@Test(priority=2)
//@Test(enabled=false)
//@Test(groups="RegressionTest")
public void completeAuditTest() throws InterruptedException, IOException, AWTException{
//String engagementTitlespaudit="ZIM/263CH/SA/2020/117";
initialization(prop.getProperty("incogbrowser"));
loginPage = new LoginPage();
String title = loginPage.validateLoginPageTitle();
Assert.assertEquals(title, "eTools");
loginPage.clickonSigninBtn();
Thread.sleep(9000);
loginPage.auditorSignIn(prop.getProperty("auditorusername"), prop.getProperty("auditorpassword"));
Thread.sleep(9000);
ht.WriteResult("Auditor Login Test Step", "Expected  results: eTools page should dispay in Incognito browser", "Actual  results : eTools page displayed in incognito browser", "PASS", "");

System.out.println("engagement tite in complete audit test:"+engagementTitlespaudit);
auditorengpage = new AuditorEngagementPage();
auditorengpage.selectNewlyCreatedEngagement(engagementTitlespaudit);//this will click the newly created engagement
auditorengpage.clickOnSpecialAuditReportsTab();
//Populate data in Report Page
reportspage=new ReportsPage();
reportspage.populatespecialAuditDataInEngagementStatus();
Thread.sleep(2000);
reportspage.populateSpecificProcedureData();
Thread.sleep(2000);
reportspage.clickOnSpecialAuditAttachmentTab();
// Populate Data in Attachment Tab
attachmentpage= new AttachmentsPage();
attachmentpage.uploadSpecialauditAttachment(prop.getProperty("path"));
attachmentpage.specialAuditreportAttachment(prop.getProperty("path"));
// Save Engagement
// attachmentpage.ClickspecialauditTab();
attachmentpage.clickSpecialAuditSavebtn();
Thread.sleep(4000);
String actsavemsg=attachmentpage.getEngagementMsg();
System.out.println("Save the Engagement : "+actsavemsg);
if (actsavemsg.equalsIgnoreCase("Engagement data has been saved!"))
{
ht.WriteResult("Save Engagement Test Step", "Expected  results: Save the Engagement ", "Actual  results :"+actsavemsg +": msg displayed", "PASS", "");
testsa.log(LogStatus.PASS, "Save Engagement Test Step: Actual  results :"+actsavemsg +": msg displayed");

}
//Submit Engagement
attachmentpage.clickSpecialAuditSubmitbtn();
Thread.sleep(4000);
String actsubmitmsg=attachmentpage.getEngagementMsg();
System.out.println("Submit the Engagement msg: "+actsubmitmsg);

Assert.assertEquals("Engagement has been submitted!", actsubmitmsg);
if (actsubmitmsg.equalsIgnoreCase("Engagement has been submitted!"))
{
ht.WriteResult("Submit Engagement Test Step", "Expected  results: Submit the Engagement", "Actual  results :"+actsubmitmsg +": msg displayed", "PASS", "");
testsa.log(LogStatus.PASS, "Submit Engagement Test Step: Actual  results :"+actsubmitmsg +": msg displayed");

}

closeBrowsers();
}
@Test(priority=3)
//@Test(enabled=false)
public void FinalizeEngagementTest(final ITestContext testContext) throws InterruptedException, IOException{

//String engagementTitlespaudit="ZIM/263CH/SA/2020/118";
Thread.sleep(3000);
String browserName = prop.getProperty("browser");
initialization(browserName);
loginPage = new LoginPage();
loginPage.clickonSigninBtn();
// loginPage.clickUnicefEmployee();
// Thread.sleep(TestUtil.MIN_WAIT);
loginPage.UnicefSignIn(prop.getProperty("encryuserid"),prop.getProperty("encrypwd"));
Thread.sleep(9000);
System.out.println("Login title tite:+"+loginPage.validateLoginPageTitle());
Assert.assertEquals(loginPage.validateLoginPageTitle(),"eTools | Dashboard");
ht.WriteResult("Login Test Step", "Expected  results: eTools | Dashboard should dispay", "Actual  results : eTools | Dashboard displayed", "PASS", "");
GridPage = new GridPage();
GridPage.clickGridIcon();
// GridPage.clickFAMLink();
Thread.sleep(9000);
auditorengpage = new AuditorEngagementPage();
System.out.println("engagement tite -FinalizeEngagementTest:"+engagementTitlespaudit);
auditorengpage.selectNewlyCreatedEngagement(engagementTitlespaudit);
Thread.sleep(4000);
attachmentpage= new AttachmentsPage();
attachmentpage.clickSpecialAuditFinalizebtn();
Thread.sleep(4000);
String actfinlizemsg=attachmentpage.getFinalizeMsg();
Assert.assertEquals("Engagement has been finalized!", actfinlizemsg);
if (actfinlizemsg.equalsIgnoreCase("Engagement has been finalized!"))
{
ht.WriteResult("Submit Finalized Test Step", "Expected  results: Finalize the Engagement", "Actual  results :"+actfinlizemsg +": msg displayed", "PASS", "");
testsa.log(LogStatus.PASS, "Submit Finalized Test Step: Actual  results :"+actfinlizemsg +": msg displayed");

}
closeBrowsers();
}

@AfterTest
public void tearDown(){

reportsa.endTest(testsa);

reportsa.flush();
}


}
