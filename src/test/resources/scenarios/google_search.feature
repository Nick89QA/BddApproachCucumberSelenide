Feature: Searching in google article about Cucumber tool

  Background: the google search is open

  Scenario: searching in google article
    Given confirm cookie in start google page
    When enter a search word "Cucumber io"
    And and click on the official page Cucumber
    And allow cookie on official website
    And click on the topic Docs in drop down menu
    And click on the button Installation in drop down menu
    Then ensure that topic of quick start is onsite
