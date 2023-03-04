public class Main {
    public static void main(String[] args) {
        /* -------- Factory Method -------- */
        // Create a VehicleFactory object
        VehicleFactory vehicleFactory = new VehicleFactory();

        // Create a Car object
        Vehicle car = vehicleFactory.getVehicle("CAR");

        // Create a Motorcycle object
        Vehicle motorcycle = vehicleFactory.getVehicle("MOTORCYCLE");

        System.out.println("FACTORY METHOD");
        System.out.println(car.getSound());
        System.out.println(motorcycle.getSound());

        /* -------- Builder -------- */
        // Create an OrderBuilder object
        Order orderBuilder = new OrderBuilder("John Doe")
                                    .setShippingAddress("123 Main St.")
                                    .setItems(2)
                                    .build();

        System.out.println("\nBUILDER");
        // Print the OrderBuilder object
        System.out.println(orderBuilder.getCustomerName());
        System.out.println(orderBuilder.getShippingAddress());
        System.out.println(orderBuilder.getItems());

    }
}