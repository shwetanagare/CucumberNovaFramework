package com.Nova.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions

(
		features="src/test/resources/Features",
		glue="com.Nova.stepdefinitions",
	    plugin = {"pretty", "html:target/cucumber-reports.html"}
		//dryRun=true
	   // tags="@test"
		
		
		)

public class TestRunner {

}
