package withBridge.Living;

import withBridge.Breath.BreatheImplementor;

//here we have seprated 2 things
//1. living things
//2. breathing
public abstract class LivingThings {
    BreatheImplementor breatheImplementor;

    public LivingThings(BreatheImplementor breatheImplementor){
        this.breatheImplementor=breatheImplementor;
    }
    abstract  public void breathProcess();
}
