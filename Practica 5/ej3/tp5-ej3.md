## 3.1

- El bad smell es **codigo duplicado**.
- El refactoring que lo corrige es **Extract Superclass**
- Adicionalmente se cambio la visibilidad de las variables (no sé si esto es refactoring o no).

## 3.2

- El bad smell es **feature envy**
- El refactoring que lo corrige es **Move Method**

## 3.3

- El bad smell es **large method** y **comentarios** para el metodo de la clase PostApp y **data class** para la clase Usuario
- El refactoring que lo corrige es **Extract Method** y **Move Method**
- Luego de refactorizarlo me di cuenta que algunos metodos podrían agregarse en otras clases por ejemplo agregar en Post el método para comparar su fecha con el de otro metodo. (_me da paja implementarlo_)

## 3.4

- El bad smell es **feature envy**
- El refactoring que lo corrige es **Move Method**

## 3.5

- El bad smell es **feature envy** por parte del Cliente y **data class** para la clase Direccion
- El refactoring que lo corrige es **Extract Method** y **Move Method**

## 3.6

- El bad smell es **switch statements**
- El refactoring que lo corrige es **Replace Conditional with Polymorphism**
- _consultar_: podría usar un strategy no?
