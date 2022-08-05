Feature: Automatizacion del los micro servicios Causes

  @GetCauses
  Scenario: Realizar peticion get esperando respusta OK
    Given Que juan realiza realiza un llamado al api
    When Que realiza peticion get al micro servicio: /backcausestopper/getCauses
    Then Verifica el estado de la peticion 200