package withBridge.Living;

import withBridge.Breath.BreatheImplementor;

public class Dog extends LivingThings {
    public  Dog(BreatheImplementor breatheImplementor){
        super(breatheImplementor);
    }
    @Override
    public void breathProcess() {
        breatheImplementor.breathe();
    }
}
