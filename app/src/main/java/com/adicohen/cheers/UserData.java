package com.adicohen.cheers;

import java.util.ArrayList;
import java.util.List;


public class UserData {
    private List<Friend> friendsList = new ArrayList<Friend>();
    private List<Place> placesList = new ArrayList<Place>();
    private List<Hangout> hangoutsList = new ArrayList<Hangout>();

    public List<Hangout> getHangoutsList() {
        return this.hangoutsList;
    }

    public List<Friend> getFriendsList() {
        return this.friendsList;
    }

    public List<Place> getPlacesList() {
        return this.placesList;
    }

}



