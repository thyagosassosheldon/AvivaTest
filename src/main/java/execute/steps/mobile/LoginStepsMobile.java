package execute.steps.mobile;

import io.cucumber.java.en.*;
import pages.mobile.HomePageMobile;
import pages.mobile.LoginPageMobile;

public class LoginStepsMobile {
	
	private LoginPageMobile loginPageMobile;
	private HomePageMobile homePageMobile;

	@Given("Eu quero logal no sistema com meu usuario no app")
	public void euQueroLogalNoSistemaComMeuUsuarioNoApp() {
	    homePageMobile = new HomePageMobile();
	  //TODO Confirmar HomePage
	    homePageMobile.accessLoginPage();
	}
	@When("Eu informar meu usuario e senha no app")
	public void euInformarMeuUsuarioESenhaNoApp() {
	    loginPageMobile = new LoginPageMobile();
	  //TODO Confirmar LoginPage
	    loginPageMobile.loginUser("", "");   
	}
	@Then("Uma notificação avisara sobre o sistema antifraude no app")
	public void umaNotificaçãoAvisaraSobreOSistemaAntifraudeNoApp() {
		loginPageMobile = new LoginPageMobile();
		//TODO METODO CHECAR INFORMAÇÃO DE ANTI FRAUDE
	}

	@Given("Eu quero adicionar um produto ao carrinho pelo app")
	public void euQueroAdicionarUmProdutoAoCarrinhoPeloApp() {
		homePageMobile = new HomePageMobile();
	    //TODO Confirmar HomePage
	}
	
	@When("Eu pesquisar o produto que eu desejo no app")
	public void euPesquisarOProdutoQueEuDesejoNoApp() {
	    homePageMobile = new HomePageMobile();
	    homePageMobile.searchProduct("Lampada");
	}
	
	@When("Eu adicionar o produto ao carrinho no app")
	public void euAdicionarOProdutoAoCarrinhoNoApp() {
		homePageMobile.adicionarPrimeiroProduto();
	}
	@Then("O produto deve ser adicionado com sucesso ao carrinho no app")
	public void oProdutoDeveSerAdicionadoComSucessoAoCarrinhoNoApp() {
		//TODO Confirmar produto foi adicionado
	}
	@Then("O produto deve ser apresentado corretamente no carrinho no app")
	public void oProdutoDeveSerApresentadoCorretamenteNoCarrinhoNoApp() {
		//TODO Confirmar produto na pagina do carrinho
	}

	@Given("Eu queira finalizar uma compra no app")
	public void euQueiraFinalizarUmaCompraNoApp() {
		homePageMobile = new HomePageMobile();
	    homePageMobile.searchProduct("Lampada");
	    homePageMobile.adicionarPrimeiroProduto();
	}
	@Given("Eu ja tenha adicionado o produto ao carrinho no app")
	public void euJaTenhaAdicionadoOProdutoAoCarrinhoNoApp() {
		//TODO Confirmar produto na pagina do carrinho
	}
	@When("Eu ir para o pagamento e informar os meios de pagamento no app")
	public void euIrParaOPagamentoEInformarOsMeiosDePagamentoNoApp() {
		//TODO Confirmar produto e ir para pagamento
	}
	@Then("Uma notificação avisara que eu devo estar logado")
	public void umaNotificaçãoAvisaraQueEuDevoEstarLogado() {
		//TODO Confirmar mensagem popup
	}





}
