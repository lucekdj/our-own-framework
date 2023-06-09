Feature: Login feature
@Smoke
  Scenario: Verify user is able to log in with valid credentials
    Given user enters valid "valid.username" and "valid.password"
    When user clicks on sign in button
    Then verify user is successfully logged into the account