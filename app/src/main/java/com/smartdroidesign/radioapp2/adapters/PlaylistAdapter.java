package com.smartdroidesign.radioapp2.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smartdroidesign.radioapp2.R;
import com.smartdroidesign.radioapp2.holders.PlaylistViewHolder;
import com.smartdroidesign.radioapp2.model.Playlist;

import java.util.ArrayList;

/**
 * Created by mstara on 25/01/2018.
 */

public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistViewHolder> {

    ArrayList<Playlist> playlists;

    public PlaylistAdapter(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    @Override
    public PlaylistViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View playlistCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.playlist_card, parent, false);
        return new PlaylistViewHolder(playlistCard);
    }

    @Override
    public void onBindViewHolder(PlaylistViewHolder holder, int position) {
        Playlist playlist = playlists.get(position);

    }

    @Override
    public int getItemCount() {
        return playlists.size();
    }
}
