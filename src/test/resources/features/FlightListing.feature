Feature: Validate Flight Listing Functionality

  Scenario: Verify Filter Functionality
    Given user open application
    Then verify user is on homepage
    When user click on Flight Tab
    Then verify flight search page is displayed
    When user search flight with from city "flight.from.city" and to city "flight.to.city" with date "flight.date"
    Then verify user is on flight listing page
    When user select filter option "flight.filter.option"
    Then verify only "flight.filter.option" flights are displayed on the page

  Scenario: Verify Round Trip tab activated after selecting return date
    Given user open application
    Then verify user is on homepage
    When user click on Flight Tab
    Then verify flight search page is displayed
    When user select return date "flight.return.date"
    Then verify round trip tab is activated