package com.eTools.testcases;

import org.junit.AfterClass;

import org.junit.BeforeClass;

import org.junit.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;

import com.relevantcodes.extentreports.ExtentTest;

import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentDemo {

static ExtentTest test;

static ExtentReports report;

@BeforeClass

public static void startTest()

{

report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
System.out.println(System.getProperty("user.dir")+"\\ExtentReportResults.html");
test = report.startTest("ExtentDemo");

}

@Test

public void extentReportsDemo()

{
//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");


	WebDriverManager.chromedriver().version("77.0.3865.40").setup();
	//	ChromeOptions options = new ChromeOptions();
	//	options.addArguments("start-maximized"); 
	//	options.addArguments("enable-automation"); 
//		options.addArguments("--no-sandbox"); 
//		options.addArguments("--disable-infobars");
//		options.addArguments("--disable-dev-shm-usage");
//		options.addArguments("--disable-browser-side-navigation"); 
//		options.addArguments("--disable-gpu"); 
	//	driver = new ChromeDriver(options); 
		WebDriver driver = new ChromeDriver(); 
driver.get("https://www.google.co.in");

if(driver.getTitle().equals("Google"))

{

test.log(LogStatus.PASS, "Navigated to the specified URL");

}

else

{

test.log(LogStatus.FAIL, "Test Failed");

}

}
@AfterClass

public static void endTest()
{

report.endTest(test);

report.flush();

}

}