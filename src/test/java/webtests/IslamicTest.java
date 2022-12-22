package webtests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pages.IslamicBasePage;
import pages.IslamicHomePage;
import pages.IslamicProductPage;
import pages.IslamicViewCartPage;
import utilities.IslamicDriverSetup;

public class IslamicTest extends IslamicDriverSetup {
	IslamicBasePage BasePage = new IslamicBasePage();
	IslamicHomePage HomePage = new IslamicHomePage();
	IslamicProductPage ProductPage = new IslamicProductPage();
	IslamicViewCartPage ShopingCartPage = new IslamicViewCartPage();

	@Test
	public void webTest() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		getDriver().get("https://www.islamicshopdk.com/");
		js.executeScript("window.scrollBy(0,2100)");
		HomePage.slidePoint();
		HomePage.clickBook();
		ProductPage.addToCart();
		ProductPage.goToCart();
		ProductPage.checkOut();
		ShopingCartPage.firstName();
		ShopingCartPage.lastName();
		ShopingCartPage.streetAddress();
		ShopingCartPage.town();
		ShopingCartPage.district();
		ShopingCartPage.selectDistrict();
		ShopingCartPage.postCode();
		js.executeScript("window.scrollBy(0,400)");
		ShopingCartPage.phone();
		ShopingCartPage.email();
		ShopingCartPage.comments();
		ShopingCartPage.payment();
		ShopingCartPage.transition();
		ShopingCartPage.transitionID();
		ShopingCartPage.confirmOrder();
	}

}
