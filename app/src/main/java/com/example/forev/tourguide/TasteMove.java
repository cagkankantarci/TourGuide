package com.example.forev.tourguide;

import android.os.Parcel;
import android.os.Parcelable;

public class TasteMove implements Parcelable {

    private String tasteName;
    private int tastePicture;
    private String tasteDescription;
    private String tasteKm;

    public TasteMove(String tasteName, int tastePicture, String tasteDescription, String tasteKm) {
        this.tasteName = tasteName;
        this.tastePicture = tastePicture;
        this.tasteDescription = tasteDescription;
        this.tasteKm = tasteKm;
    }

    public String getTasteName() {
        return tasteName;
    }

    public int getTastePicture() {
        return tastePicture;
    }

    public String getTasteDescription() {
        return tasteDescription;
    }

    public String getTasteKm() {
        return tasteKm;
    }

    protected TasteMove(Parcel in) {
        tasteName = in.readString();
        tastePicture = in.readInt();
        tasteDescription = in.readString();
        tasteKm = in.readString();
    }

    public static final Creator<TasteMove> CREATOR = new Creator<TasteMove>() {
        @Override
        public TasteMove createFromParcel(Parcel in) {
            return new TasteMove(in);
        }

        @Override
        public TasteMove[] newArray(int size) {
            return new TasteMove[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(tasteName);
        parcel.writeInt(tastePicture);
        parcel.writeString(tasteDescription);
        parcel.writeString(tasteKm);
    }
}
