package com.lfpu.auto;

import com.lfpu.auto.model.DataGetCausesModel;
import com.lfpu.auto.questions.ResponseCode;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import org.junit.Test;
import org.junit.runner.RunWith;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SerenityRunner.class)
public class Tests {

    private static final String restUrl = "https://cdnqa.lineadirecta.com.co:31295";

    @Test
    public void getCauses() {

        Actor actor = Actor.named("user")
                .whoCan(CallAnApi.at(restUrl));

        actor.attemptsTo(
                Get.resource("/backcausestopper/getCauses")
        );

        actor.should(
                seeThat("El codigo es:", ResponseCode.was(), equalTo(200))
        );
    }

    @Test
    public void prueba2() {

        DataGetCausesModel d = DataGetCausesModel.builder()
                .capacidad("")
                .edad("").build();



    /*    DataGetCausesModel dataGetCausesModel2 = DataGetCausesModel.builder()
                .estadoRespuesta("10")
                .build();

        DataGetCausesModel dataGetCausesModel3 = DataGetCausesModel.builder()
                .estadoRespuesta("10")
                .build();

     */

       // System.out.println(dataGetCausesModel1.toString());
       // System.out.println(dataGetCausesModel2);
      //  System.out.println(dataGetCausesModel3);
    }
}