package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

public class IslamicViewCartPage extends IslamicBasePage {
	public By FIRSTNAME = By.xpath("//input[@id=\"billing_first_name\"]");
	public By LASTNAME = By.xpath("//input[@id=\"billing_last_name\"]");
	public By STREETADDRESS = By.xpath("//input[@id=\"billing_address_1\"]");
	public By TOWN = By.xpath("//input[@id=\"billing_city\"]");
	public By DISTRICT = By.xpath("//span[@id=\'select2-billing_state-container\']");
	public By SELECTDISTRICT = By.xpath("//li[text()='Meherpur']");
	public By POSTCODE = By.xpath("//input[@id='billing_postcode']");
	public By PHONE = By.xpath("//input[@id='billing_phone']");
	public By EMAIL = By.xpath("//input[@id='billing_email']");
	public By COMMENTS = By.xpath("//textarea[@id='order_comments']");
	public By PAYMENT = By.xpath("//label[@for='payment_method_woo_nagad']");
	public By TRANSITION = By.xpath("//input[@name='nagad_acc_no']");
	public By TRANSITIONID = By.xpath("//input[@name='nagad_trans_id']");
	public By CONFIRMORDER = By.xpath("//button[@id='place_order']");

	public void firstName() {
		sendKeys(FIRSTNAME, "Abul Hasan");
	}

	public void lastName() {
		sendKeys(LASTNAME, "Sohan");
	}

	public void streetAddress() {
		sendKeys(STREETADDRESS, "Akaur Thakur Para , Simul Toli Road");
	}

	public void town() {
		sendKeys(TOWN, "Golir more vuter dokan");
	}

	public void district() {
		clickOnElement(DISTRICT);
	}

	public void selectDistrict() {
		clickOnElement(SELECTDISTRICT);
	}

	public void postCode() {
		sendKeys(POSTCODE, "1952");
	}

	public void phone() {
		sendKeys(PHONE, "1445522333");
	}

	public void email() {
		sendKeys(EMAIL, "abulmia@gmail.kom");
	}

	public void comments() {
		sendKeys(COMMENTS, "In publishing and graphic design, Lorem ipsum is a placeholder text commonly used to "
				+ "demonstrate the visual form of a document or a " + "typeface without relying on meaningful content. "
				+ "Lorem ipsum may be used as a placeholder before final copy is available.");
	}

	public void payment() {
		try {
			clickOnElement(PAYMENT);
		} catch (StaleElementReferenceException e) {
			By payment = By.xpath("//label[@for='payment_method_woo_nagad']");
			clickOnElement(payment);

		}
	}

	public void transition() {
		sendKeys(TRANSITION, "01303634998");
	}

	public void transitionID() {
		sendKeys(TRANSITIONID, "L5P7M");
	}

	public void confirmOrder() {
		try {
			clickOnElement(CONFIRMORDER);
		} catch (StaleElementReferenceException e) {
			By confirmOrder = By.xpath("//button[@id='place_order']");
			clickOnElement(confirmOrder);

		}
	}
}
