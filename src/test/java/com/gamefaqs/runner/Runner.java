package com.gamefaqs.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"features/game.feature"},
        glue={"com.gamefaqs.stepdef"},
        tags={"@Clao"}
)
public class Runner {}
