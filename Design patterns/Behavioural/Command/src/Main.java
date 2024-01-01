public class Main {
    public static void main(String[] args) {
    AirConditioner ac= new AirConditioner();
    MyRemoteControl remote=new MyRemoteControl();

    remote.setCommand(new TurnACOnCommand(ac));
    remote.pressButton();

    remote.undo();
    }
}
/*
the same remote can also be used to handle bulb: on/off
 */