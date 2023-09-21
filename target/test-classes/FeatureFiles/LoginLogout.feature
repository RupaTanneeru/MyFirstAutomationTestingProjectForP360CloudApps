@login
Feature: Test Login and Logout functionality from Pentana360 WebApplicaiton Portal 
 

  
  Scenario Outline: Test Login and Logout functionality from Pentana360 WebApplicaiton Portal 
    Given As User I want to Logon into Pentana360 Application
    And I entered email into "<email>" field
    And I click on Continue button 
    And I entered password into "<password>" field
    When I click on Sign In button
    Then I verify user can successfully login into Application
    And I click on User icon to search for sign out option
    When I click on Sign Out option
    Then I verify user can successfully logout from the applicaiton 

  
    Examples: 
      | email                               |   password  |
      | rupa.tanneeru@pentanasolutions.com  |   Test1234! |
      