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
		ShopingCartPage.firstName("Abul Hasan");
		ShopingCartPage.lastName("Sohan");
		ShopingCartPage.streetAddress("Akaur Thakur Para , Simul Toli Road");
		ShopingCartPage.town("Golir more vuter dokan");
		ShopingCartPage.district();
		ShopingCartPage.selectDistrict();
		ShopingCartPage.postCode("1952");
		js.executeScript("window.scrollBy(0,400)");
		ShopingCartPage.phone("01445522333");
		ShopingCartPage.email("abulmia@gmail.kom");
		ShopingCartPage.comments("In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to "
				+ "demonstrate the visual form of a document or a " + "typeface without relying on meaningful content. "
				+ "Lorem ipsum may be used as a placeholder before final copy is available.");
		ShopingCartPage.payment();
		ShopingCartPage.transition("01303634998");
		ShopingCartPage.transitionID("L5P7M");
		ShopingCartPage.confirmOrder();
	}

}
