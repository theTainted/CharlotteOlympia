package com.CO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class Search {
	public WebDriver driver;
	String sSearchTextBoxClass="search_cat";
	String sExpandedSearchTextBoxId="q";
	String sBreadCrumbSearchTextClass="breadcrumb-result-text";
	
	public void clickOnSearch(WebDriver driver){
		driver.findElement(By.className(sSearchTextBoxClass)).click();
	}
	public void searchWithText(WebDriver driver) throws Exception{
		
		String[] searchText;
		String sText;
		searchText = ReadFromExcel.readFromExcel("Search",1);
		for(int i=1;i<searchText.length;i++){
			clickOnSearch(driver);
			 sText =searchText[i];
			 System.out.println("SearchText : "+searchText[i]);
		driver.findElement(By.id(sExpandedSearchTextBoxId)).clear();	 
		driver.findElement(By.id(sExpandedSearchTextBoxId)).sendKeys(sText);
		driver.findElement(By.id(sExpandedSearchTextBoxId)).sendKeys(Keys.ENTER);
		String sActualSearchText=driver.findElement(By.className(sBreadCrumbSearchTextClass)).getText();
		System.out.println("getText "+sActualSearchText);
		if(sText.toUpperCase()==sActualSearchText){
		System.out.println("welldoneBoy");
		}
		}	
		
	}

}
