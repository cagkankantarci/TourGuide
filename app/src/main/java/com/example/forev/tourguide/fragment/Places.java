package com.example.forev.tourguide.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.forev.tourguide.Place;
import com.example.forev.tourguide.R;
import com.example.forev.tourguide.recyclerview.PlacePictureAdapter;

import java.util.ArrayList;
import java.util.List;

public class Places extends android.app.Fragment {
    View view;
    List<Place> lstBook;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.layout_place,container,false);

        lstBook = new ArrayList<>();
        lstBook.add(new Place("Şenyuva Bridge","Stone bridges built in accordance with the geography and climatic conditions of the Black Sea region are generally designed as one-eyed. The Şenyuva Bridge, located on the Fırtına Stream in the village of Şenyuva in Çamlıhemşin, is a good example of such arch bridges.\n" +
                "The arch of Şenyuva Bridge, which is 40 meters long and 20 meters high, was constructed with smooth cut stone and feet with rubble stone. According to the Şenyuva villagers, the inscription of the bridge was lost in the flood in 1946. The sign at the entrance of the bridge, 7 kilometers from Çamlıhemşin, is indicated as 1696.\n.\n",R.drawable.y_senyuva,"40.997542","40.9752371"));
        lstBook.add(new Place("Zilkale","Zilkale is a medieval castle located in the Fırtına Valley (literally: \"Stormy Valley\"), and is one of the most important historical structures in Çamlıhemşin district of Rize Province in the Black Sea Region of Turkey.\n" +
                "The castle is built at an altitude of 1,130 m (3,710 ft), and sits at the edge of a cliff overlooking the Fırtına Creek (Turkish: Fırtına Deresi approximately 380 m (1,250 ft) below running at an elevation of 750 m (2,460 ft) southeast of it. The castle consists of outer walls, middle walls and inner castle. There are garrison quarters, and a possible chapel and head tower. It is believed that the castle was built in the 14th-15th century.\n",R.drawable.y_zilkale,"40.9592226","40.9631012"));
        lstBook.add(new Place("Palovit Falls","The Palovit Falls can be found in Kaçkar Mountains National Park, in one of Turkey's most beautiful valleys, the Firtina (Storm) Valley. Palovit Falls are 10-15m-high in height and have the highest flow rate of the water falls in Rize province.\n",R.drawable.y_palovitselalesi,"40.941498","40.9934164"));
        lstBook.add(new Place("Pokut Plateau","Pokut Plateau is a plateau built in Çamlıhemşin district of Rize province with an elevation of 2050 meters. Although it is 21 kilometers away from Çamlıhemşin, it is only 1.5 - 2 hours since one side of the road road is covered with mountains and the other side of the road is covered with mountains. The moment you reach the plateau and see the landscape, you forget the excitement of the road just before. The name of Pokut comes from Armenian, like many plateaus in the region. It means \"windy valley\". The settlement date of the Pokut Plateau is unknown. The first settlement dates back to 200 years. There are about 75 houses in the area today, but not all of them are used. Some houses in the plateau are shared with guests for accommodation. The people of Yayla are mostly residents of Ortan Village and Konak District.\n",R.drawable.y_pokutyaylasi,"40.964196","41.021361"));
        lstBook.add(new Place("Ayder Plateau","Ayder Plateau, located at an altitude of 1350 meters above sea level, 19 kilometers southeast of Çamlıhemşin district of Rize province of the Black Sea, is covered with spruce and beech forests. It is a plateau with its natural beauty and a paradise view, covered with pine trees and its slopes are covered with pine trees.\n",R.drawable.y_ayderyaylasi,"40.9521568","41.1018166"));
        lstBook.add(new Place("Anzer Plateau","It is 2105 meters high in İkizdere district. It is 85 km away from the city center of Rize. Anzer, also referred to as Ballıköy, is connected to the Çoruh River and Bayburt city and Trabzon Uzungöl Tourism Center on the other. In addition to the cultural influences of being in a transition zone, Meles is on its way to being one of the important tourism centers of the future with its location surrounded by Petran, Kabahor and Garzavan plateaus.\n" +
                "It is a highland center which is located on the skirts of Kırklardağı. There are facilities for eating and drinking. The world-famous Anzer honey is distilled from the flower of thousands of these plateaus. It is attractive for its trekking and photography, especially with its deciduous trees, which take on different shades of green in summer and with yellow and red colors in winter.\n",R.drawable.y_anzeryaylasi,"40.5916179","40.5169581"));
        lstBook.add(new Place("Ovit Plateau","Ovit Plateau is located on the boundary of İkizdere district of Rize province. Rize is approximately 52 km from the city center. In other words, it is located in the Zafer neighborhood on Rize İspir Road.\n",R.drawable.y_ovityaylasi,"40.6483706","40.7557912"));
        lstBook.add(new Place("Samistal Plateau","Samistal plateau, located at an altitude of 2508 m from Çamlıhemşin district, attracts attention with its local architectural features, consisting of large stone masses in the form of raft and extending past. You can reach this plateau both over the Ayder and Palovit. The car can be reached in less time than the ayder route. After going by car to Palovit, it is also possible to climb up to 2 hours on foot and arrive at samistal.\n",R.drawable.y_samistalyaylasi,"40.909132","41.0987571"));
        lstBook.add(new Place("Elevit Plateau","Elevit 1800 meters high, where you can see typical highland houses. Local people who mostly migrated to the big city come to the region for two to three months in the summer season. A three-hour walk can be made from the Elevit Plateau to the Haçevanak plateau. After the fire after the 80s, a large process of the construction of the elevit plateau in fact, consists of two parts. The largest of these departments out of the main valve in the number of houses, known as Tafteni the second comes. The center is also the stop of those who pass the plateau.\n",R.drawable.y_elevityaylasi,"40.8551296","41.0103891"));
        lstBook.add(new Place("Amlakit Plateau ","When you are going to the Amlakit plateau from Kotençur, the traditional horon place of the plateaus is passed through Poşğut Düzü. When the path is followed, the Amlakit plateau, which was founded at the end of the forest and divided by the Palovit creek, is reached.\n" +
                "Amlakit is famous for the Vartavor festival, which he celebrated enthusiastically. Amlakit is at the transition point of the valley known as the honey warehouses of Palovit Valley. With the transition to this valley, Palovit's most dangerous areas are entered.\n" +
                "Vegetation can interfere with the transportation of people from time to time. The road to the Amlakit plateau, which was built five years ago, allowed more people to reach the plateau, but took a course that destroyed the ecological balance of this valley.\n" +
                "Amlakit plateau is still used by the villages of Lower Vice, Hala, Habak.\n",R.drawable.y_amlakityayalsi,"40.898829","41.0728691"));
        lstBook.add(new Place("Aşağı and Yukarı Kavron Plateaus","Kavrun Plateau, located in Rize, divided into two as the Lower and Upper Kavrun Plateaus, is one of the most important plateaus of the Kaçkar people. Kavrun Plateau, which is located at a central point for both mountaineers and local people, is known as one of the leading plateaus in the protests against the ’Green Road 201 project in 2015 and 2016.\n" +
                "20-30 years ago, thousands of small ruminant animals grazing, even people graze in the ground to graze their animals in this highland population has decreased considerably. Even if Kavrun type is turned into a ghost, Upper Kavrun continues to exist even though local life is limited; the old people who came to reclaim the old, the villagers who went to the refreshing and the few remaining animals. Many people living in these regions had to migrate to big cities when they could not make money from animal husbandry.\n",R.drawable.y_kavrunrun,"40.908291","41.1292884"));
        lstBook.add(new Place("Gito Plateau","Gito plateau, connected to the district of Rize Çamlıhemşin. One of the most famous places to visit in Rize, Zil Kale is 18.6 kilometers away.\n" +
                "There are not so many houses in this plateau. If you actually collect 50 or not. People usually deal with animal husbandry, so summers are on the highlands; in the winters are returning to Rize.\n" +
                "The main thing in Gito is camping or hiking. 2070 meters high from the bottom of the Black Sea at your feet, officially poses for you; while you are enjoying the clean air with plenty of oxygen. I confess: The most beautiful breath I've had was in Gito.\n",R.drawable.y_samistalyaylasi,"41.048553","41.0033879"));

        RecyclerView myrv = (RecyclerView) view.findViewById(R.id.recyclerview_place_id);
        PlacePictureAdapter myAdapter = new PlacePictureAdapter((AppCompatActivity) getActivity(),lstBook);
        myrv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        myrv.setAdapter(myAdapter);

        return view;
    }
}
