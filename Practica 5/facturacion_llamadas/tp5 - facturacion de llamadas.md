## TP5 pt. 2

- Malos olores:

  - Persoona actua como una **data class**
  - GuiaTelefonica actua como **data class**
  - Persoonal hace **feature envy** de GuiaTelefonica y de Persoona
  - Persoonal tiene **sentencias switch** con respecto al tipo de Persoona
  - Persoonal tiene **sentencias switch** con respecto al tipo de Llamada
  - Persoonal tiene **metodos largos**
  - Todas las clases tienen nombres de variables que no son autoexplicativos

- Refactoring:

  - **Move method** (para la data class y feature envy de GuiaTelefonica y Persoonal)
  - **Replace Conditional with Polymorphism** para el switch de Persoonal con Persoona
  - **Replace Conditional with Polymorphism** para el switch de Persoonal con Llamada
  - **Extract Method** para los metodolos largos
  - **Rename Method** para cambiar el nombre de las variables (_creo que está mal porque este refactoring solo cambia los nombres de los metodos, no de las variables_)

- Errores:
  - Me tira "error" el test porque me imprime con más de 2 decimales asi que le saque los decimales porque en general el numero estaba bien, el resto funciona bien.
