package stepDefinitions;

import GenericActions.GenericBrowserActions;
import PageActions.AppsDashboardPageActions;
import PageActions.LoginPageActions;
import PageObjects.LoginPage;
import PageVerifications.AppsDashboardPageVerifications;
import PageVerifications.LoginPageVerifications;
import PageVerifications.SalesActivityPageVerifications;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectAppSteps {
	
	LoginPage loginPage;
	LoginPageActions loginPageActions;
	LoginPageVerifications loginPageVerifications;
	GenericBrowserActions genericBrowserActions;
	AppsDashboardPageActions appsDashboardPageActions;
	AppsDashboardPageVerifications appsDashboardPageVerifications;
	SalesActivityPageVerifications salesActivityPageVerifications;
	
	public SelectAppSteps() {
		
		loginPage = new LoginPage();
		loginPageActions = new LoginPageActions();
		loginPageVerifications = new LoginPageVerifications();
		genericBrowserActions = new GenericBrowserActions();
		appsDashboardPageActions = new AppsDashboardPageActions();
		appsDashboardPageVerifications = new AppsDashboardPageVerifications();
		salesActivityPageVerifications = new SalesActivityPageVerifications();

	}
	
	@Given("User sings into Pentana360 application with email {string} and password {string}")
	public void user_sings_into_pentana360_application_with_email_and_password(String email, String password) throws Throwable {


			genericBrowserActions.launchBrowser();
			loginPageActions.enterEmail(email);
			loginPageActions.clickContinueBtn();
			loginPageActions.enterpassword(password);
			loginPageActions.signIn();
		}


	
	@And("User Navigated to HomePage and clicks on Menu Icon")
	public void user_navigated_to_home_page_and_clicks_on_menu_icon() throws Throwable {
		
		loginPageVerifications.verifySignInSuccessful();
		appsDashboardPageActions.clickMenu();
		
	}
		
	
	    
	
	@And("Clicks on Apps tab")
	public void clicks_on_apps_tab() throws Throwable {
		appsDashboardPageActions.clikApps();
         
	}
	
	

	@Then("User Redirected to the Applications")
	public void user_redirected_to_the_applications() throws Throwable {
		
		appsDashboardPageVerifications.verifyTextOnAppsPage();
		
	}
	
	

	@When("User Clicks on a SAL Application")
	public void user_clicks_on_a_sal_application() throws Throwable  {
		
		appsDashboardPageActions.clickSAL();
	}
	
	

	@Then("User Redirects to the SAL Applicaiton Page")
	public void user_redirects_to_the_sal_applicaiton_page() throws Throwable  {
		
		salesActivityPageVerifications.verifyTextOnSALPage();
	}
	
	
	

}


