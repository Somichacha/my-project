Feature: Verify Invalid Login Functionality

  Background:
    Given I am on the homepage

  Scenario: Verify the login with invalid credentials
    When I enter invalid username and valid password
    And I click the login
    Then I should see an error message invalid login