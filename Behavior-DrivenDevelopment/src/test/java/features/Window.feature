Feature: Multiple Windows Functionality Test
  Test the multiple windows behavior including tab handling and navigation

  Scenario: Verify window handling and back navigation
    Given I am on the-internet homepage in incognito mode
#    When I navigate to the "Multiple Windows" page
    When I navigate to the Multiple Window page
    Then the Multiple Windows page should be displayed
    And the "Click Here" link should be visible
    When I click the "Click Here" link
    Then a new tab with "New Window" header should open
    When I switch back to the original tab
    And I navigate back to the main page
    Then the main page should be displayed