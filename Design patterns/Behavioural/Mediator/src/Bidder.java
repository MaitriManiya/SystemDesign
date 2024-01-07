public class Bidder implements Colleague{
    String name;
    AuctionMediator auctionMediator;

    @java.lang.Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this,bidAmount);
    }

    @java.lang.Override
    public void receiveBidNotification(int bidAmount) {
        System.out.printf("Bidder: "+name+" got the notification that someone jas put bid of: "+bidAmount);
    }

    @java.lang.Override
    public java.lang.String getName() {
        return name;
    }
}
