package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPageObjects {	
	WebDriver driver;
	
public MyAccountPageObjects(WebDriver driver) {
		this.driver = driver;		
	}

public void methodNamde () {}

		//method for manage adresses link on MY Account PAge
	public WebElement sidenavAddressBook() {
			WebElement sidenavAddressBook = driver.findElement(By.xpath("//li[a[@href='https://magento.softwaretestingboard.com/customer/address/' and text()='Address Book']]"));					
			return sidenavAddressBook;
	}
		
	public WebElement sidenavMyOrders() {
		WebElement sidenavMyOrders = driver.findElement(By.xpath("//li[a[@href='https://magento.softwaretestingboard.com/sales/order/history/' and text()='My Orders']]"));					
		return sidenavMyOrders;
}
	
}
