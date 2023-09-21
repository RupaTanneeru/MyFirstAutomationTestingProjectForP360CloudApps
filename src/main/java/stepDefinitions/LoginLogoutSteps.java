package stepDefinitions;

import GenericActions.GenericBrowserActions;
import PageActions.LoginPageActions;
import PageObjects.LoginPage;
import PageVerifications.LoginPageVerifications;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginLogoutSteps {
	
	LoginPage loginpage;
	LoginPageActions loginPageActions;
	LoginPageVerifications loginPageVerifications;
	GenericBrowserActions genericBrowserActions;
	
	
	
	public LoginLogoutSteps()
	{
		loginpage = new LoginPage();
		loginPageActions = new LoginPageActions();
		loginPageVerifications = new LoginPageVerifications();
		genericBrowserActions = new GenericBrowserActions();
		
	}
	
	@Given("As User I want to Logon into Pentana360 Application")
	public void as_user_i_want_to_logon_into_pentana360_application() throws Throwable {
	   
		genericBrowserActions.launchBrowser();
		Thread.sleep(2000);
	}

	@And("I entered email into {string} field")
	public void i_entered_email_into_field(String email) throws Throwable {
		loginPageActions.enterEmail(email);
	   
	}

	@And("I click on Continue button")
	public void i_click_on_continue_button()   throws Throwable {
		loginPageActions.clickContinueBtn();
	}

	@And("I entered password into {string} field")
	public void i_entered_password_into_field(String password)   throws Throwable {
		loginPageActions.enterpassword(password);
	}

	@When("I click on Sign In button")
	public void i_click_on_sign_in_button()   throws Throwable{
		loginPageActions.signIn();
	}

	@Then("I verify user can successfully login into Application")
	public void i_verify_user_can_successfully_login_into_application()   throws Throwable {
		
		loginPageVerifications.verifySignInSuccessful();
	}

	@And("I click on User icon to search for sign out option")
	public void i_click_on_user_icon_to_search_for_sign_out_option()  throws Throwable {
		loginPageActions.clickUserIcon();
		
	}

	@When("I click on Sign Out option")
	public void i_click_on_sign_out_option()  throws Throwable {
		loginPageActions.signOut();
		
	}

	@Then("I verify user can successfully logout from the applicaiton")
	public void i_verify_user_can_successfully_logout_from_the_applicaiton() {
	   
		loginPageVerifications.verifySignOut();
	}

	

}
