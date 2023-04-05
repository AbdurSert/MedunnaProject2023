@US06

Feature: User info segment (User Settings) should be editable on Homepage

  Background:
    Given User go to home page


  Scenario: There should be user info being populated when navigating to user info "firstname, lastname, email and language"

    When User click register_signIn icon
    And User click signIn filed
    And User fill the userName and password field with their informations
    And User click the signInbutton
    And User click icon that contains their username
    And User click userInfo field
    Then Assert that page contains user informations firstname, lastname, email and language

