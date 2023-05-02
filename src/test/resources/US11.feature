@US11
Feature: Date should be created on the time of customer creation

  Background:
    Given User goes to home page
    When User click register_signIn icon
    And User click signIn filed
    And User fill the userName and password field with their informations
    And User click the signInbutton
    And User clicks My Operations field
    And User clicks Manage Costumers field


    Scenario: The date cannot be typed earlier, in the past, at the time of creation a customer

    And User clicks Create New Costumer field
    And User pick the date by using Create Date field
    Then Assert that date is not typed earlier than at the time of creation a customer


    Scenario: The date should be created as month, day, year, hour and minute

      And User clicks Create New Costumer field
      Then Assert that  date contains month, day, year, hour and minute

    Scenario: The user can choose an account created on manage accounts

      And User clicks user id to get informations of them
      Then Assert that user can choose an account created on manage accounts

    Scenario: User can select Zelle Enrolled optionally and save it

      And User clicks Create New Costumer field
      And User fills first name field
      And User fills last name field
      And User fills middle initial field
      And User fills email field
      And User fills mobilephone number field
      And User fills phone number fills field
      And User fills zip code field
      And User fills adress field
      And User fills city field
      And User fills ssn field
      And User click save button
      Then Assert that Zelle Enrolled is optional and it can be save without it



