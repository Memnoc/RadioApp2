package com.smartdroidesign.radioapp2.model;

/**
 * Created by mstara on 25/01/2018.
 */

public class Playlist {

    final String DRAWABLE = "drawable/";
    private String playlistTitle;
    private String imgUri;

    public Playlist(String playlistTitle, String imgUri) {
        this.playlistTitle = playlistTitle;
        this.imgUri = imgUri;
    }

    public String getDRAWABLE() {
        return DRAWABLE;
    }

    public String getPlaylistTitle() {
        return playlistTitle;
    }

    public String getImgUri() {
        return DRAWABLE + imgUri;
    }
}
