package utilities;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;



public class LoginClass {
	
	
	WebDriver driver;
	
	public LoginClass (WebDriver driver)  {
	this.driver = driver;
	
	BaseClass base = new BaseClass(driver);
	HomePageObjects homePage = new HomePageObjects(driver);
	LoginPageObjects login = new LoginPageObjects(driver);
	
	
	homePage.buttonSignIn().click();
	login.emailField().sendKeys("johntester2@gmail.com");
	login.passwordField().sendKeys("Killah313!");
	login.buttonSubmitEmailPass().click();
			
	
	//driver.quit();	
}

}



