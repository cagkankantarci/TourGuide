package com.example.forev.tourguide.fragment;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.forev.tourguide.R;

public class Emergency extends android.app.Fragment implements View.OnClickListener {
    View view;
    private static final int REQUEST_CALL = 1;
    String number;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.layout_emergency,container,false);

        ImageView imageCallPolice = view.findViewById(R.id.emergency_police_button);
        ImageView imageCallAmbulance = view.findViewById(R.id.emergency_ambulance_button);
        ImageView imageCallFire = view.findViewById(R.id.emergency_fire_button);
        ImageView imageCallGendarme = view.findViewById(R.id.emergency_gendarme_button);
        ImageView imageCallForestFire = view.findViewById(R.id.emergency_forest_button);

        imageCallPolice.setOnClickListener(this);
        imageCallAmbulance.setOnClickListener(this);
        imageCallFire.setOnClickListener(this);
        imageCallGendarme.setOnClickListener(this);
        imageCallForestFire.setOnClickListener(this);

        return view;
    }

    private void makePhoneCall(String numb){

        if(number.trim().length()>0)
        {
            if(ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(getActivity(),new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }else{
                String dial = "tel:" + numb;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

        }else{

        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode == REQUEST_CALL)
        {
            if(grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                makePhoneCall(number);
            }
            else{
                //TOASST
            }
        }
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.emergency_police_button)
        {
            number="155";
            makePhoneCall(number);
        }
        else if (view.getId()==R.id.emergency_ambulance_button)
        {
            number="112";
            makePhoneCall(number);
        }
        else if (view.getId()==R.id.emergency_fire_button)
        {
            number="110";
            makePhoneCall(number);
        }
        else if (view.getId()==R.id.emergency_gendarme_button)
        {
            number="156";
            makePhoneCall(number);
        }
        else if (view.getId()==R.id.emergency_forest_button)
        {
            number="177";
            makePhoneCall(number);
        }
    }
}
