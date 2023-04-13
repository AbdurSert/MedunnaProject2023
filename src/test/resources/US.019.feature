@US019

  Feature: System should allow Admin to create a new Account

    @US01901
    Scenario: User should create a description for the new account and it cannot be blank

      Given go to website Gmibank
      And click dropdown login
      And click sign in
      And enter a valid username
      And go to password box
      And enter a valid password
      And click to sign in button
      And
      Then

    @US01902

    Scenario: User should provide a balance for the first time account creation as Dollar

    @US01903

    Scenario: User can select an account type as CHECKING, SAVING, CREDIT_CARD or INVESTING

    @US01904

    Scenario: Account status should be defined as ACTIVE, SUSPENDED or CLOSED

    @US01905

    Scenario: User can select an employee from the drop-down
