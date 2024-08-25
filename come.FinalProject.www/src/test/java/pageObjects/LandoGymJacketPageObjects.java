package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandoGymJacketPageObjects {

	WebDriver driver;

public LandoGymJacketPageObjects(WebDriver driver) {
		this.driver = driver;
	}

public void methodNamde () {}

	public WebElement buttonSizeXL() {
		WebElement buttonSizeXL = driver.findElement(By.xpath("//*[@id='option-label-size-143-item-170']"));
		return buttonSizeXL;
	}
	
	public WebElement buttonColourGrey() {
		WebElement buttonColourGrey = driver.findElement(By.xpath("//*[@id='option-label-color-93-item-52']"));
		return buttonColourGrey;
	}
	
	public WebElement buttonAddToCart() {
		WebElement buttonAddToCart = driver.findElement(By.xpath("//button[@id='product-addtocart-button']"));
		return buttonAddToCart;
	}
	
	public WebElement buttonShowCart() {
		WebElement buttonShowCart = driver.findElement(By.xpath("//a[@class='action showcart']"));
		return buttonShowCart;
	}
	
	public WebElement linkViewCart() {
		WebElement linkViewCart = driver.findElement(By.xpath("//a[@class='action viewcart']"));
		return linkViewCart;
	}
	
}
