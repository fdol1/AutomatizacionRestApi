package com.lfpu.auto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Causes.feature",
        tags = {"@GetCauses"},
        glue ="com.lfpu.auto.stepsdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerGetCauses {
}
