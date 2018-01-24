package com.smartdroidesign.radioapp2.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.smartdroidesign.radioapp2.R;
import com.smartdroidesign.radioapp2.model.Station;

/**
 * Created by mstara on 24/01/2018.
 */

public class StationViewHolder extends RecyclerView.ViewHolder {

    private ImageView mainImage;
    private TextView titleTextView;

    public StationViewHolder(View itemView) {
        super(itemView);

        this.mainImage = itemView.findViewById(R.id.main_image);
        this.titleTextView  = itemView.findViewById(R.id.main_text);
    }

    public void updateUI(Station station){
        String uri = station.getImgUri();
        int resources = mainImage.getResources().getIdentifier(uri,null, mainImage.getContext().getPackageName());
        mainImage.setImageResource(resources);

        titleTextView.setText(station.getStationTitle());
    }
}
