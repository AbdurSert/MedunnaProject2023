@US027
Feature: System should allow to delete states using api end point

  Scenario: User can just delete each state 1 by 1
    Given User delete each state one by one
    Then user verifies the state which is deleted

