Feature: REST - Reqres Rest Testing - Register Client

  @ApiRestJson @ID_001
  Scenario: Registrar Cliente
    Given El sistema está listo para enviar una solicitud
    When El sistema envía una solicitud para crear cliente de un servicio de reqres
    Then El estado de respuesta debe ser 200