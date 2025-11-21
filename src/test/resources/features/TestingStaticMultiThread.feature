
@MultiThreadFactory
Feature: testing multiThread

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
 
 
