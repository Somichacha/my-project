Feature: Logo and Login

  Background:
    Given I am on the homepage


  Scenario: Verify the logo and login is displayed on the homepage
    When I enter application URL
    And I wait for 5 seconds
    Then I should see the logo and login button on the homepage
