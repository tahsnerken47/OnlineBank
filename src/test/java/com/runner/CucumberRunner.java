package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={
                "json:target/cuucmber.json",
         //       "html:target/HTML-report1.html",
         //       "rerun:target/rerun.txt"
        },
        publish = true,
        features = "src/test/resources/features",
        glue = "com/step_def",
        dryRun = false,
        tags = "@test1"
)

public class CucumberRunner {}


