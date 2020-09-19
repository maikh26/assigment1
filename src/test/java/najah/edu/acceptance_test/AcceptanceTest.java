package najah.edu.acceptance_test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "user_cases", plugin = {
		"html:target/cucumber/wikipedia.html" }, monochrome = true, snippets = SnippetType.CAMELCASE, glue = {
				"najah.edu.acceptance_test" }, strict = true)

public class AcceptanceTest {

}