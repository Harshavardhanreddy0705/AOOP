package onlineauction_4a;
public class AuctionSystem {
    public static void main(String[] args) {
        Auctioneer auctioneer = new Auctioneer();

        Bidder bidder1 = new Bidder("Bidder 1");
        Bidder bidder2 = new Bidder("Bidder 2");
        Bidder bidder3 = new Bidder("Bidder 3");

        auctioneer.subscribe(bidder1);
        auctioneer.subscribe(bidder2);
        
        auctioneer.itemAvailable("Antique Vase");
        auctioneer.biddingStart("Antique Vase");

        auctioneer.unsubscribe(bidder2);

        auctioneer.biddingEnd("Antique Vase");
        
        auctioneer.subscribe(bidder3);
        
        auctioneer.itemAvailable("Vintage Car");
        auctioneer.biddingStart("Vintage Car");
        auctioneer.biddingEnd("Vintage Car");
    }
}
