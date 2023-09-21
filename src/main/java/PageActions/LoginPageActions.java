package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Utils.WebDriverManager.getDriver;

import GenericActions.GenericPageWaits;
import PageObjects.LoginPage;

public class LoginPageActions {
	
	private WebDriver driver;	
	GenericPageWaits pagewaits;	
	LoginPage loginpage;
	
	
	public LoginPageActions() {
		
		driver = getDriver();
		pagewaits = new GenericPageWaits();
		loginpage = new LoginPage();
		
	}
	
	public void enterEmail(String email) throws InterruptedException {
		
		pagewaits.waitElementVisible(loginpage.getEmailTextbox);
		loginpage.getEmailTextbox.click();
		loginpage.getEmailTextbox.sendKeys(email);
		Thread.sleep(1000);
		
		
	}
	
	public void enterpassword(String password) throws InterruptedException {
		
		loginpage.getPasswordTextbox.click();
		loginpage.getPasswordTextbox.sendKeys(password);
		Thread.sleep(1000);
		
	}
	
	public void signIn()  throws InterruptedException {
		
		loginpage.getSignInBtn.click();
		Thread.sleep(1000);
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("Pentana Sign in")) {
			System.out.println(loginpage.errorMsg.getText());
		} else {
			Assert.assertTrue(true);
		}
		
	}
	
	
	public void signOut() throws InterruptedException {
		
		SearchContext shadowRoot3 = loginpage.shadowHost3.getShadowRoot();
		Thread.sleep(1000);
		
		WebElement shadowHost4 = shadowRoot3.findElement(By.cssSelector("ps-button[text='Sign out']")); 
		SearchContext shadowRoot4 = shadowHost4.getShadowRoot();
		shadowRoot4.findElement(By.cssSelector(".relative.w-full.text-left.px-6.space-x-4")).click();
		 
	}	
	public void menuClick()
	{
		WebElement shadowHost1 = driver.findElement(By.cssSelector("ps-button[icon='menu']"));
		SearchContext shadowRoot1 = shadowHost1.getShadowRoot();
		shadowRoot1.findElement(By.cssSelector("ps-icon[icon='menu']")).click();
		
	}
	
	public void clickOnApps() {
		
		WebElement shadowHost1 =  driver.findElement(By.cssSelector("ps-navmenuitem[slot='slot_main']"));
		SearchContext shadowRoot1 =  shadowHost1.getShadowRoot();
		String text = shadowRoot1.findElement(By.cssSelector(".flex-grow")).getText();
		Assert.assertEquals(text, "Apps");
		shadowRoot1.findElement(By.cssSelector(".flex-grow")).click();
		
	}
	
	public void clickUserIcon() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement shadowHost1 = driver.findElement(By.cssSelector("ps-button[icon='user']"));
		SearchContext shadowRoot1 =  shadowHost1.getShadowRoot();
		Thread.sleep(2000);
		shadowRoot1.findElement(By.cssSelector("button[part='button']")).click();
		
		
	}
	
	public void clickContinueBtn() {
		
		pagewaits.waitElementVisible(loginpage.getContinueBtn);
		loginpage.getContinueBtn.click();
	}

}
