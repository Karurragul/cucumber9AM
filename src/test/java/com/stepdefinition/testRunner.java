package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\ragul\\cucumber9AM\\src\\test\\resources\\feature\\scenariooutline.feature",glue="com.stepdefinition",plugin= {"html:target"})
public class testRunner {

}
