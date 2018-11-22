package com.example.forev.tourguide.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.forev.tourguide.TasteMove;
import com.example.forev.tourguide.R;

import java.util.ArrayList;

public class TastePictureAdapter extends RecyclerView.Adapter<TastePictureViewHolder> implements View.OnClickListener {

    private ArrayList<TasteMove> tasteMoves;
    private LayoutInflater layoutInflater;
    private AppCompatActivity appCompatActivity;
    private MyListener myListener;

    public TastePictureAdapter(AppCompatActivity appCompatActivity, MyListener myListener) {
        this.appCompatActivity = appCompatActivity;
        this.myListener = myListener;
        layoutInflater = appCompatActivity.getLayoutInflater();
        tasteMoves = new ArrayList<>();
    }

    public ArrayList<TasteMove> getTasteMoves() {

        return tasteMoves;
    }

    @Override
    public TastePictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listView = layoutInflater.inflate(R.layout.recyclerview_taste_picture_list,parent,false);
        listView.setOnClickListener(this);

        return new TastePictureViewHolder(listView);
    }

    @Override
    public void onBindViewHolder(TastePictureViewHolder holder, int position)
    {
        holder.getMoves(appCompatActivity,tasteMoves.get(position));

    }

    @Override
    public int getItemCount() {
        return tasteMoves.size();
    }

    @Override
    public void onClick(View view) {

        if(view.getTag() instanceof TasteMove){
            TasteMove tasteMove = (TasteMove) view.getTag();
            myListener.MyListener(tasteMove);
        }
    }

    public interface MyListener{
        public void MyListener(TasteMove tasteMove);
    }
}
