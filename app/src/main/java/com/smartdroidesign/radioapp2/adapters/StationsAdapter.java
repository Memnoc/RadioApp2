package com.smartdroidesign.radioapp2.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smartdroidesign.radioapp2.R;
import com.smartdroidesign.radioapp2.activities.MainActivity;
import com.smartdroidesign.radioapp2.holders.StationViewHolder;
import com.smartdroidesign.radioapp2.model.Station;

import java.util.ArrayList;

/**
 * Created by mstara on 24/01/2018.
 */

public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder> {

    ArrayList<Station> stations;

    public StationsAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }

    public StationsAdapter() {
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View stationCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_station, parent, false);
        return new StationViewHolder(stationCard);
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, final int position) {
        final Station station = stations.get(position);
        holder.updateUI(station);



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Load the details screen
                MainActivity.getMainActivity().loadDetailScreen(station);
            }
        });




    }

    @Override
    public int getItemCount() {
        return stations.size();
    }
}
