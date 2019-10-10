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

import com.eTools.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver; 
	public static Properties prop;
	
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
		//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/Driver/chromedriver.exe");
				//WebDriver driver = null;
		//		 WebDriverManager.chromedriver().setup();
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
				driver = new ChromeDriver(); 
			//	driver.get(prop.getProperty("url"));
			}
			else if (browsername.equals("incognito"))
			{
				//Incognito browser
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/Driver/chromedriver.exe");	
				driver = new ChromeDriver(); 
				
				ChromeOptions options = new ChromeOptions();
		//		options.addArguments("--incognito");
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		//		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/Driver/chromedriver.exe");	
				 driver = new ChromeDriver(capabilities);
				//	driver.get(prop.getProperty("url"));
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
			
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
		