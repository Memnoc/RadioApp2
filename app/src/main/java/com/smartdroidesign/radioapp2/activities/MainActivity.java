package com.smartdroidesign.radioapp2.activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.smartdroidesign.radioapp2.R;
import com.smartdroidesign.radioapp2.fragments.MainPlaylistFragment;
import com.smartdroidesign.radioapp2.fragments.PlaylistFragment;
import com.smartdroidesign.radioapp2.fragments.MainFragment;
import com.smartdroidesign.radioapp2.model.Station;

public class MainActivity extends AppCompatActivity {

    private static MainActivity mainActivity;

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    private static void setMainActivity(MainActivity mainActivity) {
        MainActivity.mainActivity = mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity.setMainActivity(this);

        FragmentManager fm = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment)fm.findFragmentById(R.id.container_main);

        if(mainFragment == null){
            mainFragment = MainFragment.newInstance("bla", "bla");
            fm.beginTransaction()
                    .add(R.id.container_main, mainFragment)
                    .commit();
        }

    }

    public void loadDetailScreen(Station selectedStation){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_main, new MainPlaylistFragment())
                .addToBackStack(null)
                .commit();

    }
}
