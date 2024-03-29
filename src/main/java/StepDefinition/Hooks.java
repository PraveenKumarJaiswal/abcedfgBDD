package StepDefinition;

import Resource.BaseClass;
import Resource.UtilityClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void beforeScenario(Scenario s) throws Throwable {
		initializeDriver();
		
	}

	@After
	public void afterScenario(Scenario s) throws Throwable {
		UtilityClass.captureScreenshot();
		driver.close();
		driver.quit();
	}

}
