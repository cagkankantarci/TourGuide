package com.example.forev.tourguide.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.forev.tourguide.CafesItems;
import com.example.forev.tourguide.CafesNamesActivity;
import com.example.forev.tourguide.R;

import java.util.List;

public class CafeAdapter  extends RecyclerView.Adapter<CafeAdapter.myViewHolder> {

    Context mContext;
    List<CafesItems> mData;


    public CafeAdapter(Context mContext, List<CafesItems> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View v =layoutInflater.inflate(R.layout.layout_cafes_items,parent,false);

        Button showButton = (Button) v.findViewById(R.id.btn_show);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, CafesNamesActivity.class);
                mContext.startActivity(intent);
            }
        });

        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position)
    {
        holder.background_img.setImageResource(mData.get(position).getBackground());
        holder.cafe_photo.setImageResource(mData.get(position).getCafePhoto());
        holder.tv_title.setText(mData.get(position).getCafeName());
        holder.test.setText(mData.get(position).getTest());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{
        ImageView cafe_photo,background_img;
        TextView tv_title, test;

        public myViewHolder(View itemView){
            super(itemView);
            cafe_photo = itemView.findViewById(R.id.profile_img);
            background_img = itemView.findViewById(R.id.card_layout_cafes_background);
            tv_title = itemView.findViewById(R.id.card_layout_cafes_title);
            test = itemView.findViewById(R.id.card_layout_cafes_sub_title);
        }
    }
}
