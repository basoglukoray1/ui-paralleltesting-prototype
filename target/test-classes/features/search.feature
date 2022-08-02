Feature: Navigate to random urls

  Scenario: User should search for random things
    Given User is on the google home page
    When user searches for "Keller Williams"
    And user clicks on search button
    Then user must see "Keller Williams - Google Search" as the tab title