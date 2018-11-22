package com.example.forev.tourguide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.forev.tourguide.fragment.Popup;

public class PopupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_activity);

        FragmentManager fragmentManager = getSupportFragmentManager();

        Fragment fragment = fragmentManager.findFragmentById(R.id.popup_activity_framelayout);

        if(fragment == null)
        {
            fragment = Popup.newInstance();
            fragmentManager.beginTransaction().add(R.id.popup_activity_framelayout,fragment).commit();
        }
    }

    public static Intent newIntent(Context context, TasteMove tasteMove)
    {
        Intent intent = new Intent(context,PopupActivity.class);
        intent.putExtra("INFO",tasteMove);
        return intent;
    }
}
