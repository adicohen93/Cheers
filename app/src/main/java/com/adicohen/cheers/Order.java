package com.adicohen.cheers;

import android.net.Uri;

public class Order {
    private Friend friend;
    private String product;
    private Uri photoUrl;

    public Order(Friend friend, String product, Uri photoUrl){
        this.friend = friend;
        this.product = product;
        this.photoUrl = photoUrl;
    }

    public Friend getFriend() {
        return this.friend;
    }

    public String getProduct() {
        return this.product;
    }

    public Uri getPhotoUrl() {
        return this.photoUrl;
    }
}

