package Observer;

import Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;

    public  EmailAlertObserver(String emailId, StockObservable observable){
        this.emailId=emailId;
        this.observable=observable;
    }
    @Override
    public void update() {
        sendEmail(this.emailId, "Product is in stock hurry up");
    }

    public void sendEmail(String emailId, String msg){
        System.out.println("email sent to: "+emailId);
    }
}
