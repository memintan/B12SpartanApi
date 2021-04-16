package com.b12.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com/b12/stepDefinitions",
        dryRun = false,
        //tags = ""
        plugin = {
                "json:target/cucumber.json",
                "rerun:rerun.txt"
        }

)
public class BatchRunner {
}
