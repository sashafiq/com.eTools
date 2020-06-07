package com.eTools.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

public class AttachmentsPage extends TestBase {
private Actions act;
private Actions act1;

public AttachmentsPage() throws InterruptedException
{
Thread.sleep(2000);
}
public void getwindow() throws InterruptedException
{
// String windowhandle=driver.getWindowHandle();
// System.out.println("single window handle name :"+ windowhandle);
// Thread.sleep(2000);

Set<String> windowhandes = driver.getWindowHandles();
System.out.println("post click button, display 2 window handles");

int size = windowhandes.size();

for (String i: windowhandes) {
System.out.println("in loop");
    System.out.println(i);
    System.out.println("Window title :"+driver.switchTo().window(i).getTitle());
    driver.switchTo().window(i);
driver.navigate().refresh();    
}

}
public void uploadAttachment(String path) throws AWTException
{
try {
act= new Actions(driver);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
String[] documenttypeShadow = {"app-shell","audits-page-main","file-attachments-tab","etools-dropdown","paper-input"};
String documenttypeIcon="#input-82 > input";

getShadowElement(documenttypeShadow,driver,documenttypeIcon).click();
Thread.sleep(2000);
// act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
System.out.println("Path in attachment tab:"+path);
String[] uploadbtnShadow = {"app-shell","audits-page-main","file-attachments-tab","etools-upload"};
String uploadbtnIcon="paper-input-container > div > paper-button > iron-icon";
getShadowElement(uploadbtnShadow,driver,uploadbtnIcon).click();
Thread.sleep(2000);
//AWT robot concept
StringSelection ss = new StringSelection(path);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
   //imitate mouse events like ENTER, CTRL+C, CTRL+V
 Robot robot = new Robot();
   robot.keyPress(KeyEvent.VK_ENTER);
   robot.keyRelease(KeyEvent.VK_ENTER);
   robot.keyPress(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_ENTER);
  robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(3000);
// System.out.println("Clicked tab and enter");
// String[] uploadbtnShadow = {"app-shell","audits-page-main","file-attachments-tab","etools-upload"};
// act.sendKeys(path).perform();
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);
// String[] attachShadow = {"app-shell","audits-page-main","file-attachments-tab","etools-dialog"};
// String attachbtn="div.iron-selected > #engagement_attachments > #attachDoc > #dialog > div > paper-button.confirm-btn";

// getShadowElement(attachShadow,driver,attachbtn).click();
// Thread.sleep(2000);

} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public void specialAuditreportAttachment(String path) throws AWTException
{
try {
act= new Actions(driver);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
String[] reporttypeShadow = {"app-shell","#special-audits","#report_attachments","#fileType"};
String reporttypeIcon="#main";

getShadowElement(reporttypeShadow,driver, reporttypeIcon).click();


Thread.sleep(2000);
String[] reportShadow = {"app-shell","#special-audits","#report_attachments","#fileType","#optionsList"};

String report="paper-listbox > paper-icon-item:nth-child(2) > paper-item-body";
  getShadowElement(reportShadow,driver, report).click();
//act.sendKeys(Keys.TAB).perform();
// act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);

System.out.println("Path in attachment tab:"+path);
String[] reportuploadbtnShadow = {"app-shell","#special-audits","#report_attachments","#attachDoc > div > div > div.row-h.group.padd-top > etools-upload"};
String uploadbtnIcon="paper-input-container > div > paper-button > iron-icon";


getShadowElement(reportuploadbtnShadow,driver,uploadbtnIcon).click();
Thread.sleep(2000);


//AWT robot concept
StringSelection ss = new StringSelection(path);
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

   //imitate mouse events like ENTER, CTRL+C, CTRL+V
   Robot robot = new Robot();
   robot.keyPress(KeyEvent.VK_ENTER);
   robot.keyRelease(KeyEvent.VK_ENTER);
   robot.keyPress(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_ENTER);
  robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);

//System.out.println("Clicked tab and enter");
// String[] uploadbtnShadow = {"app-shell","audits-page-main","file-attachments-tab","etools-upload"};
// act.sendKeys(path).perform();
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);

// String[] attachShadow = {"body > etools-dialog:nth-child(10)"};
// String attachbtn="#dialog > div > paper-button.confirm-btn";

// getShadowElement(attachShadow,driver,attachbtn).click();
// Thread.sleep(2000);

//Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public void uploadSpotCheckreportAttachment(String path) throws AWTException
{
try
{
act= new Actions(driver);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
String[] documenttypeShadow = {"app-shell","#spot-checks","#engagement_attachments","#fileType"};
String documenttypeIcon="#main";

getShadowElement(documenttypeShadow,driver,documenttypeIcon).click();
Thread.sleep(2000);
//act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);

System.out.println("Path in attachment tab:"+path);
String[] uploadbtnShadow = {"app-shell","#spot-checks","#engagement_attachments","#attachDoc > div > div > div.row-h.group.padd-top > etools-upload"};
String uploadbtnIcon="paper-input-container > div > paper-button > iron-icon";

getShadowElement(uploadbtnShadow,driver,uploadbtnIcon).click();
Thread.sleep(2000);

//AWT robot concept
StringSelection ss = new StringSelection(path);
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

   //imitate mouse events like ENTER, CTRL+C, CTRL+V
   Robot robot = new Robot();
   robot.keyPress(KeyEvent.VK_ENTER);
   robot.keyRelease(KeyEvent.VK_ENTER);
   robot.keyPress(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_ENTER);
  robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);

System.out.println("Clicked tab and enter");
// String[] uploadbtnShadow = {"app-shell","audits-page-main","file-attachments-tab","etools-upload"};
// act.sendKeys(path).perform();
act.sendKeys(Keys.TAB).perform();
Thread.sleep(3000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(3000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(3000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(3000);

// String[] attachShadow = {"app-shell","audits-page-main","file-attachments-tab","etools-dialog"};
// String attachbtn="div.iron-selected > #engagement_attachments > #attachDoc > #dialog > div > paper-button.confirm-btn";

// getShadowElement(attachShadow,driver,attachbtn).click();
// Thread.sleep(2000);

//Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}

public void SpotCheckreportAttachment(String path) throws AWTException
{
try {
act= new Actions(driver);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
String[] reporttypeShadow = {"app-shell","#spot-checks","#report_attachments","#fileType"};
String reporttypeIcon="#main";

getShadowElement(reporttypeShadow,driver, reporttypeIcon).click();
Thread.sleep(2000);
//act.sendKeys(Keys.TAB).perform();
//act.sendKeys(Keys.ENTER).perform();
String[] reportShadow = {"app-shell","#spot-checks","#report_attachments","#fileType","#optionsList"};

String report="paper-listbox > paper-icon-item:nth-child(2) > paper-item-body";
  getShadowElement(reportShadow,driver, report).click();

Thread.sleep(1000);
System.out.println("Path in attachment tab:"+path);
      String[] reportuploadbtnShadow = {"app-shell","#spot-checks","#report_attachments","#attachDoc > div > div > div.row-h.group.padd-top > etools-upload"};
String uploadbtnIcon="paper-input-container > div > paper-button > iron-icon";

getShadowElement(reportuploadbtnShadow,driver,uploadbtnIcon).click();
Thread.sleep(2000);

//AWT robot concept
StringSelection ss = new StringSelection(path);
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

   //imitate mouse events like ENTER, CTRL+C, CTRL+V
   Robot robot = new Robot();
   robot.keyPress(KeyEvent.VK_ENTER);
   robot.keyRelease(KeyEvent.VK_ENTER);
   robot.keyPress(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_ENTER);
  robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);

//System.out.println("Clicked tab and enter");
// String[] uploadbtnShadow = {"app-shell","audits-page-main","file-attachments-tab","etools-upload"};
// act.sendKeys(path).perform();
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);

// String[] attachShadow = {"body > etools-dialog:nth-child(10)"};
// String attachbtn="#dialog > div > paper-button.confirm-btn";

// getShadowElement(attachShadow,driver,attachbtn).click();
// Thread.sleep(2000);

//Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}



public void uploadMicroAssessmentAttachment(String path) throws AWTException
{
try
{
act= new Actions(driver);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
String[] documenttypeShadow = {"app-shell","#micro-assessments","#engagement_attachments","#fileType"};
String documenttypeIcon="#main";

getShadowElement(documenttypeShadow,driver,documenttypeIcon).click();
Thread.sleep(2000);
//act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);

System.out.println("Path in attachment tab:"+path);
String[] uploadbtnShadow = {"app-shell","#micro-assessments","#engagement_attachments","#attachDoc > div > div > div.row-h.group.padd-top > etools-upload"};
String uploadbtnIcon="paper-input-container > div > paper-button > iron-icon";

getShadowElement(uploadbtnShadow,driver,uploadbtnIcon).click();
Thread.sleep(2000);

//AWT robot concept
StringSelection ss = new StringSelection(path);
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

   //imitate mouse events like ENTER, CTRL+C, CTRL+V
   Robot robot = new Robot();
   robot.keyPress(KeyEvent.VK_ENTER);
   robot.keyRelease(KeyEvent.VK_ENTER);
   robot.keyPress(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_ENTER);
  robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);

System.out.println("Clicked tab and enter");
// String[] uploadbtnShadow = {"app-shell","audits-page-main","file-attachments-tab","etools-upload"};
// act.sendKeys(path).perform();
act.sendKeys(Keys.TAB).perform();
Thread.sleep(3000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(3000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(3000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(3000);

// String[] attachShadow = {"app-shell","audits-page-main","file-attachments-tab","etools-dialog"};
// String attachbtn="div.iron-selected > #engagement_attachments > #attachDoc > #dialog > div > paper-button.confirm-btn";

// getShadowElement(attachShadow,driver,attachbtn).click();
// Thread.sleep(2000);

//Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}

public void MicroAssessmentreportAttachment(String path) throws AWTException
{
try {
act= new Actions(driver);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
String[] reporttypeShadow = {"app-shell","#micro-assessments","#report_attachments","#fileType"};
String reporttypeIcon="#main";

getShadowElement(reporttypeShadow,driver, reporttypeIcon).click();
Thread.sleep(2000);
//act.sendKeys(Keys.TAB).perform();
//act.sendKeys(Keys.ENTER).perform();
String[] reportShadow = {"app-shell","#micro-assessments","#report_attachments","#fileType","#optionsList"};

String report="paper-listbox > paper-icon-item:nth-child(2) > paper-item-body";
  getShadowElement(reportShadow,driver, report).click();
Thread.sleep(1000);
System.out.println("Path in attachment tab:"+path);
      String[] reportuploadbtnShadow = {"app-shell","#micro-assessments","#report_attachments","#attachDoc > div > div > div.row-h.group.padd-top > etools-upload"};
String uploadbtnIcon="paper-input-container > div > paper-button > iron-icon";

getShadowElement(reportuploadbtnShadow,driver,uploadbtnIcon).click();
Thread.sleep(2000);

//AWT robot concept
StringSelection ss = new StringSelection(path);
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

   //imitate mouse events like ENTER, CTRL+C, CTRL+V
   Robot robot = new Robot();
   robot.keyPress(KeyEvent.VK_ENTER);
   robot.keyRelease(KeyEvent.VK_ENTER);
   robot.keyPress(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_ENTER);
  robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);

//System.out.println("Clicked tab and enter");
// String[] uploadbtnShadow = {"app-shell","audits-page-main","file-attachments-tab","etools-upload"};
// act.sendKeys(path).perform();
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);

// String[] attachShadow = {"body > etools-dialog:nth-child(10)"};
// String attachbtn="#dialog > div > paper-button.confirm-btn";

// getShadowElement(attachShadow,driver,attachbtn).click();
// Thread.sleep(2000);

//Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}


public void UploadspecialAuditreportAttachment(String path) throws AWTException
{
try {
act= new Actions(driver);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
String[] reporttypeShadow = {"app-shell","#spot-checks","#report_attachments","#fileType","#main"};
String reporttypeIcon=" #input-55 > input";

getShadowElement(reporttypeShadow,driver, reporttypeIcon).click();


Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);

System.out.println("Path in attachment tab:"+path);
String[] reportuploadbtnShadow = {"app-shell","#spot-checks","#report_attachments","#attachDoc > div > div > div.row-h.group.padd-top > etools-upload"};
String uploadbtnIcon="paper-input-container > div > paper-button > iron-icon";


getShadowElement(reportuploadbtnShadow,driver,uploadbtnIcon).click();
Thread.sleep(2000);


//AWT robot concept
StringSelection ss = new StringSelection(path);
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

   //imitate mouse events like ENTER, CTRL+C, CTRL+V
   Robot robot = new Robot();
   robot.keyPress(KeyEvent.VK_ENTER);
   robot.keyRelease(KeyEvent.VK_ENTER);
   robot.keyPress(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_ENTER);
  robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(3000);

//System.out.println("Clicked tab and enter");
// String[] uploadbtnShadow = {"app-shell","audits-page-main","file-attachments-tab","etools-upload"};
// act.sendKeys(path).perform();
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);

// String[] attachShadow = {"body > etools-dialog:nth-child(10)"};
// String attachbtn="#dialog > div > paper-button.confirm-btn";

// getShadowElement(attachShadow,driver,attachbtn).click();
// Thread.sleep(2000);

//Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public void reportAttachment(String path) throws AWTException
{
try {
act= new Actions(driver);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
String[] reporttypeShadow = {"app-shell","#audits","#report_attachments","#fileType","#main"};
String reporttypeIcon="#input-86 > input";


getShadowElement(reporttypeShadow,driver, reporttypeIcon).click();
Thread.sleep(2000);
//act.sendKeys(Keys.TAB).perform();
// act.sendKeys(Keys.ARROW_DOWN).perform();
String[] reportShadow = {"app-shell","#audits","#report_attachments","#fileType","#optionsList"};

String report="paper-listbox > paper-icon-item:nth-child(2) > paper-item-body";
  getShadowElement(reportShadow,driver, report).click();
// act.sendKeys(Keys.PAGE_DOWN).perform();
// Thread.sleep(1000);
//act.sendKeys(Keys.PAGE_DOWN).perform();
//Thread.sleep(1000);
// act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);
// act.sendKeys(Keys.ENTER).perform();
// Thread.sleep(1000);
System.out.println("Path in attachment tab:"+path);
String[] reportuploadbtnShadow = {"app-shell","#audits","#report_attachments","#attachDoc > div > div > div.row-h.group.padd-top > etools-upload"};
String uploadbtnIcon="paper-input-container > div > paper-button > iron-icon";
getShadowElement(reportuploadbtnShadow,driver,uploadbtnIcon).click();
Thread.sleep(2000);

//AWT robot concept
StringSelection ss = new StringSelection(path);
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

   //imitate mouse events like ENTER, CTRL+C, CTRL+V
   Robot robot = new Robot();
   robot.keyPress(KeyEvent.VK_ENTER);
   robot.keyRelease(KeyEvent.VK_ENTER);
   robot.keyPress(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_ENTER);
  robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(3000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);

//Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public void ClickTab() throws InterruptedException
{
System.out.println("ClickTab Method");
Thread.sleep(5000);
act= new Actions(driver);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
//act.sendKeys(Keys.TAB).perform();
//Thread.sleep(2000);
}
public void ClickspecialauditTab() throws InterruptedException
{
System.out.println("ClickspecialauditTab  Method");
Thread.sleep(5000);
act= new Actions(driver);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
}
public void uploadSpotCheckAttachment(String path) throws AWTException
{
try {
act= new Actions(driver);
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();


Thread.sleep(5000);


act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);

act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(2000);

String[] uploadbtnShadow = {"app-shell","spot-checks-page-main","#report_attachments"};
String uploadbtnIcon="#uploadButton > iron-icon";

getShadowElement(uploadbtnShadow,driver,uploadbtnIcon).click();
Thread.sleep(2000);

//AWT robot concept
StringSelection ss = new StringSelection(path);
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

   //imitate mouse events like ENTER, CTRL+C, CTRL+V
   Robot robot = new Robot();
   robot.keyPress(KeyEvent.VK_ENTER);
   robot.keyRelease(KeyEvent.VK_ENTER);
   robot.keyPress(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_ENTER);
  robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(1000);

//FF System.out.println("Clicked tab and enter");
// String[] attachdbtnShadow = {"app-shell","audits-page-main","file-attachments-tab","etools-dialog"};
// String attachbtnIcon="#dialog > div > paper-button.confirm-btn";

//getShadowElement(attachdbtnShadow, driver,attachbtnIcon).click();
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);


Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public void uploadSpecialauditAttachment(String path) throws AWTException
{
try {
act= new Actions(driver);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
String[] documenttypeShadow = {"app-shell","#special-audits","#engagement_attachments","#fileType"};
String documenttypeIcon="#main";

getShadowElement(documenttypeShadow,driver,documenttypeIcon).click();
Thread.sleep(2000);
//act.sendKeys(Keys.TAB).perform();
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);

System.out.println("Path in attachment tab:"+path);
String[] uploadbtnShadow = {"app-shell","#special-audits","#engagement_attachments","#attachDoc > div > div > div.row-h.group.padd-top > etools-upload"};
String uploadbtnIcon="paper-input-container > div > paper-button > iron-icon";

getShadowElement(uploadbtnShadow,driver,uploadbtnIcon).click();
Thread.sleep(2000);

//AWT robot concept
StringSelection ss = new StringSelection(path);
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

   //imitate mouse events like ENTER, CTRL+C, CTRL+V
   Robot robot = new Robot();
   robot.keyPress(KeyEvent.VK_ENTER);
   robot.keyRelease(KeyEvent.VK_ENTER);
   robot.keyPress(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_V);
   robot.keyRelease(KeyEvent.VK_CONTROL);
   robot.keyPress(KeyEvent.VK_ENTER);
  robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(3000);

System.out.println("Clicked tab and enter");
// String[] uploadbtnShadow = {"app-shell","audits-page-main","file-attachments-tab","etools-upload"};
// act.sendKeys(path).perform();
act.sendKeys(Keys.TAB).perform();
Thread.sleep(3000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(3000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(3000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(3000);

// String[] attachShadow = {"app-shell","audits-page-main","file-attachments-tab","etools-dialog"};
// String attachbtn="div.iron-selected > #engagement_attachments > #attachDoc > #dialog > div > paper-button.confirm-btn";

// getShadowElement(attachShadow,driver,attachbtn).click();
// Thread.sleep(2000);

//Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}




}

public void clickSavebtn() throws InterruptedException
{
System.out.println("clickSavebtn");
/*
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,5000)");
Actions act1= new Actions(driver);
act1.sendKeys(Keys.PAGE_DOWN).perform();
act1.sendKeys(Keys.TAB).perform();
act1.sendKeys(Keys.TAB).perform();
*/
Thread.sleep(1000);
String[] savebtnShadow = {"app-shell","audits-page-main","status-tab-element","action-buttons"};
String savebtnIcon="paper-button";

JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", getShadowElement(savebtnShadow, driver,savebtnIcon));

// act.sendKeys(Keys.TAB).perform();
// Thread.sleep(1000);
// act.sendKeys(Keys.TAB).perform();
// Thread.sleep(1000);
getShadowElement(savebtnShadow, driver,savebtnIcon).click();
Thread.sleep(3000);
}
public void clickSpecialAuditSavebtn() throws InterruptedException
{
String[] savebtnShadow = {"app-shell","#special-audits","#sidebar > status-tab-element","etools-content-panel > div.status-buttons > action-buttons"};
String savebtnIcon="paper-button";
JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", getShadowElement(savebtnShadow, driver,savebtnIcon));

getShadowElement(savebtnShadow, driver,savebtnIcon).click();
Thread.sleep(2000);
}
public void clickSpotCheckSavebtn()
{
String[] savebtnShadow = {"app-shell","#spot-checks","#sidebar > status-tab-element","etools-content-panel > div.status-buttons > action-buttons"};
String savebtnIcon="paper-button";
 JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", getShadowElement(savebtnShadow, driver,savebtnIcon));

getShadowElement(savebtnShadow, driver,savebtnIcon).click();
}
public void clickMicroAssessmentSavebtn()
{
String[] savebtnShadow = {"app-shell","#micro-assessments","#sidebar > status-tab-element","etools-content-panel > div.status-buttons > action-buttons"};
String savebtnIcon="paper-button";
 JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", getShadowElement(savebtnShadow, driver,savebtnIcon));

getShadowElement(savebtnShadow, driver,savebtnIcon).click();
}
public String getEngagementMsg()
{
String[] engagementsaveShadow = {"app-shell","multi-notification-list","multi-notification-item"};
String engagementsavemsg="span";

return getShadowElement(engagementsaveShadow, driver,engagementsavemsg).getText();


}

public void clickSubmitbtn() throws InterruptedException
{

String[] submitbtndrpShadow = {"app-shell","audits-page-main","status-tab-element","action-buttons","paper-icon-button"};
String submitbtndrpIcon="#icon";

getShadowElement(submitbtndrpShadow, driver,submitbtndrpIcon).click();
Thread.sleep(1000);
String[] submitbtnShadow = {"app-shell","audits-page-main","status-tab-element","action-buttons"};
String submitbtnIcon="paper-button > paper-menu-button > div > div";

getShadowElement(submitbtnShadow, driver,submitbtnIcon).click();
Thread.sleep(2000);
// String[] yesShadow = {"etools-dialog"};
// String yesbtnIcon="#dialog > div > paper-button.confirm-btn";

//getShadowElement(yesShadow, driver,yesbtnIcon).click();

// String[] yesShadow ={"body > etools-dialog:nth-child(10)"};
String yesbtnIcon="#dialog > div > paper-button.confirm-btn";

WebElement rootElement = driver.findElement(By.cssSelector("body > etools-dialog:nth-child(10)"));
WebElement shadowElement = (WebElement) ((JavascriptExecutor) driver)
.executeScript("return arguments[0].shadowRoot",rootElement);

shadowElement.findElement(By.cssSelector(yesbtnIcon)).click();

//getShadowElement(yesShadow, driver,yesbtnIcon).click();
/*
act= new Actions(driver);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(2000);
// act.sendKeys(Keys.TAB).perform();
//Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(1000);
act.sendKeys(Keys.ENTER).perform();
*/
Thread.sleep(3000);

}
public void clickSpecialAuditSubmitbtn() throws InterruptedException
{

String[] submitbtndrpShadow = {"app-shell","special-audits-page-main","status-tab-element","action-buttons","paper-icon-button"};
String submitbtndrpIcon="#icon";
getShadowElement(submitbtndrpShadow, driver,submitbtndrpIcon).click();
Thread.sleep(1000);
String[] submitbtnShadow = {"app-shell","special-audits-page-main","status-tab-element","action-buttons"};
String submitbtnIcon="paper-button > paper-menu-button > div > div";
getShadowElement(submitbtnShadow, driver,submitbtnIcon).click();
Thread.sleep(3000);
String yesbtnIcon="#dialog > div > paper-button.confirm-btn";
WebElement rootElement = driver.findElement(By.cssSelector("body > etools-dialog:nth-child(10)"));
WebElement shadowElement = (WebElement) ((JavascriptExecutor) driver)
.executeScript("return arguments[0].shadowRoot",rootElement);

shadowElement.findElement(By.cssSelector(yesbtnIcon)).click();
Thread.sleep(1000);
}
public void clickSpotCheckSubmitbtn() throws InterruptedException
{

String[] submitbtndrpShadow = {"app-shell","#spot-checks","status-tab-element","action-buttons","paper-icon-button"};
String submitbtndrpIcon="#icon";
getShadowElement(submitbtndrpShadow, driver,submitbtndrpIcon).click();
Thread.sleep(1000);
String[] submitbtnShadow = {"app-shell","#spot-checks","status-tab-element","action-buttons"};
String submitbtnIcon="paper-button > paper-menu-button > div > div";
getShadowElement(submitbtnShadow, driver,submitbtnIcon).click();
Thread.sleep(3000);
String yesbtnIcon="#dialog > div > paper-button.confirm-btn";
WebElement rootElement = driver.findElement(By.cssSelector("body > etools-dialog:nth-child(10)"));
WebElement shadowElement = (WebElement) ((JavascriptExecutor) driver)
.executeScript("return arguments[0].shadowRoot",rootElement);

shadowElement.findElement(By.cssSelector(yesbtnIcon)).click();
Thread.sleep(1000);

}
public void clickMicroAssessmentSubmitbtn() throws InterruptedException
{

String[] submitbtndrpShadow = {"app-shell","#micro-assessments","status-tab-element","action-buttons","paper-icon-button"};
String submitbtndrpIcon="#icon";
getShadowElement(submitbtndrpShadow, driver,submitbtndrpIcon).click();
Thread.sleep(1000);
String[] submitbtnShadow = {"app-shell","#micro-assessments","status-tab-element","action-buttons"};
String submitbtnIcon="paper-button > paper-menu-button > div > div";
getShadowElement(submitbtnShadow, driver,submitbtnIcon).click();
Thread.sleep(3000);
String yesbtnIcon="#dialog > div > paper-button.confirm-btn";
WebElement rootElement = driver.findElement(By.cssSelector("body > etools-dialog:nth-child(10)"));
WebElement shadowElement = (WebElement) ((JavascriptExecutor) driver)
.executeScript("return arguments[0].shadowRoot",rootElement);

shadowElement.findElement(By.cssSelector(yesbtnIcon)).click();
Thread.sleep(1000);

}

public void clickFinalizebtn() throws InterruptedException
{
/*
for (int i =1;i<21;i++)
{
act= new Actions(driver);
act.sendKeys(Keys.TAB).perform();
Thread.sleep(1000);
}
*/
String[] submitbtndrpShadow = {"app-shell","#audits","#sidebar > status-tab-element","etools-content-panel > div.status-buttons > action-buttons"};
String submitbtndrpIcon="paper-button > paper-menu-button > paper-icon-button";
JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript("arguments[0].scrollIntoView();", getShadowElement(submitbtndrpShadow, driver,submitbtndrpIcon));
getShadowElement(submitbtndrpShadow, driver,submitbtndrpIcon).click();
Thread.sleep(1000);
String[] submitbtnShadow = {"app-shell","#audits","#sidebar > status-tab-element","etools-content-panel > div.status-buttons > action-buttons"};
String submitbtnIcon="paper-button > paper-menu-button > div > div";
getShadowElement(submitbtnShadow, driver,submitbtnIcon).click();

// String[] yesShadow = {"etools-dialog"};
// String yesbtnIcon="#dialog > div > paper-button.confirm-btn";

//getShadowElement(yesShadow, driver,yesbtnIcon).click();

// String[] finalizebtnShadow = {"app-shell","audits-page-main","status-tab-element","action-buttons"};
// String finalizebtnIcon="paper-button > span";

// getShadowElement(finalizebtnShadow, driver,finalizebtnIcon).click();
// Thread.sleep(4000);
}
public void clickSpecialAuditFinalizebtn() throws InterruptedException
{
String[] submitbtndrpShadow = {"app-shell","#special-audits","#sidebar > status-tab-element","etools-content-panel > div.status-buttons > action-buttons"};
String submitbtndrpIcon="paper-button > paper-menu-button > paper-icon-button";

JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", getShadowElement(submitbtndrpShadow, driver,submitbtndrpIcon));

getShadowElement(submitbtndrpShadow, driver,submitbtndrpIcon).click();
Thread.sleep(1000);
String[] submitbtnShadow = {"app-shell","#special-audits","#sidebar > status-tab-element","etools-content-panel > div.status-buttons > action-buttons"};
String submitbtnIcon="paper-button > paper-menu-button > div > div";

getShadowElement(submitbtnShadow, driver,submitbtnIcon).click();
Thread.sleep(5000);

/*
String[] finalizebtnShadow = {"app-shell","special-audits-page-main","status-tab-element","action-buttons"};
String finalizebtnIcon="paper-button > span";
JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", getShadowElement(finalizebtnShadow, driver,finalizebtnIcon));

getShadowElement(finalizebtnShadow, driver,finalizebtnIcon).click();
Thread.sleep(4000);
*/
}
public void clickSpotCheckFinalizebtn() throws InterruptedException
{


String[] submitbtndrpShadow = {"app-shell","#spot-checks","#sidebar > status-tab-element","etools-content-panel > div.status-buttons > action-buttons"};
String submitbtndrpIcon="paper-button > paper-menu-button > paper-icon-button";

JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", getShadowElement(submitbtndrpShadow, driver,submitbtndrpIcon));

getShadowElement(submitbtndrpShadow, driver,submitbtndrpIcon).click();
Thread.sleep(1000);
String[] submitbtnShadow = {"app-shell","#spot-checks","#sidebar > status-tab-element","etools-content-panel > div.status-buttons > action-buttons"};
String submitbtnIcon="paper-button > paper-menu-button > div > div";

getShadowElement(submitbtnShadow, driver,submitbtnIcon).click();
Thread.sleep(5000);
}
public void clickMicroAssessmentFinalizebtn() throws InterruptedException
{


String[] submitbtndrpShadow = {"app-shell","#micro-assessments","#sidebar > status-tab-element","etools-content-panel > div.status-buttons > action-buttons"};
String submitbtndrpIcon="paper-button > paper-menu-button > paper-icon-button";

JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", getShadowElement(submitbtndrpShadow, driver,submitbtndrpIcon));

getShadowElement(submitbtndrpShadow, driver,submitbtndrpIcon).click();
Thread.sleep(1000);
String[] submitbtnShadow = {"app-shell","#micro-assessments","#sidebar > status-tab-element","etools-content-panel > div.status-buttons > action-buttons"};
String submitbtnIcon="paper-button > paper-menu-button > div > div";

getShadowElement(submitbtnShadow, driver,submitbtnIcon).click();
Thread.sleep(5000);
}
public String getFinalizeMsg()
{
String[] engagementfinalizeShadow = {"app-shell","multi-notification-list","multi-notification-item"};
String engagementfinalizemsg="span";

return getShadowElement(engagementfinalizeShadow, driver,engagementfinalizemsg).getText();


}



//******* To  be delete ***********************************
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



//Loop until get the shadow root for the Webelement and returns the webelement. Like findelement..Multiple shadow roots
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
}
