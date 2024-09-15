@regression
@US024
Feature: System should allow to create new states using api end point
  Scenario: User can Just create each state 1 by 1

    When user creates state
    Then assert that state is created




