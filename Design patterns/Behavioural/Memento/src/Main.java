public class Main {
    public static void main(String[] args) {
      ConfigurationCareTaker configurationCareTaker= new ConfigurationCareTaker();

      ConfigurationOriginator originator=new ConfigurationOriginator(3,5);

      ConfigurationMemento memento1=originator.createMemento();
      configurationCareTaker.addMemento(memento1);

      originator.setHeight(7);
      originator.setWidth(2);

      ConfigurationMemento memento2=originator.createMemento();
      configurationCareTaker.addMemento(memento2);

      //undo
        ConfigurationMemento restoredMemento=configurationCareTaker.undo();
        originator.restoreMemento(restoredMemento);

        System.out.printf("height: "+originator.height+ " width: "+originator.width);
    }
}