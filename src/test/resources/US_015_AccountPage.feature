Feature: System should allow user to manage their account

  Background:
    Given The manager goes to the homepage
    When The manager clicks the profile menu
    When The manager clicks the sign in button
    When The manager clicks the username's text box
    And The manager enters valid username for manager
    When The manager clicks the password's text box
    And The manager enters valid password for manager
    And The manager clicks the sign in button
    And The manager clicks the button of "My Operations" on the headline
    And The manager selects Manage Accounts


  @US_015
  Scenario: User should see all account types and balance populated

    Then The user sees all account types and balance populated

  @US_015
  Scenario: User can view transaction

    And The user clicks the View button
    Then The user can view transaction
