$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AS_1_RegisterClient.feature");
formatter.feature({
  "name": "REST - Reqres Rest Testing - Register Client",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Registrar Cliente",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ApiRestJson"
    },
    {
      "name": "@ID_001"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "El sistema está listo para enviar una solicitud",
  "keyword": "Given "
});
formatter.match({
  "location": "com.sofive.stepdefs.CommonStepDefs.el_sistema_está_listo_para_enviar_una_solicitud()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El sistema envía una solicitud para crear cliente de un servicio de reqres",
  "keyword": "When "
});
formatter.match({
  "location": "com.sofive.stepdefs.register.CreateClientStepDefs.el_sistema_envía_una_solicitud_para_crear_cliente_de_un_servicio_de_reqres()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El estado de respuesta debe ser 200",
  "keyword": "Then "
});
formatter.match({
  "location": "com.sofive.stepdefs.CommonStepDefs.el_estado_de_respuesta_debe_ser(int)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});