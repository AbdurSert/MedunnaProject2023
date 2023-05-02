@US014

  Feature: Date should be created on the time of account creation

    Background:
        Given go to website Gmibank
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
        And click to firstname box
        And enter a name
        And enter a lastname
        And enter a middle initial
        And enter a mail
        And enter a mobile phone number
        And enter a phone number
        And enter a zipcode
        And enter a address
        And enter a city
        And enter a SSN
        And enter a date
        And click to save customer box
        Then assert that the date format is MMDDYYYY



    @US01403
    Scenario: User can choose a user from the registration and it cannot be blank



    @US01404
    Scenario: There user can choose an account created on manage accounts
        And click to the dropdown on my operations
        And user clicks on the manage accounts
        And user clicks on one of the created accounts
        Then assert that you clicked on a created account


    @US01405
    Scenario: User can select Zelle Enrolled optionally and save it
        And click to the dropdown on my operations
        And click to manage customers
        And click to create a new customer
        And click to firstname box
        And enter a name
        And enter a lastname
        And enter a middle initial
        And enter a mail
        And enter a mobile phone number
        And enter a phone number
        And enter a zipcode
        And enter a address
        And enter a city
        And enter a SSN
        And enter a date
        And click to the Zelle Enrolled box
        And click to save customer box
        Then assert that new customer is created