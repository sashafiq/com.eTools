package com.eTools.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import com.eTools.util.ExcelLib;
import com.eTools.util.HTMLReport;
import com.eTools.util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
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
import com.eTools.Pages.AddActionPointDetailsPage;
import com.eTools.Pages.ActionPointsHomePage;

import com.eTools.base.TestBase;
public class ActionPoints_WorkFlowTest extends TestBase {
	
	public WebDriver driver=null;
	public HTMLReport ht;
	
	public  ExcelLib datatable;
	public int row;

	LoginPage loginPage;
	GridPage GridPage;
	ActionPointsHomePage actionpointsPage;
	AddActionPointDetailsPage addactionpointdetailspage;
	ReportsPage reportspage;
//	String path = System.getProperty("user.dir");
	String reportPath;
	String testdataPath;
	public String TestCaseName="ActionPoints_WorkFlowTest";
	public String engagementTitle;
	//Constructor
	public ActionPoints_WorkFlowTest() throws IOException{
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
	//	datatable=new ExcelLib(testdataPath,"TestData");
				
	}
	@Test(priority=0)	
	
	//@Test(groups="SmokeTest")
//	@Test(enabled=false)
	public void LoginTest(final ITestContext testContext) throws InterruptedException, IOException{
	//	TestCaseName=testContext.getName();
		String browserName = prop.getProperty("browser");
		initialization(browserName);
		//Initializing the login page
		loginPage = new LoginPage();		 
		loginPage.clickonSigninBtn();
	//	loginPage.clickUnicefEmployee();
	//	Thread.sleep(TestUtil.MIN_WAIT);
		loginPage.UnicefSignIn(prop.getProperty("encryuserid"),prop.getProperty("encrypwd"));
		Thread.sleep(8000);
		System.out.println("Login title tite:+"+loginPage.validateLoginPageTitle());		
		Assert.assertEquals(loginPage.validateLoginPageTitle(),"eTools | Dashboard");
		ht.WriteResult("Login Test Step", "Expected  results: eTools | Dashboard should dispay", "Actual  results : eTools | Dashboard displayed", "PASS", "");
		Thread.sleep(1000);
	
	}
			@Test(priority=1)	
	//@Test(groups="SmokeTest")
	//@Test(enabled=false)
	public void createActionPointsTest(final ITestContext testContext) throws InterruptedException, IOException{
		//TestCaseName=testContext.getName();
		//Initialize the GridPage page
		GridPage = new GridPage();
		GridPage.clickGridIcon();
		GridPage.clickAcionPointslink();
		Thread.sleep(2000);
		actionpointsPage=new ActionPointsHomePage();
		actionpointsPage.clickOnaddActionPoint();

		addactionpointdetailspage=new AddActionPointDetailsPage();
		addactionpointdetailspage.createActionPoint();
		String actionpointsavemsg=addactionpointdetailspage.getActionPointSaveMsg();
		System.out.println("Save action point:+"+actionpointsavemsg);
		Assert.assertTrue(actionpointsavemsg.contains("Action Point successfully created"));
		ht.WriteResult("Save Action Point", "Expected  results: Action Point successfully created", "Actual  results : "+actionpointsavemsg, "PASS", "");

		addactionpointdetailspage.AddActionsTaken();
		addactionpointdetailspage.CompleteActionPoint();
		//addactionpointdetailspage.createActionPoint();
		String actionpointcompletedmsg=addactionpointdetailspage.getActionPointCompleteMsg();
		System.out.println("Complete action point:+"+actionpointcompletedmsg);
		Assert.assertTrue(actionpointcompletedmsg.contains("Action Point successfully completed"));
		ht.WriteResult("Complete Action Point", "Expected  results: Action Point successfully completed", "Actual  results : "+actionpointcompletedmsg, "PASS", "");
		
	}
	
}	
	
	

