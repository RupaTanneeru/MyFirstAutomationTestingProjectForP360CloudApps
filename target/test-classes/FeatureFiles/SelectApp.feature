@SelectApp
Feature: Access to Different Apps on Penatana360

  
Scenario: Select SAL Application on Apps Tab
    Given User sings into Pentana360 application with email "rupa.tanneeru@pentanasolutions.com" and password "Test1234!"
    And User Navigated to HomePage and clicks on Menu Icon
    And Clicks on Apps tab
    Then User Redirected to the Applications
    When User Clicks on a SAL Application
    Then User Redirects to the SAL Applicaiton Page
