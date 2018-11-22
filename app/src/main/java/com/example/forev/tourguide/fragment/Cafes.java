package com.example.forev.tourguide.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.forev.tourguide.CafesItems;
import com.example.forev.tourguide.R;
import com.example.forev.tourguide.recyclerview.CafeAdapter;

import java.util.ArrayList;
import java.util.List;

public class Cafes extends android.app.Fragment {
    View view;
    View view2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.layout_cafes,container,false);
        view2 = inflater.inflate(R.layout.layout_cafes_items,container,false);

        RecyclerView recyclerView = view.findViewById(R.id.layout_cafes_items_rv_list);
        List<CafesItems> mList = new ArrayList<>();
        mList.add(new CafesItems(R.drawable.backgroundcafe,"Cafes",R.drawable.cafepeope,"A coffee?"));
        mList.add(new CafesItems(R.drawable.restaurantchocolat,"Restaurants",R.drawable.restaurantpeople,"Are you hungry?"));
        mList.add(new CafesItems(R.drawable.bar,"Bars",R.drawable.barpeople2,"Some fun?"));
        CafeAdapter adapter = new CafeAdapter(getActivity(),mList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }
}

        /*Button showButton = (Button) view2.findViewById(R.id.btn_show);
            showButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), CafesNamesActivity.class);
                    startActivity(intent);
                }
            });
            return view2;
        }*/