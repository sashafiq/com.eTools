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

		String[] uploadbtnShadow = {"app-shell","audits-page-main","#report_attachments"};
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
		
		System.out.println("Clicked tab and enter");
		 String[] attachdbtnShadow = {"app-shell","audits-page-main","#report_attachments","dialog-element"};
		 String attachbtnIcon="#buttons > paper-button.btn-confirm.right";
		
		getShadowElement(attachdbtnShadow, driver,attachbtnIcon).click();
		
	
		
		Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		
		System.out.println("Clicked tab and enter");
		 String[] attachdbtnShadow = {"app-shell","spot-checks-page-main","#report_attachments","dialog-element"};
		 String attachbtnIcon="#buttons > paper-button.btn-confirm.right";
		
		getShadowElement(attachdbtnShadow, driver,attachbtnIcon).click();
		
	
		
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

		String[] uploadbtnShadow = {"app-shell","special-audits-page-main","#report_attachments"};
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
		
		System.out.println("Clicked tab and enter");
		 String[] attachdbtnShadow = {"app-shell","special-audits-page-main","#report_attachments","dialog-element"};
		 String attachbtnIcon="#buttons > paper-button.btn-confirm.right";
		
		getShadowElement(attachdbtnShadow, driver,attachbtnIcon).click();
		
	
		
		Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickSavebtn()
	{
		 String[] savebtnShadow = {"app-shell","audits-page-main","status-tab-element","action-buttons"};
		 String savebtnIcon="paper-button";
		
		getShadowElement(savebtnShadow, driver,savebtnIcon).click();
	}
	public void clickSpecialAuditSavebtn()
	{
		 String[] savebtnShadow = {"app-shell","special-audits-page-main","status-tab-element","action-buttons"};
		 String savebtnIcon="paper-button";
		
		getShadowElement(savebtnShadow, driver,savebtnIcon).click();
	}
	public void clickSpotCheckSavebtn()
	{
		 String[] savebtnShadow = {"app-shell","spot-checks-page-main","status-tab-element","action-buttons"};
		 String savebtnIcon="paper-button";
		
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
	}
	public void clickSpotCheckSubmitbtn() throws InterruptedException
	{
		
		String[] submitbtndrpShadow = {"app-shell","spot-checks-page-main","status-tab-element","action-buttons","paper-icon-button"};
		 String submitbtndrpIcon="#icon";
		
		getShadowElement(submitbtndrpShadow, driver,submitbtndrpIcon).click();
		Thread.sleep(1000);	
		 String[] submitbtnShadow = {"app-shell","spot-checks-page-main","status-tab-element","action-buttons"};
		 String submitbtnIcon="paper-button > paper-menu-button > div > div";
		
		getShadowElement(submitbtnShadow, driver,submitbtnIcon).click();
	}
	

	public void clickFinalizebtn() throws InterruptedException
	{
		 String[] finalizebtnShadow = {"app-shell","audits-page-main","status-tab-element","action-buttons"};
		 String finalizebtnIcon="paper-button > span";
		
		getShadowElement(finalizebtnShadow, driver,finalizebtnIcon).click();
		Thread.sleep(4000);
	}
	public void clickSpecialAuditFinalizebtn() throws InterruptedException
	{
		 String[] finalizebtnShadow = {"app-shell","special-audits-page-main","status-tab-element","action-buttons"};
		 String finalizebtnIcon="paper-button > span";
		
		getShadowElement(finalizebtnShadow, driver,finalizebtnIcon).click();
		Thread.sleep(4000);
	}
	public void clickSpotCheckFinalizebtn() throws InterruptedException
	{
		 String[] finalizebtnShadow = {"app-shell","spot-checks-page-main","status-tab-element","action-buttons"};
		 String finalizebtnIcon="paper-button > span";
		
		getShadowElement(finalizebtnShadow, driver,finalizebtnIcon).click();
		Thread.sleep(4000);
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
		
		}
		
	
	

