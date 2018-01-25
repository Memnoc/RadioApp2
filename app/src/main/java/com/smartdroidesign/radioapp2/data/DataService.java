package com.smartdroidesign.radioapp2.data;

import com.smartdroidesign.radioapp2.model.Station;

import java.util.ArrayList;

/**
 * Created by memnoc on 24/01/2018.
 */

public class DataService {
    private static final DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {

    }

    public ArrayList<Station> getFeaturedStations() {

        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for travel)", "flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlist)", "bicyclemusic"));
        list.add(new Station("Kids Jam (Music for children)", "kidsmusic"));

        return list;

    }

    public ArrayList<Station> getRecentStations() {
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Key Music (Tunes for hipsters)", "keymusic"));
        list.add(new Station("Social Music (Social-house Playlist)", "socialmusic"));
        list.add(new Station("Vinyl Music (When you are hold)", "vinylmusic"));

        return list;

    }

    public ArrayList<Station> getPartyStations() {
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for travel)", "flightplanmusic"));
        list.add(new Station("Key Music (Tunes for hipsters)", "keymusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlist)", "bicyclemusic"));
        list.add(new Station("Social Music (Social-house Playlist)", "socialmusic"));
        list.add(new Station("Kids Jam (Music for children)", "kidsmusic"));
        list.add(new Station("Vinyl Music (When you are hold)", "vinylmusic"));

        return list;

    }
}
