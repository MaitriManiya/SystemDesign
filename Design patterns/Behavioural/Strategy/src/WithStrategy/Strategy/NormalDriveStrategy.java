package WithStrategy.Strategy;

//The Concrete Strategy
public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("normal drive capability");
    }
}
