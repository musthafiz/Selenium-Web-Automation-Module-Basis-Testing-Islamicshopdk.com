package pages;

import org.openqa.selenium.By;

public class IslamicHomePage extends IslamicBasePage {
	public By SLIDEPOINT = By
			.xpath("//div[@class='woocommerce columns-3 swiper-container__extra']//span[@aria-label='Go to slide 2']");
	public By CLICKBOOK = By.xpath("//a[contains(text(),'পারিবারিক সংকটে নবিজির উপদেশ')]");
	public By ADDTOCART = By.xpath("//button[@name='add-to-cart']");
	public By GOTOCART = By.xpath("//i[@class=\"woofc-icon-cart6\"]");
	public By CHECKOUT = By.xpath("//a[@class='woofc-action-checkout']");

	public void slidePoint() {
		clickOnElement(SLIDEPOINT);
	}

	public void clickBook() {
		clickOnElement(CLICKBOOK);
	}

}
