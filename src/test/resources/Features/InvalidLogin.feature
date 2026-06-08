Feature: Verify Invalid Login Functionality

  Background:
    Given I am on the homepage

  Scenario: Verify that a user cannot log in with invalid credentials
    When I enter valid username and invalid password
    And I click  login button
    Then I should see an error message indicating invalid login