package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutReviewPaymentsPageObjects {

	
	
	WebDriver driver;

public CheckoutReviewPaymentsPageObjects(WebDriver driver) {
		this.driver = driver;
	}

public void methodNamde () {}

	
	public WebElement buttonPlaceOrder() {
		WebElement buttonPlaceOrder = driver.findElement(By.xpath("//button[@title='Place Order']"));
		return buttonPlaceOrder;
		
	}
	

}

	
	

