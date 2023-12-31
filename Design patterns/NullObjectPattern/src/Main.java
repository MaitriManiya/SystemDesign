public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Vehicle vehicle=VehicleFactory.getVehicleDetails("Car");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle){
        System.out.println("Fuel Tank capacity: "+vehicle.getTankCapacity());
        System.out.println("Seating capacity: "+vehicle.getSeatingCapacity());
    }
}