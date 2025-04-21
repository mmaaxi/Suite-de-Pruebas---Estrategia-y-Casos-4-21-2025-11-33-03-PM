Feature: Logout Functionality
  As a user
  I want to log out from the application
  So that I can ensure my session is secure

  Scenario: Verify logout functionality
    Given I am logged into the application
    When I click on the logout button
    Then I should be redirected to the login page