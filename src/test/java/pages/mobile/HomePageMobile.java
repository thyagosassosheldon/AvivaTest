package pages.mobile;

import org.openqa.selenium.By;

import core.BasePage;

public class HomePageMobile extends BasePage{
	
	
	
    private By searchTxt = By.xpath("//android.widget.AutoCompleteTextView[@resource-id=\"br.com.kabum.webviewapp:id/search_src_text\"]");
	private By addToCartBtn = By.xpath("(//android.widget.TextView[@text=\"COMPRAR\"])[1]");
	private By goForCartBtn = By.xpath("//android.widget.Button[@resource-id=\"br.com.kabum.webviewapp:id/button_primary\"]");
	private By skipNotificationBtn = By.xpath("//android.widget.Button[@resource-id=\"br.com.kabum.webviewapp:id/btn_cancel\"]");
	private By myAccountBtn = By.xpath("//android.widget.FrameLayout[@content-desc=\"Minha conta\"]");
	private By addedToCardTxt = By.xpath("//android.widget.TextView[@resource-id=\"br.com.kabum.webviewapp:id/success_message\"]");
	private By allowNotificationSkipBtn = By.xpath("//android.widget.Button[@resource-id=\"br.com.kabum.webviewapp:id/btn_cancel\"]");
	
	public HomePageMobile(){
		if(interactions.isElementDisplayed(allowNotificationSkipBtn, "allowNotificationSkipBtn")) {
			interactions.click(allowNotificationSkipBtn, "allowNotificationSkipBtn");;
		}
	}
	
	public void skipNotification() {
		interactions.click(skipNotificationBtn, "skipNotificationBtn");
	}
	
	public void accessLoginPage() {
		interactions.click(myAccountBtn, "myAccountBtn");
	}
	
	public void searchProduct(String product) {
		interactions.awaitElement(searchTxt, "searchTxt");
		interactions.click(searchTxt, "searchTxt");
		interactions.wait(5000);
		interactions.write(searchTxt, product + "\n", "searchTxt");
		
	}
	
	public void addFirstProduct() {
		interactions.awaitElement(addToCartBtn, "addToCartBtn");
		interactions.click(addToCartBtn, "addToCartBtn");
	}
	
	public boolean confirmProductAddedToCart() {
		interactions.awaitElement(addedToCardTxt, "addedToCardTxt");
		if(interactions.getText(addedToCardTxt, "addedToCardTxt").contains("Produto adicionado no carrinho")) {
			return true;
		}
		return false;
	}
	
	public void goToCart() {
		interactions.click(goForCartBtn, "cartBtn");
	}

}
