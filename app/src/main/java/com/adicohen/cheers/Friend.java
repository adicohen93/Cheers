package com.adicohen.cheers;


import android.net.Uri;

public class Friend {
    private String name;
    private Uri photoUll;
    private String email;

    public Friend (String name){
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public Uri getPhotoUll() {
        return this.photoUll;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhotoUll(Uri photo) {
        this.photoUll = photo;
    }
}
