package pages.web;

import org.openqa.selenium.By;

import core.BasePage;

public class HomePage extends BasePage{
	
	private By entrarBtn = By.xpath("//span[text()=\"Entrar\"]");
	
	public void entrarNoSite() {
		interactions.url("https://www.petz.com.br");
		interactions.awaitElement(entrarBtn, "Aguardando entrar no site");
	}

}
