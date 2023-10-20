package stepDefinitions;

import PageActions.UserAdminPageActions;
import PageObjects.UserAdminPage;
import PageVerifications.UserAdminPageVerifications;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserAdminPermissionSteps {
	
	
	UserAdminPage  userAdminPage;
	UserAdminPageActions  userAdminPageActions;
	UserAdminPageVerifications userAdminPageVerifications;
	
	public UserAdminPermissionSteps() {
		
		userAdminPage = new UserAdminPage();
		userAdminPageActions = new UserAdminPageActions();
		userAdminPageVerifications = new UserAdminPageVerifications();
		
		
	}
	
	@When("user admin sarch for a user who has Permissions profile {string}")
	public void user_admin_sarch_for_a_user_who_has_permissions_profile(String searchText) throws InterruptedException {
		
		userAdminPageActions.enterSearchText(searchText);
		userAdminPageActions.clickUser();
	   
	}

	@Then("user admin navigated to the user Permissions tab")
	public void user_admin_navigated_to_the_user_permissions_tab() throws InterruptedException {
		
		userAdminPageActions.clickPermissions(); 
	   
	}

	@Then("user admin will see mutiple user permissions profiles")
	public void user_admin_will_see_mutiple_user_permissions_profiles() throws InterruptedException {
		
		userAdminPageVerifications.verifyPermissionPage();
		
	}

	@Then("user admin can activates Accountant Profile setup to their user")
	public void user_admin_can_activates_accountant_profile_setup_to_their_user() throws InterruptedException {
		
		
	    
	}

	@Then("user admin click on worksheet service can see a list of default fields")
	public void user_admin_click_on_worksheet_service_can_see_a_list_of_default_fields() throws InterruptedException {
	    
	}

	@Then("user admin can give permissions to enabled to view AccountingGP and ActualDeliveryDate fields to the user")
	public void user_admin_can_give_permissions_to_enabled_to_view_accounting_gp_and_actual_delivery_date_fields_to_the_user() throws InterruptedException {
	    
	}

	@Then("user admin click on back navigation of worksheet service")
	public void user_admin_click_on_back_navigation_of_worksheet_service() throws InterruptedException {
	 
	}

	@When("user admin click on Actions menu to reset permissions")
	public void user_admin_click_on_actions_menu_to_reset_permissions() throws InterruptedException  {
	   
	}

	@Then("user admin should see fields AccountingGP and ActualDeliveryDate are reset back with origional settings")
	public void user_admin_should_see_fields_accounting_gp_and_actual_delivery_date_are_reset_back_with_origional_settings() throws InterruptedException  {
	    
	}

	@Then("User admin able to deactivte the Accountant profile setup for the user")
	public void user_admin_able_to_deactivte_the_accountant_profile_setup_for_the_user() throws InterruptedException {
	   
	}

	@Then("user admin navigate back to the users menu")
	public void user_admin_navigate_back_to_the_users_menu() throws InterruptedException  {
	
	}

	
	

}
