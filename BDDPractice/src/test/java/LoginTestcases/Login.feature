Feature: Login Function
Scenario: Valid Login
  Given navigate to login page
  When valid username and password are entered
  And clicked on submit button
  Then user's home page is displayed


  Scenario: Valid Login
    Given navigate to login page
    When invalid username and password are entered
    And clicked on submit button
    Then error message will be displayed