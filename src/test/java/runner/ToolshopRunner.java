package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@EndToEnd",
        features = "src/test/resources/Features/Toolshop.feature",
        glue = "stepDefs",
        plugin = {"rerun:data/rerunFails.txt","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true)
public class ToolshopRunner {
}
