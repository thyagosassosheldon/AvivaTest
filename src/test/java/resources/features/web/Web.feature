@WebLogin
Feature: Logar com usuario
  Dado que eu queira logar no sistema com meu usuario

  @WebLogin
  Scenario: Logar no sistema com usuario valido
    Given Eu quero logal no sistema com meu usuario
    And Eu ja possua cadastro
    When Eu informar meu usuario e senha
    Then O sistema deve me encaminhar para pagina home logado
