Feature: Facebook app login feature


  @Regression
  Scenario: User should be able to login with valid credentials
    Given user is on the login page
    When user enters email and password
    And user clicks login
    Then user should navigate to the home page and title must be "Facebook"