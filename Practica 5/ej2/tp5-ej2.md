## 2.1)

Para mejorarlo puedo cambiar la visibilidad de los metodos, también cambiaria los nombres de los mismos para que sean más intuitivos.

## 2.2)

En una primera instancia la persona tenía el poder de evaluar si estaba o no en un proyecto, esto no tiene sentido ya que obtiene el get del proyecto y recién ahi evalua si está o no, están mal las responsabilidad.
El cambio que se realizó fue que Proyecto en si evalue si una persona (ingresada como parametro) participa (o no) del proyecto, es decir, cambio la responsabilidad.

Considero que es un cambio adecuado ya que no deberia ser responsabilidad de la persona buscar a las personas que participan en un proyecto, no tiene sentido.

## 2.3)

`public void imprimirValores() { int totalEdades = 0; double promedioEdades = 0; double totalSalarios = 0; for (Empleado empleado : personal) { totalEdades = totalEdades + empleado.getEdad(); totalSalarios = totalSalarios + empleado.getSalario(); } promedioEdades = totalEdades / personal.size(); String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios); System.out.println(message); } `

- Como el codigo es muy largo separaria en distintos metodos acorde a cada accion que se hace. Querian tres metodos en vez de 1 solo:
  - uno para promediar edades
  - otro para sacar el total de salarios
  - y finalmente para imprimir
