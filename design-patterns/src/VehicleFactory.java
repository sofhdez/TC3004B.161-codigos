public class VehicleFactory {
    /*
    * Class of VehicleFactory that creates a vehicle
    * @param type type of vehicle
    * @return vehicle
    */

public Vehicle getVehicle(String type) {
        // If type is null, return null
        if (type == null) {
            return null;
        }

        // equalsIgnoreCase() is used to compare two strings, ignoring case considerations.
        if (type.equalsIgnoreCase("CAR")) {
            // If type is "CAR", return a new Car object
            return new Car();
        } else if (type.equalsIgnoreCase("MOTORCYCLE")) {
            // If type is "MOTORCYCLE", return a new Motorcycle object
            return new Motorcycle();
        }
        return null;
    }
}
