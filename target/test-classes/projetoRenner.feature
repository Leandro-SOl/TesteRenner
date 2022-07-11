#Author: leandrooliveira.lo52@gmail.com
Feature: Fazer compras no site
  Eu como usuario quero acessar o site para realizar compra

  Scenario: Realizando compra
    Given que eu esteja no "http://automationpractice.com/" para realizar login 
    When selecionar as pecas de roupa para compra
    Then compra e realizada com sucesso 
