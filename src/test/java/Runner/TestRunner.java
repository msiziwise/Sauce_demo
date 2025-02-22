package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDefinitions"},
        tags = "",
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} ,
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests
{
}
