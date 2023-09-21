package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.sql.Timestamp;

import static Utils.WebDriverManager.getDriver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static Utils.WebDriverManager.closeDriver;

public class HookSteps {
	
	@Before
	public void beforeScenario() {
		getDriver();
	}
	
	@After
	public void afterScenario() {
		closeDriver();
	}

	@AfterStep
	public void caprtureExceptionImage(Scenario scenario) {
		if(scenario.isFailed()) {
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			String timeMills = Long.toString(timestamp.getTime());
			
			byte[] screenshotFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotFile,  "image/png", timeMills);
			
		}
	}
	
}
