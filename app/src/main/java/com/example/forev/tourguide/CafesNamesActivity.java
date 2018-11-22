package com.example.forev.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CafesNamesActivity extends AppCompatActivity {

    private String[] names = {"Masal Cafe(Ardeşen)","SOHO Cafe(Çamlıhemşin)","OSMANLI Restaurant(Çamlıhemşin)","Ayder Burger(Çamlıhemşin)", "Tarzan Park Cafe(Palovit)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafes_names);

        //To be corrected.

        ListView cafeNames =(ListView) findViewById(R.id.listview_cafes_names);

        ArrayAdapter<String> cafeAdapter =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, names);

        cafeNames.setAdapter(cafeAdapter);
    }
}
