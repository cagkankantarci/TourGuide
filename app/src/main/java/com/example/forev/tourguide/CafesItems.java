package com.example.forev.tourguide;

public class CafesItems {

    int background;
    String cafeName;
    String test;
    int cafePhoto;

    public CafesItems(int bar, String bars, String s){

    }

    public CafesItems(int background, String cafeName, int cafePhoto, String test) {
        this.background = background;
        this.cafeName = cafeName;
        this.cafePhoto = cafePhoto;
        this.test = test;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public String getCafeName() {
        return cafeName;
    }

    public void setCafeName(String cafeName) {
        this.cafeName = cafeName;
    }

    public int getCafePhoto() {
        return cafePhoto;
    }

    public void setCafePhoto(int cafePhoto) {
        this.cafePhoto = cafePhoto;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
