@Registration @Regression
Feature: User registration

  Background: 
    Given I launch the application
    When I click on "REGISTER" link

  Scenario: user registration with valid user details
    And I enter "rahul" into firstname text box
    And I enter "tripathi" into lastname text box
    And I enter "autouser" into username text box
    And I enter "test" into password testbox
    And I enter "test" into confirm password text box
    And I click on submit button
    Then I should land on registration confirmation page

  Scenario: user registration with invalid user details
    And I enter "invalidauser" into firstname text box
    And I enter "tripathi" into lastname text box
    And I enter "autouser" into username text box
    And I enter "test" into password testbox
    And I enter "test234" into confirm password text box
    And I click on submit button
    Then I should not land on registration confirmation page
