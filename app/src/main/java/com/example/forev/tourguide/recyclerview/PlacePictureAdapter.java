package com.example.forev.tourguide.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.forev.tourguide.Place;
import com.example.forev.tourguide.PlaceActivity;
import com.example.forev.tourguide.R;

import java.util.List;

public class PlacePictureAdapter extends RecyclerView.Adapter<PlacePictureAdapter.MyViewHolder>{

    private Context mContext;
    private List<Place> mData;

    public PlacePictureAdapter(Context mContext, List<Place> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_place,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.placeName.setText(mData.get(position).getTitle());
        holder.placeThumbnails.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //passing data the book activity
                Intent intent = new Intent(mContext, PlaceActivity.class);
                intent.putExtra("Title",mData.get(position).getTitle());
                intent.putExtra("Description",mData.get(position).getDescription());
                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());
                intent.putExtra("Latitude",mData.get(position).getLatitude());
                intent.putExtra("Longitude",mData.get(position).getLongitude());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView placeName;
        ImageView placeThumbnails;
        CardView cardView;

        public MyViewHolder(View itemView){
            super(itemView);

            placeName = (TextView) itemView.findViewById(R.id.place_title_id);
            placeThumbnails = (ImageView) itemView.findViewById(R.id.place_image_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_place_id);
        }
    }
}
