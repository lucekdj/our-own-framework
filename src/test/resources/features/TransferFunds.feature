Feature: Transfer Funds Feature

  Background: Verify user is able to log in with valid credentials
    Given user enters valid "valid.username" and "valid.password"
    When user clicks on sign in button
    Then verify user is successfully logged into the account
@DB
    Scenario: Verify user is able to transfer funds between accounts
      Given verify user is successfully logged into the account
      Then user clicks on Transfer Between Accounts
      Then verify user is on Internal Transfer Page
      When user selects from Account "TransferFromAccount"
      Then user selects to Account "TransferToAccount"
      And user enters amount "TransferAmount"
      And user clicks on submit button

      Then verify user is on View Accounts Page
      And verify transaction history is displayed for the new transaction
      And verify transaction details getting updated to the database
