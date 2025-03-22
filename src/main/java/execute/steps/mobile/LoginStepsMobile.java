package execute.steps.mobile;

import io.cucumber.java.en.*;
import pages.mobile.HomePageMobile;

public class LoginStepsMobile {
	
	private HomePageMobile homePageMobile;
	
	
	@Given("Eu quero logal no sistema com meu usuario no mobile")
	public void euQueroLogalNoSistemaComMeuUsuarioNoMobile() {
	    homePageMobile = new HomePageMobile();
	    homePageMobile.homePage();
	}
	@When("Eu informar meu usuario e senha no mobile")
	public void euInformarMeuUsuarioESenhaNoMobile() {
	    
	}
	@Then("O sistema deve me encaminhar para pagina home logado no mobile")
	public void oSistemaDeveMeEncaminharParaPaginaHomeLogadoNoMobile() {
	    
	}




}
