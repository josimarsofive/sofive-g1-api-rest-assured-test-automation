package com.sofive.stepdefs.register;

import com.sofive.config.ReqresEndpoints;
import com.sofive.stepdefs.CommonStepDefs;
import io.cucumber.java.en.When;

public class CreateClientStepDefs {
    private CommonStepDefs commonSteps;

    public CreateClientStepDefs(CommonStepDefs commonSteps){
        this.commonSteps = commonSteps;
    }

    String issueBody ="{\n" +
            "    \"name\": \"morpheus\",\n" +
            "    \"job\": \"leader\",\n" +
            "    \"email\": \"eve.holt@reqres.in\",\n" +
            "    \"password\": \"serenity\"\n" +
            "}";

    @When("El sistema envía una solicitud para crear cliente de un servicio de reqres")
    public void el_sistema_envía_una_solicitud_para_crear_cliente_de_un_servicio_de_reqres() {

        commonSteps.response = commonSteps.request
                .body(issueBody)
                .when()
                .post(ReqresEndpoints.CREAR_USUARIO_REQRES);
        }
    }


