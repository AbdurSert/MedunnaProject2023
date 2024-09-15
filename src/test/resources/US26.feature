@regression
@US26

Feature: System should allow to update countries using api end point

  Scenario: User can just update each country 1 by 1

    When User update a country
    Then Assert that country is updated




