package com.everve.kata.shoppingkart;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        format = "pretty",
        features = "src/test/resources/")
public class RunCukes {
}
