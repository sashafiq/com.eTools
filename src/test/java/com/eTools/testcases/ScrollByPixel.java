package com.eTools.testcases;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.eTools.Pages.LoginPage;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class ScrollByPixel {

    WebDriver driver;
    @Test
    public void ByPixel() throws InterruptedException {
    	
    String encodedBytes = Base64.encode("sashafiq@unicef.org".getBytes());
   	 	System.out.println("encodedBytes "+ new String(encodedBytes));

   	 	byte[] unamedecodedBytes = Base64.decode(encodedBytes);
   	 	System.out.println("Username decodedBytes "+ new String(unamedecodedBytes));
    	
     /*
    	System.setProperty("webdriver.chrome.driver", "D://sa//com.eTools//src//test//resources//Driver//chromedriver.exe");
        driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application		
        driver.get("https://etools-staging.unicef.org/landing/");

        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
        driver.manage().window().maximize();
Thread.sleep(5000);
LoginPage loginPage = new LoginPage();		 
loginPage.clickonSigninBtn();
System prop;
//	loginPage.clickUnicefEmployee();
//	Thread.sleep(TestUtil.MIN_WAIT);
loginPage.UnicefSignIn("sashafiq@unicef.org","Nycb1234");
Thread.sleep(8000);
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,5000)");
        */
    }
}