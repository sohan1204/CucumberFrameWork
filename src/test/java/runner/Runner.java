package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:/Java/workspaceintellij/class23_Cucumber"},
        glue = {"stepDefinition"},
        monochrome = true,
        dryRun = true,
        plugin = {"pretty","html:test-output","json:target/cucumber-report/cucumber.json"}

)
public class Runner {


}
