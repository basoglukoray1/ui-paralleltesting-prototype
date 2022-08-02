package com.kwri.auto.platform.ui_parallel_prototype.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumber-report.html",

        },
        features = "src/test/resources/features",
        glue = "com/kwri/auto/platform/ui_parallel_prototype/steps",
        dryRun = false,
        tags = "@Regression"

)

public class TestRunner {
}
