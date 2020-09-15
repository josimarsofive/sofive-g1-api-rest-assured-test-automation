package com.sofive.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class CommonStepDefs {
    public RequestSpecification request;
    public Response response;

    @Given("El sistema está listo para enviar una solicitud")
    public void el_sistema_está_listo_para_enviar_una_solicitud() {
        request = given();
    }

    @Then("El estado de respuesta debe ser {int}")
    public void el_estado_de_respuesta_debe_ser(int statusCode) {
        response.then()
                .log()
                .all()
                .statusCode(statusCode);
    }
}
