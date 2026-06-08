Feature: Valid Login Functionality

  Background:
    Given I am on the homepage

  Scenario: Verify that a user can log in with valid credentials
    When I enter valid username and password
    And I click the login button
    Then I should be logged in successfully
