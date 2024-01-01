import withBridge.Breath.WaterBreatheImplementation;
import withBridge.Living.Fish;
import withBridge.Living.LivingThings;

public class Main {
    public static void main(String[] args) {
        LivingThings fishObj= new Fish(new WaterBreatheImplementation());
        fishObj.breathProcess();
    }
}