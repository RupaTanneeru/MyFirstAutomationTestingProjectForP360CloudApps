@AdminUserCanFilterUsersByCompanyAndBranch
Feature: Admin User Can Filter Users By Company And Branches
  
  Scenario Outline: Admin Users can Filter Users by Company And Branches
    
    Given User sings into Pentana360 application with email "rupa.tanneeru@pentanasolutions.com" and password "Test1234!"
    When User click on UserAdmin App
    Then Page is redirected to UserAdmin App 
    And User selects Filter button
    And User enters Company Name "test" and Branch Name "test3a"
    Then User Verifies the company name "test" and branch name "test3a"