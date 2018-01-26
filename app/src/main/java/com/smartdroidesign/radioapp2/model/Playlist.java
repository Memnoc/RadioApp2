package com.smartdroidesign.radioapp2.model;

/**
 * Created by mstara on 25/01/2018.
 */

public class Playlist {

    final private String DRAWABLE = "drawable/";
    private String playlistTitle;
    private String playlistSubTitle;
    private String imgUri;

    public Playlist(String playlistTitle, String playlistSubTitle, String imgUri) {
        this.playlistTitle = playlistTitle;
        this.playlistSubTitle = playlistSubTitle;
        this.imgUri = imgUri;
    }

    public String getDRAWABLE() {
        return DRAWABLE;
    }

    public String getPlaylistTitle() {
        return playlistTitle;
    }

    public String getPlaylistSubTitle(){
        return playlistSubTitle;
    }

    public String getImgUri() {
        return DRAWABLE + imgUri;
    }
}
