package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class BaseClass {

		WebDriver driver;

		//put these pre-test steps into one class to be reused - method to open + prepare web browser, then go to url.
		public  BaseClass (WebDriver driver)  {
				this.driver = driver;
				
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();						
			driver.navigate().to("https://magento.softwaretestingboard.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
		}
		
		public void waitForElement() {
			
			
		}
		
		
		}