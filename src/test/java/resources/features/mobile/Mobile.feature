@MobileFeature
Feature: Logar com usuario
  Dado que eu queira logar no sistema com meu usuario

  @Mobile
  Scenario: Logar no sistema com usuario valido no Mobile
    Given Eu quero logal no sistema com meu usuario no app
    When Eu informar meu usuario e senha no app
    Then Uma notificação avisara sobre o sistema antifraude no app
    
 @Mobile
  Scenario: Adicionar um produto ao carrinho Mobile
    Given Eu quero adicionar um produto ao carrinho pelo app
    When Eu pesquisar o produto que eu desejo no app
    And  Eu adicionar o produto ao carrinho no app
    Then O produto deve ser adicionado com sucesso ao carrinho no app
    And O produto deve ser apresentado corretamente no carrinho no app
    
  @Mobile
  Scenario: Comprar um produto deslogado no Mobile
    Given Eu queira finalizar uma compra no app
    And Eu ja tenha adicionado o produto ao carrinho no app
    When Eu ir para o pagamento e informar os meios de pagamento no app
    Then Uma notificação avisara que eu devo estar logado
