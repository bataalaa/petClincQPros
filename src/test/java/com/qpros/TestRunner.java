package com.qpros;

import io.cucumber.testng.*;



@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features = {"src/test/resources/features"},
        glue = {"com.qpros.StepsDefinitions"}

)

// this is the interface to get Cucumber to work with TestNG
public class TestRunner extends AbstractTestNGCucumberTests {


}

