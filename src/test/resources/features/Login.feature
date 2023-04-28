Feature: Login feature

  Scenario: Verify user is able to log in with valid credentials
    Given user enters valid "username" and "password"
    When user clicks on sign in button
    Then verify user is successfully logged into the account