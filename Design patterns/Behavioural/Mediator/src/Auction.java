public class Auction implements  AuctionMediator{
    List<Colleague> colleagues=new ArrayList<>();
    @java.lang.Override
    public void addBidder(Colleague bidder) {
        colleagues.add(bidder);
    }

    @java.lang.Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for(Colleague colleague: colleagues){
            if(!colleague.getName().equals(bidder.getName())){
                colleague.receiveBidNotification(bidAmount);
            }
        }
    }
}
