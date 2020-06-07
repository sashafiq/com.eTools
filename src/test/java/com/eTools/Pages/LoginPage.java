package com.eTools.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eTools.base.TestBase;
import com.eTools.util.TestUtil;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;


public class LoginPage extends TestBase {

// private WebDriver driver;
//Page Factory - Object Repository

@FindBy(id="sign-in-button")
private WebElement SignInBtn;

@FindBy(id="UNICEFExchange")
private WebElement UnicefEmployee;

@FindBy(id="signInName")
private WebElement EmailAddress;

@FindBy(id="password")
private WebElement Password;

@FindBy(id="next")
private WebElement SignBtn;

@FindBy(name="loginfmt")
private WebElement UnicefSignInField;

@FindBy(id="idSIButton9")
private WebElement UnicefSignInNextBtn;


@FindBy(id="idSIButtoen9")
private WebElement UnicefSignInNextBtn1;


@FindBy(id="idSIButtoen9")
private WebElement UnicefSignInNextBtn2;

//Initializing the Page Objects:
public LoginPage(){
PageFactory.initElements(driver, this);
}

public void clickonSigninBtn() throws InterruptedException{
SignInBtn.click();
Thread.sleep(3000);

}

public  String validateLoginPageTitle(){
return driver.getTitle();
}

public void clickUnicefEmployee(){
UnicefEmployee.click();

}

public void UnicefSignIn(String un,String pwd) throws InterruptedException{

byte[] unamedecodedBytes = Base64.decode(un);
System.out.println("Username decodedBytes "+ new String(unamedecodedBytes));
byte[] pwddecodedBytes = Base64.decode(pwd);
System.out.println("Password decodedBytes "+ new String(pwddecodedBytes));
//pwd.sendKeys(new String(encodedBytes));

EmailAddress.sendKeys(new String(unamedecodedBytes));
Password.sendKeys(new String(pwddecodedBytes));
SignBtn.click();
Thread.sleep(5000);
// JavascriptExecutor js = (JavascriptExecutor) driver;
// js.executeScript("window.scrollBy(0,5000)");
// Thread.sleep(TestUtil.MAX_WAIT);
}

public void auditorSignIn(String un, String pwd) throws InterruptedException{
EmailAddress.sendKeys(un);
Password.sendKeys(pwd);
SignBtn.click();
Thread.sleep(9000);

// Thread.sleep(TestUtil.MAX_WAIT);
}



}
