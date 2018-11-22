package com.example.forev.tourguide.fragment;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.forev.tourguide.TasteMove;
import com.example.forev.tourguide.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class Popup extends Fragment {

    View view;
    TextView nameText;
    TextView descriptionText;
    TextView kmText;
    ImageView imageView;
    ProgressBar progressBar;
    private TasteMove tasteMove;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.popup,container,false);
        nameText = view.findViewById(R.id.popup_name_textview);
        descriptionText = view.findViewById(R.id.popup_description_textview);
        kmText = view.findViewById(R.id.popup_kmText_textview);
        imageView = view.findViewById(R.id.popup_imageview);
        progressBar = view.findViewById(R.id.popup_progressbar);

        nameText.setText(tasteMove.getTasteName());
        descriptionText.setText(tasteMove.getTasteDescription());
        kmText.setText(""+tasteMove.getTasteKm());

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

        return view;
    }

    public static Popup newInstance()
    {
        return new Popup();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasteMove = getActivity().getIntent().getParcelableExtra("INFO");
    }
}
