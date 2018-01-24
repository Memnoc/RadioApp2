package com.smartdroidesign.radioapp2.activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.smartdroidesign.radioapp2.R;
import com.smartdroidesign.radioapp2.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment)fm.findFragmentById(R.id.container_main);

        if(mainFragment == null){
            mainFragment = MainFragment.newInstance("bla", "bla");
            fm.beginTransaction()
                    .add(R.id.container_main, mainFragment)
                    .commit();
        }




    }
}
