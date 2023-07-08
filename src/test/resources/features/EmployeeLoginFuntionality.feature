@Employee

Feature:  Employee Login Functionality

  Description: Description:
  As a Employee
  I want to Login as Employee
  So that I can Employee Home Page

  Scenario:
    Given I am in Landing Page
    Then I click on Login Menu
    And I Enter Employee User Id
    And I enter Employee Password
    When I click on Login button
    Then Verify I am in Employee Home Page

