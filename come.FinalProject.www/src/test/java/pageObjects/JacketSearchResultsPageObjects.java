package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JacketSearchResultsPageObjects {

	WebDriver driver;

public JacketSearchResultsPageObjects(WebDriver driver) {
		this.driver = driver;
	}

public void methodNamde () {}

		
	public WebElement jacketLandoGym() {
		WebElement jacketLandoGym = driver.findElement(By.xpath("//ol/li[6]//a"));
		return jacketLandoGym;
	}
	
}
