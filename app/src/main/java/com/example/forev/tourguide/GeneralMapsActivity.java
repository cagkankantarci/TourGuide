package com.example.forev.tourguide;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GeneralMapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng senyuvaBridge = new LatLng(40.997542, 40.9752371);
        LatLng zilKale = new LatLng(40.9592226, 40.9631012);
        LatLng palovitFalls = new LatLng(40.941498, 40.9934164);
        LatLng pokutPlateau = new LatLng(40.964196, 41.021361);
        LatLng ayderPlateau = new LatLng(40.9521568, 41.1018166);
        LatLng anzerPlateau = new LatLng(40.5916179, 40.5169581);
        LatLng ovitPlateau = new LatLng(40.6483706, 40.7557912);
        LatLng samistalPlateau = new LatLng(40.909132, 41.0987571);
        LatLng elevitPlateau = new LatLng(40.8551296, 41.0103891);
        LatLng amlakitPlateau = new LatLng(40.898829, 41.0728691);
        LatLng kavronPlateau = new LatLng(40.908291, 41.1292884);
        LatLng gitoPlateau = new LatLng(41.048553,41.0033879);

        mMap.addMarker(new MarkerOptions().position(senyuvaBridge).title("Senyuva Bridge"));
        mMap.addMarker(new MarkerOptions().position(zilKale).title("ZilKale"));
        mMap.addMarker(new MarkerOptions().position(palovitFalls).title("Palovit Falls"));
        mMap.addMarker(new MarkerOptions().position(pokutPlateau).title("Pokut Plateau"));
        mMap.addMarker(new MarkerOptions().position(ayderPlateau).title("Ayder Plateau"));
        mMap.addMarker(new MarkerOptions().position(anzerPlateau).title("Anzer Plateau"));
        mMap.addMarker(new MarkerOptions().position(ovitPlateau).title("Ovit Plateau"));
        mMap.addMarker(new MarkerOptions().position(samistalPlateau).title("Samistal Plateau"));
        mMap.addMarker(new MarkerOptions().position(elevitPlateau).title("Elevit Plateau"));
        mMap.addMarker(new MarkerOptions().position(amlakitPlateau).title("Amlakit Plateau"));
        mMap.addMarker(new MarkerOptions().position(kavronPlateau).title("Kavron Plateau"));
        mMap.addMarker(new MarkerOptions().position(gitoPlateau).title("Gito Plateau"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(senyuvaBridge,10));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(zilKale,10));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(palovitFalls,10));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pokutPlateau,10));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ayderPlateau,10));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(anzerPlateau,10));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ovitPlateau,10));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(samistalPlateau,10));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(elevitPlateau,10));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(amlakitPlateau,10));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kavronPlateau,10));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(gitoPlateau,10));
    }
}
