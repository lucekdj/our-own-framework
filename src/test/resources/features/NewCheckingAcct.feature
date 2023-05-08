Feature: New checking account

  Background:
    Given user enters valid "valid.username" and "valid.password"
    When user clicks on sign in button
    Then verify user is successfully logged into the account

  Scenario Outline: user opens new checking account
    Given user clicks on Checking dropdown
    Then user clicks on New Checking
    Then verify user is on New Checking page
    And user selects "<Checking Account Type>" on the Checking Account Type menu
    And user selects "<Account Ownership>" on the Select Account Ownership
    And user enters Account Name
    And user enters Initial Deposit Amount
    Then user clicks on submit button on checking page
    Then verify user successfully created a checking account

    Examples:
      | Checking Account Type | Account Ownership |
      | Standard Checking     | Individual        |
      | Interest Checking     | Joint             |




