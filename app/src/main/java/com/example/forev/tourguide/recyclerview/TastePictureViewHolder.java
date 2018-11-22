package com.example.forev.tourguide.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.example.forev.tourguide.TasteMove;
import com.example.forev.tourguide.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class TastePictureViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    ProgressBar progressBar;

    public TastePictureViewHolder(View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.recyclerview_taste_picture_list_imageview);
        progressBar = itemView.findViewById(R.id.recyclerview_taste_picture_list_progressbar);

    }

    public void getMoves(Context context, TasteMove tasteMove)
    {
        itemView.setTag(tasteMove);
        Picasso.get().load(tasteMove.getTastePicture()).fit().centerCrop().into(imageView, new Callback() {
            @Override
            public void onSuccess()
            {
                progressBar.setVisibility(View.INVISIBLE);
            }
            @Override
            public void onError(Exception e) {

            }
        });

    }
}
