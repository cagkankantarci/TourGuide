package com.example.forev.tourguide.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.forev.tourguide.TasteMove;
import com.example.forev.tourguide.PopupActivity;
import com.example.forev.tourguide.R;
import com.example.forev.tourguide.recyclerview.TastePictureAdapter;

import java.util.ArrayList;

public class Taste extends android.app.Fragment implements TastePictureAdapter.MyListener{

    private TastePictureAdapter tastePictureAdapter;
    private RecyclerView recyclerView;
    private ArrayList<TasteMove> tasteMoves;

    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.layout_taste,container,false);
        tastePictureAdapter = new TastePictureAdapter((AppCompatActivity) getActivity(),this);

        tasteMoves = tastePictureAdapter.getTasteMoves();

        recyclerView = view.findViewById(R.id.fragment_taste_recylerview);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));

        if(isAdded()){
            recyclerView.setAdapter(tastePictureAdapter);
        }

        getTasteMoves(tasteMoves);

        return view;
    }

    private ArrayList<TasteMove> getTasteMoves(ArrayList<TasteMove> tasteMoves)
    {
            tasteMoves.add(new TasteMove("Muhlama", R.drawable.t_muhlama, "In some regions, so-called kuymak; corn flour, butter and wire are made from cheese. Chopped cheese and water are added to the corn flour, which is cooked in butter, until the cheese is melted. It is served hot.\n", "Calorie: 489"));
            tasteMoves.add(new TasteMove("Laz Böreği", R.drawable.t_lazboregi, "It is prepared by mixing and boiling custard, wheat flour, sugar, salt, egg and milk to be put into Laz Pie which is a dumpling.\n", "Calorie: 421"));
            tasteMoves.add(new TasteMove("Hamsili Pilav", R.drawable.t_hamsiliekmek,"It's that simple. Rice + Anchovies. Anchovy swords are extracted. In a separate place, rice, peppermint, black pepper, currant is mixed and pulverized. A row of anchovies is placed on a portion of the tray and the prepared mixture is laid. Back to the top anchovies are arranged and given to the oven.\n", "Calorie: 334"));
            tasteMoves.add(new TasteMove("Mısır Ekmeği", R.drawable.t_misirekmegi, "Bread made of corn flour.\n", "Calorie: 94"));
            tasteMoves.add(new TasteMove("Hamsikoli", R.drawable.t_hamsikoli, "At least one year of pickled brine is made from anchovies. Squeezed anchovies, sifted corn flour and abundant greens (leeks, cabbage, chard, onion, parsley,) are kneaded together.", "Calorie: 341"));
            tasteMoves.add(new TasteMove("Hamsi Çığırtası", R.drawable.t_hamsicigartasi, "A bowl of chard, a bowl of fresh onion or equivalent domestic leek leaf, two cups of fine corn flour or equivalent of wheat flour, may also be a bowl of salted anchovies, an egg-sized tallow, not olive oil for frying.\n", "Calorie: 230"));
            tasteMoves.add(new TasteMove("Lahana Sarması", R.drawable.t_lahanasarmasi, "The material used is brass, onion and cabbage leaves. Rice is roasted in oil, onion is added and roasting is continued, then spices are added if desired. The prepared interior is wrapped in boiled cabbage leaves. In addition, it can be added to the wrappers (part of corn corn, corn cut).", "Calorie: 231"));
            tasteMoves.add(new TasteMove("TEA", R.drawable.t_cay, "Most legendary drink.", "Calorie: 0"));
        return tasteMoves;
    }

    @Override
    public void MyListener(TasteMove tasteMove) {
        Intent intent = PopupActivity.newIntent(getActivity(),tasteMove);
        startActivity(intent);
    }
}
