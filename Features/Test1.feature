#Feature: List of scenarios.

@tag
Feature: New gameaccount
  New user creates a gameaccount using join now button on homepage

  @tag1
  Scenario Outline: User joins gameaccount
	Given I am a user to join gameaccount by selecting Join Now
	When I Enter Title and FirstName and Surname
	And I Accept terms and conditions
	And I Enter Join Now
	Then I get validation error
	


Examples:                      		
|Title |FirstName |LastName |
|Mr		  |TestFName       |TestLName    |
