package com.example.forev.tourguide;

public class Place {

    private String Title;
    private String Description;
    private int Thumbnail;
    private String Latitude;
    private String Longitude;

    public Place(){

    }

    public Place(String title, String description, int thumbnail, String latitude, String longitude)
    {
        Title = title;
        Description = description;
        Thumbnail = thumbnail;
        Latitude = latitude;
        Longitude = longitude;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public String getLatitude() {
        return Latitude;
    }

    public String getLongitude() {
        return Longitude;
    }
}
