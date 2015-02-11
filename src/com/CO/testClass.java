package com.CO;


public class testClass {
	/*public WebDriver driver;
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://charlotteolympia.com");
		driver.findElement(By.className("user-login")).click();
		

	}*/
	public static void main(String[] args) throws Exception {
		ReadFromExcel test = new ReadFromExcel();
		test.readFromExcel("Search", 0);
		
	}

}
