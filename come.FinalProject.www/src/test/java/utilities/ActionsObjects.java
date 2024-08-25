package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionsObjects {
	
	
	
	public void insertData (WebElement element, String inputData) {
		element.sendKeys(inputData);
	}
	
	public void clickElement(WebElement element) {
			element.click();		
			
	
	// actions.insertData(addBook.txtboxPhoneNumber(), "2262462922");
	
	
	
	//WebDriver driver;
	
	//public void insterData (WebElement element, String inputData) {
		//element.sendKeys();	
	
	//}

	
	
	//}
}
}
