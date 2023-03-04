# Patrones de diseño


## Patrones de diseño creacionales


### Patrón Factory Method


El patrón Factory Method define una interfaz para crear un objeto, pero deja a las subclases decidir qué clase instanciar. Factory Method permite que una clase delegue la instancia a subclases.

En este ejemplo se crea un objeto `VehicleFactory` y se utiliza para crear objetos `Car` y `Motorcycle` según un parámetro dado ("CAR" o "MOTORCYCLE"). Luego se llama al método `getSound()` en cada objeto para mostrar el sonido del vehículo.