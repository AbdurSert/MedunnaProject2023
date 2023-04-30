Feature: System should allow to read all customers info using api end point
  "https://www.gmibank.com/api/tp-customers"

  @US_020
  Scenario: Read all customers you created and validate them from your data set

    Given API User sets required path params "api, tp-customers"
    #* API user sends requests and gets response
    #* API user verify that status code is 200

    #When Read all customers you created
    #Then Validate them from your data set

  @US_020
  Scenario: Read all customers you created and validate them 1 by 1