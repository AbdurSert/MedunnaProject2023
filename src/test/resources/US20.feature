@regression
Feature: System should allow to read all customers info using api end point
  "https://www.gmibank.com/api/tp-customers"

  @US_020
  Scenario: Read all customers you created and validate them from your data set

    When Read all customers you created
    Then Validate customers from the Data Set


  #@US_020
  #Scenario: Read all customers you created and validate them 1 by 1