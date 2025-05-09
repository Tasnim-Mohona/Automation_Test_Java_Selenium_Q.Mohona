Feature: Multiple Windows Navigation

  Background:
    Given I am on the-internet homepage in incognito mode

  Scenario Outline: Verify window handling functionality
    When I store the Index Page Tab handle
    And I navigate to the Multiple Window page
    Then I validate Multiple Page Header is <expectedHeader>
    When I click the Click Here link
    And I wait for and switch to new tab
    Then the page header should be <expectedHeader1>
    When I switch back to index window
    Then the main page should be displayed
    Examples:
      | expectedHeader | expectedHeader1 |
      | "Click Here"   | "New Window"    |
