package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Utils.WebDriverManager.getDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.gson.GsonExtentTypeAdapterBuilder.Builder;

import GenericActions.GenericPageWaits;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import PageObjects.UserAdminPage;

public class UserAdminPageActions {
	
	
	private WebDriver driver;
	UserAdminPage userAdminPage;
	public static String date;
	public static String randomLabel;
	public static String name = "testAutomation";
	GenericPageWaits pageWaits;
	
	
	public UserAdminPageActions() {
		this.driver = getDriver();
		userAdminPage = new UserAdminPage();
		LocalDateTime dateToday = LocalDateTime.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMddyy");
		date = dateToday.format(dateFormat);
		randomLabel = "_"+ date +"_"+ userAdminPage.generateRandomInt(0, 10000, 4);
 }
	
	
	
	public void enterSearchText(String searchText) throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='search']")));
		WebElement searchbar = driver.findElement(By.cssSelector("input[type='search']"));
		searchbar.sendKeys(searchText + Keys.RETURN);
		
		//wait for search loader
		By loader = By.xpath(("//section//p[text()='Loading']"));
		Thread.sleep(1000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
		Thread.sleep(3000);
				
	}
	
	public void clickUser()
	{
		
	}
	
	
	public void clickUserAdminBtn()
	{
		userAdminPage.getUserAdminBtn.click();
	}
	
	public void clickFilterButton() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));		
	    WebElement shadowHost1 = driver.findElement(By.cssSelector("ps-button[text='Filter']"));
	    SearchContext shadowRoot1 = shadowHost1.getShadowRoot();
	    By searchSelector = By.cssSelector("button[part='button']");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(searchSelector));
	    shadowRoot1.findElement(searchSelector).click();
	    Thread.sleep(5000);
	      		
		
	}
	
	public void enterCompanyNameAndBranchName(String companyName, String branchName) throws InterruptedException
	{
	  
//		Thread.sleep(3000);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[type='text']")));
		
		driver.findElement(By.cssSelector("input[type='text']")).click();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys(companyName);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		List<WebElement> branlists = driver.findElements(By.cssSelector("input[type='text']"));
		branlists.get(1).click();
		branlists.get(1).sendKeys(branchName);
		branlists.get(1).sendKeys(Keys.ARROW_DOWN);
		branlists.get(1).sendKeys(Keys.ENTER);
		branlists.get(1).sendKeys(Keys.TAB);
	
			
		
	}
	
	public void clickApplyButton() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement shadowHost1 = driver.findElement(By.cssSelector("ps-button[text='Apply']"));
		SearchContext shadowRoot1 = shadowHost1.getShadowRoot();
        By searchSelector = By.cssSelector("button[part='button']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchSelector));
        shadowRoot1.findElement(searchSelector).click();
        Thread.sleep(5000);
		
        
	} 
	
     
      
     

      public void ClickCompaniesAndBranches() throws InterruptedException {
    	  
    	 WebElement shadowHost1 =  driver.findElement(By.cssSelector("ps-tabs[classes='sticky top-0']"));
    	 SearchContext shadowRoot1 =  shadowHost1.getShadowRoot();
    	 WebElement element = shadowRoot1.findElement(By.cssSelector("section"));
    	 WebElement element1 = element.findElement(By.cssSelector("section > button:nth-child(2)"));
    	 element1.click();
    	 
    	}
      
}
