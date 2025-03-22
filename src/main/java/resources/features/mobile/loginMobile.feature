@MobileLogin
Feature: Logar com usuario
  Dado que eu queira logar no sistema com meu usuario

  @MobileLogin
  Scenario: Logar no sistema com usuario valido no mobile
    Given Eu quero logal no sistema com meu usuario no mobile
    And Eu ja possua cadastro
    When Eu informar meu usuario e senha no mobile
    Then O sistema deve me encaminhar para pagina home logado no mobile
