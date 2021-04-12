
#Feature: List of scenarios.

Feature: New User registration with password validation
	I would like to validate thepassword for minimum length, numerical value and special charcater
	
	Scenario: Create a new account but password is too short
		Given I am registering as new user
		When I go to the Join Now page
		And I fill in all form fields correctly
		And I fill in "Choose password" with "pas@1"
		And I fill in "Re-type password" with "pas@1"
		And I press "Join Now"
		Then I should see "Password must be at least 6 characters long"
		
	
	Scenario: Create a new account but password with no number
		Given I am registering as new user
		When I go to the Join Now page
		And I fill in all form fields correctly
		And I fill in "Choose password" with "passw@"
		And I fill in "Re-type password" with "passw@"
		And I press "Join Now"
		Then I should see "Password must have at least one number"


	
	Scenario: Create a new account but password with no special character
		Given I am registering as new user
		When I go to the Join Now page
		And I fill in all form fields correctly
		And I fill in "Choose password" with "passw1"
		And I fill in "Re-type password" with "passw1"
		And I press "Join Now"
		Then I should see "Password must have at least one special character"

	Scenario: Create a new account but password is too short with no special character and no number
		Given I am registering as new user
		When I go to the Join Now page
		And I fill in all form fields correctly
		And I fill in "Choose password" with "p"
		And I fill in "Re-type password" with "p"
		And I press "Join Now"
		Then I should see "Password must be at least 6 characters long with at least one number and at least one special character"
		
		
		
		