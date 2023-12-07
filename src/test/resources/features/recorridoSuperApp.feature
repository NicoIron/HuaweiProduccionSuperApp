Feature: Recorrido SuperApp

  @Ingreso_Correo_SuperApp
  Scenario Outline: Recorrido SuperApp Ingreso Con Correo
    Given Ingresa a super app con correo electronico y usuario postpago
      | email   | password   | numero   | nombreUsuario   |
      | <email> | <password> | <numero> | <nombreUsuario> |
    When Realiza recorrido de Administra tus productos
      | adminProductos   |
      | <adminProductos> |
    Examples:
      | email                   | password | numero                | nombreUsuario | adminProductos |
 ##@externalData@./src/test/resources/dataDriven/SuperApp.xlsx@correo@1
   |giobernal44@hotmail.com   |AppYnw20   |3222807009 - Postpago   |Hola, Giovani   |All|



