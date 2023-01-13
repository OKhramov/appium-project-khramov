@smoke
@regression
Feature: Wikipedia search field
  As a regular user of the Wikipedia application, I want to have a opportunity to find something in the Wikipedia

  Scenario: Open application on the welcome screen and search word Appium
    Given user open application
    When welcome screen ready
    And user can see Explore icon
    And user tap on the search field
    And user type in search line "Appium"
    And search result is displayed
    And click on search result for word Appium
    And search result is displayed on the Result page
    Then search result has the text "Automation for Apps"
