@Customer
Feature: CustomerLoginFunctionality
   Description:
   As a Customer
   I want to Login as Customer
   So that I can Customer Home Page

  @Test2
  Scenario: Verify Customer Login Functionality Test2

    Given I am in Landing Page
    Then I click on Login Menu
    And I click on Customer Login Menu
    And I Enter User Id
    And I enter Password
    When I click on Login button
    Then Verify I am in Customer Home Page


  @Test3
  Scenario: Verify Customer Login Functionality Test3
    Given I am in Landing Page
    Then I click on Login Menu
    And I click on Customer Login Menu
    And I Enter User Id
    And I enter Password
    When I click on Login button
    Then Verify I am in Customer Home Page