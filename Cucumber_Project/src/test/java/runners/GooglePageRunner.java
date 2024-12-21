package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "//src//test//resources//features/GoogoleSearchTest.feature"
)

public class GooglePageRunner extends AbstractTestNGCucumberTests{

}
