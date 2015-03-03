package com.CO;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public WebDriver driver;
	String sCountrySelectorId="dialog-container";
	String sCloseButtonClass="ui-icon ui-icon-closethick";
	
	public void clickOnCloseButton(WebDriver driver){
		boolean bValue = driver.findElement(By.id(sCountrySelectorId)).isDisplayed();
		if (bValue==true){
			System.out.println("the popup exists");
			//driver.findElement(By.className(sCloseButtonClass)).click();
			driver.findElement(By.id(sCountrySelectorId)).sendKeys(Keys.ESCAPE);
		}
		else{
			System.out.println("what the heck");
		}
			
		
	}

}
