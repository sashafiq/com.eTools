package com.eTools.Pages;

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

public class ActionPointsHomePage extends TestBase {


private String addactionpointbtn="div > div > div > paper-button > a";
private String[] addactionpointbtnshadow = {"app-shell","#action-points","iron-pages > action-points-list","pages-header-element"};    

public ActionPointsHomePage() throws InterruptedException
{
Thread.sleep(2000);
}

public void clickOnaddActionPoint() {
try {

Thread.sleep(1000);
System.out.println("Click on add action point");
getShadowElement(addactionpointbtnshadow,driver,addactionpointbtn).click();;
Thread.sleep(4000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,5000)");
} catch (InterruptedException e) {

e.printStackTrace();
}

}


}


