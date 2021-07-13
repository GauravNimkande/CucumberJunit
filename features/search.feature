
Feature: Amazon Search
@Smoke
Scenario: Amazon
Given I have a search field on Amazon page
When I search for a product with name "Apple mackbook Pro" and price 1000
Then Product with name "Apple macBook Pro" Should be dispalyed

@Regration
Scenario: Search a IPhone
Given I have a search field on Amazon page
When I search for a product with name "Apple mackbook Pro" and price 1200
Then Product with name "Apple IPhone" Should be dispalyed 