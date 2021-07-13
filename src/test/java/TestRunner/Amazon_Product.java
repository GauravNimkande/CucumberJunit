package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
       // features = {"src/test/java/Apppfeature"}
        		features = "features\\search.feature",
        		monochrome=true,
        		dryRun=false,
       glue = {"Steps","MyHooks"},
       tags="@Smoke or @Regration",
    		  // plugin = {"html:target/cucumber-reports/cucumber-pretty"}, 
    		   plugin = {"pretty","json:target/MyReport/Report.json"},
    		   publish = true
    		   
		)
public class Amazon_Product {
	
	

}
