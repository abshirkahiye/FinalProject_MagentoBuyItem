package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {


		WebDriver driver;

	public HomePageObjects(WebDriver driver) {
			this.driver = driver;
		}

	public void methodNamde () {}

			//method to call sign in button element on page so that we can begin loggin in
		public WebElement buttonSignIn() {
				WebElement buttonSignIn = driver.findElement(By.xpath("//li[@class='authorization-link']/a[contains(text(),'Sign In')]"));		
				return buttonSignIn;
			}	
		public WebElement dropdownarrowWelcome() {
				WebElement dropdownarrowWelcome = driver.findElement(By.xpath("//button[@type='button'][1]"));
				return dropdownarrowWelcome;	
			}
		public WebElement dropdownMyAccount() {
				WebElement dropdownMyAccount = driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/'][1]"));
				return dropdownMyAccount;
			}
		
		public WebElement txtboxSearchStore() {
			WebElement txtboxSearchStore = driver.findElement(By.xpath("//input[@name='q']"));
			return txtboxSearchStore;							////form[@class='form minisearch']  "//input[@name='q']")
		}
		public WebElement buttonSearch() {
			WebElement buttonSearch = driver.findElement(By.xpath("//button[@class='action search']"));
			return buttonSearch;
		}
	
	}
