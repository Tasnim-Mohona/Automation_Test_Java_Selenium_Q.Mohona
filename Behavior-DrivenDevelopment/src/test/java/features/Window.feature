Feature: Multiple Windows Navigation
  Scenario: Verify window handling functionality
    Given I am on the-internet homepage in incognito mode
    Then I navigate to the Multiple Window page
    Then the Multiple Windows page should be displayed
    When I store the current tab handle
    And I click the Click Here link
    And I wait for and switch to new tab
    Then the New Window page should be displayed
    And the page header should be "New Window"
    When I switch back to original tab
    And I navigate back to previous page
    Then the main page should be displayed