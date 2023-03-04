# Patrones de diseño


## Patrones de diseño creacionales


### Patrón Factory Method

El patrón Factory Method define una interfaz para crear un objeto, pero deja a las subclases decidir qué clase instanciar. Factory Method permite que una clase delegue la instancia a subclases.

En este ejemplo se crea un objeto `VehicleFactory` y se utiliza para crear objetos `Car` y `Motorcycle` según un parámetro dado ("CAR" o "MOTORCYCLE"). Luego se llama al método `getSound()` en cada objeto para mostrar el sonido del vehículo.

El código muestra cómo el patrón Factory Method permite crear objetos de diferentes tipos sin tener que conocer los detalles específicos de su creación y cómo los objetos creados pueden ser utilizados en el mismo contexto de manera consistente.

### Patrón Builder

El patrón Builder permite crear objetos complejos paso a paso. El cliente especifica el tipo y contenido del objeto final llamando a métodos en el Builder.

En este ejemplo se crea un objeto `OrderBuilder` que toma un argumento obligatorio en el constructor: el nombre del cliente "John Doe". Luego, se establecen propiedades opcionales del objeto `Order` utilizando los métodos `setShippingAddress` y `setItems` de la clase `OrderBuilder`. Finalmente, se llama al método `build` para crear un objeto `Order` con los valores actuales del `OrderBuilder`.

El código muestra cómo utilizar el patrón Builder para crear objetos Order de manera eficiente y fácil de entender.