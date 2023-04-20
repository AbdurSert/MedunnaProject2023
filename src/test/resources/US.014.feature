@US014

  Feature: Date should be created on the time of account creation

    Background: Given go to website Gmibank
        And click dropdown login
        And click sign in
        And enter a valid username
        And go to password box
        And enter a valid password
        And click to sign in button

    @US01401
    Scenario:The date cannot be typed earlier, in the past, at the time of creation an account


    @US01402
    Scenario: The date should be created as month, day, year, hour and minute
        And click to the dropdown on my operations
        And click to manage customers
        And click to create a new customer


    @US01403
    Scenario: User can choose a user from the registration and it cannot be blank

    @US01404
    Scenario: There user can choose an account created on manage accounts