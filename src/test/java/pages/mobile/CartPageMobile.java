package pages.mobile;

import org.openqa.selenium.By;

import core.BasePage;

public class CartPageMobile extends BasePage{
	
	private By emptyCartTxt = By.xpath("//android.widget.TextView[@resource-id=\"br.com.kabum.webviewapp:id/error_text\"]");
	private By paymentBtn = By.xpath("//android.widget.Button[@resource-id=\"br.com.kabum.webviewapp:id/btn_go_to_payment\"]");
	private By needLogInTxt = By.xpath("//android.widget.TextView[@resource-id=\"br.com.kabum.webviewapp:id/snackbar_text\"]");
	
	public boolean confirmThatCartIsNotEmpty() {
		if(interactions.isElementDisplayed(emptyCartTxt, "emptyCartTxt")) {
			return true;
		}
		return false;
	}
	
	public void goToPaymentPage() {
		interactions.scrollTo("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"IR PARA O PAGAMENTO\").instance(0))", "paymentBtn");
		interactions.wait(3000);
		interactions.click(paymentBtn, "paymentBtn");
	}
	
	public boolean needToBeLogedInConfirmation() {
		System.out.println(interactions.getText(needLogInTxt, "needLogInTxt"));
		if(interactions.getText(needLogInTxt, "needLogInTxt").contains("Acesse sua conta para finalizar a compra.")) {
			return true;
		}
		return false;
	}
}
