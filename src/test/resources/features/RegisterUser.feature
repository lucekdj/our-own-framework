Feature: Register user feature

  Scenario: Verify user is able to register for account
    Given user clicks on sign up here button
    When user fills out first registration page
    Then user fills out second registration page
    Then verify registration is successful

