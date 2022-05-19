- **Responda las preguntas correspondientes al ejercicio de plantillas y _herencia_ (que a continuación se copian):**
  - Si aparece una nueva fuente de energia debo crear 7 clases, 1 del tipo de energia, 2 del tipo de locomocion y 4 de armas. Las clases serian: _NewEnergyRobot_ y de esta se extiende: _NewEnergyOvercraftRobot_ y _NewEnergyCaterpilarRobot_, de las cuales se extienden 4 clases, 2 por cada tipo ed arma: _NewEnergyOvercraftRobotWithLasers_, _NewEnergyOvercraftRobotWithBombs_, _NewEnergyCaterpilarRobotWithLasers_ y _NewEnergyCaterpilarRobotWithBombs_.
  - No puedo cambiarle a un robot existente su sistema de armas sin tener que instanciar un nuevo robot, ya que la implementacion de la herencia es estatica.
  - Almacenaria el nivel de carga de la batería en la clase abstracta Robot y que la misma tenga su determinado _get_. No me sirve tenerla en cada robot ya que estaria instanciando en ambos una V.I. que al fin y al cabo todos los robots tendrán.
  <hr />
- **Responda las preguntas correspondientes al ejercicio de plantillas y _composición_ (que a continuación se copian):**

  - Si aparece una nueva fuente de locomoción sólo debo agregar una unica clase hija de _LocomotionSystem_.
  - Si puedo cambiarle a un robot existente el sistema de armas sin instanciar un robot nuevo ya que la composición es dinámica.
  - Almacenaria el nivel de carga de la batería en la clase abstracta Robot y que la misma tenga su determinado _get_.
  <hr />

- **Explique las ventajas y desventajas de las dos formas de extensión del framework (herencia y composición).**
  - Las _ventajas_ de la **herencia** es que es más siemple en casos con pocas combinaciones y además al usar ganchos puedo acceder a las V.I. y metodos heredados de la clase abstracta. <br>
    Las _desventajas_ de la **herencia** es que se duplica el codigo y se crean muchas clases. <br>
    Las _ventajas_ de la **composición** es que evita la duplicación de codigo y que se incremente el numero de clases si existen muchas combinaciones posibles. Además, puedo cambiar el comportamiento en tiempo de ejecución sin mayor dificultad. <br>
    La _desventaja_ de la **composición** es que no puedo acceder a las V.I. del objeto asi que debo enviarle todo lo que necesite.
