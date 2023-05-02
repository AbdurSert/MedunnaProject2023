Feature: System should allow to create new countries using api end point
  "https://www.gmibank.com/api/tp-countries" if not created already

  @US_025
  Scenario: User can Just create each country 1 by 1

    When User create a country
    Then Assert that country is created
