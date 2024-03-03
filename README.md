## Estructura del Proyecto

El proyecto está organizado en varios paquetes para una mejor estructura y modularidad.

### `entidades` (Dominio)

En este paquete, se encuentran las clases que representan las entidades principales del sistema. Por ejemplo, clases como `Persona`, `Producto`, etc.

### `implementacion`

Aquí se encuentran las implementaciones concretas de las entidades y cualquier lógica de negocio específica.

### `interfaces`

En este paquete, se definen las interfaces que pueden ser implementadas por las clases en `implementacion`. Por ejemplo, interfaces como `OperacionesMatematicas`, etc.

### `main` (Principal)

Este paquete contiene la clase principal (`Principal`) donde se inicia la ejecución del programa.

### `utilidades`

Contiene clases de utilidades, como la lectura por teclado (`Teclado`) u otras funciones comunes.

## Uso de la Clase `Object`

En algunos lugares del código, se puede encontrar el uso de la clase `Object` para proporcionar funcionalidades comunes a todas las clases.
