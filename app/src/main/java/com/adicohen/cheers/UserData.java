package com.adicohen.cheers;

import java.util.ArrayList;
import java.util.List;


public class UserData {
    private static List<Friend> friendsList;
    private static List<Place> placesList;
    private static List<Hangout> hangoutsList;

    public UserData() {
        friendsList = new ArrayList<Friend>();
        placesList = new ArrayList<Place>();
        hangoutsList = new ArrayList<Hangout>();
        placesList.add(new Place("Gambrinos"));
        placesList.add(new Place("Cafe Cafe"));
        placesList.add(new Place("Shabtay's Pizza"));
        placesList.add(new Place("Pazzel Cafe"));
        placesList.add(new Place("Routina Bar"));
    }
    public List<Hangout> getHangoutsList() {
        return hangoutsList;
    }

    public List<Friend> getFriendsList() {
        return friendsList;
    }

    public List<String> getPlacesStringList() {
        List<String> placeStringList = new ArrayList<>();
        for (int i=1; i<placesList.size(); i++) {
            placeStringList.add(placesList.get(i).getName());
        }
        return placeStringList;
    }

}



