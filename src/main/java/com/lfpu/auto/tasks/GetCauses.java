package com.lfpu.auto.tasks;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static com.lfpu.auto.utils.Headers.AUTHORIZATION;
import static com.lfpu.auto.utils.Headers.AUTHORIZATION_CAUSES_VALUE;

public class GetCauses implements Task {

    private final String capacidad;

    public GetCauses(String capacidad) {
        this.capacidad = capacidad;
    }

    public static GetCauses capabilite(String capacidad) {
        return Tasks.instrumented(GetCauses.class, capacidad);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Get.resource(capacidad)
                        .with(requestSpecification -> requestSpecification.contentType(ContentType.JSON)
                                .header(AUTHORIZATION, AUTHORIZATION_CAUSES_VALUE))
        );
    }
}
