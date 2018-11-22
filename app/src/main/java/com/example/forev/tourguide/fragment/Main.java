package com.example.forev.tourguide.fragment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.forev.tourguide.R;

public class Main extends android.app.Fragment implements View.OnClickListener {
    View view;
    private CardView placeCard,tasteCard,cafeCard;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.layout_main,container,false);

        placeCard = (CardView) view.findViewById(R.id.place_layout_main);
        tasteCard = (CardView) view.findViewById(R.id.taste_layout_main);
        cafeCard = (CardView) view.findViewById(R.id.cafe_layout_main);

        placeCard.setOnClickListener(this);
        tasteCard.setOnClickListener(this);
        cafeCard.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        android.app.Fragment fragment = null;
        Intent intent;

        switch (view.getId())
        {
            case R.id.place_layout_main : fragment = new Places(); replaceFragment(fragment); break;
            case R.id.taste_layout_main : fragment = new Taste(); replaceFragment(fragment); break;
            case R.id.cafe_layout_main : fragment = new Cafes(); replaceFragment(fragment); break;
            default:break;
        }
    }

    public void replaceFragment(Fragment someFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
