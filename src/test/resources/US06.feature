
@US06

Feature: User info segment (User Settings) should be editable on Homepage

  Background:
    Given User goes to home page
    When User click register_signIn icon
    And User click signIn filed
    And User fill the userName and password field with their informations
    And User click the signInbutton
    And User click icon that contains their username
    And User click userInfo field

  Scenario: There should be user info being populated when navigating to user info "firstname, lastname, email and language"

    Then Assert that page contains user informations firstname, lastname, email and language

  Scenario: There should be 2 languages available "English and Turkish"

    Then Assert that there are two languages available Turkish and English

  Scenario: There should be an option to update firstname

    And User changes their first name
    And User click save button
    Then Assert that firstname is changed

  Scenario: There should be an option to update lastname

    And User changes their last name
    And User click save button
    Then Assert that lastname is changed

  Scenario: There should be an option to update email id adding "@" sign and "." extension

    And User changes email address
    And User click save button
    Then Assert that email is changed with @ sign and . extension