package com.lfpu.auto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Manager.feature",
        tags = {"@GetManager"},
        glue ="com.lineadirecta.certificacion.stepsdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerGetManager {
}
