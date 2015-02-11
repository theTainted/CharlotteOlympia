package com.CO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonFunctions {
	WebDriver driver;
	String sCookieCloseButtonXpath="//div[@class='cookie-policy']//span[@class='button close']";
	String sHeaderSignInXpath="//*[@id='header']//header/ul[@class='menu-utility']//a[@class='user-login']";
	
public void clickHeaderSignIn(WebDriver driver){
	boolean bValue;
	bValue = driver.findElement(By.xpath(sCookieCloseButtonXpath)).isDisplayed();
	if(bValue==true){
		driver.findElement(By.xpath(sCookieCloseButtonXpath)).click();
			}
	else{
		System.out.println("not displayed : "+bValue);
	}
	driver.findElement(By.xpath(sHeaderSignInXpath)).click();
	System.out.println("clicked");
	
}
}
