package com.eTools.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eTools.base.TestBase;

public class GridPage extends TestBase {
	//Shadow root element for the grid
		private String[] gridshadow = {"app-shell","page-header","etools-app-selector"};

//css path for grid  icon
	private String gridIcon="#etools-selector > paper-icon-button";
	
	//css path for FAM link
	private String famLink= "#selector > div > div.app-outer > div > div:nth-child(4) > div > a:nth-child(1) > paper-icon-button";
	
	private String actionpointlink= "#selector > div > div.app-outer > div > div:nth-child(6) > div > a:nth-child(2) > div";
	
		public GridPage() throws InterruptedException{
	///		PageFactory.initElements(driver, this);
			//super();
			Thread.sleep(2000);
		}
		
	public void clickGridIcon() {
		try {
			//driver.findelement(by.csspath()).click;
			//driver=driver;
			Thread.sleep(1000);
			getShadowElement(gridshadow,driver, gridIcon).click();
		
			Thread.sleep(3000);	
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
				
		}
		
		public void clickFAMLink(){
		
			try {
				Thread.sleep(1000);
				getShadowElement(gridshadow,driver, famLink).click();	
				Thread.sleep(5000);	
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
					
			
			}
		
		public void clickAcionPointslink(){
			
			try {
				Thread.sleep(1000);
				getShadowElement(gridshadow,driver, actionpointlink).click();	
				Thread.sleep(8000);	
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,5000)");
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
		
	
	

