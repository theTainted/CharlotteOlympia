package com.CO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class clickOnSignIn extends CommonFunctions {
	 WebDriver driver = new FirefoxDriver();
@Test
  public void testClickOnSignIn() {
	  CommonFunctions CF = new CommonFunctions();
	  CF.clickHeaderSignIn(driver);
  }
  @BeforeMethod
  public void setUp() {
	// WebDriver driver = new FirefoxDriver();
	//  System.setProperty("webdriver.ie.driver","C://IEDriverServer.exe");
	 //WebDriver driver = new InternetExplorerDriver(); 
	 driver.get("http://charlotteolympia.com");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	  
  }
  @AfterTest
  public void kill(){
	  driver.quit();
  }
}
