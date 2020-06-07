package com.eTools.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

import com.eTools.util.TestUtil;

public class TestBase {

public static WebDriver driver;
public static Properties prop;
public ExtentReports objExRepo;
public static ExtentTest test;
//Constructor for Test Base - Initialize the config properties file
public TestBase(){
try {
prop = new Properties();
FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/test/java/com/eTools/config/config.properties");
prop.load(ip);
} catch (FileNotFoundException e) {
e.printStackTrace();
} catch (IOException e) {
e.printStackTrace();
}
}

// browser initialization method
public static void initialization(String browsername){
//

if(browsername.equals("chrome")){
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/Driver/chromedriver.exe");
driver = new ChromeDriver();

}
else if (browsername.equals("incognito"))
{
//Incognito browser
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/Driver/chromedriver.exe");
driver = new ChromeDriver();

ChromeOptions options = new ChromeOptions();
options.addArguments("--incognito");
DesiredCapabilities capabilities = DesiredCapabilities.chrome();
capabilities.setCapability(ChromeOptions.CAPABILITY, options);
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/Driver/chromedriver.exe");
driver = new ChromeDriver(capabilities);

}
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
driver.get(prop.getProperty("url"));


}

public static void closeBrowsers()
{
driver.close();
driver.quit();
}


//  Loop until get the shadow root for the Webelement and returns the webelement. Like findelement..Multiple shadow roots
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



//  Loop until get the shadow root for the Webelement and returns the webelement. Like findelement..Multiple shadow roots
public  WebElement getShadowElementbyXPath(String [] shadowroot, WebDriver driver,String element) {

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
rootElement = shadowElement.findElement(By.xpath(shadowroot[loop]));
}
shadowElement = (WebElement) ((JavascriptExecutor) driver)
.executeScript("return arguments[0].shadowRoot",rootElement);

}

return shadowElement.findElement(By.cssSelector(element));
}



// returns the shadow element. If you have one shadowroot, will return shadowroot. One shadow root
public WebElement expandRootElement(WebElement element,WebDriver driver ) {
WebElement ele = (WebElement) ((JavascriptExecutor) driver)
.executeScript("return arguments[0].shadowRoot",element);
return ele;
}
public  WebElement getShadowElement1(String [] shadowroot, WebDriver driver) {

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

return shadowElement;
}

}
