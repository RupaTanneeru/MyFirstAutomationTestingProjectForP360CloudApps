package PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObjects.AppsDashboardPage;

import static Utils.WebDriverManager.getDriver;

public class AppsDashboardPageActions {
	
	private WebDriver driver;
	AppsDashboardPage appsDashboardPage;
	
	public AppsDashboardPageActions() {
		this.driver = getDriver();
		appsDashboardPage = new AppsDashboardPage();
		
	}
	
	public void tickDarkModeCheckbox() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".flex-grow order-first mr-3")).click();
		
	}
	
	public void clickMenu() throws InterruptedException
	{
		appsDashboardPage.menuBtn.click();
		Thread.sleep(3000);
	}
	
	public void clikApps() throws InterruptedException
	{
		appsDashboardPage.appBtn.click();
		Thread.sleep(3000);
		
	}
	
	public void clickSAL() throws InterruptedException
	{
		appsDashboardPage.salBtn.click();
		Thread.sleep(3000);
		
	}
	
	public void clickEdge() throws InterruptedException
	{
		appsDashboardPage.edgeBtn.click();
		Thread.sleep(3000);
		
	}
	
	
	
}
