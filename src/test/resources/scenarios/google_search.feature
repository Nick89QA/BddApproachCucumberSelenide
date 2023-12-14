Feature: Searching in google article about Cucumber tool

  Background: the google search is open

  Scenario: searching in google article
    Given confirm cookie in start google page
    When enter a search word "Cucumber tool for automation testing"
    And find an article on the official website of Cucumber
    Then ensure that topic of quick start is onsite
