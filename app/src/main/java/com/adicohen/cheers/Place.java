package com.adicohen.cheers;

public class Place {
    private String name;
    private String address;

    public Place(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
