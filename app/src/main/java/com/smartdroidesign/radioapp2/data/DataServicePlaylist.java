package com.smartdroidesign.radioapp2.data;

import com.smartdroidesign.radioapp2.model.Playlist;

import java.util.ArrayList;

/**
 * Created by mstara on 25/01/2018.
 */

public class DataServicePlaylist {
    private static final DataServicePlaylist ourInstance = new DataServicePlaylist();


    public static DataServicePlaylist getInstance() {
        return ourInstance;
    }

    private DataServicePlaylist() {
    }

    public ArrayList<Playlist> getFeaturedPlaylists(){

        ArrayList<Playlist> plist = new ArrayList<>();
        plist.add(new Playlist("International Playlist", "Celebrate music from around the world","flightmosaic"));

        return plist;
    }

    public ArrayList<Playlist> getRecentPlaylists(){

        ArrayList<Playlist> plist = new ArrayList<>();
        plist.add(new Playlist("Rock Playlist", "This is rock n' roll","radarimage"));

        return plist;
    }

    public ArrayList<Playlist> getPartyPlaylists(){

        ArrayList<Playlist> plist = new ArrayList<>();
        plist.add(new Playlist("International Playlist", "Celebrate music from around the world","flightmosaic"));

        return plist;
    }
}
