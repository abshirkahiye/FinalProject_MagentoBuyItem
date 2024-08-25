package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPageObjects {
	
	
		WebDriver driver;

	public ShoppingCartPageObjects(WebDriver driver) {
			this.driver = driver;
		}

	public void methodNamde () {}

		
		public WebElement buttonProceedToCheckout() {
			WebElement buttonProceedToCheckout = driver.findElement(By.xpath("//button[@data-role='proceed-to-checkout']"));
			return buttonProceedToCheckout;
			
		}
		

}
