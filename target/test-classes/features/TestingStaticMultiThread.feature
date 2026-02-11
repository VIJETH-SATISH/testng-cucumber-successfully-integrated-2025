
@MultiThreadFactory
Feature: testing multiThread application with Static ThreadLocal

  @Gmail
  Scenario: Login into Gmail account
    Given I enter creds in Gmail account page
    And I click on next and enter password
  
  @Amazon
  Scenario Outline: Search item on amazon
    Given I on amazon enter content to be searched
    And clicked on the needed item
    
  @Spicejet
  Scenario Outline: Search flight on spicejet
    Given I on spicejet enter destination and start point 
    And I select the Date of travel
    
  @saucedemo_GithubWorkflow_secret
  Scenario Outline: Fetching Username and Password from Github secrets Actions
    Given I login into saucedemo page using user credentials from Github secrets
    #And I should land on the home page
 
 
