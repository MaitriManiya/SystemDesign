import Observable.IPhoneObservable;
import Observer.EmailAlertObserver;
import Observer.MobilelAlertObserver;

public class Store {
    public static void main(String[] args) {
        IPhoneObservable iPhoneObservable= new IPhoneObservable();

        EmailAlertObserver observer1=new EmailAlertObserver("test1@gmail.com", iPhoneObservable);
        EmailAlertObserver observer2=new EmailAlertObserver("test2@gmail.com", iPhoneObservable);
        MobilelAlertObserver observer3=new MobilelAlertObserver("maitri", iPhoneObservable);

        iPhoneObservable.add(observer1);
        iPhoneObservable.add(observer2);
        iPhoneObservable.add(observer3);

        iPhoneObservable.setStockCount(10);
        iPhoneObservable.setStockCount(-10);
        iPhoneObservable.setStockCount(100);
    }
}