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

	public void firstName(String fname) {
		sendKeys(FIRSTNAME, fname);
	}

	public void lastName(String lname) {
		sendKeys(LASTNAME, lname);
	}

	public void streetAddress(String address) {
		sendKeys(STREETADDRESS, address);
	}

	public void town(String townn) {
		sendKeys(TOWN, townn);
	}

	public void district() {
		clickOnElement(DISTRICT);
	}

	public void selectDistrict() {
		clickOnElement(SELECTDISTRICT);
	}

	public void postCode(String pcode) {
		sendKeys(POSTCODE, pcode);
	}

	public void phone(String phn) {
		sendKeys(PHONE, phn);
	}

	public void email(String mail) {
		sendKeys(EMAIL, mail);
	}

	public void comments(String cmt) {
		sendKeys(COMMENTS, cmt);
	}

	public void payment() {
		try {
			clickOnElement(PAYMENT);
		} catch (StaleElementReferenceException e) {
			By payment = By.xpath("//label[@for='payment_method_woo_nagad']");
			clickOnElement(payment);

		}
	}

	public void transition(String trnson) {
		sendKeys(TRANSITION, trnson);
	}

	public void transitionID(String trnsonID) {
		sendKeys(TRANSITIONID, trnsonID);
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
