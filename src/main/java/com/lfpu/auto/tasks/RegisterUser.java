package com.lfpu.auto.tasks;

import com.lfpu.auto.model.RegisterUserInfo;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class RegisterUser implements Task {

    private final RegisterUserInfo userInfo;

    public RegisterUser(RegisterUserInfo userInfo) {
        this.userInfo = userInfo;
    }

    /*public static RegisterUser capabilite(RegisterUserInfo userInfo) {
        return Tasks.instrumented(RegisterUser.class, userInfo);
    }*/

    //punto de entrada --> va a la linea 42 y setea la primera propiedad
    public static RegisterUserBuilder conEmail(String email) {
        return new RegisterUserBuilder(email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Post.to("/api/register")
                        .with(requestSpecification -> requestSpecification.contentType(ContentType.JSON)
                                .body(userInfo))
        );
    }

    public static class RegisterUserBuilder{

        private final String email;
        private String password;

        public RegisterUserBuilder(String email){
            this.email = email;
        }

        //Cuando se llama a andPassword se devuelve un objeto de tipo Task por lo tanto el attemptsTo lo va a poder entender
        public RegisterUser andPassword(String password){
            this.password = password;

            return new RegisterUser(RegisterUserInfo.builder()
                    .email(this.email)
                    .password(this.password)
                    .build());
        }
    }
}