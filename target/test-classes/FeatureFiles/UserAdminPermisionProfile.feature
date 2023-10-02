@ProfilePermission

Feature: Profile Permission Functionality
  
  Background:
   Given User sings into Pentana360 application with email "carl.malubag@pentanasolutions.com" and password "Password123#"
   When User click on UserAdmin App
   Then Page is redirected to UserAdmin App 
  
  
  Scenario: 
  When user admin sarch for a user who has Permissions profile "Carl-Test"
  Then user admin navigated to the user Permissions tab
  And user admin will see mutiple user permissions profiles
  And user admin can activates Accountant Profile setup to their user
  And user admin click on worksheet service can see a list of default fields
  And user admin can give permissions to enabled to view AccountingGP and ActualDeliveryDate fields to the user  
  And user admin click on back navigation of worksheet service
  When user admin click on Actions menu to reset permissions
  Then user admin should see fields AccountingGP and ActualDeliveryDate are reset back with origional settings
  Then User admin able to deactivte the Accountant profile setup for the user
  Then user admin navigate back to the users menu