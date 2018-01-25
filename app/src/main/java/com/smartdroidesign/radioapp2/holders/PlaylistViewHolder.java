package com.smartdroidesign.radioapp2.holders;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.smartdroidesign.radioapp2.R;
import com.smartdroidesign.radioapp2.model.Playlist;

/**
 * Created by mstara on 25/01/2018.
 */

public class PlaylistViewHolder extends RecyclerView.ViewHolder {

    private ImageView mainImage;
    private TextView titleTextView;

    public PlaylistViewHolder(View itemView) {
        super(itemView);

        this.mainImage = (ImageView)itemView.findViewById(R.id.main_playlist_image);
        this.titleTextView = (TextView)itemView.findViewById(R.id.main_playlist_text);
    }

    public void updatePlaylistUI(Playlist playlist){
        String uri  =playlist.getImgUri();
        int resource = mainImage.getResources().getIdentifier(uri,null, mainImage.getContext().getPackageName());
        mainImage.setImageResource(resource);

        titleTextView.setText(playlist.getPlaylistTitle());

    }
}
