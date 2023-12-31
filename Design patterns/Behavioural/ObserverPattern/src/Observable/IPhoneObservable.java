package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservable implements StockObservable{

    public List<NotificationAlertObserver> observerList=new ArrayList<>();
    public int stockCount=0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer:observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockToAdd) {
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount=stockCount+newStockToAdd;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
