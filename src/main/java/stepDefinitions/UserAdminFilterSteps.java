package stepDefinitions;

import PageActions.UserAdminPageActions;
import PageObjects.UserAdminPage;
import PageVerifications.UserAdminPageVerifications;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserAdminFilterSteps {
	
	UserAdminPage userAdminPage;
	UserAdminPageActions userAdminPageActions;
	UserAdminPageVerifications userAdminPageVerifications;
	
	public UserAdminFilterSteps() {
		
		userAdminPage = new UserAdminPage();
		userAdminPageActions = new UserAdminPageActions();
		userAdminPageVerifications = new UserAdminPageVerifications();
	}
	
	@When("User click on UserAdmin App")
	public void user_click_on_user_admin_app() throws InterruptedException {
		
		userAdminPageActions.clickUserAdminBtn();
		
	}

	@Then("Page is redirected to UserAdmin App")
	public void page_is_redirected_to_user_admin_app() throws InterruptedException {
		
		Thread.sleep(2000);
		userAdminPageVerifications.verifyUserAdminTabTitle();
	}

	@Then("User selects Filter button")
	public void user_selects_filter_button() throws InterruptedException {
		
	   userAdminPageActions.clickFilterButton();
	}

	@Then("User enters Company Name {string} and Branch Name {string}")
	public void user_enters_company_name_and_branch_name(String companyName, String branchName) throws  InterruptedException {
		
		userAdminPageActions.enterCompanyNameAndBranchName(companyName, branchName);
		userAdminPageActions.clickApplyButton();
		Thread.sleep(2000);
		userAdminPage.userBtn.click();
		userAdminPageActions.ClickCompaniesAndBranches();
		Thread.sleep(2000);
		
	 
	}

	@Then("User Verifies the company name {string} and branch name {string}")
	public void user_verifies_the_company_name_and_branch_name(String companyName, String branchName)  throws InterruptedException {
		
		
		userAdminPageVerifications.verifyCompanyName(companyName);
		Thread.sleep(2000);
		userAdminPageVerifications.verifyBranchname(branchName);
		
		
	}

	
	
	

}
