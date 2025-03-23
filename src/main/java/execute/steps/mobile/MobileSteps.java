package execute.steps.mobile;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.mobile.CartPageMobile;
import pages.mobile.HomePageMobile;
import pages.mobile.LoginPageMobile;

public class MobileSteps {
	
	private LoginPageMobile loginPageMobile;
	private HomePageMobile homePageMobile;
	private CartPageMobile cartPageMobile;

	@Given("Eu quero logal no sistema com meu usuario no app")
	public void euQueroLogalNoSistemaComMeuUsuarioNoApp() {
	    homePageMobile = new HomePageMobile();
	    homePageMobile.accessLoginPage();
	}
	
	@When("Eu informar meu usuario e senha no app")
	public void euInformarMeuUsuarioESenhaNoApp() {
	    loginPageMobile = new LoginPageMobile();
	    loginPageMobile.loginUser("thyago_baxcry@hotmail.com", "68cf7777");       
	}
	@Then("Uma notificação avisara sobre o sistema antifraude no app")
	public void umaNotificaçãoAvisaraSobreOSistemaAntifraudeNoApp() {
		loginPageMobile = new LoginPageMobile();
		Assert.assertEquals(true, loginPageMobile.securityPopUp());
	}

	@Given("Eu quero adicionar um produto ao carrinho pelo app")
	public void euQueroAdicionarUmProdutoAoCarrinhoPeloApp() {
		homePageMobile = new HomePageMobile();
	    //NECESSARIO?
	}
	
	@When("Eu pesquisar o produto que eu desejo no app")
	public void euPesquisarOProdutoQueEuDesejoNoApp() {
	    homePageMobile = new HomePageMobile();
	    homePageMobile.searchProduct("Lampada");
	}
	
	@When("Eu adicionar o produto ao carrinho no app")
	public void euAdicionarOProdutoAoCarrinhoNoApp() {
		homePageMobile.addFirstProduct();
	}
	@Then("O produto deve ser adicionado com sucesso ao carrinho no app")
	public void oProdutoDeveSerAdicionadoComSucessoAoCarrinhoNoApp() {
		Assert.assertEquals(true, homePageMobile.confirmProductAddedToCart());
	}
	@Then("O produto deve ser apresentado corretamente no carrinho no app")
	public void oProdutoDeveSerApresentadoCorretamenteNoCarrinhoNoApp() {
		homePageMobile.goToCart();
		cartPageMobile = new CartPageMobile();
		Assert.assertEquals(false, cartPageMobile.confirmThatCartIsNotEmpty());
	}

	@Given("Eu queira finalizar uma compra no app")
	public void euQueiraFinalizarUmaCompraNoApp() {
		homePageMobile = new HomePageMobile();
	    homePageMobile.searchProduct("Lampada");
	}
	@Given("Eu ja tenha adicionado o produto ao carrinho no app")
	public void euJaTenhaAdicionadoOProdutoAoCarrinhoNoApp() {
		homePageMobile.addFirstProduct();
		homePageMobile.goToCart();
	}
	@When("Eu ir para o pagamento e informar os meios de pagamento no app")
	public void euIrParaOPagamentoEInformarOsMeiosDePagamentoNoApp() {
		cartPageMobile = new CartPageMobile();
		cartPageMobile.goToPaymentPage();
	}
	@Then("Uma notificação avisara que eu devo estar logado")
	public void umaNotificaçãoAvisaraQueEuDevoEstarLogado() {
		Assert.assertEquals(true, cartPageMobile.needToBeLogedInConfirmation());
	}





}
