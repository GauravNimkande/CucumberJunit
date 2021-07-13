package TestRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
       // features = {"src/test/java/Apppfeature"}
        		features = "features\\Uber.feature",
        		monochrome=true,
        		dryRun=true,
       glue = {"Steps"},
    		   tags="@Smoke or @Regrassion",
    		   plugin = {"html:target/cucumber-reports/cucumber-pretty"},
    		   publish = true
		)
public class UberTest {

}
