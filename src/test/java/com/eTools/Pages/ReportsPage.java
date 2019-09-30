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
	private String[] dateofFieldVisitShadow = {"app-shell","audits-page-main","audit-report-page-main","assign-engagement"};
	private String dateofFieldVisitText="#dateVisit";
	private String[] microassesdateofFieldVisitShadow = {"app-shell","micro-assessments-page-main","ma-report-page-main","assign-engagement"};
	private String[] spotcheckdateofFieldVisitShadow = {"app-shell","spot-checks-page-main","sc-report-page-main","assign-engagement"};
	private String[] specialauditdateofFieldVisitShadow = {"app-shell","special-audits-page-main","sa-report-page-main","assign-engagement"};
	
	
	
	
	private String dateofFieldReportToIptext="#draftReportToIp";
	private String dateofFieldCommentsRecivedIptext="#commentsReceivedByIp";
	private String DraftReporttext="#draftReportUnicef";
	private String CommentsRecivedIptext1="#commentsReceivedUnicef";
	
	private String[] exchangearteshadow = {"app-shell","audits-page-main","audit-report-page-main","assign-engagement","etools-currency-amount-input","paper-input"};
	private String[] spotcheckexchangearteshadow = {"app-shell","spot-checks-page-main","sc-report-page-main","assign-engagement","etools-currency-amount-input","paper-input"};
	
	private String exchangerate="#input";
	private String[] summaryauditshadow = {"app-shell","audits-page-main","audit-report-page-main","findings-summary"};
	private String summaryauditshadowtext="etools-content-panel > list-element > div > paper-icon-button";
	private String[] auditexpenditureshadow = {"app-shell","audits-page-main","audit-report-page-main","findings-summary","etools-currency-amount-input","paper-input"};
	private String auditexpenditure="#input";
	private String[] saveshadow = {"app-shell","audits-page-main","audit-report-page-main","findings-summary","dialog-element"};
	private String save="#buttons > paper-button.btn-confirm.right";
	
	private String[] attachmentTabShadow = {"app-shell","audits-page-main"};
	private String attachmentTab="#pageTabs > paper-tab:nth-child(5) > span";
	
	private String[] specialauditattachmentTabShadow = {"app-shell","special-audits-page-main"};
	private String[] spotcheckattachmentTabShadow = {"app-shell","spot-checks-page-main"};
	
	private String[] overviewtotalamountShadow = {"app-shell","spot-checks-page-main","sc-report-page-main","overview-element","etools-content-panel > div:nth-child(2) > div:nth-child(1) > etools-currency-amount-input","paper-input"};
	private String overviewtotalamounttext="#input";
	private String[] overviewtotalamountineligibleShadow = {"app-shell","spot-checks-page-main","sc-report-page-main","overview-element","etools-content-panel > div:nth-child(2) > div:nth-child(2) > etools-currency-amount-input","paper-input"};
	private String overviewtotalamountineligible="#input";
	
	private String[] internalcontrolshadow= {"app-shell","spot-checks-page-main","sc-report-page-main","internal-controls","paper-textarea","iron-autogrow-textarea"};
			
		private String internalcontrol="#textarea";
	
	public ReportsPage() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	public void populatespecialAuditDataInEngagementStatus() {
		try {
				
			getShadowElement(specialauditdateofFieldVisitShadow,driver,dateofFieldVisitText).click();			    
			Thread.sleep(2000);
			act= new Actions(driver);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.ENTER).perform();			
			Thread.sleep(1000);		
		
			getShadowElement(specialauditdateofFieldVisitShadow,driver,dateofFieldReportToIptext).click();			    
			Thread.sleep(2000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.ENTER).perform();			
			Thread.sleep(1000);
				
			getShadowElement(specialauditdateofFieldVisitShadow,driver,dateofFieldCommentsRecivedIptext).click();			    
			Thread.sleep(2000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);					
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.ENTER).perform();			
			Thread.sleep(1000);
			
			getShadowElement(specialauditdateofFieldVisitShadow,driver,DraftReporttext).click();			    
			Thread.sleep(2000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.ENTER).perform();			
			Thread.sleep(1000);	
			
			getShadowElement(specialauditdateofFieldVisitShadow,driver,CommentsRecivedIptext1).click();			    
			Thread.sleep(2000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.ENTER).perform();			
			Thread.sleep(1000);
			
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
				
		}
	public void clickOnSpotCheckAttachmentTab()
	{
		
		try {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,-1000)", "");
			Thread.sleep(3000);
			getShadowElement(spotcheckattachmentTabShadow, driver,attachmentTab).click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickOnAttachmentTab()
	{
		
		try {
			getShadowElement(attachmentTabShadow, driver,attachmentTab).click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	public void populateDataInEngagementStatus() {
		try {
				
			getShadowElement(dateofFieldVisitShadow,driver,dateofFieldVisitText).click();			    
			Thread.sleep(2000);
			act= new Actions(driver);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.ENTER).perform();			
			Thread.sleep(1000);		
		
			getShadowElement(dateofFieldVisitShadow,driver,dateofFieldReportToIptext).click();			    
			Thread.sleep(2000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.ENTER).perform();			
			Thread.sleep(1000);
				
			getShadowElement(dateofFieldVisitShadow,driver,dateofFieldCommentsRecivedIptext).click();			    
			Thread.sleep(2000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);					
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.ENTER).perform();			
			Thread.sleep(1000);
			
			getShadowElement(dateofFieldVisitShadow,driver,DraftReporttext).click();			    
			Thread.sleep(2000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.ENTER).perform();			
			Thread.sleep(1000);	
			
			getShadowElement(dateofFieldVisitShadow,driver,CommentsRecivedIptext1).click();			    
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
	public void populateMicroassesDataInEngagementStatus() {
		try {
				
			getShadowElement(microassesdateofFieldVisitShadow,driver,dateofFieldVisitText).click();			    
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
				
			getShadowElement(spotcheckdateofFieldVisitShadow,driver,dateofFieldVisitText).click();			    
			Thread.sleep(2000);
			act= new Actions(driver);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.ENTER).perform();			
			Thread.sleep(1000);		
		
			getShadowElement(spotcheckdateofFieldVisitShadow,driver,dateofFieldReportToIptext).click();			    
			Thread.sleep(2000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.ENTER).perform();			
			Thread.sleep(1000);
				
			getShadowElement(spotcheckdateofFieldVisitShadow,driver,dateofFieldCommentsRecivedIptext).click();			    
			Thread.sleep(2000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);					
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.ENTER).perform();			
			Thread.sleep(1000);
			
			getShadowElement(spotcheckdateofFieldVisitShadow,driver,DraftReporttext).click();			    
			Thread.sleep(2000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.ENTER).perform();			
			Thread.sleep(1000);	
			
			getShadowElement(spotcheckdateofFieldVisitShadow,driver,CommentsRecivedIptext1).click();			    
			Thread.sleep(2000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);			
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.ENTER).perform();			
			Thread.sleep(1000);
			getShadowElement(spotcheckexchangearteshadow,driver,exchangerate).clear();
			getShadowElement(spotcheckexchangearteshadow,driver,exchangerate).sendKeys("1000");
			
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
				
		}

	public void populateSpotCheckOverviewData()
	{
		getShadowElement(overviewtotalamountShadow,driver,overviewtotalamounttext).clear();
		getShadowElement(overviewtotalamountShadow,driver,overviewtotalamounttext).sendKeys("1000");
		getShadowElement(overviewtotalamountineligibleShadow,driver,overviewtotalamountineligible).clear();
		getShadowElement(overviewtotalamountineligibleShadow,driver,overviewtotalamountineligible).sendKeys("1000");
	}
	
	public void populateSpotCheckInternalControlData()
	{
		getShadowElement(internalcontrolshadow,driver,internalcontrol).clear();
		getShadowElement(internalcontrolshadow,driver,internalcontrol).sendKeys("1000");
	
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
		 String[] saveShadow = {"app-shell","special-audits-page-main","sa-report-page-main","specific-procedure","dialog-element"};
		 String save="#buttons > paper-button.btn-confirm.right";
		getShadowElement(saveShadow,driver,save).click();
		Thread.sleep(1000);
	}
	
	public void populateSummaryOfAuditFindings() {
		try {
			// summary of audit findings
			getShadowElement(summaryauditshadow,driver,summaryauditshadowtext).click();	
			Thread.sleep(2000);
			getShadowElement(auditexpenditureshadow,driver,auditexpenditure).clear();	
			getShadowElement(auditexpenditureshadow,driver,auditexpenditure).sendKeys("1000");
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.BACK_SPACE).perform();
			act.sendKeys(Keys.BACK_SPACE).perform();
			act.sendKeys(Keys.BACK_SPACE).perform();
			act.sendKeys(Keys.BACK_SPACE).perform();
					//	act.sendKeys(Keys.CLEAR).perform();
			act.sendKeys("100").perform();;
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);
			act.sendKeys(Keys.ENTER).perform();			
			Thread.sleep(1000);
			getShadowElement(saveshadow,driver,save).click();
			Thread.sleep(5000);
			
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
		
	
	

