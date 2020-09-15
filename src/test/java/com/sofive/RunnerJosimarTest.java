package com.sofive;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "pretty",
        "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/json-reports/Cucumber.json",
        "junit:target/cucumber-reports/json-reports/Cucumber.xml"},
        tags = {"@ApiRestJson","@ID_001"},
        glue = {"com.sofive"},
        features = {"src/test/resources/features"},
        monochrome = true, snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunnerJosimarTest {
}
