package pages;

import org.openqa.selenium.By;

public class IslamicProductPage extends IslamicBasePage {
	public By ADDTOCART = By.xpath("//button[@name='add-to-cart']");
	public By GOTOCART = By.xpath("//i[@class=\"woofc-icon-cart6\"]");
	public By CHECKOUT = By.xpath("//a[@class='woofc-action-checkout']");

	public void addToCart() {
		clickOnElement(ADDTOCART);
	}

	public void goToCart() {
		clickOnElement(GOTOCART);
	}

	public void checkOut() {
		clickOnElement(CHECKOUT);
	}

}
