Feature: Search a Product
  Scenario: Simple Product with Success
    Given I access  Petz homepage
    When I search "AquárioBoyu Curvo 100 187 Litros Preto Champagne"
    Then I see a list of product "AquárioBoyu Curvo 100 187 Litros Preto Champagne"
    And I click at product "AquárioBoyu Curvo 100 187 Litros Preto Champagne"
    Then show the title "AquárioBoyu Curvo 100 187 Litros Preto Champagne" and price R$ 3.199,99"