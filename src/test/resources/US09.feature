@regression
@US09
Feature:Create a new customer

  Scenario:User can search for a new applicant by their SSN and see all their registration info populated

    Given go to website Gmibank
    And  click dropdown login
    And click sign in
    And enter a valid username
    And go to password box
    And enter a valid password
    And click to sign in button
    And click to the dropdown on my operations
    And click to manage customers
    And click to the first ID box
    Then assert if all the info of the customer shines










