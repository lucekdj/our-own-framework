Feature: Savings feature

  Background:
    Given user enters valid "valid.username" and "valid.password"
    When user clicks on sign in button
    Then verify user is successfully logged into the account

  Scenario Outline: Verify user is able to create New Savings Account
    Given user clicks on "savings" menu
    And user selects "new savings" subItem
    Then verify user is on new savings page
    When user selects "<Savings Account Type>" on the Savings Account Type
    And user selects "<Account Ownership>" on the Savings Account Ownership
    And user enters "<Account Name>" on the Savings Account Name field
    And user enters "<Initial Deposit>" on the Initial Deposit field in Savings
    And user clicks on submit button on Savings Page
    Then verify user is on view savings page
    Then verify new savings account was created

    Examples:
      | Savings Account Type | Account Ownership | Account Name  | Initial Deposit |
      | Savings              | Individual        | House Savings | 25              |
      | Money Market         | Joint             | House         | 250             |