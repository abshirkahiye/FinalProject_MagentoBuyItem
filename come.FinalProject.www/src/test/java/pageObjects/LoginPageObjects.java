package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	
	WebDriver driver;

	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public void methodNamde () {}

		//method to call sign in button element on page so that we can begin loggin in
		public WebElement buttonSignIn() {
			WebElement buttonSignIn = driver.findElement(By.xpath("//li[@class='authorization-link']/a[contains(text(),'Sign In')]"));		
			return buttonSignIn;
		}
		// this method is for the email field element during log in. we dont always want to write the xpath. we will just call this method.
		public WebElement emailField() {
			WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
			return emailField;
		}
		 
		public WebElement passwordField() {
			WebElement passwordField = driver.findElement(By.xpath("//input[@title='Password']"));
			return passwordField;
		}
			
		public WebElement buttonSubmitEmailPass() {
			WebElement buttonSubmitEmailPass = driver.findElement(By.xpath("//button[@class='action login primary']"));
			return buttonSubmitEmailPass;
		}
		
		public WebElement dropdownarrowWelcome() {
			WebElement dropdownarrowWelcome = driver.findElement(By.xpath("//button[@type='button'][1]"));
			return dropdownarrowWelcome;	
		}

		public WebElement dropdownMyAccount() {
			WebElement dropdownMyAccount = driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/'][1]"));
			return dropdownMyAccount;
		}
		
	}

