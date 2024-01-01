package withBridge.Living;

import withBridge.Breath.BreatheImplementor;

public class Fish extends LivingThings {
    public Fish(BreatheImplementor breatheImplementor){
        super(breatheImplementor);
    }
    @Override
    public void breathProcess() {
        breatheImplementor.breathe();
    }
}
