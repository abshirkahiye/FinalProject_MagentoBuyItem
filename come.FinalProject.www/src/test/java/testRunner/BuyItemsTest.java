package testRunner;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
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

public class BuyItemsTest {


@Test
public void fulltest() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
			
			BaseClass base = new BaseClass(driver);
			LoginClass loginToApp = new LoginClass(driver);
			ActionsObjects actions = new ActionsObjects();
			
			HomePageObjects homePage = new HomePageObjects(driver);
			LoginPageObjects login = new LoginPageObjects(driver);
			MyAccountPageObjects myAccount = new MyAccountPageObjects(driver);
			
			JacketSearchResultsPageObjects searchPage = new JacketSearchResultsPageObjects(driver);
			LandoGymJacketPageObjects landoPage = new LandoGymJacketPageObjects(driver);
			ShoppingCartPageObjects cartPage = new ShoppingCartPageObjects(driver);
			CheckoutShippingPageObjects shippingPage = new CheckoutShippingPageObjects(driver);
			CheckoutReviewPaymentsPageObjects reviewPage = new CheckoutReviewPaymentsPageObjects(driver);
			
			
			//type Jacket in the search bar and click search button 
			actions.insertData(homePage.txtboxSearchStore(),"Jacket");
			actions.clickElement(homePage.buttonSearch());
						
			//click on item of choice (in this case the Lando Gym Jacket)
			actions.clickElement(searchPage.jacketLandoGym());
			
			//click on desired size, colour, click 'add to cart' button, click Cart icon, then click 'view cart' link
			actions.clickElement(landoPage.buttonSizeXL());
			actions.clickElement(landoPage.buttonColourGrey());
			actions.clickElement(landoPage.buttonAddToCart());
			Thread.sleep(5000);
			actions.clickElement(landoPage.buttonShowCart());
			actions.clickElement(landoPage.linkViewCart());
			
			// click proceed to checkout, next, and place order buttons to complete order
			actions.clickElement(cartPage.buttonProceedToCheckout());
			actions.clickElement(shippingPage.buttonNextContinue());
			Thread.sleep(5000);
			actions.clickElement(reviewPage.buttonPlaceOrder());
			Thread.sleep(5000);
			
			// user goes to My Accounts Page, then clicks on my orders tab to view order history and details
			actions.clickElement(homePage.dropdownarrowWelcome());
			actions.clickElement(homePage.dropdownMyAccount());
			Thread.sleep(5000);
			actions.clickElement(myAccount.sidenavMyOrders());
			Thread.sleep(3000);
			
			//quit and close browser
			driver.quit();
			
		//assertEquals("" + expectedText + "' not found on the page.", pageSource.contains(expectedText));
		
	}

}
