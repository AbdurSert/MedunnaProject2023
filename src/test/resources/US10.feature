@US_010
Feature: Address of customer can be created.

  Background:
    Given The manager goes to the homepage
    When The manager clicks the profile menu
    And The manager clicks the sign in link
    And The manager clicks the username's text box
    And The manager enters valid username for manager
    And The manager clicks the password's text box
    And The manager enters valid password for manager
    And The manager clicks the sign in button
    And The manager clicks the button of "My Operations" on the headline
    And The manager selects "Manage Customers"
    And The manager clicks "Create a new Customers" button


  @US_010_1
  Scenario: Address as street and number should be provided  and cannot be left blank.

    And The manager clicks on the Address bar
    #And The manager clicks on the City bar
    Then The manager sees that text of "This field is required."
    And The Manager enters the address information as street and number
    Then The manager verifies that address information should be entered as street and number

  @US_010_2
  Scenario: City should be provided and cannot be left as blank.

    And The manager clicks on the City bar
    Then The manager verifies that the City bar cannot be left blank

  @US_010_3
  Scenario: Country should be typed and cannot be blank should be provided and cannot be left as blank.

    And The manager clicks on the Country bar
    Then The manager verifies that the Country bar cannot be left blank

  @US_010_4
  Scenario: State should be provided as US state and cannot be blank.

    And The manager clicks on the State bar
    Then The manager verifies that the State bar cannot be left blank
