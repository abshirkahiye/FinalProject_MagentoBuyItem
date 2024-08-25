package testRunner;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CheckoutReviewPaymentsPageObjects;
import pageObjects.CheckoutShippingPageObjects;
import pageObjects.HomePageObjects;
import pageObjects.JacketSearchResultsPageObjects;
import pageObjects.LandoGymJacketPageObjects;
import pageObjects.LoginPageObjects;
import pageObjects.MyAccountPageObjects;
import pageObjects.ShoppingCartPageObjects;
import utilities.ActionsObjects;
import utilities.BaseClass;
import utilities.LoginClass;

public class BuyItemsTestNG  {

	static WebDriver driver;


		
		
	static BaseClass base;
	static LoginClass loginToApp;
	static ActionsObjects actions;

	static HomePageObjects homePage;
	static LoginPageObjects login;
	static MyAccountPageObjects myAccount;

	static JacketSearchResultsPageObjects searchPage;
	static LandoGymJacketPageObjects landoPage;
	static ShoppingCartPageObjects cartPage;
	static CheckoutShippingPageObjects shippingPage;
	static CheckoutReviewPaymentsPageObjects reviewPage;

	@BeforeTest
	public void testPageSetup() {
	

		driver = new ChromeDriver();
		
		actions = new ActionsObjects();
		base = new BaseClass(driver);
		loginToApp = new LoginClass(driver);
		
		homePage = new HomePageObjects(driver);
		login = new LoginPageObjects(driver);
		myAccount = new MyAccountPageObjects(driver);

		searchPage = new JacketSearchResultsPageObjects(driver);
		landoPage = new LandoGymJacketPageObjects(driver);
		cartPage = new ShoppingCartPageObjects(driver);
		shippingPage = new CheckoutShippingPageObjects(driver);
		reviewPage = new CheckoutReviewPaymentsPageObjects(driver);
	}

	
	@Test (priority = 1)
	public void searchJacket() {
		// type Jacket in the search bar and click search button
		actions.insertData(homePage.txtboxSearchStore(), "Jacket");
		actions.clickElement(homePage.buttonSearch());
	}

	@Test (priority = 2)
	public void chooseJacket() {
		// click on item of choice (in this case Lando Gym Jacket)
		actions.clickElement(searchPage.jacketLandoGym());
	}

	@Test (priority = 3)
	public void purchaseDetails() throws InterruptedException {
		// click on desired size, colour, click 'add to cart' button, then 'View Cart'
		// link
		actions.clickElement(landoPage.buttonSizeXL());
		actions.clickElement(landoPage.buttonColourGrey());
		actions.clickElement(landoPage.buttonAddToCart());
		Thread.sleep(5000);
		actions.clickElement(landoPage.buttonShowCart());
		actions.clickElement(landoPage.linkViewCart());
	}

	@Test (priority = 4)
	public void completeOrder() throws InterruptedException {
		// click proceed to checkout, next, and place order buttons to complete order
		actions.clickElement(cartPage.buttonProceedToCheckout());
		actions.clickElement(shippingPage.buttonNextContinue());
		Thread.sleep(5000);
		actions.clickElement(reviewPage.buttonPlaceOrder());
		Thread.sleep(5000);
	}

	@Test (priority = 5)
	public void viewOrderHistory() throws InterruptedException {
		// user goes to My Accounts Page, then clicks on my orders tab to view order
		// history and details
		actions.clickElement(homePage.dropdownarrowWelcome());
		actions.clickElement(homePage.dropdownMyAccount());
		Thread.sleep(5000);
		actions.clickElement(myAccount.sidenavMyOrders());
		Thread.sleep(5000);
	}

	@AfterTest 
	public void testTearDown() {
		// quit and close browser
		driver.quit();

		// assertEquals("" + expectedText + "' not found on the page.",
		// pageSource.contains(expectedText));
	
	}

}
