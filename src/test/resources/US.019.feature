@US019

  Feature: System should allow Admin to create a new Account

    Background:
      Given go to website Gmibank
      And click dropdown login
      And click sign in
      And enter manager username
      And go to password box
      And enter manager password
      And click to sign in button
      And click to dropdown on my operations
      And click to manage accounts
      And click to create a new account
    @US01901
    Scenario: User should create a description for the new account and it cannot be blank


      And click to description
      And type in description
      And click to balance
      And type in balance
      And click to save box
      Then verify that account is created successfully

    @US01902

    Scenario: User should provide a balance for the first time account creation as Dollar

      And

    @US01903

    Scenario: User can select an account type as CHECKING, SAVING, CREDIT_CARD or INVESTING

      And click to account type box
      Then verify that all four options shines

    @US01904

    Scenario: Account status should be defined as ACTIVE, SUSPENDED or CLOSED

      And click to account status type bar
      And select one of the dropdown options


    @US01905

    Scenario: User can select an employee from the drop-down
