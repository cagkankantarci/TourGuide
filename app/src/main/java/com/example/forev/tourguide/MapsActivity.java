package com.example.forev.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        Intent intent = getIntent();
        String placeName = intent.getStringExtra("placeName");
        String Latitude = intent.getStringExtra("latitude");
        String Longitude = intent.getStringExtra("longitude");

        Double LatitudeDouble = Double.valueOf(Latitude);
        Double LongitudeDouble = Double.valueOf(Longitude);

        LatLng place = new LatLng(LatitudeDouble, LongitudeDouble);
        mMap.addMarker(new MarkerOptions().position(place).title(placeName));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(place,15));
    }
}
