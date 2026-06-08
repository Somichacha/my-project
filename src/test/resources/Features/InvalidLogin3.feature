Feature: Login Functionality

  Background:
    Given I am on the homepage

  Scenario Outline: Invalid credentials should return the correct error message
    When I enter username "<Username>"
    And I enter password "<Password>"
    And I click submit button
    Then I should see an error message "<errorMessage>"

    Examples:
      | Username                | Password      | errorMessage              |
      |qa_testers@qabrains.com  | Password12    | Your password is invalid! |
      |qa_testers@qabrains.co   | Password123   | Your email is invalid!    |


    Scenario Outline: User should not be able to login with empty fields
    When I enter username "<Username>" and password "<Password>"
    And I click on the submit button
      Then I should see an email error message "<emailErrorMessage>"
      And I should see a password error message "<passwordErrorMessage>"


    Examples:
      | Username | Password | emailErrorMessage           | passwordErrorMessage          |
      |          |          | Email is a required field   | Password is a required field  |