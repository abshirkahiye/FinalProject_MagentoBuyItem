package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutShippingPageObjects {
	
		
		
		WebDriver driver;

	public CheckoutShippingPageObjects(WebDriver driver) {
			this.driver = driver;
		}

	public void methodNamde () {}

		
		public WebElement buttonNextContinue() {
			WebElement buttonNextContinue = driver.findElement(By.xpath("//button[@data-role='opc-continue']"));
			return buttonNextContinue;
			
		}
		

}
