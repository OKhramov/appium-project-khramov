@smoke
@regression
Feature: Wikipedia welcome screen
  As a regular user of the Wikipedia application, I want to be able to see the Welcome screen.

  Background:
    Given user open application
    When welcome screen ready

  Scenario: Open application on the welcome screen and see the Explore icon
    Then user can see Explore icon

  Scenario: Open application on the welcome screen and see the Nearby icon
    Then user can see Nearby icon