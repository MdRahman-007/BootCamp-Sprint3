package Config_Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by mdrahman on 7/28/18.
 * Spring 2018
 */

@RunWith(Cucumber.class)
@CucumberOptions(

        // This creates cucumber reports
        plugin = {"pretty", "html:target/site/cucumber-pretty"},

        //This create auto method name in camelCase
        snippets = cucumber.api.SnippetType.CAMELCASE,

        //Path to your feature file
        features = {"src/test/resources/features"},

        // Specify tags to be executed
        tags = {"@mobile-1"},

        //Specify step definition package name (Note: make sure to have this package on current directory)
        glue = {"Stepdefinition"}
)

public class TestRunner {

}

