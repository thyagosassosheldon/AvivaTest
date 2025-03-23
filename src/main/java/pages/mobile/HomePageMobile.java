package pages.mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import core.BasePage;

public class HomePageMobile extends BasePage{
	
    private By searchTxt = By.xpath("//android.widget.AutoCompleteTextView[@resource-id=\"br.com.kabum.webviewapp:id/search_src_text\"]");
	private By addToCartBtn = By.xpath("(//android.widget.TextView[@text=\"COMPRAR\"])[1]");
	private By goForCartBtn = By.xpath("//android.widget.Button[@resource-id=\"br.com.kabum.webviewapp:id/button_primary\"]");
	private By skipNotificationBtn = By.xpath("//android.widget.Button[@resource-id=\"br.com.kabum.webviewapp:id/btn_cancel\"]");
	private By myAccountBtn = By.xpath("//android.widget.FrameLayout[@content-desc=\"Minha conta\"]");
	
	public void skipNotification() {
		interactions.click(skipNotificationBtn, "skipNotificationBtn");
	}
	
	public void accessLoginPage() {
		interactions.click(myAccountBtn, "myAccountBtn");
	}
	
	public void searchProduct(String product) {
		interactions.awaitElement(searchTxt, "searchTxt");
		interactions.click(searchTxt, "searchTxt");
		interactions.write(searchTxt, product + "\n", "searchTxt");
		
	}
	
	public void adicionarPrimeiroProduto() {
		interactions.awaitElement(addToCartBtn, "addToCartBtn");
		interactions.click(addToCartBtn, "addToCartBtn");
		interactions.click(goForCartBtn, "cartBtn");
	}

}
