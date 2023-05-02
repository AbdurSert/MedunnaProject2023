@US022
  Feature: System should allow to read states using api end point

    Background:
      Given Read all states you created

  @US022_AC01
  Scenario: Read all states that were created and validate from your data set
    Then Validate them from data set


  @US022_AC02
  Scenario: Read all states and validate them 1 by 1
    Then Validate them one by one

