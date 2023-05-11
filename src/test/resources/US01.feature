@regression
@registration
Feature: System should allow any user to register with valid credentials validating the success message

  Background:
    Given user opens the homepage

    Scenario: There should be a valid SSN respecting the "-" where necessary, it should be 9 digits long

      When User click register_signIn icon
      And User click register button
      And User fill the blank with valid ssn number
      Then Assert that is been filled valid ssn number


    Scenario: There should be a valid name that contains chars and cannot be blank

      When User click register_signIn icon
      And User click register button
      And User fill the blank with valid ssn number
      And User fill the blank that belongs firstName with chars without blank
      Then Assert that firstName has no blanks and contains chars

    Scenario: There should be a valid lastname and it is a required field

      When User click register_signIn icon
      And User click register button
      And User click lastname field
      And User click adress field
      Then Assert that lastname is required field


    Scenario: There should be a valid lastname that contains chars

      When User click register_signIn icon
      And User click register button
      And User fill the lastname field
      Then Assert that lastname is valid and contains chars

    Scenario: You can provide chars and digits to describe a valid address along with zip code

      When User click register_signIn icon
      And User click register button
      And User fill the address field
      Then Assert that address field contains chars and digits with zip code

    Scenario: User should provide 10 digit-long mobilephone number as a required field respecting the "-"

      When User click register_signIn icon
      And User click register button
      And User fill the mobilephone field as 10 digit long
      Then Assert that blank filled with 10 digit long mobilephone number

    Scenario: User cannot use just digits while creating username, but can use any chars and digits along with them and of any length

      When User click register_signIn icon
      And User click register button
      And User fill the username field by using chars and digits
      Then Assert that blank filled with username that contains any chars and digits

    Scenario: You should provide a valid email format that contains "@"sign and "." extensions

      When User click register_signIn icon
      And User click register button
      And User fill the e-mail field
      Then Assert that email contains "@" sign and "." extension