Feature: System should allow user to manage their account

  Background:
    Given The user goes to the homepage
    When The user clicks the profile menu
    When The user clicks the sign in button
    When The user clicks the username's text box
    And The user enters valid username for user
    When The user clicks the password's text box
    And The user enters valid password for user
    And The user clicks the sign in button
    And The user clicks the button of "My Operations" on the headline
    And The user selects Manage Accounts


  @US_015
  Scenario: User should see all account types and balance populated

    Then The user sees all account types and balance populated

  @US_015
  Scenario: User can view transaction

    And The user clicks the View button
    Then The user can view transaction
