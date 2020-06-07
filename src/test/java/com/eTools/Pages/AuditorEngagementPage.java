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

public class AuditorEngagementPage extends TestBase {

private String[] searchengagementshadow = {"app-shell","engagements-page-main","engagements-list-view","search-and-filter","paper-input"};    
private String searchengagement="#input";

private String[] rowsshadow = {"app-shell","#engagements","#listPage","list-tab-main","#list-pagination","#item-nr-select"};    
private String rows="#menuButton > div > paper-input > iron-icon";

private String[] allrowshadow = {"app-shell","#engagements","#listPage","list-tab-main","#list-pagination"};    
//private String allrow= "#selecta > paper-item:nth-child(4)";
private String allrow="#selecta > paper-item.iron-selected";
private String[] uniqueIDShadow = {"app-shell","engagements-page-main","engagements-list-view","list-tab-main"};

private String[] reportTabShadow = {"app-shell","#audits"};
private String[] spotcheckreportTabShadow = {"app-shell","spot-checks-page-main"};
private String reportTab="#pageTabs > paper-tab:nth-child(2) > span";



private String[] microassesreportTabShadow = {"app-shell","micro-assessments-page-main"};
private String[] specialauditreportTabShadow = {"app-shell","special-audits-page-main"};

private String[] rptAtchPlusShadow = {"app-shell","audits-page-main","file-attachments-tab"};
private String rptAtchPlusTab="#icon";

private String[] docTypeDrpDwnShadow = {"app-shell","audits-page-main","file-attachments-tab","etools-searchable-multiselection-menu"};
private String docTypeDrpDwn="#icon";

private String[] uploadFileShadow = {"app-shell","audits-page-main","file-attachments-tab"};
private String uploadFile="#uploadButton";

private String[] attachBtnShadow = {"app-shell","audits-page-main","file-attachments-tab","dialog-element"};
private String attachBtn="#buttons > paper-button.btn-confirm.right";

private String[] saveBtnShadow = {"app-shell","audits-page-main","status-tab-element","action-buttons"};
private String saveBtn="paper-button > span";

private String[] saveBtnDrpDwnShadow = {"app-shell","audits-page-main","status-tab-element","action-buttons"};
private String saveBtnDrpDwn="#icon";

private String[] submitBtnShadow = {"app-shell","audits-page-main","status-tab-element","action-buttons"};
private String submitBtn="paper-button > paper-menu-button > div > div > span";


public AuditorEngagementPage() throws InterruptedException
{
Thread.sleep(2000);
}

public void clickOnReportsTab()
{

try {
System.out.println("clickOnReportsTab Function in auditor engagement page");
getShadowElement(reportTabShadow, driver,reportTab).click();

Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public void clickOnSpotCheckReportsTab()
{
try {
getShadowElement(spotcheckreportTabShadow, driver,reportTab).click();

Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public void clickOnMicroAssesReportsTab()
{
try {
getShadowElement(microassesreportTabShadow, driver,reportTab).click();

Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public void clickOnSpecialAuditReportsTab()
{
try {
getShadowElement(specialauditreportTabShadow, driver,reportTab).click();

Thread.sleep(5000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}

public void selectNewlyCreatedEngagement(String engagementtitle) {
//String[] text1 = null;
Actions act = new Actions(driver);
try {
System.out.println("engagement title in complete audit test:"+engagementtitle);

// for (int i=1;i<=24;i++)
// {
 
// act.sendKeys(Keys.TAB).perform();
// Thread.sleep(1000);
// }
// expand the rows.
// getShadowElement(rowsshadow, driver,rows).click();
// Thread.sleep(3000);
// getShadowElement(allrowshadow, driver,allrow).click();
// Thread.sleep(8000);


int j=1;
String sflag="false";
do{
//if (j>1)
//{
System.out.println(" beore start of s flag value:"+sflag);
/*
String[] nextbuttonshadow = {"app-shell","#engagements","#listPage","list-tab-main","#list-pagination"};    
String nextbutton="div > div > paper-icon-button:nth-child(3)";

       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", getShadowElement(nextbuttonshadow, driver,nextbutton));
getShadowElement(nextbuttonshadow, driver,nextbutton).click();
Thread.sleep(5000);
System.out.println(" Clicked next button");
*/
// }
for(int i=5;i<=14;i++)
{

WebElement shadowRoot4=getShadowElement1(uniqueIDShadow,driver);
WebElement root5=shadowRoot4.findElement(By.cssSelector("paper-card > list-element:nth-child("+i+")"));
WebElement shadowRoot5 = expandRootElement(root5,driver);
String text=shadowRoot5.findElement(By.cssSelector("#wrapper > div > a > span")).getText();
System.out.println("I value :"+i);
System.out.println("actual title:"+text);
System.out.println("expected title:"+engagementtitle);
String[] text1=text.split("\n");

if(text1[0].toString().equals(engagementtitle))
{

System.out.println("matched");
System.out.println("actual text:"+text);
System.out.println("expected title:"+engagementtitle);

String[] nextbuttonshadow = {"app-shell","#engagements","#listPage","list-tab-main","#list-pagination"};    
String nextbutton="div > div > paper-icon-button:nth-child(3)";

       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", getShadowElement(nextbuttonshadow, driver,nextbutton));
Thread.sleep(1000);
// act1.sendKeys(Keys.PAGE_DOWN).build().perform();
shadowRoot5.findElement(By.cssSelector("#wrapper > div > a > span")).click();
sflag="true";

Thread.sleep(8000);
break;
}

}
if (sflag!="true" )
{
System.out.println("after for loop sflag value:"+sflag);
String[] nextbuttonshadow = {"app-shell","#engagements","#listPage","list-tab-main","#list-pagination"};    
String nextbutton="div > div > paper-icon-button:nth-child(3)";

       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", getShadowElement(nextbuttonshadow, driver,nextbutton));
getShadowElement(nextbuttonshadow, driver,nextbutton).click();
Thread.sleep(5000);
System.out.println(" Clicked next button");
}
// j=j+1;
} while(sflag!="true");


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