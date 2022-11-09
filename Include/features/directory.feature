#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@directory
Feature: Search directory
  I want to search valid name and invalid name in directory

  @Valid
  Scenario Outline: Enter valid name for search in directory
    Given I want to login to the webpage
    When I enter valid username and password
    And I click directory
    And I search for valid first name <firstname>
    And I click for valid name <name>
    Then I logout from the browser

    Examples: 
      | firstname | name        |
      | Harry      |Harry  Potter |

  @Invalid
  Scenario Outline: Enter invalid name for search in directory
    Given I want to login to the webpage
    When I enter valid username and password
    And I click directory
    And I search invalid name <name>
    Then I logout from the browser

    Examples: 
      | name |
      | anis |
