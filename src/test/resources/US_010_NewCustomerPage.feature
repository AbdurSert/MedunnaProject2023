Feature: Address of customer can be created.

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
    And The manager selects "Manage Customers"
    And The manager clicks "Create a new Customers" button


  @US_010
  Scenario: Address as street and number should be provided  and cannot be left blank.

    And The manager clicks on the Address bar
    Then The manager verifies that the address bar cannot be left blank
    Then The manager verifies that address information should be entered as street and number

  @US_010
  Scenario: City should be provided and cannot be left as blank.

    And The manager clicks on the City bar
    Then The manager verifies that the City bar cannot be left blank

  @US_010
  Scenario: Country should be typed and cannot be blank should be provided and cannot be left as blank.

    And The manager clicks on the Country bar
    Then The manager verifies that the Country bar cannot be left blank

  @US_010
  Scenario: State should be provided as US state and cannot be blank.

    And The manager clicks on the State bar
    Then The manager verifies that the State bar cannot be left blank
