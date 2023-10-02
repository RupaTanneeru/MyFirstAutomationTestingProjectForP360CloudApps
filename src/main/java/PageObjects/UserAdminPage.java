package PageObjects;

import static Utils.WebDriverManager.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAdminPage {
	
	private WebDriver driver;
	
	public UserAdminPage() {
		
		this.driver = getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[text()='User Administration']/parent::a")
	public WebElement getUserAdminBtn;
	
	@FindBy(xpath = "//label[text()='Branch']/following-sibling::input")
	public WebElement branchTxt;
	
	@FindBy(xpath = "//button[@id='74d6947c-d6b1-40e2-8697-0583d141a6c4']")
	public WebElement userBtn;
	
	@FindBy(xpath = "//div/ol/li[5]/p")    
	public WebElement getCompanyTxt;
	
	@FindBy(xpath = "//div/ol/li[5]/ol/li[1]/p")     //*[@id="aec41f51d_abb3577f4_tab"]/app-org-structure/div/ol/li[5]/ol/li[1]/p
	public WebElement getBranchTxt;
	
	
	
	public String generateRandomInt(int min, int max, int length)
	{
		int number = (int)(Math.random()*(max-min+1)+min);
		String random = String.format("%0" + length + "d", number);
		return random;
		
	}
	
		    
	}

