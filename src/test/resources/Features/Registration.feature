Feature: Registration Functionality

  Background: Given I am on the homepage

    Scenario: User should be able to login with valid details
      And I navigate to the registration page
      When I enter valid registration details
      And I click on the signup button
      Then I should see a confirmation message indicating successful registration
