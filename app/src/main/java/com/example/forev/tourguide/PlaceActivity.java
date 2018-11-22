package com.example.forev.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceActivity extends AppCompatActivity {

    private TextView placeActivityName;
    private TextView placeActivityDescription;
    private ImageView placeActivityImage;

    private String Title;
    private String Description;
    private String Latitude;
    private String Longitude;
    private int image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        placeActivityName = (TextView) findViewById(R.id.place_activity_title_name);
        placeActivityDescription = (TextView) findViewById(R.id.place_activity_description);
        placeActivityImage = (ImageView) findViewById(R.id.activity_place_image);

        //Recieve data
        Intent intent = getIntent();
        Title = intent.getExtras().getString("Title");
        Description = intent.getExtras().getString("Description");
        image = intent.getExtras().getInt("Thumbnail");
        Latitude = intent.getExtras().getString("Latitude");
        Longitude = intent.getExtras().getString("Longitude");

        //Setting values

        placeActivityName.setText(Title);
        placeActivityDescription.setText(Description);
        placeActivityImage.setImageResource(image);
    }

    public void show_map(View view)
    {
        Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
        intent.putExtra("placeName",Title);
        intent.putExtra("latitude",Latitude);
        intent.putExtra("longitude",Longitude);
        startActivity(intent);
    }
}
