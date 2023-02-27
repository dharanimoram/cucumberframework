package Stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\muram.rani\\eclipse-workspace\\Cucumberframework11\\src\\test\\resources\\Features",

glue = {"Stepdefinations"},
monochrome = true,
plugin = {"pretty","junit:target/JUnitReports/report.xml",
		"html:target/HtmlReports/HtmlReports.html",
		"json:target/JsonReports/report.json"})
public class Testrunner {

}
