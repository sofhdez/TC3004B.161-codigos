public class Main {
    public static void main(String[] args) {
        // Create a VehicleFactory object
        VehicleFactory vehicleFactory = new VehicleFactory();

        // Create a Car object
        Vehicle car = vehicleFactory.getVehicle("CAR");
        System.out.println(car.getSound());

        // Create a Motorcycle object
        Vehicle motorcycle = vehicleFactory.getVehicle("MOTORCYCLE");
        System.out.println(motorcycle.getSound());
    }
}