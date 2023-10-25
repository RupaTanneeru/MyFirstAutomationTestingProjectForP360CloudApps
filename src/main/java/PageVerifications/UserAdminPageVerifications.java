package PageVerifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Utils.WebDriverManager.getDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import GenericActions.GenericPageWaits;
import PageActions.UserAdminPageActions;
import PageObjects.UserAdminPage;
import java.util.List;
import java.time.Duration;
import java.util.ArrayList;

public class UserAdminPageVerifications {
	private WebDriver driver;
	UserAdminPage userAdminPage;
	UserAdminPageActions userAdminPageActions;
	GenericPageWaits pageWaits; 
	
	
	
	public UserAdminPageVerifications() {
		
		this.driver = getDriver();
		userAdminPage = new UserAdminPage();
		userAdminPageActions = new 	UserAdminPageActions();
		pageWaits = new GenericPageWaits();
			
	}
	
	public void verifyUserAdminTabTitle() throws InterruptedException {
		
		Thread.sleep(5000);
		String expectedTitle1 = "Users";
		String expectedTitle2 = "UserAdministration";
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		driver.close();
		driver.switchTo().window(tabs.get(1));
		String actualTitle = driver.getTitle();
		boolean isPass = false;
		if(actualTitle.equals(expectedTitle1) || actualTitle.equals(expectedTitle2)) {
			isPass = true;
		} else {
			isPass = false;
		}
		
		Assert.assertEquals(isPass, true);
		
	}
	
	public void verifyCompanyName(String expectedCompanyName) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(userAdminPage.getCompanyTxt));
		String searchBarTxt = userAdminPage.getCompanyTxt.getText();
		Assert.assertEquals(searchBarTxt.toLowerCase(), expectedCompanyName.toLowerCase());
		
	}
	
	public void verifyBranchname(String expectedBranchName) throws InterruptedException 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(userAdminPage.getBranchTxt));
		String searchBarTxt =  userAdminPage.getBranchTxt.getText();
		Assert.assertEquals(searchBarTxt.toLowerCase(), expectedBranchName.toLowerCase());
		
	}
	
	
	public void verifyPermissionPage() throws InterruptedException {
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Permissions']")));
		WebElement permisiontext = driver.findElement(By.xpath("//h2[text()='Permissions']"));
		Assert.assertTrue(permisiontext.isDisplayed());
		
	}
	
	
	public void verifyFinanceGP() throws InterruptedException {
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ps-inputgroup[label='Finance GP']")));
		WebElement FinanceGPButton = driver.findElement(By.cssSelector("ps-inputgroup[label='Finance GP']"));
		WebElement FinanceGPChecked = FinanceGPButton.findElement(By.cssSelector("//ps-input[@name='estimatedTotalFinanceAndInsuranceIncome' and @label='View']"));
		Assert.assertTrue(FinanceGPChecked.isSelected());
	}
	

	public void verifyFinanceIncome() throws InterruptedException {
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ps-inputgroup[label='Finance GP']")));
		WebElement FinanceGPButton = driver.findElement(By.cssSelector("ps-inputgroup[label='Finance GP']"));
		WebElement FinanceGPChecked = FinanceGPButton.findElement(By.cssSelector("//ps-input[@name='estimatedTotalFinanceAndInsuranceIncome' and @label='View']"));
		Assert.assertTrue(FinanceGPChecked.isSelected());
	}
	
    public void verifyFinanceType() throws InterruptedException {
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ps-inputgroup[label='Finance GP']")));
		WebElement FinanceGPButton = driver.findElement(By.cssSelector("ps-inputgroup[label='Finance GP']"));
		WebElement FinanceGPChecked = FinanceGPButton.findElement(By.cssSelector("//ps-input[@name='estimatedTotalFinanceAndInsuranceIncome' and @label='View']"));
		Assert.assertTrue(FinanceGPChecked.isSelected());
	}
	
	
    public void verifyFinancedAmount() throws InterruptedException {
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ps-inputgroup[label='Finance GP']")));
		WebElement FinanceGPButton = driver.findElement(By.cssSelector("ps-inputgroup[label='Finance GP']"));
		WebElement FinanceGPChecked = FinanceGPButton.findElement(By.cssSelector("//ps-input[@name='estimatedTotalFinanceAndInsuranceIncome' and @label='View']"));
		Assert.assertTrue(FinanceGPChecked.isSelected());
	}
    
}
