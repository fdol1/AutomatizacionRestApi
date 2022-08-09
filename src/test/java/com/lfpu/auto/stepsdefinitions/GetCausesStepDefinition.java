package com.lfpu.auto.stepsdefinitions;

import com.lfpu.auto.questions.ResponseCode;
import com.lfpu.auto.tasks.RegisterUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetCausesStepDefinition {

    private EnvironmentVariables environmentVariables;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Que juan realiza realiza un llamado al api$")
    public void queJuanRealizaUnLlamadoAlApi() {
        String endpoint;
        endpoint = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("endpoint.pruebas");
        theActorCalled("juan").whoCan(CallAnApi.at(endpoint)).remember("variables", environmentVariables);
    }

    @When("^Que realiza peticion get al micro servicio: (.*)$")
    public void queRealizaPeticionGetAlMicroServicioBackcausestopperGetCauses(String capacidad) {
        //theActorInTheSpotlight().attemptsTo(GetCauses.capabilite(capacidad));

        theActorInTheSpotlight().attemptsTo(
                RegisterUser
                        .conEmail("hola")
                        .andPassword("hola2")
        );
    }

    @Then("^Verifica el estado de la peticion (.*)$")
    public void verificaElEstadoDeLaPeticionOK(String codigoEstado) {
        theActorInTheSpotlight().should(seeThat("el codigo es", ResponseCode.was(),equalTo(codigoEstado)));
    }
}