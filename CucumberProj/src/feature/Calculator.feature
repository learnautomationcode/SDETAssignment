@calc @regression @smoke
Feature: calculator

  @add
  Scenario: Addition
    Given I have two number 10 and 3
    When I add those two number
    Then I should get the value as 13

  @multiply
  Scenario: multiplication
    Given I have two number 10 and 3
    When I multiply those two number
    Then I should get the value as 30

  #@substraction
  #Scenario: substraction
  #Given I have number 10
  #When I substract it from 20
  #Then I should get the value as 10
  