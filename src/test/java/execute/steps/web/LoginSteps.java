package execute.steps.web;

import io.cucumber.java.en.*;
import pages.web.HomePage;

public class LoginSteps {
	
	private HomePage homePage;
	
	@Given("Eu quero logal no sistema com meu usuario")
	public void euQueroLogalNoSistemaComMeuUsuario() {
	    homePage = new HomePage();
	    homePage.entrarNoSite();
	}
	
	@Given("Eu ja possua cadastro")
	public void euJaPossuaCadastro() {
	    
	}
	@When("Eu informar meu usuario e senha")
	public void euInformarMeuUsuarioESenha() {
	    
	}
	@Then("O sistema deve me encaminhar para pagina home logado")
	public void oSistemaDeveMeEncaminharParaPaginaHomeLogado() {
	    
	}

}
