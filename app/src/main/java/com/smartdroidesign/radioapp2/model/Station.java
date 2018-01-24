package com.smartdroidesign.radioapp2.model;

/**
 * Created by mstara on 24/01/2018.
 */

public class Station {


    final private String DRAWABLE = "drawable/";
    private String stationTitle;
    private String imgUri;


    public Station(String stationTitle, String imgUri) {
        this.stationTitle = stationTitle;
        this.imgUri = imgUri;
    }

    public String getDRAWABLE() {
        return DRAWABLE;
    }

    public String getStationTitle() {
        return stationTitle;
    }

    public String getImgUri() {
        return DRAWABLE + imgUri;
    }

}
