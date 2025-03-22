package pages.mobile;

import org.openqa.selenium.By;

import core.BasePage;

public class HomePageMobile extends BasePage{
	
	private By entrarBtn = By.xpath("(//android.widget.ViewFlipper[@resource-id=\"br.com.petz:id/vf_root\"])[1]/android.view.ViewGroup");
	
	public void homePage() {
		interactions.click(entrarBtn, "entrarBtn");
	}
	

}
