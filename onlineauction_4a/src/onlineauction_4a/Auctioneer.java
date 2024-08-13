package onlineauction_4a;

import java.util.ArrayList;
import java.util.List;

class Auctioneer implements Subject {
    private List<Observer> bidders = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        bidders.add(observer);
        System.out.println(observer + " has subscribed to auction notifications.");
    }

    @Override
    public void unsubscribe(Observer observer) {
        bidders.remove(observer);
        System.out.println(observer + " has unsubscribed from auction notifications.");
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : bidders) {
            ((Observer) observer).update(message);
        }
    }

    // Auction events
    public void itemAvailable(String itemName) {
        notifyObservers("Item available: " + itemName);
    }

    public void biddingStart(String itemName) {
        notifyObservers("Bidding started for: " + itemName);
    }

    public void biddingEnd(String itemName) {
        notifyObservers("Bidding ended for: " + itemName);
    }
}