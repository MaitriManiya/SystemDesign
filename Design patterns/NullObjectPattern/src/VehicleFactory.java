public class VehicleFactory {
    static Vehicle getVehicleDetails(String type)
    {
        if("Car".equals(type)){
            return new Car();
        }
        return new NullVehicle();
    }
}
