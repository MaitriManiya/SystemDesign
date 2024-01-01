package Problem;

public abstract class LivingThings {
    abstract  public void breathProcess();
}
//suppose if i have to add a new breathing process then i cannot add in the existing class. have to create a new class which extends the LivingThings.
//so it is tightly coupled. it cannnnot vary independently