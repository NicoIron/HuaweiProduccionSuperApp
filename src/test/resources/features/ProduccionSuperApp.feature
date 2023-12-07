#language: es

Característica: : Recorrido SuperApp Mi Claro Produccion


##Maria
  @Produccion_Pagos_y_cosutlas
  Esquema del escenario: : Recorrido SuperApp Ingreso Con usuario
    Dado Ingresa a super app con correo electronico y usuario postpago
      | celular   | contrasena   |
      | <celular> | <contrasena> |
    Cuando Realizar flujo de pagos y consultas
      | miniprograma   |
      | <miniprograma> |
    Entonces Valida que funcionen los botones
    Ejemplos:
  | celular    | contrasena | miniprograma |
		##@externalData@./src/test/resources/dataDriven/SuperAppPROD.xlsx@PagosYConsultas@1
  |3195971315   |Kevin1023  | All |

##Daniel
  @Produccion_Entretenimiento
  Esquema del escenario: Recorrido SuperApp Ingreso Con usuario
    Dado Ingresa a super app con correo electronico y usuario postpago
      | celular   | contrasena   |
      | <celular> | <contrasena> |
    Cuando Realizar flujo de entretenimiento
      | miniprograma   |
      | <miniprograma> |
    Entonces Valida que funcionen los botones
    Ejemplos:
      | celular    | contrasena | miniprograma |
		##@externalData@./src/test/resources/dataDriven/SuperApp.xlsx@Entretenimiento@2
      | 3195971315 | Kevin1023  | ALL          |


  ##Sebastian
  @Produccion_Mundo_Claro
  Esquema del escenario: Recorrido SuperApp Ingreso Con usuario
    Dado Ingresa a super app con correo electronico y usuario postpago
      | celular   | contrasena   |
      | <celular> | <contrasena> |
    Cuando Realizar navegacion a Mundo Claro
      | zona   | miniprograma   |
      | <zona> | <miniprograma> |
    Entonces Valida que funcionen los botones
    Ejemplos:
      | celular    | contrasena | zona        | miniprograma |
		##@externalData@./src/test/resources/dataDriven/SuperAppPROD.xlsx@Mundo Claro@1
      | 3195971315 | Kevin1023  | Mundo Claro | All          |


  ##Andres
  @Produccion_Soluciones_Empresariales
  Esquema del escenario: Recorrido por MP de Soluciones Empresariales
    Dado Ingresa a super app con correo electronico y usuario postpago
      | celular   | contrasena   |
      | <celular> | <contrasena> |
    Cuando recorre la seccion de soluciones empresariales
      | miniprograma   |
      | <miniprograma> |
    Entonces Valida que funcionen los botones
    Ejemplos:
      | celular    | contrasena | miniprograma |
		##@externalData@./src/test/resources/dataDriven/SuperAppPROD.xlsx@Entretenimiento@2
      | 3195971315 | Kevin1023  | ALL          |
