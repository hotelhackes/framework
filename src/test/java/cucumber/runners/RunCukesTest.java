package cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue= "cucumber/runners/steps",
        plugin ={"pretty", "html:target/cucumber","junit:target/cucumber/report.xml"})
public class RunCukesTest {
}
