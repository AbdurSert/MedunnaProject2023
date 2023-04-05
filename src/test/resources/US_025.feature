Feature: System should allow to create new countries using api end point
  "https://www.gmibank.com/api/tp-countries" if not created already

  Background:
    Given The admin goes to the homepage
    When The admin clicks the profile menu
    When The admin clicks the sign in button
    When The admin clicks the username's text box
    And The admin enters valid username for admin
    When The admin clicks the password's text box
    And The admin enters valid password for admin
    And The admin clicks the sign in button

  @US_020
  Scenario: User can Just create each country 1 by 1