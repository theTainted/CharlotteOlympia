package com.CO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.CO.ReadFromExcel;

public class Register {
	//public WebDriver driver;
	String sHeaderRegisterXpath= "//*[@id='header']//header/ul[@class='menu-utility']//a[@class='user-register']";
	String sFirstNameTextBox ="dwfrm_profile_customer_firstname";
	String sLastNameTextBox ="dwfrm_profile_customer_lastname";
	String sFirstNameError="//span[contains(.,'Please enter a First Name')]";
	String sApplyButton="dwfrm_profile_confirm";
	String sLastNameError="//span[contains(.,'Please enter a Last Name')]";
	
	public void clickOnRegister(WebDriver driver){
		driver.findElement(By.xpath(sHeaderRegisterXpath)).click();
		Assert.assertTrue(driver.findElement(By.id(sFirstNameTextBox)).isDisplayed(),"DISPLAYED");
		/*	driver.findElement(By.id(sFirstNameTextBox)).sendKeys("Aidan");
		if(driver.findElement(By.id(sFirstNameTextBox)).isDisplayed()){
			System.out.println("awesome");
			driver.findElement(By.id(sFirstNameTextBox)).sendKeys("Aidan");
		}*/
		
	}
	
	public void clickOnApplyButton(WebDriver driver){
		driver.findElement(By.name(sApplyButton)).click();
	}
	
	public void verifyEmptyFirstNameErrorMessage(WebDriver driver){
		boolean bValue = driver.findElement(By.xpath(sFirstNameError)).isDisplayed();
		System.out.println("bValue="+bValue);
		
	}
		public void verifyEmptyLastNameErrorMessage(WebDriver driver){
						if(driver.findElement(By.xpath(sFirstNameError)).isDisplayed()){
				System.out.println("thats so cool");
			}	
	}
		public void enterFirstName(WebDriver driver) throws Exception{
			String[] firstName;
			String name;
			firstName = ReadFromExcel.readFromExcel("Input",0);
			for(int i=1;i<firstName.length;i++){
				 name =firstName[i];
			driver.findElement(By.id(sFirstNameTextBox)).clear();	 
			driver.findElement(By.id(sFirstNameTextBox)).sendKeys(name);
			}
			
		}
		
		public void enterLastName(WebDriver driver) throws Exception{
			String[] lastName;
			String name;
			lastName = ReadFromExcel.readFromExcel("Input",1);
			for(int i=1;i<lastName.length;i++){
				 name =lastName[i];
			driver.findElement(By.id(sLastNameTextBox)).clear();	 
			driver.findElement(By.id(sLastNameTextBox)).sendKeys(name);
			}
			
		}
		
		
	/*public boolean firstNameTextBoxPresent(WebDriver driver){
		try{
			driver.findElement(By.id(sFirstNameTextBox));
			return true;
		}
		catch (NoSuchElementException e){
			return false;
		}
	}*/
}
