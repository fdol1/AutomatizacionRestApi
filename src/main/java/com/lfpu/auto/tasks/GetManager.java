package com.lfpu.auto.tasks;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static com.lfpu.auto.utils.Headers.*;

public class GetManager implements Task {

    private final String capacidad;

    public GetManager(String capacidad) {
        this.capacidad = capacidad;
    }

    public static GetManager capabilite(String capacidad) {
        return Tasks.instrumented(GetManager.class, capacidad);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Get.resource(capacidad)
                        .with(requestSpecification -> requestSpecification.contentType(ContentType.JSON)
                                .header(AUTHORIZATION, AUTHORIZATION_MANAGER_VALUE))
        );
    }
}
