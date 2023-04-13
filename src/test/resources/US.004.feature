@US04
Feature: Login page should accessible with valid credentials

@US0401
  Scenario: There should be a valid username and password validating the success message to login



    Given go to website Gmibank
    And click dropdown login
    And click sign in
    And enter a valid username
    And go to password box
    And enter a valid password
    And click to sign in button
    Then see if you are signed in

@US0402
  Scenario: There should be an option to cancel login

    Given go to website Gmibank
    And click dropdown login
    And click sign in
    And click to cancel
    Then see if it is cancelled








