Feature: Checkbox Functionality Test
  Test the checkbox behavior including selection and state after refresh


  Background:
    Given I am on the-internet homepage in incognito mode

  Scenario: Verify checkbox state after selection and page refresh
    When I navigate to the Checkboxes page
    Then the Checkboxes page should be displayed
    When I select Checkbox 1
    Then Checkbox 1 should be selected
    When I refresh the page
    Then Checkbox 1 should not be selected
