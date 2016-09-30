package com.adicohen.cheers;

import java.util.ArrayList;
import java.util.List;

public class Hangout {

    private Place place;
    private List<Friend> friendsList;
    private List<Order> ordersList;

    public Hangout(Place place) {
        this.place = place;
        this.friendsList = new ArrayList<Friend>();
        this.ordersList = new ArrayList<Order>();
    }

    public List<Friend> getFriendsList() {
        return this.friendsList;
    }

    public List<Order> getOrdersList() {
        return this.ordersList;
    }

    public void addFriend(Friend friend) {
        friendsList.add(friend);
    }

    public void addOrder(Order order) {
        ordersList.add(order);
    }

}
