package Observer;

import Observable.StockObservable;

public class MobilelAlertObserver implements NotificationAlertObserver{
    String userName;
    StockObservable observable;

    public  MobilelAlertObserver(String userName, StockObservable observable){
        this.userName=userName;
        this.observable=observable;
    }
    @Override
    public void update() {
        sendEmail(this.userName, "Product is in stock hurry up");
    }

    public void sendEmail(String userName, String msg){
        System.out.println("email sent to: "+userName);
    }
}
