package com.CO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testCases {
	
//	WebDriver driver = new ChromeDriver();
	
	 WebDriver driver = new FirefoxDriver();
@Test(enabled=false)
  public void testClickOnRegister() throws Exception {
	/*Search search = new Search();
	search.searchWithText(driver);*/
	 Register register = new Register();
	  register.clickOnRegister(driver);
	  register.enterFirstName(driver);
	  register.enterLastName(driver);
	/*  register.clickOnApplyButton(driver);
	  register.verifyEmptyFirstNameErrorMessage(driver);
	  register.verifyEmptyLastNameErrorMessage(driver);*/
  }
@Test
public void testSearchWithText() throws Exception{
	Search searchWithText=new Search();
	searchWithText.searchWithText(driver);
}
  @BeforeMethod
  public void setUp() {
	//WebDriver driver = new FirefoxDriver();
	/* System.setProperty("webdriver.chrome.driver","C://ChromeDriver.exe");
	WebDriver driver = new ChromeDriver();*/ 
	 driver.get("http://charlotteolympia.com");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	  
  }

}
